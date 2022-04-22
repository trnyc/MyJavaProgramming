package day30_CustomClass;

public class C09_Employee_CapitalOne {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("John", 'M', 25, 2237, "Developer", 100000, true);
        employee2.setInfo("Anna", 'F', 28, 2287, "QA", 85000, true);
        employee3.setInfo("David", 'M', 35, 2256, "QA", 45000, false);
        employee4.setInfo("Lina", 'F', 45, 2290, "Manager", 80000, true);
        employee5.setInfo("Kevin", 'M', 35, 2298, "Senior QA", 110000, true);


        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
    //we stored all employee objects in an Array to use more efficiently

//Now find how many employees are full time
    int countFullTime = 0;
    int countPartTime = 0;

// Find min and max salary
        double max = employees[0].salary; // first we assign first employee's salary as max to be able to compare
                                            //each other and find the real max
        double min = employees[0].salary; // again this time we assign first employee's salaray as min to be able to
                                            //compare it each other and find real min


        for (Employee employee : employees) {
            if(employee.isFullTime){// if true hi is full time
                countFullTime++; // increase by 1
            }else{              // if not
                countPartTime++; // increase partTime by 1
            }

            if(employee.salary > max){ // if any of salary is bigger than max, assign it back to max
                max = employee.salary;
            }

            if(employee.salary < min){
                min = employee.salary;
            }
        }


        System.out.println("countFullTime = " + countFullTime); // 4
        System.out.println("countPartTime = " + countPartTime); // 1

        System.out.println("min = " + min); // 45000
        System.out.println("max = " + max); // 110000


    }
}
/*
Employee_CapitalOne Class:
	1. create 5 Employee objects
	2. store those 5 employee objects into an array
	3. how many employees are full time employees?
	4. What's the minimum salary
	5. what's the maximum salary
 */