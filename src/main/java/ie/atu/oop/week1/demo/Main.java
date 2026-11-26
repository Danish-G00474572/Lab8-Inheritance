package ie.atu.oop.week1.demo;

public class Main {
    public static void main(String[] args) {
        String eventName = "Summer Concert";

        // Change to 80.0 for the second price check.
        double basePrice = 50.0;

        Ticket alice = new Ticket(eventName, "Alice", basePrice);
        StudentTicket bob = new StudentTicket(eventName, "Bob", basePrice, "S12345");
        VIPTicket charlie = new VIPTicket(eventName, "Charlie", basePrice);

        System.out.println("Event: " + alice.getEventName());
        System.out.println("Standard Ticket - " + alice.getHolderName()
                + ": €" + alice.calculatePrice());
        System.out.println("Student Ticket - " + bob.getHolderName()
                + ": €" + bob.calculatePrice());
        System.out.println("VIP Ticket - " + charlie.getHolderName()
                + ": €" + charlie.calculatePrice());
        System.out.println("Student ID: " + bob.getStudentId());
        System.out.println("Benefits: " + charlie.getBenefits());
    }
}