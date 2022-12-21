package abc_Practice_B28.quiz_Encapsulation_B28;

public class Q9 {

    static String studentName = "Mike";

    static{
        studentName = "Jordan";
    }

    public static void main(String[] args) {
        studentName = "Jean";
        System.out.println(studentName);
    }
}
