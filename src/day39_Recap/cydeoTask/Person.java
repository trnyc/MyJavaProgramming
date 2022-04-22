package day39_Recap.cydeoTask;

public class Person {

    private String name;
    private int age;
    private char gender;


// R.click -> generate -> getter and setter-> sellect -> ok
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;// can add conditions
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

// R.click -> Generate -> Constructor -> sellect -> ok
    // Than replace all the 'this.' with 'set'
    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }


    public void eat(){
        System.out.println(name + " is eating");
    }


    public void drink(){
        System.out.println(name+ " is drinking");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

/*
 1. Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                eat()
                drink()
                sleep()
                toString()
 */