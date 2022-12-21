package abc_Practice_B28.kahoot_review_week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q11 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(13);
        numbers.add(7);
        numbers.add(18);
        numbers.add(5);
        numbers.add(2);

        System.out.println("Before:" + numbers);  // Before:[13, 7, 18, 5, 2]

        Collections.sort(numbers);

        System.out.println("After" + numbers);   // After[2, 5, 7, 13, 18]
    }

}
