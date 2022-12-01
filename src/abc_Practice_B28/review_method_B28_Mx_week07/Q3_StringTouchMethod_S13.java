package abc_Practice_B28.review_method_B28_Mx_week07;

public class Q3_StringTouchMethod_S13 {

    public static void main(String[] args) {

        String head= "shoulders";
        String knees= "toes";
        String elbow= "head";
        String eye= "eyes and ears";
        String ear = "eye";


        touch (ear, elbow);
        touch (elbow,ear);
        touch(head, "bani");
        touch(eye,eye);
        touch(knees, "Toes");
        touch(head, "knees" + knees);

    }

    public static void touch(String elbow, String ear){

        System.out.println("touch your " + elbow + " to your " + ear);
    }



    /*
    touch you eye to your head
touch you head to your eye
touch you shoulders to your bani
touch you eyes and ears to your eyes and ears
touch you toes to your Toes
touch you shoulders to your kneestoes
    */


}
