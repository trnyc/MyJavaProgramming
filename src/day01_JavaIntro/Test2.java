package day01_JavaIntro;

import utilities.StringUtility;

public class Test2 {

    public static void main(String[] args) {
/* to be abl to use another method here, firs we need to import
it here by typing package and class name.
import utilities.StringUtility; (see line3)
And then type the class name to use it.
 */
        String str = "Wooden Spoon";
        StringUtility.printEachChar(str);


    }
}
