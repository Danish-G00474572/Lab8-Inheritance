package ie.atu.oop.week1.demo;

public class Ticket {
    private String eventName;
    private String holderName;
    private Double basePrice;

    public Ticket(String eventName, String holderName, Double basePrice) {
        this.eventName = eventName;
        this.holderName = holderName;
        this.basePrice = basePrice;
    }

    public String getEventName() {
        return eventName;
    }

    public String getHolderName() {
        return holderName;
    }

    public Double getBasePrice() {
        return basePrice;
    }
    public Double calculatePrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "eventName='" + eventName + '\'' +
                ", holderName='" + holderName + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}
