package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {


        //System.out.println(ProtectedAccessModifier.name1); // default is not visible outside the package

        System.out.println(ProtectedAccessModifier.name2); // protected is visible outside the package in subclass only

       // AccessModifiers_Test4.method1(); default method is not visible
        AccessModifiers_Test4.method2(); // protected method is visible bec. this is a subclass.



    }
}
