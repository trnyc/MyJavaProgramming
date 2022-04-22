package day37_Inheritance.animalTask;

public class Cat extends Animal{
// After you passed 'extends' here, intelli j will give error, because in animal class has constructor with argument
// thats why you must call it explicitly. intelli j has a shortcut for it
// if you click on the error lamb, it will show you shortcut to call constructor, with 'super()' keyword

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }
}
