package abc_Practice_B28.dateAndTimePracticeWithAdam;

public class Student implements Comparable<Student>{
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.id > o.id)
            return 1;
            else if (this.id == o.id)
                return 0;
            else
                return -1;

    }
}
