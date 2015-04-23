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

    public void Insert(int i){
	Node n = new Node(i);
	Node T=root;
	if (T==null){
		T=n;
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
			T=T.setLeft(In);}		
	    /*
	      1. Set T to root
	      2. search for n, but use a piggyback pointer T2 to follow T.
	      3. T2 now points to new Node’s parent
	      4. Insert the new node to the left or right of T2 as appropriate
	    */
	}    
    }

}
