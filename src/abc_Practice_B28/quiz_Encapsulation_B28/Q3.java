package abc_Practice_B28.quiz_Encapsulation_B28;



class Credentials {

    private String username = "BugBusters";
    private String password = "WoodenSpoon";

    private String getUserName(){
        return username;
    }

    private String getPassword(){
        return password;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Credentials obj = new Credentials();
        //System.out.println(obj.getPassword() );
    }
}
