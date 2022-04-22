package day40_FinalKeyword;

public class Zoo {

    public static void main(String[] args) {


            Dog dog = new Dog("Max", "Husky", 'M', "White", "Large", 4);
// since we declared instance variables as 'final' we can not change the values that we assigned here


            System.out.println(dog.getBreed());
            System.out.println(dog.getGender());

            dog.drink();

    }
}
