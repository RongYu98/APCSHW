public class myQueue<E>{

    Node front;
    Node back;

    public myQueue(int e1, int e2){
	Node Something = new Node(e1, e2);
	front = Something;
	back = Something;
    }

    public void enqueue(int data1, int data2){
        // add something to the tail/last
	Node Stuff = new Node(data1, data2);
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

    public Node head() {
        // return the first item in the queue
	return front;
    }
}
