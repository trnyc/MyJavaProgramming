package day36_Inheritance.animalTask;

public class Dog extends Animal {
    //      child       parent
    //      sub         super

    public void bark(){
        System.out.println(name + " is barking");
    }

}


/*
we have created all common data for all animals in 'Animal' class, so that we will be able to use
all these instances and methods in other animal classes via 'inheritance'
We dont need to write all these codes again and again.
Inheritance is different than importing.
Importing is like borrowing, but inheriting is owning.
That means, now Dog class has 6 variables and 8 methods that created in Animal class
 */