package day30_CustomClass;

public class Student {

    public String name;//instance variables
    public char gender;
    public int age;
    public int ID;
    public char grade;


    /*
    since instance variables and local variable nemes are the same, while creating setInfo method
 we need to use 'this.' keyword, so that compiler will understand its instance name, not local
  variabele.


    public void setInfo(String name, char gender, int age, int ID, char grade){//local variables
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;


 SHORT CUT: there is a shortcut to create a custom method (setInfo) on intelliJ.
  right click on the screen, sellect 'generate', than click Constructor, sellect all parameters and hit ok.
  there will be created our custom method automatically. just change the class name 'void setInfo'
     */



    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }




    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }//toString method


    public void code(){
        System.out.println(name + " is coding");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }


}
