package abc_Practice_B28.review_arrayB28_week09;

public class Q3Mx_concat {
    public static void main(String[] args) { // Question 3 - Slide 4 - 11

        String [] strs = {"A", "B"};
        int idx = 0;

        for(String s : strs) {
            strs[idx].concat("element" + idx);
            idx++;
        }

        for (idx = 0; idx < strs.length ; idx++ ){
            System.out.println( strs[idx] );
        }

// Output= A  B

    }
}
