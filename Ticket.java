//quiz
//enum States { ILLINOIS, NEW_YORK, FLORIDA, CALIFORNIA, NONE};
//enum Destinations { CHICAGO, NEW_YORK, SOME_CITY, TAMPA, MIAMI, LOS_ANGELES, SAN_FRANCISCO, NONE};

import MainClass.OtherClasses.*;

public class Ticket
{
 Destinations city;
 States state;
 String LastName;
 String month;
 int counter;
 
 public Ticket()
 {
  city=Destinations.NONE;
  state=States.NONE;
  LastName="No_Name";
  month="No_Month";
  counter++;
 }
 
 public Ticket(String Lname, String monOfTravel)
 {
  LastName= Lname;
  month=monOfTravel;
  counter++;
 }
 
 public Destinations getCity()
 {
  return this.city;
 }
 
 public States getState()
 {
  return this.state;
 }
 
 public String getLastName()
 {
  return this.LastName;
 }
 
 public String getMonth()
 {
  return this.month;
 }
 
 public void setCity(Destinations travel)
 {
  city=travel;
 }
 
 public void setState(States newState)
 {
  state=newState;
 }
 
 public void setLastName(String newName)
 {
  LastName=newName;
 }
 
 public void setMonth(String newMonth)
 {
  month=newMonth;
 }
 
 public String toString()
 {
  System.out.println( "The Destination is "+getCity()+"."+" The State is "+getState()+"."+"The last name is "+getLastName()+"."+"The month is "+getMonth()+"The ticket id is "+counter+" The price is "+calculatePrice());
  return "done";
 }
 
 public double fare()
 {
  double price=0.00;
  if(city.ordinal()==0){
  price=200.00;}
  else if(city.ordinal()==1){
  price=300.00;}
  else if(city.ordinal()==3){
  price=300.00;}
  else if(city.ordinal()==4){
  price=200.00;}
  else if(city.ordinal()==5){
  price=500.00;}
  else if(city.ordinal()==6){
  price=500.00;}
  else if(city.ordinal()==7){
  price=0.00;}
  else if(city.ordinal()==2){
   if(state.ordinal()==3){
    price=400.00;}
   else if(state.ordinal()==1){
    price=200.00;}
  }
  return price;
 }
 
 public double calculatePrice()
 {
  double totPrice=0.00;
  
  if(month.equals("Jan") || month.equals("Feb") || month.equals("Mar"))
  {
   if((city.ordinal()==4) || city.ordinal()==5 || city.ordinal()==7 || city.ordinal()==3)
    { 
	 double surfare=(0.2*fare());
	 totPrice= surfare+fare();
	}
   if(state.ordinal()==3 || state.ordinal()==2)
    {
	 double surfare=(0.2*fare());
	 totPrice= surfare+fare();
	}
   }
   
  else if(month.equals("July") || month.equals("Aug"))
   {
    if(state.ordinal()==2)
	{
	 double discount= (0.2*fare());
	 totPrice= fare()-discount;
	}
   }
   
   else 
   {
    totPrice=fare();
   }
   
   return totPrice;
  }
  
}
   
	 
