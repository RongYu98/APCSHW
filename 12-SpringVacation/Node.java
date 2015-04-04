public class Node{

    private int X;
    private int Y;
    private Node next;

    public Node(int x, int y){
	X = x;
	Y = y;
    }

    public int GetX(){
	return X;}
    public int GetY(){
	return Y;}

    public void setNext(Node n){
	next = n;
    }
    public Node getNext(){
	return next;
    }
    public String toString(){
	return ""+X+Y;
    }
}
