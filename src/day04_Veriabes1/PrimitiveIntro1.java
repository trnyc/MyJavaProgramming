package day04_Veriabes1;

public class PrimitiveIntro1 {

    public static void main(String[] args) {

        //age: 38 years old - range of numbers for "byte"> -128 to 127
        byte age = 38;

        // weight: 160 pounds
        // byte weight = 160; //this code line gives error bec. 160 greater then 128
        // byte num = -129; this line gives error bec. -129 smaller than -128
        // short weight = 160;

        // salary: 100000$ range of numbers for "short" > -32,768 to 32,767
        // short salary = 100000; this line gives error bec. 100000 out of short' range

        //int salary = 100000

    /*
    even if you use long for the numbers out range of int, you must use l or L
    right after the number in order java recognize it as long. otherwise it
    will gives error.
     */
        //long asset = 3_333_333_333l;

        // float and double are used for fraction (kesirli) numbers
     /* but, even if you use float in its range you must ad an f or F just after
     the nuber you type
      */
        // tax: 0.26
        //double tax = 0.26;

        //float PI = 3.14; // this line gives error bec. f or F is missing
        //float PI = 3.14f;

  /* char is used for uniq/sigle characters. it means yuo can use only one
  character with char. And if you use a character with char you must it
  with single quotes. like this : char ch1 = '#' if you use/asign it wit ASCII code
  you must type it without ' '  single quotes.
   */

        char sample1 = '#';
        System.out.println("sample1 = " + sample1);

        char sample2 = 35; // 35 is the ASCII code for #, so when u use 35 with
        // char it will print #
        System.out.println("sample2 = " + sample2);

    /* you can asign number for 'char' between 0 - 65,535; but what you will get
    is a single charakter that this number represnts in computer language. ASCII
    code table includes 127 characters that all computer recognize.
     */
        char sample3 = 2888;//this will print sp. character #2888
        System.out.println("sample3 = " + sample3);
        char sample4 = 9999;
        System.out.println("sample4 = " + sample4);
        char sample5 = 127;
        System.out.println("sample5 = " + sample5);
//you can also use for gender or grade. see ex
        char gender = 'F';

        char grade = 'C';
        char yesNo = 'T';
// boolean is used for only true or false situations.

        boolean isEmployed = false;
        boolean isMarried = true;
        boolean result = 100 > 300;

        System.out.println("result = " + result);

/* if you need to use more than 1 character you must use String (with upper S)
and between " "
        String name = "kamil";
        String country = "USA";
        String state = "Virginia";
 */


    }

  }
