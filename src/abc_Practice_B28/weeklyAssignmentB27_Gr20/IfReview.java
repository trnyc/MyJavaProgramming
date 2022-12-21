package abc_Practice_B28.weeklyAssignmentB27_Gr20;

public class IfReview {

    public static String name;
    static {
        name = "heyo";
    }

    public static void main(String[] args) {
        IfReview ifReview = new IfReview();
        ifReview.name = "yoyo";

        IfReview newIfReview = new IfReview();
        newIfReview.name = "nono";

        IfReview lastIfReview = new IfReview();

        System.out.println(lastIfReview.name);

//        System.out.println(ifReview.name);
//        System.out.println(newIfReview.name);

    }
}
