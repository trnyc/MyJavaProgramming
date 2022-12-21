package topicsKahoot.week11_Strings_Arrays_ArrayList_Methods_B28;

public class QSample14_TwoDmnsnlArray {
    public static void main(String[] args) {

        String shirts [][] = new String[2][2];
        shirts [0][0]= "red";
        shirts [0][1]= "blue";
        shirts [1][0]= "small";
        shirts [1][1]= "medium";


        // line 1  Which enables to prints red blue small medium

        for (int i = 0; i < 2;) {
            for (int j = 0; j < 2; ) {
                System.out.println(shirts[i][j]);
                    j++;
            }
                i++;
        }


        //        for (int i = 0; i < 2;i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.println(shirts[i][j]);
//
//            }
//
//        }




    }
}
