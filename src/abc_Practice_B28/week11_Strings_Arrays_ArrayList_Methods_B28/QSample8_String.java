package topicsKahoot.week11_Strings_Arrays_ArrayList_Methods_B28;

public class QSample8_String {
    public static void main(String[] args) {

        String str1 ="Java";
        String str2 = new String("java");

        if(str1.equalsIgnoreCase(str2)){ // This line should be added
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }


    }


}
