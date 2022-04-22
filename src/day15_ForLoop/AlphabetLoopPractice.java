package day15_ForLoop;

public class AlphabetLoopPractice {
    public static void main(String[] args) {


//print A-Z, a-z, z-a, Z-A.

        for(char x = 'A'; x <= 'Z'; ++x){//you can use ++x, x++ or x+=1
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------");

        for(char x = 'a'; x <='z'; x += 1){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------");

        for(char x = 'z'; x >='a'; x -= 1){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------");

        for(char x = 'Z'; x >='A'; x--){
            System.out.print(x + " ");
        }

    }
}
