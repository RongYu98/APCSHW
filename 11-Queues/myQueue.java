public class myQueue<E>{

    Node<E> dum = new Node<E>();
    Node<E> front = new Node<E>();
    Node<E> back = new Node<E>();

    public myQueue(E e){
	dum.setNext(new Node (e));
	front.setNext(new Node (e));
	back.setNext(new Node (e));
    }

    public void enqueue(E data){
        // add something to the tail/last
	Node<E> Stuff = new Node(data);
	back.setNext(Stuff);
	back = Stuff;
    }

    public E dequeue(){
        // remove and return the head/front item from the stack
	Node Stuff = front;
	front = front.getNext();
	return Stuff;
    }

    public boolean empty(){
	return front==null;

    }

    public E head() {
        // return the first item in the queue
	return front;
    }
}
