package topicsKahoot.week11_Strings_Arrays_ArrayList_Methods_B28;


class scope {
    static int z;
}

public class MyTest21 {

    int z;

    public static void main(String[] args) {
        MyTest21 myTest2 = new MyTest21();
        int z=6;
        System.out.println(z);  //
        myTest2.doStuff();
        System.out.println(z);
        System.out.println(scope.z);
        System.out.println(myTest2.z);
    }

    void doStuff() {
        int z= 5;
        doStuff2();
        System.out.println(z);
        doStuff2();
    }
   void doStuff2(){
        z++;
       scope.z++;
    }

    //Output=6 5 6 2 2

}
