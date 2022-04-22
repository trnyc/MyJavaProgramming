package day06_PrimitiveTypeCastings;
/* PRIMITIVE TYPE CASTING is needed to assign one pirimive to another.
THERE ARE TWO TYPES OF PRIMITIVE TYPE CASTING
1- Impilicit Primitive Type Casting (Java makes it automatically)
2- Expilicit Primitive Type Casting (Should be done manually but has a short cut)
 */
public class PrimitiveCastings {
    public static void main(String[] args) {
//1-IMPILICIT:
        int a = 220;
        long b = a;
        System.out.println( a + " / " + b);

        float z = 33.58f;
        double k = z;
        System.out.println(z + " / " +k);

//2- EXPILICIT:
        int x = 111;
        byte y = (byte)x; //
        System.out.println(x +" / "+ y);

    //it has short cut: press alt and enter at the end of second line after ";" sign
    // or click on error red bulb

        double c = 22.8;
        int d = (int) c; //if you assign a decimal to int it gives only intiger part
        System.out.println(c + " / " + d);//this will give you 22 for d






    }
}
