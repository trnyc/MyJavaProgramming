package abc_Practice_B28.kahoot_constructor_encapsulation_inheritance_finalKeyword;

public class Q7_CustomerTest {
    public static void main(String[] args) {

        Customer c = new Customer("Sally");
        renameCustomer(c);
        System.out.println(c.getName());
    }

    private static void renameCustomer(Customer cust){
        cust.setName("Diana");
    }

// Output: Diana


}


