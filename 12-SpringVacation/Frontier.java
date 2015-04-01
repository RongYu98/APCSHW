public class Frontier{

    Node<String> front = new Node<String>();
    //front = null;
    Node<String> back = new Node<String>();
    //back = null;
    
    public Frontier(){
	front = new Node("Stuff");
	back = new Node("Stuff");
	front.getNext();
	back.getNext();
    }
    
    public void enqueue(String data){
        // add something to the tail/last
	Node<String> Stuff = new Node(data);
	if (empty()){
	    back=Stuff;
	    front=Stuff;
	} else {
	    back.setNext(Stuff);
	    back = Stuff;
	}
    }

    public E dequeue(){
        // remove and return the head/front item from the stack
	if (empty()){
	    return null;
	}
	E retval = front.getData();
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
