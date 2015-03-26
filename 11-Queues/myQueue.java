public class myQueue<E>{

    Node<E> front = new Node<E>();
    Node<E> back = new Node<E>();

    public myQueue(E e){
	Node<E> Something = new Node(e);
	front = Something;
	back = Something;
    }

    public void enqueue(E data){
        // add something to the tail/last
	Node<E> Stuff = new Node(data);
	back.setNext(Stuff);
	back = Stuff;
    }

    public E dequeue(){
        // remove and return the head/front item from the stack
	if (empty()){
	    return null;
	}
	E retval = front.getData();
	front = front.getNext();
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
