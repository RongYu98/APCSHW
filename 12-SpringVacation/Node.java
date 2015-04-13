public class Node{

    private int X;
    private int Y;
    private Node next;
    private Node pre=null;

    public Node(int x, int y){
	X = x;
	Y = y;
    }

    public int GetX(){
	return X;}
    public int GetY(){
	return Y;}
    public void SetPre(Node N){
	pre=N;}
    public Node GetPre(){
	return pre;}
    
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
