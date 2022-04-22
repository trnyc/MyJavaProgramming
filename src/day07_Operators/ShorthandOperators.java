package day07_Operators;

public class ShorthandOperators {
    public static void main(String[] args) {

        // ASSIGNMENT OPERATOR  < = >

        int number = 202;
        System.out.println("number = " + number);//now its 202

        number = 404; //we changed it 404. after this line number=404
        System.out.println("number = " + number);

/*
if I declare a new veriable to number like this (int number = 404) it will give
error. to change the value you must do like above. java works from top to bottom.
so when you want to print veriable "number" it will print the last value of it
which is 404.
 */
        String word = "Java Programming";
        System.out.println("word = " + word);

        word = "Wooden Spoon";
        System.out.println("word = " + word);
/* now you cant assign to "word" a number like <word = 123> because "word" is a
string. (pls. see line 19 above) but you can assign numbers as string.
like this: word = "123"
 */
        //ADDITION ASSIGNMENT < += >

        int x = 500;
        System.out.println("x = " + x); //x = 500 now
        System.out.println(x + 100);//I added 100 to x but still x=500
        System.out.println("x = " + x);
//what I need to do reassign a value to x to make it 600

//      x = x + 100; //now x = 600 but there is another way by using +=

        x += 100; // now x=600
        System.out.println("x = " + x);

// we can also use += for string concatenation:
        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str); //str = Wooden Spoon

        double num1 = 2.5; //what to do to make num1 = 8.0
        num1 += 5.5;
        System.out.println("num1 = " + num1);

        double avaliableBalance = 1000.50;
        // deposit 500
        avaliableBalance += 500;
        System.out.println("avaliableBalance = " + avaliableBalance);

//SUBTRACTION ASSIGNMENT

        //withdrawing 600 from your account
        avaliableBalance -= 600; //now your balance is 900.5
        System.out.println("avaliableBalance = " + avaliableBalance);

//MULTIPLICATION ASSIGNMENT

        // your salary became double
        double salary = 5000.30;
        System.out.println("salary = " + salary);
        salary *= 2;
        System.out.println("salary = " + salary);

        double doge = 0.00000001;
        doge *= 1000000;
        System.out.println("doge = " + doge);

//DIVISION ASSIGNMENT

        double num2 = 25000.0;
        num2 /= 2;
        System.out.println("num2 = " + num2);

//REMAINDER ASSIGNMENT

        double num3 = 100;
        num3 %= 3; //this gives remainder of 100 divided by 3, which is 1
        System.out.println("num3 = " + num3);

        int amount = 127; //cents return of your shopping
        int quarters = amount / 25;//gives how many quarters you get back
        int cents = amount % 25;//gives how many cents you get back
        System.out.println("quarters = " + quarters);//5 quarters
        System.out.println("cents = " + cents);//and 2 cents

        int cents2 = 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);// it gives 2


        int y = 300;
        y %= 16;//this operator will make y = 12 from this point (bölmenin kalanı)
        System.out.println("y = " + y);

        int balance = 3500; //in your account
        balance %= (153 * 12); //monthly payment * 12 for one year
        System.out.println("balance = " + balance);



    }
}
