package day03_EscapeSequences;
/*
Escape sequences: must be given with double quotes
    \n: (Newline) Advances the cursor to the next line for subsequent printing
         Puts in the new line what comes after it.
    \t: (Horizontal Tab) Gives a paragraph space before the word you type.
    \\: (Backslash) Print a single backslash on the screen
        You need to type \\ to print a single \
    \": (Double quote) causes a double quatation mark printed

 */
public class EscapeSequences {

    public static void main(String[] args) {
        System.out.println("Java \nPython \nC#");

        System.out.println("--------------------------------------");

        System.out.println("Hi Cydeo \nHow are you all today? \nIt's nice to see you \nWhat class do we have next week?");
        System.out.println("--------------------------------------------");

        System.out.println("\tJava is a cool programming language");
        System.out.println("\\\\"); //this line will print 2 backslashes
                                    //because \ revserved for escape sequences
        System.out.println("----------------------------------------------");

        System.out.println("My favorite TV show is Breaking Bad");
//if you want to use " for Breaking Bad you should type like this
        System.out.println("My favorite TV show is \"Breaking Bad\"");


    }

}
