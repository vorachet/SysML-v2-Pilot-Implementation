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

package org.omg.sysml.interactive.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.lang.sysml.AnnotatingFeature;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.LiteralReal;
import org.omg.sysml.lang.sysml.LiteralString;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.ResultExpressionMembership;
import org.omg.sysml.util.TypeUtil;

public class ModelLevelEvaluationTest extends SysMLInteractiveTest {
	
	protected Expression checkExpression(SysMLInteractive instance, String text) {
		List<Element> members = eval(instance, "calc test { " + text + " }");
		assertFalse("'" + text +"': No Members", members.isEmpty());
		Element member = members.get(0);
		assertTrue("'" + text + "': Not an expression", member instanceof Expression);
		Expression resultExpression = 
				(Expression)TypeUtil.getOwnedFeatureByMembershipIn((Expression)member, ResultExpressionMembership.class);
		assertNotNull("'" + text + "': No result expression", resultExpression);
		return resultExpression;
	}
	
	protected Expression checkExpressionIsModelLevelEvaluable(SysMLInteractive instance, String text) {
		Expression expression = checkExpression(instance, text);
		assertTrue("'" + text + "' is not model-level evaluable", expression.isModelLevelEvaluable());
		return expression;
	}

	protected Expression checkExpressionNotModelLevelEvaluable(SysMLInteractive instance, String text) {
		Expression expression = checkExpression(instance, text);
		assertFalse("'" + text + "' is model-level evaluable", expression.isModelLevelEvaluable());
		return expression;
	}
	
	protected List<Element> evaluateExpression(SysMLInteractive instance, Element target, String text) {
		Expression expression = checkExpressionIsModelLevelEvaluable(instance, text);
		return expression.evaluate(target);
	}
	
	protected Element evaluateSingleValue(SysMLInteractive instance, Element target, String text) {
		List<Element> results = evaluateExpression(instance, target, text);
		assertNotNull(results);
		assertTrue(results.size() <= 1);
		return results.isEmpty()? null: results.get(0);
	}
	
	protected boolean evaluateBooleanValue(SysMLInteractive instance, Element target, String text) {
		Element result = evaluateSingleValue(instance, target, text);
		assertTrue(result instanceof LiteralBoolean);
		return ((LiteralBoolean)result).isValue();
	}
	
	protected String evaluateStringValue(SysMLInteractive instance, Element target, String text) {
		Element result = evaluateSingleValue(instance, target, text);
		assertTrue(result instanceof LiteralString);
		return ((LiteralString)result).getValue();
	}
	
	protected int evaluateIntegerValue(SysMLInteractive instance, Element target, String text) {
		Element result = evaluateSingleValue(instance, target, text);
		assertTrue(result instanceof LiteralInteger);
		return ((LiteralInteger)result).getValue();
	}
	
	protected double evaluateRealValue(SysMLInteractive instance, Element target, String text) {
		Element result = evaluateSingleValue(instance, target, text);
		assertTrue(result instanceof LiteralReal);
		return ((LiteralReal)result).getValue();
	}
	
	protected AnnotatingFeature checkAnnotatingFeature(SysMLInteractive instance, String annotationName, String elementName) {
		Element target = instance.resolve(elementName);
		assertTrue(target instanceof Namespace);
		assertTrue(!((Namespace)target).getOwnedMembership().isEmpty());
		
		Element annotatingFeature = ((Namespace)target).getOwnedMembership().get(0).getOwnedMemberElement();
		assertTrue(annotatingFeature instanceof AnnotatingFeature);		
		assertTrue("Annotation".equals(((AnnotatingFeature)annotatingFeature).getMetadataType().getName()));
		
		return (AnnotatingFeature)annotatingFeature;
	}
	
	@Test
	public void testLiteralEvaluation() throws Exception {
		assertEquals(true, evaluateBooleanValue(null, null, "true"));
		assertEquals("test", evaluateStringValue(null, null, "\"test\""));
		assertEquals(1, evaluateIntegerValue(null, null, "1"));
		assertEquals(2.0, evaluateRealValue(null, null, "2.0"), 0.0);
	}

