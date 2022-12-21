package abc_Practice_B28.kahoot_review_week11;

public class Q7 {

    public static void main(String[] args) {

        int[] array = new int[5];
        int [] items = {2,7,3,5,8,9};
        int arr = items[0]; //2

        for (int i = 0; i < items.length; i++) {

            if (items[i] > arr)
                arr = items[i];// 9
        }
        System.out.println(arr); // 9
    }
}
