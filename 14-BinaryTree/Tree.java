public class Tree {

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

    public Node Search2 (int i){
	Node T = root;
	while (T!=null){
	    //int c = T.getData().compareTo(i);
	    int c = i - T.getData();
	    if (c==0){
		return T;}
	    else if (c>0){
		if (T.getRight()==null){
		    return T;}
		else{
		    T=T.getRight();}
	    }else {
		if (T.getLeft()==null){
		    return T;}
		else {
		    T=T.getLeft();}
	    }
	}
	return T;
    }

    public Node RecSearch2(int i, Node T){
	if (T==null){
	    return null;
	}
	int c = i - T.getData();
	if (c==0){
	    return T;}
	else if (c>0){
	    if (T.getRight()==null){
		return T;}
	    return RecSearch(i, T.getRight());}
	else {
	    if (T.getLeft()==null){
		return T;}
	    return RecSearch(i, T.getLeft());}
    }

    public void Insert(int i){
	Node n = new Node(i);
	Node T=root;
	if (T==null){
	    root=n;
	    return;}
	else{
	    Node In = new Node(i);
	    Node T2 = Search2(i);
	    int c = i - T2.getData();
	    if (c==0){
		return;}
	    else if (c>0){
		T.setRight(In);}
	    else {
		    T.setLeft(In);}		
	    /*
	      1. Set T to root
	      2. search for n, but use a piggyback pointer T2 to follow T.
	      3. T2 now points to new Node’s parent
	      4. Insert the new node to the left or right of T2 as appropriate
	    */
	}    
    }

    public String toString(){
	String s="";
	Node T = root;

	if (T==null){
	    return "";}
	s+=String.valueOf(T.getData())+" ";
	s+=ToString(T.getRight())+" ";
	s+=ToString(T.getLeft())+" ";
	
	return s;
    }

    public String ToString(Node T){
	String s ="";
	if (T==null){
	    return s;}
	else {
	    s+=String.valueOf(T.getData())+" ";
	    s+=ToString(T.getRight())+" ";
	    s+=ToString(T.getLeft())+" ";
	} return s;}

    public static void main(String[] args){
	Tree t=new Tree();
	t.Insert(10);
	t.Insert(20);
	t.Insert(30);
	t.Insert(100);
	System.out.println(t);

    }
}
