package main;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import models.Ticket;
import services.UserService;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService us=new UserService();
        while(true){
            System.out.println("1.Reserve a ticket");
            System.out.println("2.Display Ticket details");
            System.out.println("3.Exit");
            System.out.println("Enter a choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    String name=sc.next();
                    int age=sc.nextInt();
                    String source=sc.next();
                    String destination=sc.next();
                    boolean st=false;
                    Ticket t=new Ticket(name,age,source,destination);
                    try {
                        us.createticket(t);
                        st=true;
                    } catch (exceptions.invalidAgeExceptions e) {
                        System.out.println(e.getMessage());
                        FileWriter fw= null;
                        try{
                            fw=new FileWriter("error.log",true);
                            fw.write(e.getMessage()+"\n");
                            fw.flush();
                        }
                        catch(IOException exi){
                                  System.err.println("Error writing to log file: " + exi.getMessage());
                        } 
                    } 
                    catch (exceptions.sameLocation e) {
                        System.out.println(e.getMessage());
                        FileWriter fw= null;
                        try{    
                            fw=new FileWriter("error.log",true);
                            fw.write(e.getMessage()+"\n");
                            fw.flush();
                        }
                        catch(IOException exi){
                                  System.err.println("Error writing to log file: " + exi.getMessage());
                        }   
                    }   
                    if(st) {
                        System.out.println("Ticket reserved successfully for " + t.getName());
                    }

                    break;
                case 2:
                    us.TicketList();
                    break;
                case 3:
                    System.out.println("Exit");
                    return;

            }

            
        }
    }
}
