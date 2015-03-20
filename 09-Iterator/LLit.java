import java.io.*;
import java.util.*;

public class LLit<E> implements Iterator<E>{
    private Node<E> PrePrevious;
    private Node<E> Previous;
    public LLit(Node<E> n){
	PrePrevious = n; //this will be predummy node
	Previous = n; //the t will be the dummy node
	PrePrevious.setNext(Previous);
	Previous.setNext(n);
    }

    public boolean hasNext(){
	return t.getNext()!=null;
    }

    public E next(){
	E retval = t.getNext().getData();
	t=t.getNext();
	return retval;
    }

    public void remove(){
	// to be completed for homework
    }
}

