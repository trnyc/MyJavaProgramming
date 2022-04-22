package day32_Constructors;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;


    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, char gender){
        this(name); //this.name = name;
        this.gender = gender;

    }

    public Employee(String name, char gender, String jobTitle){
        this(name, gender);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary){
        this(name, gender, jobTitle);
        this.salary = salary;
    }


    /*
    public void method1(){
        this("Aaron");
    }
*/

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }


    /*
    public void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        method1();
    }
    */



 /* IMPORTANT= Here we have created two constructors
    -first one includes only one variable which is name
    -second one has two, which are name and gender.
    - Yes, we can create more than one constructers in same class
        but, parameters must be different just like in methods overloading
    - And, in second constructor, istead of using 'name' variable, which is
        already declared in first constructor, we must call first constructor
        to be able to use it. This is because constructor is a special method.
    - Calling and using a constructor in another constructor is different than
        method. WE MUST USE 'this()' keyword to do this.
    - In JAVA constructors can not be called by their names.
        you need to pass the name of the attribute/function in the parenthesis
        of 'this()' keyword to call a constructor into another constructor.
        So:
            tihs. => is to call instance variables, attribute / function in a constructor body
            this() => is for calling a constructor into another constructor

        ==> THERE ARE SOME RULES WHILE USING this()
                1. Constructor can not be called by its name ( this() need to be used )
		        2. Only a constructor can call another constructor
		        3. Constructor call MUST be at the first step
		        4. One constructor can not call more than one constructor
		        5. Constructor can not call or contain itself

  */

}
