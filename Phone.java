// Lab 07 

package superclass;

public class Phone 
{
 private int areaCode;
 private int exchange;
 private int number;
 
 public Phone(){
  this.setAreaCode("999");
  this.setExchange("999");
  this.setNumber("9999");
 }
 
 public Phone( String area, String ex, String num){
 //if( area>=200 && ex>=200 && area<=999 && ex<=999){
  this.setAreaCode(area);
  this.setExchange(ex);
  this.setNumber(num);
  }
 
 
 public String getAreaCode(){
  String k= Integer.toString(this.areaCode);
  return k;
 }
 
 public String getExchange(){
  String l= Integer.toString(this.exchange);
  return l;
 }
 
 public String getNumber(){
  String m= Integer.toString(this.number);
  return m;
 }
 
 public void setAreaCode( String ar1){
 int ar= Integer.parseInt(ar1);
 if(ar>=200 && ar<=999){
  this.areaCode=ar;}
 else{System.out.println("wrong input for area code");
 this.setAreaCode("999");}
 }
 
 public void setExchange(String exc){
  int ex1= Integer.parseInt(exc);
  if(ex1>=200 && ex1<=999){
  this.exchange=ex1;}
  else{System.out.println("wrong input for exchange code");}
 }
 
 public void setNumber(String num1){
  int num2=Integer.parseInt(num1);
  this.number=num2;
 }
 
 public String toString(){
  return " the phone number is: "+getAreaCode()+" "+getExchange()+" "+getNumber();
 }  
 
}

  
 