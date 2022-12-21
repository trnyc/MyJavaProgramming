package topicsKahoot.week11_Strings_Arrays_ArrayList_Methods_B28;

public class MyTest20 {
    int z;  // 4 comes from doStuff2 method and assigns 4

    public static void main(String[] args) {
        MyTest20 myTest = new MyTest20();
        int z=6;
        System.out.println(z);  // 6  (1.num)
        myTest.doStuff();  // 5  (2.num)
        System.out.println(z);// 6  (3.num)
        System.out.println(myTest.z);  // Calls from class and prints 4 (4.num)
    }

    void doStuff() {
       int  z= 5;
        doStuff2();// Goes to the method
        System.out.println(z);// Prints 5  as 2. in the line
    }
    void doStuff2(){
     z=4;  // instance variable and assigns 4
        //System.out.println(z);
    }   //Output= 6564
}
