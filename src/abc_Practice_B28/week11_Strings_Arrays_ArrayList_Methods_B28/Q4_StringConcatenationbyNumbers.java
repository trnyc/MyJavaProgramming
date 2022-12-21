package topicsKahoot.week11_Strings_Arrays_ArrayList_Methods_B28;

public class Q4_StringConcatenationbyNumbers {
    public static void main(String[] args) {

        // Java works from up to down  and left to right

        String s = "Java" + 1+2 + "Quiz" +""+ (3+4 );

        String  s1= "Java"+ (1+2)+ "Quiz"+ ""+ 3+4;   //  s1 = Java3Quiz34
        System.out.println("s1 = " + s1);
        String  s2= "Java"+ (1+2)+ "Quiz"+"" +(3+4);  //    s2 = Java3Quiz7
        System.out.println("s2 = " + s2);
        String  s3= "Java"+ 1+2+ "Quiz"+"" +3+4;   //    s3 = Java12Quiz34
        System.out.println("s3 = " + s3);
        String s4 = 1+2 + "Quiz" +""+ (3+4 );  //     s4 = 3Quiz7
        System.out.println("s4 = " + s4);
        String s5 = "" + 1+2 + "Quiz" +""+ (3+4 ); //  s5 = 12Quiz7
        System.out.println("s5 = " + s5);

        System.out.println("s = " + s);  //    s = Java12Quiz7


    }





}
