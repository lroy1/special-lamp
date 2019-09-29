// testing
import java.util.*;

public class testing 
{
	public static testing play= new testing();
 public static void main(String args [])
 {
  int array1 []=new int [10];
  Scanner scan = new Scanner(System.in);
  System.out.println("does the array have all same elements?");
  for(int k=0; k<10; k++){
	  System.out.println("enter an integer");
	  int y=scan.nextInt();
	  array1[k]=y;
  }
  boolean areTheySame = play.distinctVal(array1);
  System.out.println(areTheySame);
 }

 public boolean distinctVal(int [] arr)
 {
   for (int i = 0; i < arr.length-1; i++) {
        for (int j = i+1; j < arr.length; j++) {
             if (arr[i] == arr[j]) {
                 return false;
             }
        }
    }              
    return true;          
 }
}
 