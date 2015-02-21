import java.io.*;
import java.util.*;

public class NQueens{

    int[][] board;
    int counter =1;

    public NQueens(int n){
	board = new int[n][n];
	for (int r=0; r<n; r++){
	     for (int c=0;c<n; c++){
		board[r][c]=0;
	    }
	}
    }

    public void solve(){
	Solve(0,0);
    }

    public void Solve(int Row, int Col){
	
	if (Checker(Row, Col)){
	    board[Row][Col]=counter;
	    counter++;}
	//Printing();
	//delay(5);
	if (Row<board.length){
	    Solve(Row+1, Col);}
	if (Col<board.length){
	    Solve(Row, Col+1);}
	if (Col<board.length&&Row<board.length){
	    Solve(Row+1, Col+1);}
	
	/*   This also works, it doesn't use recursion 
	for (int col = 0; col<board.length; col++){
	    for (int row = 0; row<board.length; row++){
		if (Checker(row,col)) {
		    board[row][col]=counter;
		    counter++;
		}
	}   }*/
    }

    public void Printing(){
	for (int r=0; r<board.length; r++){
	    for (int c=0;c<board[0].length;c++){
		System.out.printf("%3d", board[r][c]);
	    }
	    System.out.printf("\n");
	}
    }

    public boolean Checker(int row, int col){
	if (row>=board.length||col>=board.length){
	    return false;}
	for (int r = 0;r<board.length;r++){
	    if (board[r][col]!=0){
		return false;}
	}//vetical
	for (int c=0;c<board.length;c++){
	    if (board[row][c]!=0){
		return false;}
	}//horizontal

	try {//up right
	    for (int i=0;i<board.length;i++){
		if (board[row+i][col+i]!=0){
		    return false;}
	    }
	} catch (Exception e){}

	try {//up left
	    for (int i=0;i<board.length;i++){
		if (board[row+i][col-i]!=0){
		    return false;}
	    }
	} catch (Exception e){}
	try {
	    for (int i=0;i<board.length;i++){
		if (board[row-i][col+i]!=0){
		    return false;}
	    }
	} catch (Exception e){}
	try {
	    for (int i=0;i<board.length;i++){
		if (board[row-i][col-i]!=0){
		    return false;}
	    }
	} catch (Exception e){}
	return true;
    }
	
	    
    public void delay(int n){	
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }


    public static void main(String args[]){
	NQueens Q = new NQueens(9);
	Q.solve();
	Q.Printing(); 	
    }
}
