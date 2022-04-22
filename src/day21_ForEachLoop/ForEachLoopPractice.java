package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for (String each : words) {
            System.out.println(each.charAt(0) +""+each.charAt(each.length()-1));
        }
/* "each" represents each element inside the Array variable "words". So, since its
a loop, it will check first and last character of each element in the variable and
print it.
 */
    }
}
