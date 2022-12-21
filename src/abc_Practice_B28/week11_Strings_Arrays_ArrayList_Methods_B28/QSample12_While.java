package topicsKahoot.week11_Strings_Arrays_ArrayList_Methods_B28;

public class QSample12_While {
    public static void main(String[] args) {

        int x= 0;
        int y= 2;
        while ((y !=0) && (x/y) >= 0){
            x= x+1;
            y=y-1;

        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);

//        Ouput= x = 2
//                y=0

    }
}
