package abc_Practice_B28.kahoot_constructor_encapsulation_inheritance_finalKeyword;

public class Q15_MyClass {

    int count = 0;

    public void myMethod( Q15_MyClass ref ){
        ref.count++;
    }
}


class Test {
    public static void main(String[] args) {
        Q15_MyClass myClass = new Q15_MyClass();
        myClass.count = 1;
        myClass.myMethod(myClass);

        System.out.println(myClass.count);

    }
} // Output: 2