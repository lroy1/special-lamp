//lab 09

package subclass;
import superclass.A;

public class B extends A
{
 public String s;
 
 public B(){
  super();
  s="test";
  System.out.println("default constructor-B");
 }
 
 public B(int a, double aa, String some){
  super(a,aa);
  s=some;
  System.out.println("nondefault constructor-B");
 }
 
 public B( A objA, String s2){
  super(objA.getA(), objA.getAA());
  s=s2;
  System.out.println("B created with object A");
 }
 
 public String getS(){
  return this.s;
 }
 
 public void setS(String s3){
  this.s=s3;
 }
 
 public String toString(){
  return super.toString()+" S= "+this.getS();
 }

 public int m1(){
  int i1 = 5*(this.getA())+(int)(this.getAA());
  System.out.println("m1 implmentation of B is executing now");
  return i1;
 }
}