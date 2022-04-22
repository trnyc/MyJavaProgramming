package day37_Inheritance.animalTask;

public class Parrot extends Animal{
//             sub          super
//             child        parent

/*
if you want to add somthing extra that is unique for Parrot for ex.
you must add it manually and also add it into the constructor using 'this.' keyword
SEE line 13 and line 17.
 */

    public String parrotWingColor;

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
        this.parrotWingColor = parrotWingColor;
    }

    public void sing(){
        System.out.println(name + " is singing");
    }


}