	@Test
	public void testIntegerOpsModelLevelEvaluability() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		checkExpressionIsModelLevelEvaluable(instance, "+1");
		checkExpressionIsModelLevelEvaluable(instance, "-1");
		checkExpressionIsModelLevelEvaluable(instance, "1+2");
		checkExpressionIsModelLevelEvaluable(instance, "1-2");
		checkExpressionIsModelLevelEvaluable(instance, "1*2");
		checkExpressionIsModelLevelEvaluable(instance, "1/2");
		checkExpressionIsModelLevelEvaluable(instance, "1%2");
	}

	@Test
	public void testComparisonOpsModelLevelEvaluability() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		checkExpressionIsModelLevelEvaluable(instance, "1==2");
		checkExpressionIsModelLevelEvaluable(instance, "1!=2");
		checkExpressionIsModelLevelEvaluable(instance, "1<2");
		checkExpressionIsModelLevelEvaluable(instance, "1>2");
		checkExpressionIsModelLevelEvaluable(instance, "1<=2");
		checkExpressionIsModelLevelEvaluable(instance, "1>=2");
	}

	@Test
	public void testBooleanOpsModelLevelEvaluability() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		checkExpressionIsModelLevelEvaluable(instance, "!true");
		checkExpressionIsModelLevelEvaluable(instance, "true & false");
		checkExpressionIsModelLevelEvaluable(instance, "true | false");
		checkExpressionIsModelLevelEvaluable(instance, "true ^ false");
		checkExpressionIsModelLevelEvaluable(instance, "true && false");
		checkExpressionIsModelLevelEvaluable(instance, "true || false");
	}

	@Test
	public void testListOpsModelLevelEvaluability() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		checkExpressionIsModelLevelEvaluable(instance, "(1, 2, 3)");
		checkExpressionIsModelLevelEvaluable(instance, "SequenceFunctions::size(null)");
		checkExpressionIsModelLevelEvaluable(instance, "SequenceFunctions::includes(null, 1)");
	}

	@Test
	public void testNonModelLevelEvaluability() throws Exception {
		checkExpressionNotModelLevelEvaluable(null, "calc f(x); f(3 + 4)");
	}
	
	@Test
	public void testBooleanEvaluation() throws Exception {
		assertEquals(false, evaluateBooleanValue(null, null, "true & false"));
		assertEquals(true, evaluateBooleanValue(null, null, "true | false"));
		assertEquals(true, evaluateBooleanValue(null, null, "true ^ false"));
		assertEquals(false, evaluateBooleanValue(null, null, "true && false"));
		assertEquals(true, evaluateBooleanValue(null, null, "true || false"));
	}
	
	@Test
	public void testStringEvaluation() throws Exception {
		assertEquals("ab", evaluateStringValue(null, null, "\"a\" + \"b\""));
		assertEquals("a", evaluateStringValue(null, null, "StringFunctions::Substring(\"ab\", 1, 1)"));
		assertEquals(2, evaluateIntegerValue(null, null, "StringFunctions::Length(\"ab\")"));
	}
	
	@Test
	public void testIntegerEvaluation() throws Exception {
		assertEquals(5, evaluateIntegerValue(null, null, "2 + 3"));
		assertEquals(-1, evaluateIntegerValue(null, null, "2 - 3"));
		assertEquals(6, evaluateIntegerValue(null, null, "2 * 3"));
		assertEquals(0, evaluateIntegerValue(null, null, "2 / 3"));
		assertEquals(2, evaluateIntegerValue(null, null, "2 % 3"));
	}
	
	@Test
	public void testRealEvaluation() throws Exception {
		assertEquals(2.0d + 3.0d, evaluateRealValue(null, null, "2.0 + 3"), 0);
		assertEquals(2.0d - 3.0d, evaluateRealValue(null, null, "2.0 - 3"), 0);
		assertEquals(2.0d * 3.0d, evaluateRealValue(null, null, "2.0 * 3"), 0);
		assertEquals(2.0d/3.0d, evaluateRealValue(null, null, "2.0 / 3"), 0);
		assertEquals(4.0d, evaluateRealValue(null, null, "2.0 ** 2"), 0);
	}
	
	@Test
	public void testComparisonEvaluation() throws Exception {
		assertEquals(false, evaluateBooleanValue(null, null, "2 < 2"));
		assertEquals(false, evaluateBooleanValue(null, null, "2 > 2"));
		assertEquals(true, evaluateBooleanValue(null, null, "2 <= 2"));
		assertEquals(true, evaluateBooleanValue(null, null, "2 >= 2"));
		assertEquals(true, evaluateBooleanValue(null, null, "2 == 2"));
		assertEquals(false, evaluateBooleanValue(null, null, "2 != 2"));

		assertEquals(true, evaluateBooleanValue(null, null, "\"a\" < \"b\""));
		assertEquals(false, evaluateBooleanValue(null, null, "\"a\" > \"b\""));
		assertEquals(true, evaluateBooleanValue(null, null, "\"a\" <= \"b\""));
		assertEquals(false, evaluateBooleanValue(null, null, "\"a\" >= \"b\""));
		assertEquals(false, evaluateBooleanValue(null, null, "\"a\" == \"b\""));
		assertEquals(true, evaluateBooleanValue(null, null, "\"a\" != \"b\""));
	}
	
	@Test
	public void testListEvaluation() throws Exception {
		assertEquals(3, evaluateIntegerValue(null, null, "SequenceFunctions::size((1, 2, 3))"));
		assertEquals(true, evaluateBooleanValue(null, null, "SequenceFunctions::includes((1, 2, 3), 1)"));
	}
	
	@Test
	public void testFeatureReferenceEvaluation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		eval(instance, 
				"attribute def Annotation { attribute a; } " +
		        "attribute x {@Annotation{a = 1;}}");
		
		assertEquals(1, evaluateIntegerValue(instance, 
				checkAnnotatingFeature(instance, "Annotation", "x"), 
				"Annotation::a"));		
	}
	
	@Test
	public void testEnumeratedValueEvaluation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		eval(instance, 
				"attribute def Annotation { attribute a; } " +
			    "enum def E { e; }" +
		        "attribute x {@Annotation{a = E::e;}}");
		
		assertEquals(instance.resolve("E::e"), 
				evaluateSingleValue(instance, 
						checkAnnotatingFeature(instance, "Annotation", "x"), 
						"Annotation::a"));		
	}
	
	@Test
	public void testSelfReferenceEvaluation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		eval(instance, 
				"attribute def Annotation; " +
		        "attribute x {@Annotation;}");
		
		AnnotatingFeature feature = checkAnnotatingFeature(instance, "Annotation", "x");
		assertEquals(feature, evaluateSingleValue(instance, feature, "self"));		
	}
	
	@Test
	public void testIsTypeEvaluation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		eval(instance, 
				"attribute def Annotation { attribute a; attribute b; } " +
			    "enum def E { e; }" +
		        "attribute x {@Annotation{a = E::e; b = 2;}}");
		
		AnnotatingFeature feature = checkAnnotatingFeature(instance, "Annotation", "x");
		assertTrue(evaluateBooleanValue(instance, feature, "Annotation::a istype E"));		
		assertTrue(evaluateBooleanValue(instance, feature, "Annotation::b istype ScalarValues::Integer"));		
	}
	
	@Test
	public void testSelfIsTypeEvaluation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		eval(instance, 
				"attribute def Annotation; " +
				"attribute x {@Annotation;}");
		
		assertTrue(evaluateBooleanValue(instance, 
				checkAnnotatingFeature(instance, "Annotation", "x"), 
				"@Annotation"));
	}

}
