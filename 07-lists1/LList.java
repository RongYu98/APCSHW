public class LList{
    private Node l=null;

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }
		
    public String toString(){
	String s = "";
	Node tmp;;
	for (tmp=l ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    //PreCondition: has to be within bounds
    public Node find(int n){
	Node tmp = l;
	for (int i=0; i<n; i++){
	    tmp=tmp.getNext();
	}
	return tmp;
    }

    public void insert(int n, String S){
	Node temp;
	if (n==0){
	    temp = new Node(S);
	    temp.setNext(l);
	    l=temp;
	    return;
	}
	
	Node tmp = l;
	for (int i=0; i<n-1; i++){
	    tmp=tmp.getNext();
	}
	Node tmp2=tmp.getNext();
	Node Newie = new Node(S);
	tmp.setNext(Newie);
	Newie.setNext(tmp2);
    }
}
