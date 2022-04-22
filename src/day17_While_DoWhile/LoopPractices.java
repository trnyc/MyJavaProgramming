package day17_While_DoWhile;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {//Everything inside the parantesis
            System.out.println(i);
        }

        System.out.println("-----------------------------------");

        int j=1;//initialization outside
        while(j <= 10){//condition

            System.out.println(j);
            j++;//iteration after the statement
        }

        System.out.println("-----------------------------------");
        int k =1;//initialization
        do{

            System.out.println(k);
            k++;//statement and iteration before the condition
        }while(k <= 10);//condition



    }
}
