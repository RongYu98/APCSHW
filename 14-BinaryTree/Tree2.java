import java.util.*;

public class Tree2{

    private Node root=null;

    public Node Search (int i){
	Node T = root;
	while (T!=null){
	    //int c = T.getData().compareTo(i);
	    int c = i - T.getData();
	    if (c==0){
		return T;}
	    else if (c>0){
		T=T.getRight();}
	    else {
		T=T.getLeft();}
	}
	return null;
    }

    public Node RecSearch(int i, Node T){
	if (T==null){
	    return null;
	}
	int c = i - T.getData();
	if (c==0){
	    return T;}
	else if (c>0){
	    return RecSearch(i, T.getRight());}
	else {
	    return RecSearch(i, T.getLeft());}
    }

    public Node Search2 (int i){ //one before
	Node T = root;
	Node beforeT=root;
	while (T!=null){
	    //int c = T.getData().compareTo(i);
	    int c = i - T.getData();
	    if (c==0){
		return beforeT;}
	    else if (c>0){
		beforeT=T;
		T=T.getRight();}
	    else {
		beforeT=T;
		T=T.getLeft();}
	}
	return beforeT;
    }

    public Node RecSearch2(int i, Node T){ //one before
	if (T==null){
	    return null;
	}
	int c = i - T.getData();
	if (c==0){
	    return T;}
	else if (c>0){
	    if (T.getRight()==null){
		return T;}
	    return RecSearch2(i, T.getRight());}
	else {
	    if (T.getLeft()==null){
		return T;}
	    return RecSearch2(i, T.getLeft());}
    }

    public void Insert(int i){
	Node n = new Node(i);
	Node T=root;
	if (T==null){
	    root=n;
	    return;}
	else{
	    Node T2 = Search2(i);
	    int c = i - T2.getData();
	    if (c==0){
		return;}
	    else if (c>0){
		T2.setRight(n);
		//System.out.println(T2.getData());
		//System.out.println(In.getData());
	    }
	    else {
		T2.setLeft(n);
		//System.out.println(T2.getData());
		//System.out.println(In.getData());
	    }		
	    /*
	      1. Set T to root
	      2. search for n, but use a piggyback pointer T2 to follow T.
	      3. T2 now points to new Nodes parent
	      4. Insert the new node to the left or right of T2 as appropriate
	    */
	}    
    }

    public String toString(){
	String s="";

	if (root==null){
	    return "";}
	s+=String.valueOf(root.getData())+" ";
	//s+=ToString(root.getRight())+" ";
	//s+=ToString(root.getLeft())+" ";
	ArrayList<Node> orderOf = new ArrayList<Node>();
	orderOf.add(root.getLeft());
	orderOf.add(root.getRight());	

	return s+toString(orderOf, s);
    }

    //use an array, put it in, and them solve it in order.
    public String toString(ArrayList<Node> list, String s){
	if (list.size()==0){
	    return s;}
	Node temp = list.get(0);
	list.remove(0);
	if (temp!=null){
	    s+=String.valueOf(temp.getData()) + " ";
	    list.add(temp.getRight());
	    list.add(temp.getLeft());
	}
	return toString(list, s);
    }

    
    public String ToString(Node T){
	String s ="";
	if (T==null){
	    return s;}
	else {
	    s+=String.valueOf(T.getData())+" ";
	    s+=ToString(T.getRight())+" ";
	    s+=ToString(T.getLeft())+" ";
	} 
	return s;
    }

    public static void main(String[] args){
	Tree2 t=new Tree2();
	for (int i=0; i<10; i++){
	    t.Insert(i);}
	t.Insert(10);
	t.Insert(20);
	t.Insert(30);
	t.Insert(50);
	t.Insert(40);
	t.Insert(80);
	t.Insert(88);
	t.Insert(23);
	t.Insert(52);
	t.Insert(82);
	t.Insert(16);
	//System.out.println(t.Search2(10).getData());
	//System.out.println(t.Search2(20).getData());
	//System.out.println(t.Search2(30).getData());
	//System.out.println(t.Search2(16).getData());
	//System.out.println(t.Search(16).getData());
	System.out.println(t);

    }
}
