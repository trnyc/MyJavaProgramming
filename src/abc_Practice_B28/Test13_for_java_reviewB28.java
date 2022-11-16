package abc_Practice_B28;

public class Test13_for_java_reviewB28 {
    public static void main(String[] args) {
//
//        System.out.println(1+25+2+"aws"); //28aws
//        System.out.println(1+"aws"+(2+4));//1aws6
//        System.out.println("aws"+1+2+3);//aws123
//        System.out.println('a'+'W'+'s'); //299
//        System.out.println('w' +" "+'s'); //w s
//        System.out.println('a'+""+ 's');// as
//        System.out.println('w' + 's'); //234
//        System.out.println('w'); //w

        System.out.println((double)7/2); //3.5
        System.out.println((double) (7/2)); // 3.0
        System.out.println((int)(7.8+(double) (15)/2)); //15



//        System.out.println(8+12*(6-2));//56
//        System.out.println((4+17) % (2+7)/3); //1

//        int x = 4;
//        int y = x * 4 - x++;
//        System.out.println("y = " + y); //12
//        System.out.println("x = " + x); //5

//        int i = 11, j=4;
//        int res = i++ + --j;
//        System.out.println("res = " + res); //14

//        int b = 2;
//        boolean res = ++b == 2 || --b == 2 && --b == 2;
//        System.out.println("res = " + res); //false

//        int x = 1;
//        System.out.println((x > 4) && (++x == 4)); //false
//                        // false     wont be checked
//        System.out.println(x); //1
//
//        System.out.println((x > 4) && (++x == 4)); //false
//                         //false      wont be checked
//        System.out.println(x);//1

//        int a = 20, o = 30, p = 30;
//        boolean c = a < o || o >= p;
//        System.out.println(c); //true

//        String w;
//        int d;
//        w = "Shinny";
//        d = 70;
//        boolean comp2 = (!(w == "Rainy" || d == 70));
//                         // f                  t => !t => f
//        System.out.println("comp2 = " + comp2);

        //-------------------------------------------------------

//        int numW = 40;
//        boolean lotsW = false;
//
//        if (numW == 20){
//            System.out.println("I have more than 20 watermelon");
//            lotsW = true;
//        }
//
//        if (lotsW){
//            System.out.println("Good Job");
//        }
//
//        if(lotsW == false){  // ONLY THIS ONE WILL BE EXECUTED
//            System.out.println("I need more");
//        }


//        boolean x = true;
//        if (x == false){  //false
//            System.out.println("one");
//        }else if(x == false != true){ //true
//            System.out.println("two"); // two
//        }else if(x == true){ //wont checked
//            System.out.println("three");
//        }else if(x == !false){ // wont checked
//            System.out.println("four");
//        }

//        int num = 9;
//        if (++num < 10){
//            System.out.println(num + " Hello World!");
//        }else{
//            System.out.println(num + " Hello Universe");//print
//        }

        String str = "TV";
        String res = "";

        res = str.equals("TV") ? "Walter" : str.equals("Movie") ? "White" : "No result";

        System.out.println(res);




    }
}
