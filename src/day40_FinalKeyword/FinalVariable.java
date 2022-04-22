package day40_FinalKeyword;

public class FinalVariable {


    final String birthDate; //if you declare an instance variable before creating object it will give compile error
    final static String name;

    static{
        name = "EU 8";
    }

    public FinalVariable(String birthDate) {
        this.birthDate = birthDate;
    }

    //==========================================================================================================

    public static void main(String[] args) {


//        double pi = 3.14; // you can reassign
//
//        pi = 5.14;
//        pi = 4.14;

// but if you use 'final' keyword you can not assign a new value and change it.

        final double pi = 3.14;

        //pi = 5.14; compile error
        //pi = 4.14; compile error

        final String name; // declare a variable name without a value

        name = "Java"; // you can assign a value ONLY ONE TIME, NEVER CAN CHANGE IT

        //name = "Python"; not possible

        System.out.println("----------------------------------------");

        FinalVariable obj = new FinalVariable("May/01");
        //obj.birthDay = "June/01"; // final variables can not be reassigned
        System.out.println(obj.birthDate);


        System.out.println("----------------------------------------");

        //  FinalVariable.name = "Python";

        System.out.println(FinalVariable.name);







    }
}
