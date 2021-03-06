/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.projectweb.projectWeb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>program Web</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.projectweb.projectWeb.programWeb#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.xtext.example.projectweb.projectWeb.programWeb#getNav <em>Nav</em>}</li>
 *   <li>{@link org.xtext.example.projectweb.projectWeb.programWeb#getGoto <em>Goto</em>}</li>
 *   <li>{@link org.xtext.example.projectweb.projectWeb.programWeb#getIf <em>If</em>}</li>
 *   <li>{@link org.xtext.example.projectweb.projectWeb.programWeb#getFonction <em>Fonction</em>}</li>
 *   <li>{@link org.xtext.example.projectweb.projectWeb.programWeb#getProc <em>Proc</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.projectweb.projectWeb.ProjectWebPackage#getprogramWeb()
 * @model
 * @generated
 */
public interface programWeb extends EObject
{
  /**
   * Returns the value of the '<em><b>Declarations</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' attribute list.
   * @see org.xtext.example.projectweb.projectWeb.ProjectWebPackage#getprogramWeb_Declarations()
   * @model unique="false"
   * @generated
   */
  EList<String> getDeclarations();

  /**
   * Returns the value of the '<em><b>Nav</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nav</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nav</em>' attribute.
   * @see #setNav(String)
   * @see org.xtext.example.projectweb.projectWeb.ProjectWebPackage#getprogramWeb_Nav()
   * @model
   * @generated
   */
  String getNav();

  /**
   * Sets the value of the '{@link org.xtext.example.projectweb.projectWeb.programWeb#getNav <em>Nav</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nav</em>' attribute.
   * @see #getNav()
   * @generated
   */
  void setNav(String value);

  /**
   * Returns the value of the '<em><b>Goto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goto</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goto</em>' attribute.
   * @see #setGoto(String)
   * @see org.xtext.example.projectweb.projectWeb.ProjectWebPackage#getprogramWeb_Goto()
   * @model
   * @generated
   */
  String getGoto();

  /**
   * Sets the value of the '{@link org.xtext.example.projectweb.projectWeb.programWeb#getGoto <em>Goto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goto</em>' attribute.
   * @see #getGoto()
   * @generated
   */
  void setGoto(String value);

  /**
   * Returns the value of the '<em><b>If</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If</em>' attribute.
   * @see #setIf(String)
   * @see org.xtext.example.projectweb.projectWeb.ProjectWebPackage#getprogramWeb_If()
   * @model
   * @generated
   */
  String getIf();

  /**
   * Sets the value of the '{@link org.xtext.example.projectweb.projectWeb.programWeb#getIf <em>If</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If</em>' attribute.
   * @see #getIf()
   * @generated
   */
  void setIf(String value);

  /**
   * Returns the value of the '<em><b>Fonction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fonction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fonction</em>' attribute.
   * @see #setFonction(String)
   * @see org.xtext.example.projectweb.projectWeb.ProjectWebPackage#getprogramWeb_Fonction()
   * @model
   * @generated
   */
  String getFonction();

  /**
   * Sets the value of the '{@link org.xtext.example.projectweb.projectWeb.programWeb#getFonction <em>Fonction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fonction</em>' attribute.
   * @see #getFonction()
   * @generated
   */
  void setFonction(String value);

  /**
   * Returns the value of the '<em><b>Proc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proc</em>' attribute.
   * @see #setProc(String)
   * @see org.xtext.example.projectweb.projectWeb.ProjectWebPackage#getprogramWeb_Proc()
   * @model
   * @generated
   */
  String getProc();

  /**
   * Sets the value of the '{@link org.xtext.example.projectweb.projectWeb.programWeb#getProc <em>Proc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proc</em>' attribute.
   * @see #getProc()
   * @generated
   */
  void setProc(String value);

} // programWeb
