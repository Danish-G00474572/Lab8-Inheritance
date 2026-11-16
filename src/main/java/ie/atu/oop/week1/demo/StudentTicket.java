package ie.atu.oop.week1.demo;

public class StudentTicket extends Ticket {
 private String studentID;

    public StudentTicket(String eventName, String holderName, Double basePrice,String studentID) {
        super(eventName, holderName, basePrice);
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }


    @Override
    public Double calculatePrice() {
        return super.calculatePrice()*0.80;
    }
}
