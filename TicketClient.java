// client
import MainClass.OtherClasses.*;



import java.util.*;
import java.io.*;

public class TicketClient
{
 Ticket [] tickets= new Ticket[15];
 
 public TicketClient()
 {
	 
 }
 
 public static void main(String args []) throws IOException
 {
	 TicketClient two= new TicketClient();
  Destinations city;
  States state;
  String month=" ";
  String lastName=" ";
  
  File ifile = new File("data.txt");
  Scanner scan = new Scanner(ifile);
  
  
 for(int i=0; i<two.tickets.length; i++){
	 
  while (scan.hasNextLine())
  {
   String input= scan.nextLine();
   String [] strtok= input.split(",");
   
   city=Destinations.valueOf(strtok[0]);
   state=States.valueOf(strtok[1]);
   strtok[2]=lastName;
   strtok[3]=month;
   
   Ticket one =new Ticket(lastName, month);
   
  
   two.tickets[i]=one;}
   
   System.out.println(two.tickets[i].toString());
 }
 
}
   
}