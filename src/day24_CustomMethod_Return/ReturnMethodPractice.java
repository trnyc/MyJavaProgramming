package day24_CustomMethod_Return;

public class ReturnMethodPractice {



        public static int max(int a, int b){

            int result = 0;
            if(a > b){
                result = a;
            }else{
                result = b;
            }
            return result;
        }




    public static void main(String[] args) {

        //find the max number between 100 and 200

        int maxNumber = max(100, 200); //whenever you call max (return method) it asks to enter int number
        System.out.println(maxNumber);


        // multiply the max number by 2

        int multiplication = maxNumber * 2;
        System.out.println(multiplication);





    }//THIS IS BRACE OF MAIN METHOD. OUR RETURN METHOD WILL BE OUT OF THIS









}
