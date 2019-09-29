// lab 07 sub

package subclass;
import superclass.Phone;

public class BusinessPhone extends Phone
{
 private int extension;
 
 public BusinessPhone(){
  this.setExtension("9999");
 }
 
 public BusinessPhone(String extension){
  this.setExtension(extension);
 }
 
 public BusinessPhone( String ar, String exchange, String num, String exten){
  super ( ar, exchange, num);
  this.setExtension(exten);
 }
 
 public BusinessPhone( Phone p1, String extent){
  super ( p1.getAreaCode(), p1.getExchange(), p1.getNumber());
  this.setExtension(extent);
 }
 
 public String getExtension(){
  String k= Integer.toString(this.extension);
  return k;
 }
 
 public void setExtension(String ext){
  int k= Integer.parseInt(ext);
  this.extension=k;
 }
 
 public String toString(){
  return super.toString()+" additional extension is: "+this.getExtension();
 }
}
