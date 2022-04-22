package day33_Statics;

import java.util.Arrays;

public class C02_StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Ali");

        Student student2 = new Student("Fatma", 'F');

        Student student3 = new Student("Veli", 112);

        Student student4 = new Student("Kamil", 114, 'A');

        Student student5 = new Student("Elif", 'F', 28);

        Student student6 = new Student("Salih", 'M', 35, 118);

        Student student7 = new Student("Gunnur", 'F', 47, 119, 'A');


        System.out.println(student1 == student2);// false

        Student[] students = {student1, student2, student3, student4, student5, student6, student7};

        System.out.println(Arrays.toString(students));



    }
}
