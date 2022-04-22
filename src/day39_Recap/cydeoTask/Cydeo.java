package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {


        Developer developer = new Developer("Ali", 45, 'M', 89125, "Java Developer", 11500);

        Tester tester = new Tester("Veli", 44, 'M', 89144, "SDET", 112000);

        Teacher teacher = new Teacher("Ayse", 35, 'F', 89122, "SDLC Teacher", 113000);

        Student student = new Student("Kamil", 38, 'M', 89111, "Java");


        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_- _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        developer.setAge(46); // since we declared 'private' instances, only way to change is to call 'set' method
        System.out.println(developer.getAge()); // 46 now
        System.out.println(developer);

        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_- _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        developer.work();// Java Developer Ali is developing the app
        tester.work(); // SDET Veli is testing
        teacher.work(); // SDLC Teacher Ayse is teaching
        //student.work(); => not possible bec. student class is not under employee class

        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_- _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        
        developer.eat();
        developer.drink();
        developer.sleep();
        
        developer.fixingBugs();

        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_- _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        tester.eat();
        tester.drink();
        tester.sleep();
        
        tester.createTicket();

        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_- _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        teacher.eat();
        teacher.drink();
        teacher.sleep();
        
        teacher.work();

        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_- _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        student.eat();
        student.drink();
        student.sleep();





    }
}
