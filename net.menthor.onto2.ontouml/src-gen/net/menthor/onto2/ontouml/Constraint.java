/**
 */
package net.menthor.onto2.ontouml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * A "Constraint" is a constraint usually written in OCL.
 *  Here we support static invariants and derivations from standard OCL
 *  And also, temporal invariants and definition of historical relationships.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.menthor.onto2.ontouml.Constraint#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Constraint#getName <em>Name</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Constraint#getRuleAsString <em>Rule As String</em>}</li>
 * </ul>
 *
 * @see net.menthor.onto2.ontouml.OntoumlPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends ContainedElement {
	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * The literals are from the enumeration {@link net.menthor.onto2.ontouml.ConstraintSteteotype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see net.menthor.onto2.ontouml.ConstraintSteteotype
	 * @see #setStereotype(ConstraintSteteotype)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getConstraint_Stereotype()
	 * @model unique="false"
	 * @generated
	 */
	ConstraintSteteotype getStereotype();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Constraint#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see net.menthor.onto2.ontouml.ConstraintSteteotype
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(ConstraintSteteotype value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getConstraint_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Constraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rule As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule As String</em>' attribute.
	 * @see #setRuleAsString(String)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getConstraint_RuleAsString()
	 * @model unique="false"
	 * @generated
	 */
	String getRuleAsString();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Constraint#getRuleAsString <em>Rule As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule As String</em>' attribute.
	 * @see #getRuleAsString()
	 * @generated
	 */
	void setRuleAsString(String value);

} // Constraint
