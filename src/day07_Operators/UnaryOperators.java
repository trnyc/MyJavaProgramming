package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1 = +25; //you dont have to put a +
        int num2 = -25; //you have to put a - to say its negative

        System.out.println(num1 < 0);
        System.out.println(num2 < 0);

//PRE INCREMENT / PRE DECREMENT
        int a = 25;

        ++a; //pre increment, increases the value by 1 immediately: now a=26
        --a; //pre decrement, decreases the value by 1 immediately: now a=25 again

//POST INCREMENT / POST DECREMENT

        int b = 100;
        System.out.println(b++);//post increment increases the value in next step
                                //first it passes the correct value
        System.out.println(b);

        int x = 500;
        System.out.println(--x);//pre decrement makes it 499 immediately

        int y = 400;
        System.out.println(y--);//post decrement makes it 399 at next step
        System.out.println(y);

        int z = 88;
        System.out.println(z++);//its still 88 but will be 89 in the next line
        System.out.println(z--);//it became 89 now and will be 88 in the next line
        System.out.println(z);//now its 88 again
    }
}
