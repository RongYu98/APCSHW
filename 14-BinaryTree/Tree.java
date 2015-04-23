public class Tree{

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

    public void Insert(int i){
	Node n = new Node(i);
	Node T=root;
	if (T==null){
		T=n;
		return;}
	else{
		//insert as a new leaf
	    /*
	      1. Set T to root
	      2. search for n, but use a piggyback pointer T2 to follow T.
	      3. T2 now points to new Node’s parent
	      4. Insert the new node to the left or right of T2 as appropriate
	    */
	}    
    }

}
