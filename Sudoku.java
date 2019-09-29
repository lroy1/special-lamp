// lab 4

public class Sudoku
{
 int [][] grid= new int [9][9];
 int [][] box=new int [3][3];
 
 

 
 public Sudoku(){
 grid=null;
 }
 
 public Sudoku(int [][] array1){
 grid=array1;
 }
 
 public boolean checkRow(int [][] array2){
 int [] check1= new int [array2.length];
 for(int i=0; i<array2.length; i++){
 for(int j=0; j<array2[i].length; j++){
	check1[i]=array2[i][j];
 }}
 
 boolean notsame=distinctVal(check1);
 return notsame;
 }
  
 
 
 public boolean checkColumn(int [][] array3){
 int [] check2=new int [array3.length];
 for(int i=0; i<array3.length; i++){
 for(int g=0; g<array3.length; g++){
 check2[g]=array3[g][i];}}
 
 boolean notsame1 =distinctVal(check2);
 return notsame1;
 
 }
 
 public boolean checkBox(int [][] array4){
	 boolean one=checkRow(array4);
	 boolean two=checkColumn(array4);
	 boolean ret=false;
	 
	 if(one==true && two==true){
	 ret=true;}
	 else{ret=false;}
	 
	 return ret;
 }
		 
 
 
 public boolean distinctVal(int [] arr)
 {
	 int [] count= new int [9];
	 for (int i = 0; i < 9; i++){
	 count[i] = 0;}
	 boolean ret= true;
   for (int i = 0; i < arr.length; i++) {
   count[arr[i]-1] ++;}
   for(int j=0; j<count.length; j++){
	   if((count[j] != 1))
   ret=false;}
 
        
                  
    return ret;    
 }
} 