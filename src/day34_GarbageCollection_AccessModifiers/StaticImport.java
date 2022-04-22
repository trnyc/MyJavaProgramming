package day34_GarbageCollection_AccessModifiers;


import static day34_GarbageCollection_AccessModifiers.Circle.pi;

/*  This is how to IMPORT  a static member from another class.
        If you want to use only one member, you dont need to import whole class.
        To import oll the members of class, use '*' after class name
 */

public class StaticImport {

    public static void main(String[] args) {

        System.out.println(pi);

// after import, you can directly use static member without using class name.



    }
}

/*
static import vs regular import

		regular import: imports everything from the class
			                import packageName.className;
			                import packageName.*;


		static import:

			import static packageName.className.staticMember;  // imports one static member of a class
			import static packageName.className.*;			 // imports all static members of a class
 */