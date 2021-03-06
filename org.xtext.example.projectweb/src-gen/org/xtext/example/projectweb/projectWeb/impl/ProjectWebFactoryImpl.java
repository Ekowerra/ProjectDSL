/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.projectweb.projectWeb.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.projectweb.projectWeb.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectWebFactoryImpl extends EFactoryImpl implements ProjectWebFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ProjectWebFactory init()
  {
    try
    {
      ProjectWebFactory theProjectWebFactory = (ProjectWebFactory)EPackage.Registry.INSTANCE.getEFactory(ProjectWebPackage.eNS_URI);
      if (theProjectWebFactory != null)
      {
        return theProjectWebFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ProjectWebFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectWebFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ProjectWebPackage.PROGRAM_WEB: return createprogramWeb();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public programWeb createprogramWeb()
  {
    programWebImpl programWeb = new programWebImpl();
    return programWeb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectWebPackage getProjectWebPackage()
  {
    return (ProjectWebPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ProjectWebPackage getPackage()
  {
    return ProjectWebPackage.eINSTANCE;
  }

} //ProjectWebFactoryImpl
