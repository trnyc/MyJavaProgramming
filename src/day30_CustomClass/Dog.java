package day30_CustomClass;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;


    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;
    }


    public void eat(){
        System.out.println(name+ " is eating");
    }

    public void bark(){
        System.out.println(name + " is barking");
    }

 /* Custom classes are not for running, they are for creating objects.
 thats why we do not need 'main method' here.

  AND every custom class needs 'toString' method in order to print
  date. otherwise it will print hashcode.
  'toString' method must be created here inside custom class so that
  you can use it in other methods.

  HOW TO:   right click on intelli J page and sellect 'generate.
            and then sellect 'toString'
            on the next page sellect the attributes/objects you want to use
            uncheck 'Insert Override' and click OK
  */

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';




    }
}
/*
Attributes:
    name, age, gender, breed, size, color


Actions:
    eat(), play(), bark() ......





 */