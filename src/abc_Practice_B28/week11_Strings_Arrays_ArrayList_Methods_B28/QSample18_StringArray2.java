package topicsKahoot.week11_Strings_Arrays_ArrayList_Methods_B28;

public class QSample18_StringArray2 {
    public static void main(String[] args) {

        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};

        for (int i = 0; i < arr.length; i++) {


            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].equals("B")) {
                    break;
                }
                System.out.println(arr[i][j]);

            }
// Output= A D E
        }
    }}
