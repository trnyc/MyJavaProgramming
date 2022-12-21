package abc_Practice_B28.dateAndTimePracticeWithAdam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StudentObje {
    public static void main(String[] args) {

        Student student1=new Student("A",1);
        Student student2=new Student("B",2);
        Student student3=new Student("C",3);
        Student student4=new Student("D",4);
        Student student5=new Student("E",5);
        Student student6=new Student("F",6);
        Student student7=new Student("G",7);

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(student1, student2, student4, student6, student5, student7, student3));

        System.out.println(students);

        Collections.sort(students);

        System.out.println(students);


    }
}
