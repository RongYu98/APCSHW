import java.io.*;
import java.util.*;

public class DepthFirst extends BreadthFirst{
    public myStack Frontier;

    public DepthFirst(){
	    super();
	    System.out.println(board);
    }

    public void Solve(){
	Frontier = new myStack(1,1);
	while (!Frontier.empty()){
	    //dequeue something
	    Node temp = Frontier.pop();
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
		Frontier.push(xcor, ycor+1);}
	    if (Checker(xcor+1, ycor)){
		Frontier.push(xcor+1, ycor);}
	    if (Checker(xcor, ycor-1)){
		Frontier.push(xcor, ycor-1);}
	    if (Checker(xcor-1, ycor)){
		Frontier.push(xcor-1, ycor);}
	    System.out.println(this);
	    delay(100);		
	}
    }

    public static void main(String args[]){
	DepthFirst DF = new DepthFirst();
	DF.Solve();
    }

}