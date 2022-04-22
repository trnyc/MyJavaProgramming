package day39_Recap.cydeoTask;

public class Employee extends Person {

    private int employeeID;
    private String jobTitle;
    private double salary;



    // R.click -> Generate -> Getter and Setter -> select all -> OK
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){

    }
// after used 'extends' keyword in clas name => R.click -> Generate -> Constructor -> select -> OK
    // And replace all 'this.' keywords with 'set' keyword
    public Employee(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

// R.click -> Generate -> toString() -> select all -> OK
// copy and paste 'name, age, gender lines from parent class of Person and replace instance nemes
// to call them by 'getter' because they are 'privete'
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/*
2. Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()
 */