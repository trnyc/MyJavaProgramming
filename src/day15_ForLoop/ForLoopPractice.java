package day15_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        for(int i = 15; i <=45 ; i++){
            System.out.print(i+ " ");//15 16 17 ......45
        }
        System.out.println();//to start a new line
        System.out.println("--------------------------------------");

        for (int i2 = 100; i2 >= 50; i2--){
            System.out.print(i2 + " ");//100 99 98 .....50
        }
        System.out.println();
        System.out.println("--------------------------------------");

//print all even numbers 1-55

        for (int i = 2; i < 55; i += 2){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------OR----------------------");

        for (int i = 1; i <= 55; i++){
            if(i%2 ==0){
                System.out.print(i +" ");
            }
        }
        System.out.println();
        System.out.println("--------------------------------------------------");






    }
}
