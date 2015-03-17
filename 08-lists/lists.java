public class lists{
    private Node l=null;
    private int length;
    private final Node nothing=null;
    
    public lists(){
	l = new Node("Dummy");
	length = 0;
    }
    
    public void add(String s){
	Node tmp = new Node(s);
	if (length==0){
	    l.setNext(tmp);
	} else {
	    tmp.setNext(l.getNext());
	    l.setNext(tmp);
	}
	length++;
    }
		
    public String toString(){
	String s = "";
	Node tmp;;
	for (tmp=l.getNext() ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    //PreCondition: has to be within bounds
    public Node get(int n){
	if (n>length){
	    return nothing;
	}
	Node tmp = l.getNext();
	for (int i=0; i<n; i++){
	    tmp=tmp.getNext();
	}
	return tmp;
    }

    public void add(int n, String S){
	Node temp;
	if (n==0){
	    add(S);
	} else if (n>length){
	    System.out.println("Sorry, Out Of Bounds");
	} else {
	    Node tmp = l.getNext();
	    for (int i=0; i<n-1; i++){
		tmp=tmp.getNext();
	    }
	    Node tmp2=tmp.getNext();
	    Node Newie = new Node(S);
	    Newie.setNext(tmp.getNext());
	    tmp.setNext(Newie);
	    length++;
	}
    }

    public void remove(int n){
	if (n>length-1){
	    System.out.println("Sorry, Out Of Bounds");
	    return;}
	Node tmp=l;
	for (int i=0;i<n;i++){//same as find, only without the initial getNext
	    tmp=tmp.getNext();}
	tmp.setNext(tmp.getNext().getNext());
	length--;
    }
	

}
