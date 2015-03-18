public class lists{
    private Node l=null;
    private int length;
    private final Node nothing=null;
    
    public lists(){
	l = new Node(0);
	length = 0;
    }
    
    public void add(int s){
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
    public int get(int n){
	if (n>length){
	    return -1;
	}
	Node tmp = l.getNext();
	for (int i=0; i<n; i++){
	    tmp=tmp.getNext();
	}
	return tmp.getData();
    }

    public void add(int n, int S){
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
    
    public int remove(int n){
	if (n>length-1){
	    System.out.println("Sorry, Out Of Bounds");
	    return -1;}
	Node tmp=l;
	for (int i=0;i<n;i++){//same as find, only without the initial getNext
	    tmp=tmp.getNext();}
	Node temp = tmp.getNext();
	tmp.setNext(tmp.getNext().getNext());
	length--;
	return temp.getData();
    }

    public boolean remove2(int n){
	if (n<0 || n>length){
	    return false;}
	Node tmp;
	for (Node temp = l; temp != null; temp=temp.getNext()){
	    if (temp.getNext().getData()==n){
		tmp=temp.getNext().getNext();
		temp.setNext(temp.getNext().getNext());
		return true;
	    }
	}
	return false;
    }

}
