package day05_Concatenation;
/*
Create a class called StudentInfo, and declare variables for the
followings:
1. student name (String)
2. age (int)
3. gender (char)
4. school name (String)
5. phone number (String) (###)-###-####
6. full time (boolean)
 */
public class StudentInfo {

    public static void main(String[] args) {

        String studentName = "Turan";
        int age = 46;
        char gender = 'M';
        String schoolName = "Cydeo";
        String phoneNumber = "(123)-456-789";
        boolean isFullTime = true;

        System.out.println("studentName = " + studentName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("schoolName = " + schoolName);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("isFullTime = " + isFullTime);

    }
}
