package day44_Abstraction.animal;

public interface Playable {

    boolean isFriendly = true; // static and final by default

    /*
    public static void method1(){
      System.out.println(isFriendly);
      }
     */

    void play(); // abstract by default

}
