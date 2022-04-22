package day37_Inheritance.animalTask;

public class Animal {

    public String name, breed;
    public char gender;
    public int age;
    public String size;
    public String color;

    /* If we dont create a constructor here, the compiler will create a default constructor implicitly.
    Constructor can not be inherited.
    But when we create a constructor with the same name of class, it will again give compile error.
    Again, if we dont create a constructor, the compiler will create a default one implicitly
    and the child class will call constructor implicitly. If there is no default constructor
    in parent class (a manually created one instead) child class must call constructor explicitly.
    In this situation we must use 'super' keyword
     */

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public void eat(){
        System.out.println(name + "is eating");
    }

    public void drink(){
        System.out.println(name+ " is drinking");
    }

    public void  move(){
        System.out.println(name+ " is moving");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }


    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
