package ie.atu.oop.week1.demo;

public class VIPTicket extends Ticket {
    public VIPTicket(String eventName, String holderName, Double basePrice) {
        super(eventName, holderName, basePrice);
    }

    @Override
    public Double calculatePrice() {
        return super.calculatePrice()+25;
    }
    public void getBenefits(){
        System.out.println("Priority entry and reserved seating");
    }
}
