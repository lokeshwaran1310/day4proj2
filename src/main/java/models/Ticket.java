package models;

public class Ticket extends User {
    private String source;
    private String destination;
    public Ticket(String name, int age, String source, String destination) {
        super(name,age);
        this.source = source;
        this.destination = destination;
    }
    public String getSource() {
        return source;
    }
    public String getDestination() {
        return destination;
    }
}
