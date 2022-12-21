package topicsKahoot.week11_Strings_Arrays_ArrayList_Methods_B28;

public class QSample13_Outerfor {
    public static void main(String[] args) {

        outer:     for (int i = 0; i < 4; i++) {
                         if (i==2){
                                  continue ;
                                     }


              inner: for (int j = 0; j < 4; j++) {
                     if (j==2){
                     continue  outer;

                              }
                      if (i==1){
                         break outer;
                      }
                      System.out.println(" i: "+ i + " j: "+ j);

                    }

        }
// Output:
      //  i: 0 j: 0
     //   i: 0 j: 1


    }
}
