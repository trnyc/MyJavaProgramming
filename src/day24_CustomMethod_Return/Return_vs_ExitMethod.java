package day24_CustomMethod_Return;

public class Return_vs_ExitMethod {

    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){  // 95

        String name = "";

        if(number < 1 || number > 12){
            System.out.println("Invalid");
            //return; //*********THIS IS TO EXIT THE METHOD IF THE NUMBER IS INVALID**************
            System.exit(0);
        }

        name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                :(number==11)?"Nov" : "Dec";

        System.out.println("Month name = " + name);
    }





    public static void main(String[] args) {//**BE CAREFUL, MAIN METHOD STARTS HERE**

        nameOfMonth(25);//invalid

        System.out.println("hello world");

/* even if the given number is invalid, by "return statement" it exit the method.
but rest of the lines continious to be executed. for ex: "hello world" will be printed.
BUT if you use exit(0) method it terminates everything in your program and stops
 execution of res of the codes in the program.
 */




    }


}
