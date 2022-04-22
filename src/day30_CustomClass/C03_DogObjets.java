package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_DogObjets {
    public static void main(String[] args) {

/* Creating object from Dog class
in order to access to the class we must use (.) dot operator
 */

       Dog dog1 = new Dog();

       dog1.name = "Lucy";
       dog1.breed = "Husky";
       dog1.age = 5;
       dog1.gender = 'F';
       dog1.size = "Small";
       dog1.color = "White";

        System.out.println(dog1);

/* You can not print objects of Custom clsses without 'toString' method.
And you must pass 'toString' method in the Custom Class.
 */


        Dog dog2 = new Dog();

        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";

        System.out.println(dog2);

 /* Here we have created different objects, have different variables,
 but to make it easier when we need to input multiple objects and
 variables, we can pass set of information. To make this,
 we need to create a method.
  */

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German Shepard", 2, 'M', "Large", "Black");

        System.out.println(dog3);

 // now we can also call methods for dog actions like eat() and bark()
        //when you type dog the options will shop up on the screen as shortcut

        dog1.eat();// when you run the code, will print 'Lucy is eating'

        dog2.bark();// when you run the code, will print 'ACE is barking'


        Dog dog4 = new  Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M',"Extra Large", "Yellow");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();//find female dogs
        ArrayList<Dog> maleDogs = new ArrayList<>();


        for (Dog each : dogs) {
            if(each.gender == 'M'){
                femaleDogs.add(each);
            }else{
                maleDogs.add(each);
            }
        }


        System.out.println("femaleDogs = " + femaleDogs);
        System.out.println("maleDogs = " + maleDogs);







    }
}
