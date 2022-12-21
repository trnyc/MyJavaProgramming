package abc_Practice_B28.kahoot_constructor_encapsulation_inheritance_finalKeyword;

public class Customer {
    private String name = "Jenny";

    public Customer(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
