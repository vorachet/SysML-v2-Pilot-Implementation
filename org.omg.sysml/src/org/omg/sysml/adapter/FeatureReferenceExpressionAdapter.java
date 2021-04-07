/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
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
 *******************************************************************************/

package org.omg.sysml.adapter;

import java.util.Optional;

import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.TypeUtil;

public class FeatureReferenceExpressionAdapter extends ExpressionAdapter {

	public FeatureReferenceExpressionAdapter(FeatureReferenceExpression element) {
		super(element);
	}
	
	@Override
	public FeatureReferenceExpression getTarget() {
		return (FeatureReferenceExpression)super.getTarget();
	}
	
	// Derivation
	
	public Optional<Feature> getReferentFeature() {
		return getTarget().getOwnedMembership().stream().
				filter(mem->!(mem instanceof ParameterMembership)).
				map(Membership::getMemberElement).
				filter(Feature.class::isInstance).
				map(Feature.class::cast).
				findFirst();
	}	
	
	// Transformation
	
	protected void addReferenceConnector() {
		FeatureReferenceExpression expression = getTarget();
		addBindingConnector(expression.getReferent(), expression.getResult());
	}

	protected void addResultSubsetting() {
		FeatureReferenceExpression expression = getTarget();
		Feature result = expression.getResult();
		if (getReferentFeature().isPresent()) {
			TypeUtil.addImplicitGeneralTypeTo(result,
					SysMLPackage.eINSTANCE.getSubsetting(), expression.getReferent());
		}
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		addReferenceConnector();
		// Add subsetting in order to inherit typing of referent.
		addResultSubsetting();
	}
	
}
