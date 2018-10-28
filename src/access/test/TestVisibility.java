/*
 * Test Visibility in Java
 */
package access.test;

import access.packageone.Alpha;
import access.packageone.Beta;
import access.packageone.Ipsilon;
import access.packagetwo.Delta;
import access.packagetwo.Gamma;

/**
 *
 * @author Turbotwins
 */
public class TestVisibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alpha alphaObject = new Alpha();
        System.out.println("------------------------alphaObject.visibilityInClass--------------------");
        alphaObject.visibilityInClass();
        Beta betaObject = new Beta();
        System.out.println("------------------------betaObject.visibilityInClassSuperClass--------------------");
        betaObject.visibilityInSuperClass();
        Gamma gammaObject = new Gamma();
        System.out.println("------------------------gammaObject.visibilityInOtherPackage--------------------");
        gammaObject.visibilityInOtherPackage();
        Delta deltaObject = new Delta();
        System.out.println("------------------------deltaObject.visibilityInSuperClassInOtherPackage--------------------");
        deltaObject.visibilityInSuperClassInOtherPackage();
        Ipsilon ipsilonObject = new Ipsilon();
        System.out.println("------------------------ipsilonObject.visibilityInClass--------------------");
        ipsilonObject.visibilityInClass();
    }
    
}
