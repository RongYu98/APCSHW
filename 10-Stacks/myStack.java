public class myStack<E>{
    Node<E> dum = new Node<E>();

    public myStack(E e){
	dum.setNext(new Node(e));
    }

    public void push(E data){
	Node tmp = new Node(data);
        if (!empty()){
	    Node i = dum.getNext();
	    tmp.setNext(i);
	}
	dum.setNext(tmp);

    }

    public E pop(){
	if(empty()){
	    return null;
	}
	else{
	    E i = dum.getNext().getData();
	    dum.setNext(dum.getNext().getNext());
	    return i;
	}
    }

    public boolean empty(){
	return dum.getNext()==null;
    }

    public E top() {
	E i = pop();
	push(i);
	return i;
    }
}
