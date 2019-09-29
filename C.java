// lab 09

package subclass;
import superclass.A;

public class C extends A
{
 public double c;
 
 public C(){
  super();
  c=0.0;
  System.out.println("default constructor-C");
 }
 
 public C(int a, double aa, double some){
  super(a,aa);
  c=some;
  System.out.println("nondefault constructor-C");
 }
 
 public C( A objA, double s2){
  super(objA.getA(), objA.getAA());
  c=s2;
  System.out.println("B created with object A");
 }
 
 public double getC(){
   return this.c;
 }
 
 public void setC(double s3){
  this.c=s3;
 }
 
 public String toString(){
  return super.toString()+" C= "+this.getC();
 }

 public int m1(){
  double div= this.getC()/2;
  int i2= this.getA()+(int)(div);
  System.out.println("m1 implmentation of C is executing now");
  return i2;
 }
}
