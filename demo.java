// split demo

import java.util.*;
import java.io.*;

public class demo
{
 public static void main(String args []) throws IOException
 {
  File ifile = new File("demo.txt");
  Scanner scan = new Scanner(ifile);
  
  while(scan.hasNext())
  {
   String str= scan.next();
   String [] strtok=str.split(",");
   
   for(int i=0; i<strtok.length; i++)
   {
    System.out.println(strtok[i]);
   }
  }
 }
}