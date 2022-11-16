package abc_Practice_B28;


public class TestTest {
    public static void main(String[] args) {


        String head = "shoulders";
        String knees = "toes";
        String elbow = "head";
        String eye = "eyes and ears";
        String ear = "eye";

        touch(ear, elbow);
        touch(elbow, ear);
        touch(head, "bani");
        touch(eye, eye);
        touch(knees, "Toes");
        touch(head, "knees " + knees);




    }

    public static void touch(String elbow, String ear) {
        System.out.println("touch your " + elbow + " to your " + ear);
    }


//    public class Strange {
//        public static void main(String[] args) {
//            second();
//            first();
//            second();
//            third();
//        }
//
//        public static void first() {
//            System.out.println("Inside first method.");
//        }
//
//        public static void second() {
//            System.out.println("Inside second method.");
//            first();
//        }
//
//        public static void third() {
//            System.out.println("Inside third method.");
//            first();
//            second();
//        }
//    } ISBKTRIS



}

