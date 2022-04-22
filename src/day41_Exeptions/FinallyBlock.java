package day41_Exeptions;

public class FinallyBlock {
    public static void main(String[] args) {

        int[] arr = {1,2,3};

        try{
            System.out.println(arr[10]);
            System.out.println("Try Block");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
            e.printStackTrace();
            System.exit(0);
        }finally {
            System.out.println("Finally Block");
        }

/* No matter if any of catch block is executed or not, finally block always will be executed
    If you dont want finally block to be executed, you need to put an exit option into catch block.
    Using finally block is totally OPTIONAL

 */


    }
}
