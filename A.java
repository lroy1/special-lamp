//LAB 09

package superclass;

public abstract class A 
{
 public int a;
 private double aa;
 
 public A(){
  a=0;
  aa=0.0;
  System.out.println("default constructor- A");
 }
 
 public A(int a1, double aa1){
  this.setA(a1);
  this.setAA(aa1);
   System.out.println("non default constructor- A");
 }
 
 public int getA(){
  return this.a;
 }
 
 public double getAA(){
  return this.aa;
 }
 
 public void setA(int a2){
  this.a=a2;
 }
 
 public void setAA(double aa2){
  this.aa= aa2;
 }
 
 public String toString(){
  return "this is object of type A, with a= "+this.getA()+" and aa= "+this.getAA();
 }
 
 public int m2(char a){
  int x =(int)a;
  System.out.println("m2 of A is executing now");
  return x;
 }
 
 public int m2(int x1){
  int y=10+x1;
  System.out.println("second version of m2 in A executing now");
  return y;
 }
 
 public void m3(){
  System.out.println("m3 of A executing now");
 }
 
 public abstract int m1();
}