// client sudoku

import java.util.*;

public class SudokuApp
{
	
 static SudokuApp game= new SudokuApp();

  
 public static void main(String args [])
 {
	 
	 
  final int ASIZE=9;
  int grid [][] =new int [ASIZE][ASIZE];
  
  for(int i=0; i<9; i++)
  {
   for(int j=0; j<grid[i].length; j++)
   {
     grid[i][j]=game.randomVal();
   }
  }
  Sudoku solve=new Sudoku(grid);
  /*for(int e=0; e<9; e++){
  System.out.println(grid[5][e]);}*/
  
  int [][] box0={{grid[0][0],grid[0][1],grid[0][2]},{grid[1][0],grid[1][1],grid[1][2]},{grid[2][0],grid[2][1],grid[2][2]}};
  int [][] box1={{grid[0][3],grid[0][4],grid[0][5]},{grid[1][3],grid[1][4],grid[1][5]},{grid[2][3],grid[2][4],grid[2][5]}};
  int [][] box2={{grid[0][6],grid[0][7],grid[0][8]},{grid[1][6],grid[1][7],grid[1][8]},{grid[2][6],grid[2][7],grid[2][8]}};
  int [][] box3={{grid[3][0],grid[3][1],grid[3][2]},{grid[4][0],grid[4][1],grid[4][2]},{grid[5][0],grid[5][1],grid[5][2]}};
  int [][] box4={{grid[3][3],grid[3][4],grid[3][5]},{grid[4][3],grid[4][4],grid[4][5]},{grid[5][3],grid[5][4],grid[5][5]}};
  int [][] box5={{grid[3][6],grid[3][7],grid[3][8]},{grid[4][6],grid[4][7],grid[4][8]},{grid[5][6],grid[5][7],grid[5][8]}};
  int [][] box6={{grid[6][0],grid[6][1],grid[6][2]},{grid[7][0],grid[7][1],grid[7][2]},{grid[8][0],grid[8][1],grid[8][2]}};
  int [][] box7={{grid[6][3],grid[6][4],grid[6][5]},{grid[7][3],grid[7][4],grid[7][5]},{grid[8][3],grid[8][4],grid[8][5]}};
  int [][] box8={{grid[6][6],grid[6][7],grid[6][8]},{grid[7][6],grid[7][7],grid[7][8]},{grid[8][6],grid[8][7],grid[8][8]}};
  
  System.out.println("grid is ready");
  System.out.println("now checking solution for generated grid");
  
  System.out.println("checking rows");
  
  
  boolean sol=solve.checkRow(grid);
  
  if(sol=true){
		  System.out.println("rows have repeating elements");
	  }
  else{
		  System.out.println("rows don't have repeating elements");
	  }
  
  System.out.println("checking columns");
  
 
  boolean sol1=solve.checkColumn(grid);
  
  if(sol1=true){
		  System.out.println("columns have repeating elements");
	  }
  else{
		  System.out.println("columns don't have repeating elements");
	  }
  
  boolean cbox0=solve.checkBox(box0);
  System.out.println("does box1 have same elements: "+cbox0);
  boolean cbox1=solve.checkBox(box1);
  System.out.println("does box2 have same elements: "+cbox1);
  boolean cbox2=solve.checkBox(box2);
  System.out.println("does box3 have same elements: "+cbox2);
  boolean cbox3=solve.checkBox(box3);
  System.out.println("does box4 have same elements: "+cbox3);
  boolean cbox4=solve.checkBox(box4);
  System.out.println("does box5 have same elements: "+cbox4);
  boolean cbox5=solve.checkBox(box5);
  System.out.println("does box6 have same elements: "+cbox5);
  boolean cbox6=solve.checkBox(box6);
  System.out.println("does box7 have same elements: "+cbox6);
  boolean cbox7=solve.checkBox(box7);
  System.out.println("does box8 have same elements: "+cbox7);
  boolean cbox8=solve.checkBox(box8);
  System.out.println("does box9 have same elements: "+cbox8);
  
  if(sol=true){
  System.out.println("the solution is not valid!");}	  
 
 }

 public int randomVal(){
   int min=1;
	int max=9;
	int range=max-min+1;
	int rndval=0;
   rndval= (int)(Math.random()*(range));
   return rndval;
   }
	
	
}	
	