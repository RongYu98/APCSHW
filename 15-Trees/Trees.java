public class Trees extends Tree{

    public int numNodes(Node T){
	if (T==null){
	    return 0;}
	else {
	    return 1+numNodes(T.getRight())+numNodes(T.getLeft());
	}
    }

    public int maxValue(Node t){
	if (t==null){
	    return Integer.MIN_VALUE;}
	return maxValue(t, t).getData();
    }
    public Node maxValue(Node T, Node big){
	if (T==null || T.getData() ==0){
	    return big;}
	else if (T.getData()>big.getData()){
	    Node Lside = maxValue(T.getLeft(), T);
	    Node Rside = maxValue(T.getRight(), T);
	    if (Lside.getData()>Rside.getData()){
		return Lside;}
	    return Rside;}
	else {
	    Node LSide = maxValue(T.getLeft(), big);
	    Node RSide = maxValue(T.getRight(), big);
	    if (LSide.getData()>RSide.getData()){
		return LSide;}
	    return RSide;
	}
    }

    public int height(Node t){ //algorithm gotten from stackoverflow
	if (t==null){
	    return 0;}
	else {
	    return Math.max( height(t.getRight()), height(t.getLeft())) +1;} // max returns 0 when 0 and 0 are parameters
    }

    public void splitDupes(Node t){
	if (t==null){
	    return;
	}
	if (t.getData()==t.getLeft().getData()){
	    Node add1 = new Node (t.getData()-1);
	    add1.setLeft(t.getLeft());
	    t.setLeft(add1);
	} else if (t.getData()==t.getRight().getData()){
	    Node add2 = new Node (t.getData()-1);
	    add2.setRight(t.getRight());
	    t.setRight(add2);
	} 
	splitDupes(t.getLeft());
	splitDupes(t.getRight());
    }

    public int diameter(Node t){
	if (t==null){
	    return 0;}
	else{
	    int PL1 = height(t.getLeft()) + height(t.getRight()) + 2;
	    int PL2 = diameter(t.getRight());
	    int PL3 = diameter(t.getLeft());
	    int PL12 = Math.max(PL1,PL2);
	    return Math.max(PL12,PL3);
	}
    }

    public static void main(String args[]){
	Trees t = new Trees();
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
	System.out.println(t.height(t.root));
	System.out.println(t.maxValue(t.root));}
	
}
