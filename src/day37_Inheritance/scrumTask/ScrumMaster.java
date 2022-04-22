package day37_Inheritance.scrumTask;

public class ScrumMaster extends Employee {


    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", id, salary, companyName);
    }

// since Scrum Master has only one job title, we deleted from constructor parameter and add manually in super keyword


}
