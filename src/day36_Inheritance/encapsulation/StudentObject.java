package day36_Inheritance.encapsulation;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("Ali", 15, 'M', 'A', "Harvard");
        student1.setAge(45); // to change a specific data
        System.out.println(student1);

    }
}
