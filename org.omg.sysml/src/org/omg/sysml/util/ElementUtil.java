/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019, 2020 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Ed Seidewitz
 * 
 *****************************************************************************/

package org.omg.sysml.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.TypeFeaturing;
import org.omg.sysml.lang.sysml.impl.FeatureImpl;
import org.omg.sysml.lang.sysml.impl.TypeImpl;
import org.omg.sysml.transform.TransformerFactory;

public class ElementUtil {
	
	public static void transformAll(ResourceSet resourceSet, boolean addImplicitElements) {
		for (Resource resource: resourceSet.getResources()) {
			transformAll(resource, addImplicitElements);
		}
	}

	public static void transformAll(Resource resource, boolean addImplicitElements) {
		for (EObject object: resource.getContents()) {
			if (object instanceof Element) {
				transformAll((Element)object, addImplicitElements);
			}
		}
	}
	
	public static void transformAll(Element root, boolean addImplicitElements) {
		if (addImplicitElements && root instanceof Type) {
			addImplicitBindingConnectors((Type) root);
		}
		transform(root);
		for (Relationship relationship: root.getOwnedRelationship()) {
			transformAll(relationship, addImplicitElements);
			for (Element element: relationship.getOwnedRelatedElement()) {
				transformAll(element, addImplicitElements);
			}
		}
		if (addImplicitElements && root instanceof Type) {
			addImplicitGeneralizations((Type)root);
		}
		if (addImplicitElements && root instanceof Feature) {
			addImplicitTypeFeaturings((Feature)root);
		}
	}
	
	public static void transform(Element element) {
		TransformerFactory.createTransformer(element).transform();
	}
	
	public static void addImplicitGeneralizations(Type type) {
		((TypeImpl)type).forEachImplicitGeneralType((eClass, general)->{
			Generalization newGeneralization = (Generalization)SysMLFactory.eINSTANCE.create(eClass);
			newGeneralization.setGeneral(general);
			newGeneralization.setSpecific(type);
			type.getOwnedRelationship_comp().add(newGeneralization);
		});
		((TypeImpl)type).cleanImplicitGeneralTypes();
	}
	
	public static void addImplicitTypeFeaturings(Feature feature) {
		((FeatureImpl)feature).forEachImplicitFeaturingType(type->{
			boolean featuringRequired = feature.getOwnedRelationship_comp().stream().
				filter(TypeFeaturing.class::isInstance).
				map(TypeFeaturing.class::cast).
				noneMatch(f -> Objects.equals(f.getFeatureOfType(), feature)
						&& Objects.equals(f.getFeaturingType(), type));
			if (featuringRequired) {
				TypeFeaturing featuring = SysMLFactory.eINSTANCE.createTypeFeaturing();
				featuring.setFeaturingType(type);
				featuring.setFeatureOfType(feature);
				feature.getOwnedRelationship_comp().add(featuring);
			}
		});
	}
	
	public static void addImplicitBindingConnectors(Type type) {
		List<Membership> addedMemberships = new ArrayList<>();
		((TypeImpl)type).forEachImplicitBindingConnector((connector, eClass)->{
			if (eClass == SysMLPackage.Literals.FEATURE_MEMBERSHIP) {
				addedMemberships.add(((TypeImpl)type).addOwnedFeature(connector));
			} else {
				addedMemberships.add(((TypeImpl)type).addOwnedMember(connector));
			}
		});
		((TypeImpl)type).cleanImplicitBindingConnectors();
		// This is required as the owned relationships call of the type will not return
		// the newly created binding connectors so we have to ensure the transform
		// function is used appropriately
		for (Membership m : addedMemberships) {
			transformAll(m.getMemberElement(), true);
		}
	}
	
}
