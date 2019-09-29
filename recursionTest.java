//lab 10
import java.util.*;


public class recursionTest
{
 public static void main(String args [])
 { 
  Scanner scan = new Scanner (System.in);
  String input = " ";
  System.out.println("enter a word/sentence to check is it's a palindrome");
  input = scan.nextLine();
  
  boolean check = testPalindrome(input);
  System.out.println(" is the word you entered is a palindrome: "+check);
  
  }
  public static boolean testPalindrome(String s)
 {
  boolean ret= false;
  char [] tok = new char [s.length()];
  for(int i=0; i<s.length() ; i++){
   tok [i]= s.charAt(i);
  }
  
  
  if(s.length()%2 == 0){
	 
	  
	  for(int z=0; z<s.length(); z++){
	   if(tok[z] != tok[s.length()-(z+1)]){ return false;}  
	  }ret= true;
  }

  else if( s.length()%2 != 0){	  
		   
  if(s.length()==1){ ret= true;}
  
   else if(tok[0] == tok[s.length()-1])
   {
    ret= testPalindrome(s.substring(1,s.length()-1));
	}
    else {ret=false;}
  
  }
  return ret;
 }
}

   
  
   
   
   
   
   