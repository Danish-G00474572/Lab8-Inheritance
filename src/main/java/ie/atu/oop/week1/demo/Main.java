package ie.atu.oop.week1.demo;

public class Main {
    public static void main(String[] args) {
        Ticket firstTicket = new Ticket(" Summer Concert", "Alice", 50.0);
        System.out.println(firstTicket.toString());
        StudentTicket secondTicket = new StudentTicket(" Summer Concert", "Bob", 50.0, "123");
        System.out.println(secondTicket.toString());
        System.out.println(secondTicket.getStudentID());
        System.out.println(secondTicket.calculatePrice());


    }
}
/*
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
 */