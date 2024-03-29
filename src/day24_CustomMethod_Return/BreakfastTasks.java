package day24_CustomMethod_Return;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("cydeo", "school"); //

        System.out.println("----------------------------");

        domain("Cydeo.School@amazon.com");

        System.out.println("-----------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

        for (String email : emails) {// for each loop
            domain(email);// will check every email in the array and return domains
        }

        System.out.println("-----------------------------");

        nameOfMonth(11);

        System.out.println("________________________________________________________________");

        nameOfDay(5);


        System.out.println("-----------------------------------------------------------------------");

        daysInMonth(5);




        System.out.println("==============================================================================");
    }



    //1. Create a method that can display the initials of the person.    initials(String firstName, String lastName)
    public static void initials(String firstName, String lastName) {

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);


    }


    //2. Create a method that can display the domain of the email.  domain(String email)
    public static void domain(String email) { // Cydeo.School@gmail.com

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }


    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){  // 95

        String name = "";

        if(number >= 1 && number <= 12){

            name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                    :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                    :(number==11)?"Nov" : "Dec";

        }else{
            name = "Invalid";
        }

        System.out.println("Month name = " + name);

    }


    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){

        if(number < 1 || number > 7){ // if the number is invalid
            System.out.println("Invalid");
            return ; // exits nameOfDay method
            //RETURN STATEMENT CAN BE USED EVEN IN VOID METHOD JUST TO EXIT THE METHOD
        }

        if(number == 1){
            System.out.println("Monday");
        }else if(number == 2){
            System.out.println("Tuesday");
        }else if(number == 3){
            System.out.println("Wednesday");
        }else if(number == 4){
            System.out.println("Thursday");
        }else if(number == 5){
            System.out.println("Friday");
        }else if(number == 6){
            System.out.println("Saturday");
        }else{
            System.out.println("Sunday");
        }

    }


    //5. Create a method that can print how many days a month has (ignore leap year)
    public static void daysInMonth(int number){

        String result = "";

        if(number >= 0 && number <=12){

            switch (number){
                case 2:
                    result =  "28 days";// ternaries
                    //if (?) its leap year print 29 days, otherwise (:) 28 days
                    break;

                case 4: case 6: case 9: case 11: //if its 4,6,9 or 11
                    result = "30 days";
                    break;

                default:
                    System.out.println("31 days");

            }

        }else{
            result = "Invalid Number";
        }

        System.out.println("Days of month: "+ result);//See inside main method above

    }


    // ageGroups(int age)



}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person
	2. Create a method that can display the domain of the email
	3. Create a method that can display the name of the month based on the given number to the method
	4. Create a method that can print the name of the day based on the given number to the method
	5. Create a method that can print how many days a month has
    6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
                        */
