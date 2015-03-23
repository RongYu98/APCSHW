import java.io.*;
import java.util.*;

public class LLit<E> implements Iterator<E>{

    private Node<E> PrePrevious;
    private Node<E> Previous;
    private Node<E> NowNode;
    public LLit(Node<E> n){
	//PrePrevious = new Node("PrePre"); 
	Previous = new Node("Pre"); 
	NowNode=new Node("dummy");
	//PrePrevious.setNext(Previous);
	Previous.setNext(NowNode);
	NowNode.setNext(n);
    }

    public boolean hasNext(){
	return NowNode.getNext().getData()!=null;
    }

    public E next(){
	E retval = NowNode.getNext().getData();
	NowNode=NowNode.getNext();
	if (NowNode.getData()!=Previous.getNext().getData()){
	    Previous = Previous.getNext();}
	//Previous=NowNode;
	return retval;
    }

    public void remove(){
	//PrePrevious.setNext(Previous.getNext());
	Previous = NowNode;
    }

}

