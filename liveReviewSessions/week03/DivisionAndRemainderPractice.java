package week03;

public class DivisionAndRemainderPractice {
    public static void main(String[] args) {

  //input some amount of seconds (45000)
  //turn it hours: minutes: seconds

        int inputSeconds = 45555;
        int hours, minutes, seconds;
 //1 minute is 60 seconds and 1 hour is 60 minutes

        hours = inputSeconds/3600;
        minutes = (inputSeconds % 3600)/60;
        seconds = (inputSeconds % 3600)%60;

        System.out.println(hours+ " hours "+minutes+ " minutes "+seconds+" seoonds");



    }
}
