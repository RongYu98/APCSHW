import java.io.*;
import java.util.*;

public class KnightsTour{

    int[][] board;
    int counter=1;
    int ME = -1;
    
    public KnightsTour(int n){
	board = new int [n][n];
    }


    public void delay(int n){
	try {
    	    Thread.sleep(n);}
	catch (Exception e) {}
    }
    /*
    public KnightsTour(int n){
	board = new int[n+4][n+4];
	for (int r=0;r<2;r++){
	    for (int c=0;c<board[0].length;c++){
		board[r][c]=-1;
	    }
	}
	for (int r=board.length-1;r>n+1;r--){
	    for (int c=0;c<board[0].length;c++){
		board[r][c]=-1;
	    }
	}
	for (int r=0;r<board.length;r++){
	    for (int c=0; c<2; c++){
		board[r][c]=-1;
	    }
	}
	for (int r=0;r<board.length;r++){
	    for (int c=board[0].length-1; c>board[0].length-3; c--){
		board[r][c]=-1;
	    }
	}	
    }*/

    public void Start(){
	Random r = new Random();
	int Row = r.nextInt(board.length);
	int Col = r.nextInt(board.length);
	board[Row][Col]=ME;
	System.out.println(Solve(Row, Col));
	System.out.println("Yes");
    }

/*
    public String toString(){
	String s =String.format("%d",3);
	for (int r=0;r<board.length;r++){
	    for (int c=0;c<board.length;c++)
		s = s +board[r][c];
		s=s+"\n";
	    }
	return s;
    }
*/

    public void Printing(){
	for (int r=0; r<board.length; r++){
	    for (int c=0;c<board[0].length;c++){
		System.out.printf("%3d", board[r][c]);
	    }
	    System.out.printf("\n");
	}
    }

    public void Space(){
	for (int i = 0; i<10; i++){
	    System.out.println();
	}
    }

    public boolean Checker(int R, int C){
	if (R<0 || R>=board.length || C<0 || C >=board.length){
	    return false;}
	return true;
    }

    public boolean Solve(int R, int C){
	Space();
	for (int r=0; r<board.length; r++){
	    for (int c=0;c<board[0].length;c++){
		System.out.printf("%3d", board[r][c]);
	    }
	    System.out.printf("\n");
	}
	if (!Checker(R,C)){
	    return false;}
	if (counter == board.length*board.length){
	    return true;}
	if (board[R][C]>0){
	    return false;}
	counter++;
	board[R][C]=counter;
	delay(500);
	if (!Solve(R+2,C+1)){
	    board[R][C]=0;
	}
	if (!Solve(R+1,C+2)){
	    board[R][C]=0;
	}
	if (!Solve(R+2,C-1)){
	    board[R][C]=0;
	}
	if (!Solve(R+1,C-2)){
	    board[R][C]=0;
	}
	if (!Solve(R-2,C+1)){
	    board[R][C]=0;
	}
	if (!Solve(R-1,C+2)){
	    board[R][C]=0;
	}
	if (!Solve(R-2,C-1)){
	    board[R][C]=0;
	}
	if (!Solve(R-1,C-2)){
	    board[R][C]=0;
	}
	counter--;
	return false;

    }

    public static void main(String[] args){
	KnightsTour KT = new KnightsTour(5);
	KT.Start();

    }

}
