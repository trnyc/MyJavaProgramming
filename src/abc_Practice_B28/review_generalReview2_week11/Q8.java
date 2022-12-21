package abc_Practice_B28.review_generalReview2_week11;

public class Q8 {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String ("java");

        if(str1.equalsIgnoreCase(str2)){
        //if(str1.toLowerCase() == str2.toLowerCase()){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

    }
}
