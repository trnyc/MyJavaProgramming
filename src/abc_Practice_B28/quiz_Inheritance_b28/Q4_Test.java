package abc_Practice_B28.quiz_Inheritance_b28;

    class A {
        public A(){
            System.out.println("A ");
        }
    }

    class B extends A {
        public B(){
            System.out.println("B ");
        }
    }

    public class Q4_Test extends B{
        public Q4_Test(){
            System.out.println("C ");
        }

        public static void main(String[] args) {
            B obj = new B();
        }
    }// AB
