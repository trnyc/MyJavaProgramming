package abc_Practice_B28.review_method_B28_Mx_week07;

public class Q4_StringSentenceMethod {
    public static void main(String[] args) {//question 4 slide 5
        String one = "two";
        String two = "three";
        String three = "1";
        int number = 20;

        sentence(one, two,3);
        sentence(two, three, 14);
        sentence(three, three, number+1);
        sentence(three, two, 1);
        sentence("eight", three, number/2);

    }

    public static void sentence(String three, String one, int number){

        System.out.println(one + " times " + three + " = " + (number+2));

    }
/* Output=
three times two = 5
1 times three = 16
1 times 1 = 23
three times 1 = 3
1 times eight = 12
 */


}
