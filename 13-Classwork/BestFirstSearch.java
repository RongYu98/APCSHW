import java.io.*;
import java.util.*;

public class BestFirstSearch{

    private char[][] board;
    private int maxX;
    private int maxY;
    private int Ex,Ey;

    private char path='#';
    private char wall=' ';
    private char me='z';
    private char exit='$';
    private char visited = '.';
    private boolean solved = false;

    private Frontier f;
		
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
		
    public BestFirstSearch() {
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];
				
	try {					
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext()){
		String line = sc.nextLine();
		for (int i=0;i<maxX;i++){
		    board[i][j] = line.charAt(i);}
		j++;
	    }
	}
	catch (Exception e) {}
	
	for (int r=0; r<board.length; r++){  ////////
	    for (int c=0; c<board[0].length; c++){
		if (board[r][c]=='$'){
		    Ex=r;
		    Ey=c;
		    break;
		}
	    }
	}
    }
		
    public String toString(){
	String s = "[2J\n";
				
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	return s;
    }

    /*
      Only adds if the tx,ty spot is available path or exit
    */
    public void addToFront(int tx,int ty, Node current){
	Node tmp = null;
	if (board[tx][ty]=='#' || board[tx][ty]=='$'){
	    int far = Math.abs(tx-Ex)+Math.abs(ty-Ey);
	    tmp = new Node(tx,ty,far);
	    tmp.setPrev(current);
	    f.add(tmp);
	}
						
    }

    public void bfs(int x, int y){
	f = new Frontier();

	f.add(new Node(x,y,0));

	int tx=0,ty=0;
	Node current = null;
	while (!f.isEmpty()){
	    current = f.remove();
	    int cx = current.getX();
	    int cy = current.getY();

	    if (board[cx][cy]=='$')
		break;
						
	    board[cx][cy]='z';

	    addToFront(cx+1,cy,current);
	    addToFront(cx-1,cy,current);
	    addToFront(cx,cy+1,current);
	    addToFront(cx,cy-1,current);

	    delay(50);
	    System.out.println(this);
	}

	// path recovery
	for (Node p = current.getPrev(); p != null ; p = p.getPrev()){
	    board[p.getX()][p.getY()] = 'P';
	    delay(100);
	    System.out.println(this);
	}
    }
		
    public static void main(String[] args){
	BestFirstSearch m = new BestFirstSearch();
	System.out.println(m);
	m.bfs(1,1);
	System.out.println(m);
		
    }
    




}
