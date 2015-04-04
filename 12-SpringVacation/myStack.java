public class myStack{
    Node dum = new Node(1,1);

    public myStack(int e1, int e2){
	dum.setNext(new Node(e1, e2));
    }

    public void push(int data1, int data2){
	Node tmp = new Node(data1, data2);
    	if (!empty()){
	    Node i = dum.getNext();
	    tmp.setNext(i);
	}
	dum.setNext(tmp);
    }

    public void push(Node tmp){
        	if (!empty()){
	    Node i = dum.getNext();
	    tmp.setNext(dum.getNext());
	}
	dum.setNext(tmp);
    }

    public Node pop(){
	if(empty()){
	    return null;
	}
	else{
	    Node i = dum.getNext();
	    dum.setNext(dum.getNext().getNext());
	    return i;
	}
    }

    public boolean empty(){
	return dum.getNext()==null;
    }

    public Node top() {
	Node i = pop();
	push(i);
	return i;
    }
}
