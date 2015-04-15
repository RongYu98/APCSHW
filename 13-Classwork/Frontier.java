import java.util.*;

public class Frontier {
    public LinkedList<Node> l = new LinkedList<Node>();

    public void add(Node n){
	int i=0;
	for (i=0; i<l.size(); i++){
	    Node tmp = l.get(i);
	    if (n.getPri()<tmp.getPri()){
		break;
	    }
	}
	l.add(i, n);
    }

    public Node remove() {
	return l.remove(0);
    }

    public boolean isEmpty(){
	return l.isEmpty();
    }
}
