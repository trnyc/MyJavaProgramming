package day25_CustomMethod_Overloading;

public class MainMethodOverloading {

/* MAIN METHOD CAN BE ALSO OVERLOADED
But when you run this class, only the first main method will be executed.
Because its the original one different from the others.
 */


    public static void main(String[] args) {
        System.out.println("String");
    }

    public static void main(int[] args) {
        System.out.println("int");
    }

    public static void main(double[] args) {
        System.out.println("double");
    }

    public static void main(char[] args) {
        System.out.println("char");
    }


}