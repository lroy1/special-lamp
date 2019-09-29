//lab 09

package client;
import superclass.A;
import subclass.B;
import subclass.C;
import subclass1.D;

public class Client
{
 public static void main(String args []){
  // 1 output
  
  B b1= new B();
  C c1=new C();
  
  int x=b1.m1();
  System.out.println(x);
  int y=c1.m1();
  System.out.println(y);
  
  //2 output
  
  D d1= new D();
  d1.m3();
  
  // 3output
  
  int w=d1.m2('e');
  int q=d1.m2(2);
  
 }
}