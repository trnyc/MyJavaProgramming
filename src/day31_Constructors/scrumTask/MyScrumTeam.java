package day31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

        // 4 testers objects
        Tester tester1 = new Tester("Ali", "QA", 112, 110000);
        Tester tester2 = new Tester("Veli", "SDET", 117, 105000);
        Tester tester3 = new Tester("Elif", "SE", 188, 115000);
        Tester tester4 = new Tester("Melisa", "QA", 124, 118000);

        Tester[] testers = {tester2, tester3, tester4};// we already added tester 1 to scrum team


        // 4 developers objects
        Developer developer1 = new Developer("Hasan", "Java Developer", 224, 135000);
        Developer developer2 = new Developer("Olcay", "Java Master", 284, 140000);
        Developer developer3 = new Developer("Melike", "Software Developer", 215, 152000);
        Developer developer4 = new Developer("Kamil", "Senior Developer", 221, 160000);

        Developer[] developers = {developer2, developer3, developer4};// developer1 already added to scrum team

        // 1 Scrum Team
        ScrumTeam scrum = new ScrumTeam("Raca", "Adem", "Yusuf", 10);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);


        System.out.println(scrum);

        System.out.println("___________________________________________________________");

        for (Tester eachTester : scrum.testersList) { // testers and salaries
            System.out.println(eachTester.name+ " : "+ eachTester.salary);
        }

        System.out.println("_____________________________________________________________");

        for (Developer eachDeveloper : scrum.devopsList) {// developers and salaries
            System.out.println(eachDeveloper.name+ " : "+ eachDeveloper.salary);
        }


    // remove a tester from scrum team
    scrum.removeTester(117);// we removed tester with ID 117 from team by using our method

    // remove a developer from scrum team
    scrum.removeDeveloper(284);// we removed developer with ID 284 from team, using our method




    }
}


/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */