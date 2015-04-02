public class Node<E>{
    private E data;
    private E X;
    private E Y;
    private Node<E> next;

    public Node(int x, int y){
	X = x;
	Y = nully;
    }
    public Node(E s){
	data = s;
	next = null;
    }
    public E GetX(){
	return X;}
    public E GetY(){
	return Y;}
    public void setData(E s){
	data = s;
    }
    public E getData(){
	return data;
    }
    public void setNext(Node<E> n){
	next = n;
    }
    public Node<E> getNext(){
	return next;
    }
    public String toString(){
	return ""+data;
    }
}
