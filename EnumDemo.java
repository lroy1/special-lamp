// enum tryout

public class EnumDemo
{
	enum Days{ Sun, Mon, Tue, Wed, Thurs, Fri, Sat};
	
	public String Days(String k){
	return "this day is "+ k;}
	
 public static void main( String args [])
 {
  Days d1= Days.Sun;
  
  
  Days d2= Days.Thurs;
  
  
  boolean equality= d1.equals(d2);
  System.out.println( "are they equal?"+ equality);
  
  String k= d1.toString();
  String q= d2.toString();
  
  System.out.println(k+q);
  
  int l=d1.ordinal();
  int m=d2.ordinal();
  System.out.println(l);
  System.out.println(m);
  
 }
}
  
  