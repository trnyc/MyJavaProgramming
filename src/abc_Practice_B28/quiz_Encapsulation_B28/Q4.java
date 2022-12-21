package abc_Practice_B28.quiz_Encapsulation_B28;


class Caller {
    private void init(){ // line 1
        System.out.println("Initialized");
    }

    private void start(){
        init(); // line 2
        System.out.println("Started");
    }

}





public class Q4 {
    public static void main(String[] args) {
        Caller c = new Caller();
//        c.start(); // line 3
//        c.init(); // line 4

    }
}
