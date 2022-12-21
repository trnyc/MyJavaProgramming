package topicsKahoot.week11_Strings_Arrays_ArrayList_Methods_B28;

public class Q7_OutputOfArrayFori {

    public static void main(String[] args) {

        int[] array= new int[5];
        int [] items= {2,7,3,5,8,9};
        int arr= items[0];
        for(int i= 0; i< items.length; i++) {

            if (items[i]>arr)
                arr= items[i];

         // System.out.println("arr = " + arr); // It prints all the large numbers inside the loop.
        }
        System.out.println(arr);// it prints 9.

    }


}
