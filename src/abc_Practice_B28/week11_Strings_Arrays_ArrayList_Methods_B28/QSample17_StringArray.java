package topicsKahoot.week11_Strings_Arrays_ArrayList_Methods_B28;

public class QSample17_StringArray {
    public static void main(String[] args) {

        String [][] arr= {{"A","B","C"},{"D","E"}};

        for (int i = 0; i <arr.length ; i++) {


            for (int j = 0; j < arr[i].length ; j++) {
                System.out.println(arr[i][j]);
                if(arr[i][j].equals("B")){
                    break;
                }
 // output A  B  D  E
            }

        }


    }


}
