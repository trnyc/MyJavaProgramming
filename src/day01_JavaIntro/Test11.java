package day01_JavaIntro;

public class Test11 {
    public static void main(String[] args) {

        boolean x, z = true;
        int y = 20;

        x = (y == 10) || (z = false);

        System.out.println("x = " + x);
        System.out.println("z = " + z);


    }
}
