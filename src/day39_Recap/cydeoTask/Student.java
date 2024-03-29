package day39_Recap.cydeoTask;

public class Student extends Person {

    private int studentId;
    private String fieldOfStudy;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public void study(){
        System.out.println(getName()+ " is studying");
    }

// after used 'extends' keyword in class name
    public Student(String name, int age, char gender, int studentId, String fieldOfStudy) {
        super(name, age, gender);
//        this.studentId = studentId;
//        this.fieldOfStudy = fieldOfStudy;
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}


/*
 6. Create a sub class of Person named Student

            Extra variables:
                studentId, fieldOfStudy

            Encapsulate all the fields

            Add a constructor to set all the fields

            Encapsulate all the fields

            Methods:
                study()
 */