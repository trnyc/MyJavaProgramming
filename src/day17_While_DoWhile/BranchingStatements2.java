package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i < 'F'; i++) {

            if(i == 'C'){//when i==C
                continue;//it will skip the C and continue to execute
            }
            System.out.println(i);
        }

        System.out.println("____________________________________________");
        // print all the even numbers 1 to 15

        for (int i = 1; i <=15 ; i++) {

            if(i % 2 == 1){// will skip odds
                continue;
            }
            System.out.println(i);
        }


        System.out.println("________-----------_________________------------");
        // print all the odd numbers 1 to 15

        for (int i = 1; i <=15 ; i++) {

            if(i%2==0){// will skip evens
                continue;
            }
            System.out.println(i);
        }





    }
}
