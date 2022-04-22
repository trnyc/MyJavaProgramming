package day10_NestedIf;

public class CharacterIdentitiy {
    public static void main(String[] args) {

        char ch = 'd';

        if(ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        }else if( (ch >= 'A' && ch <= 'Z')  || (ch >= 'a' && ch <= 'z')  ) {
            System.out.println("Alphabetic");
        }else {
            System.out.println("Special character");
        }

        System.out.println("------------------------------------------------------------");
//these are the same codes but with ASCII table number of each character above
// because "char" see also ASCII table code of each digit or letter

        char ch2 = 65;

        if(ch2 >= 48 && ch2 <= 57) {
            System.out.println("Digit");
        }else if( (ch2 >= 65 && ch2 <= 90)  || (ch2 >= 97 && ch2 <= 122)  ) {
            System.out.println("Alphabetic");
        }else {
            System.out.println("Special character");
        }





    }

}



/*
4. Create a class called Character Identity, and write a program that can identify
if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character
		Ex:
			ch = '@'
		output:
			Special Character
		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */



