public class myQueue<E>{

    Node<E> front = new Node<E>();
    Node<E> back = new Node<E>();

    public myQueue(E e1, E e2){
	Node<E> Something = new Node(e1, e2);
	front = Something;
	back = Something;
    }

    public void enqueue(E data1, E data2){
        // add something to the tail/last
	Node<E> Stuff = new Node(data1, data2);
	if (empty()){
	    back=Stuff;
	    front=Stuff;
	} else {
	    back.setNext(Stuff);
	    back = Stuff;
	}
    }

    public Node dequeue(){
        // remove and return the head/front item from the stack
	if (empty()){
	    return null;
	}
	Node retval = new Node(front.GetX(), front.GetY());
	front = front.getNext();
	if (front==null){
	    back=back.getNext();// so both are null
	}
	return retval;
    }

    public boolean empty(){
	return front==null;
    }

    public E head() {
        // return the first item in the queue
	return front.getData();
    }
}
