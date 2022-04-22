package day15_ForLoop;

public class FormatFullName {
    public static void main(String[] args) {
/*  while using substring, we must give begenning and ending index of the
string portition that we need, if we give only begenning index, it will get
till the end.
 */
        String firstName = "cyDEo",
                lastName = "SCHOOL";

        String fullName = firstName.substring(0, 1).toUpperCase() +
                firstName.substring(1).toLowerCase()+ " "+ lastName.substring(0,1).toUpperCase()+
                lastName.substring(1).toLowerCase();

        System.out.println("fullName = " + fullName);

        System.out.println("---------------------OR---------------------");

        firstName = (""+ firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
//when we concatenate an empty string to 'char' it converts to string, so that we can use string methods

        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(firstName);//Cydeo
        System.out.println(lastName);//School

        fullName = firstName+" "+lastName;
        System.out.println("fullName = " + fullName);

    }
}

/*
3. Write a program that asks user to enter first and last names,
and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo";
                        lastName = "SCHOOL";
                    output:
                        Cydeo School
 */