/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.NonNotifyingEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PackageImpl#getFilterCondition <em>Filter Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends NamespaceImpl implements org.omg.sysml.lang.sysml.Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Expression> getFilterCondition() {
		EList<Expression> filterConditions = new NonNotifyingEObjectEList<>(Expression.class, this, SysMLPackage.PACKAGE__FILTER_CONDITION);
		getElementFilters().forEachOrdered(filterConditions::add);
		return filterConditions;
	}

	/**
	 * The cached OCL expression body for the '{@link #includeAsMember(org.omg.sysml.lang.sysml.Element) <em>Include As Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #includeAsMember(org.omg.sysml.lang.sysml.Element)
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_AS_MEMBER__ELEMENT__EOCL_EXP = "let metadataAnnotations: Sequence(Element) = "+
"    element.ownedAnnotation.annotatingElement->"+
"        select(oclIsKindOf(AnnotatingFeature) in"+
"    self.filterCondition->exists(cond | "+
"        metadataAnnotations->forAll(elem | "+
"            self.checkCondition(elem, cond))";
	/**
	 * The cached OCL query for the '{@link #includeAsMember(org.omg.sysml.lang.sysml.Element) <em>Include As Member</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #includeAsMember(org.omg.sysml.lang.sysml.Element)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> INCLUDE_AS_MEMBER__ELEMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includeAsMember(Element element) {
		if (INCLUDE_AS_MEMBER__ELEMENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SysMLPackage.Literals.PACKAGE, SysMLPackage.Literals.PACKAGE.getEAllOperations().get(4));
			try {
				INCLUDE_AS_MEMBER__ELEMENT__EOCL_QRY = helper.createQuery(INCLUDE_AS_MEMBER__ELEMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(INCLUDE_AS_MEMBER__ELEMENT__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("element", element);
		return ((Boolean) query.evaluate(this)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #checkCondition(org.omg.sysml.lang.sysml.Element, org.omg.sysml.lang.sysml.Expression) <em>Check Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #checkCondition(org.omg.sysml.lang.sysml.Element, org.omg.sysml.lang.sysml.Expression)
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_CONDITION__ELEMENT_EXPRESSION__EOCL_EXP = "let result: Element = condition.evaluate(element) in"+
"    result.oclIsKindOf(LiteralBoolean) and "+
"    result.oclAsType(LiteralBoolean).value";
	/**
	 * The cached OCL query for the '{@link #checkCondition(org.omg.sysml.lang.sysml.Element, org.omg.sysml.lang.sysml.Expression) <em>Check Condition</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #checkCondition(org.omg.sysml.lang.sysml.Element, org.omg.sysml.lang.sysml.Expression)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> CHECK_CONDITION__ELEMENT_EXPRESSION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkCondition(Element element, Expression condition) {
		if (CHECK_CONDITION__ELEMENT_EXPRESSION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SysMLPackage.Literals.PACKAGE, SysMLPackage.Literals.PACKAGE.getEAllOperations().get(5));
			try {
				CHECK_CONDITION__ELEMENT_EXPRESSION__EOCL_QRY = helper.createQuery(CHECK_CONDITION__ELEMENT_EXPRESSION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(CHECK_CONDITION__ELEMENT_EXPRESSION__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("element", element);
		environment.add("condition", condition);
		return ((Boolean) query.evaluate(this)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.PACKAGE__FILTER_CONDITION:
				return getFilterCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.PACKAGE__FILTER_CONDITION:
				getFilterCondition().clear();
				getFilterCondition().addAll((Collection<? extends Expression>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.PACKAGE__FILTER_CONDITION:
				getFilterCondition().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.PACKAGE__FILTER_CONDITION:
				return !getFilterCondition().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.PACKAGE___INCLUDE_AS_MEMBER__ELEMENT:
				return includeAsMember((Element)arguments.get(0));
			case SysMLPackage.PACKAGE___CHECK_CONDITION__ELEMENT_EXPRESSION:
				return checkCondition((Element)arguments.get(0), (Expression)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PackageImpl
