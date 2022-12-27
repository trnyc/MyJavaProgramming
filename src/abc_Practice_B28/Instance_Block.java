package abc_Practice_B28;

    /* The instance block can be defined as the name-less method in java inside which we can define
    logic and they possess certain characteristics as follows. They can be declared inside classes
    but not inside any method. Instance block logic is common for all the objects. Instance block
    will be executed only once for each object during its creation.
      Instance blocks are executed whenever an object of any kind is created. If we want to write
    a logic that we want to execute on the creation of all kinds of objects, then using instance
    blocks is a good idea to avoid writing the same logic inside every constructor.
      We generally don’t use them for the initialization of objects because they can not accept the
    parameters. If we still use instance blocks for the purpose of initialization, then all the objects
    will have to be initialized with the same values which are practically useless.*/

// Java Program to Illustrate Usage of Instance Blocks

// Class 1
// Helper class
class GFG {
    // Constructors of this class

    // Constructor 1
    // This constructor will get executed for 1st kind of object
    GFG(){
        System.out.println("1st argument constructor");
    }

    // Constructor 2
    // This constructor will get executed for
    // 2nd kind of object
    GFG(String a){

        // Print statement when this constructor is called
        System.out.println("2nd argument constructor");
    }

    // Constructor 3
    // This constructor will get executed for 3rd kind of object
    GFG(int a, int b){

        // Print statement when this constructor is called
        System.out.println("3rd arguments constructor");
    }

    {
        // Creation of an instance block
        System.out.println("Instance block");
    }
}

// Class 2
// Main class
class GFGJava {

    // main driver method
    public static void main(String[] args)
    {

        // Object of 1st kind
        new GFG();

        // Object of 2nd kind
        new GFG("I like Java");

        // Object of 3rd kind
        new GFG(10, 20);
    }
}
/*
Instance block
1st argument constructor
Instance block
2nd argument constructor
Instance block
3rd arguments constructor
*/

//-------------------------------------------------------------------------------------------------

/*
// Java Program to Illustrate Execution of Instance Blocks

// Main class
class GFG {

    // Main driver method
    public static void main(String[] args){

        // Making object of class in main()
        GFG geek = new GFG();
    }

    // Constructor of this class
    GFG(){
        // Print statement when constructor is called
        System.out.println("I am Constructor!");
    }

    {
        // Print statement when instance block is called
        System.out.println("I am Instance block!");
    }

    static{
        // Print statement when static block is called
        System.out.println("I am Static block!");
    }
}
//I am Static block!
//I am Instance block!
//I am Constructor!
*/