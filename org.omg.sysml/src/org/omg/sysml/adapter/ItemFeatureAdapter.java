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

import java.util.Collections;
import java.util.List;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.TypeUtil;

public class ItemFeatureAdapter extends FeatureAdapter {

	public static final String ITEM_FLOW_ITEM_FEATURE = "Transfers::Transfer::item";
	
	public ItemFeatureAdapter(ItemFeature element) {
		super(element);
	}
	
	@Override
	public ItemFeature getTarget() {
		return (ItemFeature)super.getTarget();
	}

	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type, Element skip) {
		return type == getTarget().getOwner()? TypeUtil.getRelevantFeaturesOf(type):
				Collections.singletonList((Feature)getLibraryType(ITEM_FLOW_ITEM_FEATURE));
	}
	
}
