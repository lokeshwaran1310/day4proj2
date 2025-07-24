package services;

import java.util.ArrayList;
import java.util.List;

import exceptions.invalidAgeExceptions;
import exceptions.sameLocation;
import models.Ticket;
public class UserService {
    List <Ticket> tickets = new ArrayList<>();
    public void createticket(Ticket t) throws invalidAgeExceptions, sameLocation {
        if(t.getAge()<18){
            throw new invalidAgeExceptions("User is underAged,Cannot reserve a ticket");
        }
        if(t.getSource().equals(t.getDestination())){
            throw new sameLocation("You have Entered same source and destination,Please enter different locations");
        }
        tickets.add(t);
        // System.out.println("Ticket reserved successfully for " + t.getName());
    }
    public void TicketList() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets reserved yet.");
            return;
        }
        System.out.println("Tickets List:");
        for (Ticket t : tickets) {
            System.out.println("Name: " + t.getName());
            System.out.println("Age: " + t.getAge());
            System.out.println("Source: " + t.getSource());
            System.out.println("Destination: " + t.getDestination());
            System.out.println("-----------------------------");
        }
    }
}

