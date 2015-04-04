import java.io.*;
import java.util.*;

public class BreadthFirst {
    public char[][] board;
    public int maxX;
    public int maxY;
    
    public char path='#';
    public char wall=' ';
    public char me='z';
    public char exit='$';
    public char visited = '.';
    public boolean solved = false;
    public myQueue Frontier;

    public BreadthFirst(){
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];
			
	try {
						
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext()){
		String line = sc.nextLine();
		for (int i=0;i<maxX;i++){
		    board[i][j] = line.charAt(i);
		}
		j++;
	    }
	}
	catch (Exception e){}
    }
	
    public String toString(){
	String s = "[2J\n";	  //doesn't work on my console		
	for (int y=0;y<maxY;y++){
	    for (int x=0;x<maxX;x++)
		s = s +board[x][y];
	    s=s+"\n";
	}
	for (int i=0;i<5;i++){
	    System.out.println();
	}
	return s;
    }

    public void delay(int n){
	try{
	    Thread.sleep(n);
	} catch (Exception e){}
    }

    public void Solve(){
	Frontier = new myQueue(1,1);
	while (!Frontier.empty()){
	    //dequeue something
	    Node temp = Frontier.dequeue();
	    int xcor = temp.GetX();
	    int ycor = temp.GetY();
	    
	    //calculate // break if neccessary
	    if (board[xcor][ycor]==exit){
		break;
	    } else {
		board[xcor][ycor]=me;
	    }

	    //enqueue all around it into frontier
	    if (Checker(xcor, ycor+1)){
		Frontier.enqueue(xcor, ycor+1);}
	    if (Checker(xcor+1, ycor)){
		Frontier.enqueue(xcor+1, ycor);}
	    if (Checker(xcor, ycor-1)){
		Frontier.enqueue(xcor, ycor-1);}
	    if (Checker(xcor-1, ycor)){
		Frontier.enqueue(xcor-1, ycor);}
	    System.out.println(this);
	    delay(50);		
	}
    }
    public boolean Checker(int x, int y){
	if (x>-1 && x<board.length && y >-1 && y < board[0].length){
	    return board[x][y]==path || board[x][y] ==exit;}
	return false;
    }

    public static void main(String args[]){
	BreadthFirst BF = new BreadthFirst();
	System.out.println(BF);
	BF.Solve();
    }

    /* Algorithm:
       1. put something into frontier
       2. calculate that something
       3. add all around it into frontier
       4. dequeue it
       5. repeat 2-4
       6. end when Fontier is empty
    */


}
