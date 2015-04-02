import java.io.*;
import java.util.*;

public class BreadthFirst {
    private char[][] board;
    private int maxX;
    private int maxY;
    
    private char path='#';
    private char wall=' ';
    private char me='z';
    private char exit='$';
    private char visited = '.';
    private boolean solved = false;
    private myQueue Frontier;

    public BreadthFirst(){
	Node Beginning = new Node(1,1);
	Frontier = new myQueue();
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
	String s = "[2J\n";			
	for (int y=0;y<maxY;y++){
	    for (int x=0;x<maxX;x++)
		s = s +board[x][y];
	    s=s+"\n";
	}
	return s;
    }

    public void Solve(){
	while (!Frontier.empty()){
	    //dequeue something
	    new Node temp = Fontier.dequeue();
	    int xcor = temp.GetX();
	    int ycor = temp.GetY();
	    
	    //calculate // break if neccessary

	    //enqueue all around it into frontier

	}
    }
    /*
    public void Solve(int x, int y){
	if (board[x][y]==wall || board[x][y]==me || board[x][y]==visited ||
	    solved)
	    {
		return;
	    }

	if (board[x][y]==exit){
	    System.out.println(this);
	    solved = true;
	}
	delay(100);
	System.out.println(this);
	board[x][y]=me;
	
    }
    public void Solve2(int x, int y){
	Node NewGuy = new Node (x, y);
	
    }
    */  

    public static void main(String args[]){
	BreadthFirst BF = new BreadthFirst();
	System.out.println(BF);
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
