package day35_Encapsulation.encapsulation;

public class Person {

    private String name; // these are private instances. we can only read it using getter and modify it using setter
    private int age;

    /* getters and setters need to be use outside of the class.
    And they should be 'public' in order to be used
     */

    public String getName(){ // getter for name
        return name;
    }

    public void setName(String name){ // setter fo name
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age <= 0){
            System.err.println("Invalid age " + age);
            System.exit(0);
        }
        this.age = age;
    }

 /*  We can declare a condition because our intances are 'private'
 we can not do the same when instances are public.
  */


}
