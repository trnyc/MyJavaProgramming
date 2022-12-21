package abc_Practice_B28.kahoot_constructor_encapsulation_inheritance_finalKeyword;

    class Base {

        public void foo() {
            System.out.println("Base");
        }
    }

    class Derived extends Base {
//        private void foo() {
//            System.out.println("Derived");
//        }
    }

    public class Q14_Main {

        public static void main(String[] args) {
            Base b = new Derived();
            b.foo();
        }

    }
