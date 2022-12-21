package abc_Practice_B28.review_arrayB28_week09;

public class Q2Mx_Days {
    public static void main(String[] args) { // Slide 3-10

        int wd=0;// -1,0, 2,4,3
        String [] days= { "sun", "mon", "wed", "sat"};
        for (int i = 0; i < days.length; i++) {
                switch (days[i]) {
                    case "sat":
                    case "sun":
                        wd -=1;
                        break;
                    case "mon":
                        wd++;
                    case "wed":
                        wd +=2;
                }


        }
        System.out.println(wd);  // output= 3


    }



}
