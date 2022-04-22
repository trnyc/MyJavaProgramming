package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Jhon";
        String lastName = "Doe";
        int age = 45;
        String jobTitle = "SDET";
        String companyName = "Google";
        double salary = 100000.50;

        String fullName = firstName + " " + lastName;
// if you want to put space between your words put a spece with " "

        System.out.println(fullName);

// print <Full name of the person is ........>
        System.out.println("Full name of the person is " + fullName);

// print <........is ......... years old
        System.out.println(fullName + " is " + age + " years old. ");

//print <fullName is jobTitle, works at companyName, and fullName's salary is salary>
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + " and " + fullName + "'s salary is " + salary);


    }
}
