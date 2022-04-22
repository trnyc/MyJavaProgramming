package day37_Inheritance.phoneTask;

public class Iphone extends Phone {
// for a child class its a MUST to call constructor from parent class

    public Iphone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }// brand "Apple" is a common data for all iphones, so we can directly assign it here and we can delete from argument

    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " " + " is having a Face Time with phone number: " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand + " " + model + " is having a Face Time with email: " + email);
    }


}

/*
 1.2 Create a subclass of Phone named IPhone:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    faceTime(long phoneNumber)
                    faceTime(String email)
                    toString()
 */