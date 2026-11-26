package ie.atu.oop.week1;

public class CustomerTest {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer("Paul", "Ballinrobe","12345678", 123456,true);
        System.out.println(firstCustomer);

        Customer secondCustomer = new Customer();
        secondCustomer.setName("Bob");
        secondCustomer.setPhonenumber("0000000000");
        secondCustomer.setAddress("Bob street");
        secondCustomer.setCustomerNumber(000000000);
        secondCustomer.setMailingList(false);
        System.out.println("");
        System.out.println(secondCustomer);
    }
}
