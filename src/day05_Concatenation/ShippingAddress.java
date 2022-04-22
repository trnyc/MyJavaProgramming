package day05_Concatenation;

public class ShippingAddress {
//HOW TO MAKE MULTIPLE STATEMENTS IN ONE CODE

    public static void main(String[] args) {

        String name = "Jhon Doe", buildingNumber = "123456",
                    streetName = "McLean St.", city = "Arlington",
                    state = "VA", zipCode = "22102";

        System.out.println(name + " " + buildingNumber + " " + streetName + " "
        + " " + city + " " + state + " " + zipCode);/* THIS GIVES EVERYTHING IN SAME LINE
             but the output should be like this:   Jhon Doe
                                                   123456 McLean St.
                                                   Arlington, VA 22102
                                                   */

        System.out.println(name + "\n" + buildingNumber + " " + streetName
                + "\n" + city + ", " + state + " " + zipCode);

//There is another way by giving a veriable to whole address
       String address = name + "\n" + buildingNumber + " " + streetName
               + "\n" + city + ", " + state + " " + zipCode;
        System.out.println(address);

    }
}
/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full address


 */