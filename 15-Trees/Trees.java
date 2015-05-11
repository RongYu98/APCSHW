public class Trees{

    public int numNodes(Node T){
	if (T==null){
	    return 0;}
	else {
	    return 1+numNodes(T.getRight())+numNodes(T.getLeft());
	}
    }


    public int maxValue(Node t){
	return maxValue(t, t).getData();
    }
    public Node maxValue(Node T, Node big){
	if (T==null){
	    return big;}
	else if (T.getData()>big.getData()){
	    return maxValue(maxValue(T.getLeft(), T),
			    maxValue(T.getRight(), T));}
	else return maxValue(maxValue(T.getLeft(), big),
			    maxValue(T.getRight(), big));
    }

    public static void main(String args[]){
	Trees t = new Trees();}
	
}
