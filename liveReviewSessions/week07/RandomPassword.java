package week07;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {

        String source ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        System.out.println(source.length());

        String password = "";

        Random random = new Random(); // I create a random object so I can generate random numbers

        for(int i=1;i<=8;i++){   // 8 character will be chosen rondomly ($t34mik5 for ex.)
            int index = random.nextInt(71); // randomly up to 71 : between 0 - 70, 71 is not included
            System.out.println("index = " + index); //will show which character of the string(source) is chosen
            password+=source.charAt(index);
        }

        System.out.println("password = " + password);

    }
}
