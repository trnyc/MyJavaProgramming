package day36_Inheritance.animalTask;

public class Cat extends Animal{

    public void meow(){
        System.out.println(name + " is meowing");
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }


}


/*
we have created all common data for all animals in 'Animal' class, so that we will be able to use
all these instances and methods in other animal classes via 'inheritance'
We dont need to write all these codes again and again.
Inheritance is different than importing.
Importing is like borrowing, but inheriting is owning.
That means, now Cat class has 6 variables and 8 methods that created in Animal class
 */