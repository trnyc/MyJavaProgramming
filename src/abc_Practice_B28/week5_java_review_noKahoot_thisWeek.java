package abc_Practice_B28;

public class week5_java_review_noKahoot_thisWeek {
    public static void main(String[] args) {
      /*  boolean b1, b2;
        String s1="1", s2;
        double d1, d2;
        int i1; int i2;
        int i3; i4;*/

       /* System.out.println("1")
        System.out.println("2");*/

       /* System.out.println('a'+ 'w' + 's');
        System.out.println('w'+ " "+ 's');
        System.out.println('w'+ ""+ 's');
        System.out.println('w'+ 's');
        System.out.println('w');*/

       /* double d =(double)(7)/2;
        double e =(double)(7/2);
        int i = (int)(7.8+(double)(15)/2);
        System.out.println(d);
        System.out.println(e);
        System.out.println(i);*/

     /*   System.out.println(8+12*(6-2));
        System.out.println((4+17)%(2+7)/3);*/

      /*  int x=4;
        int y=x*4-x++;
        System.out.println(y);
        System.out.println(x);*/

       /* boolean x= true;
        System.out.println(!x);*/

        /*int a=100;
        a-=20*2;
        System.out.println(a);*/

       /* int b=2;
        boolean res=++b == 2 || --b == 2 && --b == 2;  // false || true && false = false
        System.out.println(res);*/

       /* int x= 1;
        System.out.println((x>4) && (++x==4));
        System.out.println(x);
        System.out.println((x>4) & (++x==4));
        System.out.println(x);*/

        /*int apples=20;
        int oranges=30;
        int pears=30;
        boolean comp= apples<oranges || oranges>=pears;
        System.out.println(comp);*/

        /*String weather="shiny";
        int degree=70;
        boolean comp2=(!(weather=="rainy" || degree==70)); //false || true= true --> !true= false
        System.out.println(comp2);*/

      /*  int watermelon=40;
        boolean numWatermelon=false;
        if (watermelon>=20){
            System.out.println("I have more");
            numWatermelon=true;
        }

        if (numWatermelon){
            System.out.println("good job");
        }

        if (numWatermelon==false){
            System.out.println("I need more");
        }*/

       /* boolean x= true;
        if (x==false){
            System.out.println("one");
        } else if (x == false != true) {
            System.out.println("two");
        } else if (x == true) {
            System.out.println("three");
        } else if (x == !false){
            System.out.println("four");
        }*/

       /* int x =9;
        if (++x<10){
            System.out.println(x + " hello world");
        }else {
            System.out.println(x + " world");
        }*/

        /*double z =10; //can NOT use float, double, long and boolean with switch, compile error
        switch (z){
            case 10:
                System.out.println("monday");
        }*/

       /* String stuff= "TV";
        String res="";
        res= stuff.equals("TV")? "walter": stuff.equals("movie")? "white": "no result";
        System.out.println(res);*/

        /*boolean b= true; //can NOT use float, double, long and boolean with switch, compile error
        switch (b){
            case true:
                System.out.println("Monday");
        }*/

        //page 28 & 29
//        String s1="Q.E.D";
//        String s2="Arcturan Megadonkey";
//        String s3="Sirius Cybernetics Corporation";
        //         0123456789
//        System.out.println(s1.substring(2,4));//E.
//        System.out.println(s2.substring(10,14));//egad
//        System.out.println(s1.indexOf('D'));//4
//        System.out.println(s1.indexOf('.'));//1
//        System.out.println(s2.indexOf("donkey"));//13
//        System.out.println(s3.indexOf('X'));//-1
//        System.out.println(s2+s3.charAt(17));//Arcturan Megadonkeys
//        System.out.println(s3.substring(9, s3.indexOf("e")));//b
//        System.out.println(s3.substring(7, 13));//Cybern
//        System.out.println(s2.toLowerCase().substring(9, 13) + s3.substring(18, s3.length() - 7));//mega Corp
//        System.out.println(s1.toLowerCase().indexOf('E'));//-1
//        System.out.println(s2.replace("a", "x"));//Arcturxn Megxdonkey
//        System.out.println(s2.replace("MEGA", "DDD"));//Arcturan Megadonkey (no change)
//        System.out.println("s2".replace("a", "x"));//s2

       /* String str="Batch 28";
        int z= str.trim().length();
        System.out.println(z);*/

//        String str ="Dog Cat"; //not assigned, String is ummutable
//        str.replace("Cat", "Dog");
//        str.replace("Dog", "Tiger");
//        System.out.println(str.endsWith("Dog"));
//        System.out.println(str.startsWith("Dog"));

//        String ta= "A";
//        ta = ta.concat("B");
//        String tb = "C";
//        ta=ta+tb;
//        ta.replace('C', 'D');//not assigned back, no change
//        ta=ta+tb;
//        System.out.println(ta); //ABCC

       /* String str= " ";
        str.trim();
        System.out.println(str.equals("") + "" + str.isEmpty() + str.isBlank()); //falsefalsetrue*/

      /*  String str ="Sweet Sweat";
        String str2= str.trim().charAt(6)+ " " + str.indexOf("Sw",1);
        System.out.println(str2);*/




    }
}
