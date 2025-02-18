/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022 Model Driven Solutions, Inc.
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
package org.omg.sysml.expressions;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.InvocationExpression;

public class ConditionalImpliesFunction extends ControlFunction {

	@Override
	public String[] getOperatorNames() {
		return new String[]{"implies"};
	}

	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target) {
		Boolean firstValue = booleanValue(invocation, 0, target);
		if (firstValue != null) {
			if (!firstValue) {
				return booleanResult(true);
			} else {
				Boolean secondValue = booleanExpressionValue(invocation, 1, target);
				if (secondValue != null) {
					return booleanResult(secondValue);
				}
			}
		}
		return null;
	}

}
