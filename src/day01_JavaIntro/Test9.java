package day01_JavaIntro;

public class Test9 {
    public static void main(String[] args) {

        String sentence1 = "Java Java Java Java Python C# Ruby C++ Swift";

        int originalLength = sentence1.length();

        String temp = sentence1.replace("Java", "abc");

        System.out.println("temp = " + temp);

        int newLength = temp.length();
        System.out.println(sentence1);
        System.out.println(temp);

        System.out.println(originalLength);
        System.out.println(newLength);

        int frequencyOfJava = originalLength - newLength;

        System.out.println("frequencyOfJava = " + frequencyOfJava);

    }
}
