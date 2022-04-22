package day10_NestedIf;

public class NameOfMonths2 {
    public static void main(String[] args) {
/* since we have 12 names of months, we need to use 1 if block (?), 1 else (:)
and 10 else if (:?)
 */
        int m = 5;

       String month = (m == 1)? "Jan" :(m==2)? "Fab" :(m==3)? "Mar" :(m==4)? "Apr"
                 :(m==5)? "May" :(m==6)? "Jun" :(m==7)? "Jul" :(m==8)? "Aug"
                :(m==9)? "Sep" :(m==10)? "Oct" :(m==11)? "Nov" : "Dec";

        System.out.println("month = " + month);

/*NOTE: Normally you dont have to use () in TERNARIES. BUT its strongly recommended
to use. And quantities of (:) and (?) must be equal
 */


    }
}
