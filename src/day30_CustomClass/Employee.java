package day30_CustomClass;

public class Employee {

    public String name;
    public char gender;
    public int age;
    public int id;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;


    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }


    public void work(){
        System.out.println(jobTitle+ " "+ name + " is working");
    }


//How to creat setInfo method
    /* HOW TO CREATE SETINFO METHOD ON ITELLI J USING SHORTCUT
 ** After declaring yor variables/objects/attributes
    1. Right click on the screen and sellect 'Generate'
    2. Sellect 'Constructor'
    3. On the oppening page sellect all by 'ctra + a' or 'Shitf + clict'
    4. Press OK
    5. Change method name as 'void setInfo'
  */

/* AND I NEED toString() METHOD TO BE ABLE TO PRINT EMPLOYEE OBJECT
    WITHOUT toString METHOD I CAN NOT PRINT ANYTHING BUT HASHCODE
 *** TO CREATE toString METHOD
        1. Rigth click and sellecet Generate
        2. Then sellect toString()
        3. On the oppening page sellect all or what you need
        4. UNCHECK 'Insert Override'
        5. Press OK
 */




}
