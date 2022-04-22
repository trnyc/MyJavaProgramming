package day32_Constructors;

public class ConstructorCalls {


    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this(); // first/default constructor
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(String str){
        this(10); // second/int constructor
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls(); // Default Constructor

        System.out.println("-----------------------------------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(11); // Default Constructor
                                                            // Constructor with int argument

        System.out.println("------------------------------------------------------");

        ConstructorCalls obj3 = new ConstructorCalls("java"); // Default Constructor
                                                              // Constructor with int argument
                                                              // Constructor with String argument


        // THIS IS CONSTRUCTOR CHAIN

    }






}
