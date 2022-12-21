package topicsKahoot.week11_Strings_Arrays_ArrayList_Methods_B28;

public class QSample19_Object {
    String s;

    public QSample19_Object (String s) {
        this.s= s;
    }

    public static void main(String[] args) {
        String s1= "Moon";
        QSample19_Object s2= new QSample19_Object("Moon");
        System.out.println("s2 = " + s2);

        if((s1=="Moon") && (s2.equals("Moon"))){
            System.out.println("A");
        }
        else{
            System.out.println("B");
        }
        if (s1.equalsIgnoreCase(s2.s)){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }// output=  B  C

}
