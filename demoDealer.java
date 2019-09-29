// demo generate dealer card
import java.util.Random;
import java.util.*;
import java.io.*;


enum CardSign {diamonds, spades, clubs, hearts};
enum CardValue{ ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king};

public class demoDealer
{
 
 public static void main(String args []) throws IOException
 {
	 for(int i=0; i<5; i++){
   int pick = new Random().nextInt(CardSign.values().length);
     System.out.println(CardSign.values()[pick]);
	 
	 int pick1 = new Random().nextInt(CardValue.values().length);
    System.out.println( CardValue.values()[pick1] );
	
	 System.out.println("you have got a "+CardValue.values()[pick1]+" of "+CardSign.values()[pick]);}
	 
	 File ifile =new File("hand.txt");
	 Scanner scan=new Scanner(ifile);
	 String [] userHand=new String [5];
	 
	 while(scan.hasNextLine())
	 {
		for(int i=0; i<userHand.length; i++){
		userHand[i]=scan.nextLine();}
		
		for(int j=0; j<5; j++){
		System.out.println("user has"+ userHand[j]);}
	 }	
	 
		
			 
}
}
	
