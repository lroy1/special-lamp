// lab 09

package subclass1;
import superclass.A;
import subclass.C;

public class D extends C
{
 public String s;
 
 public D(){
  super();
  s="test";
  System.out.println("default constructor-D");
 }
 
 public D(int a, double aa, double c, String some){
  super(a,aa,c);
  s=some;
  System.out.println("nondefault constructor-D");
 }
 
 public D( C objC, String s2){
  super(objC.getA(), objC.getAA(), objC.getC() );
  s=s2;
  System.out.println("D created with object C");
 }
 
 public String getS(){
  return this.s;
 }
 
 public void setS(String s3){
  this.s=s3;
 }
 
 public String toString(){
  return super.toString()+" String s: "+this.getS();
 }
 
 public void m3(){
  super.m3();
  System.out.println("I am executing m3 as implemented in class D");
 }
 
 public int m2(char c){
  int x=super.m2(c);
  System.out.println("The m2(char c) version of D is executing now with returned value= "+x);
  return x;
 }
 
 public int m2(int x2){
   int y=super.m2(100);
   System.out.println( "The m2(int x1) version of D is executing now with returned value= "+y);
   return y;
  }
 
}