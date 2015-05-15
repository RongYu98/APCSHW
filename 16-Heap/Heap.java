public class Heap{

    //public Node root;
    public int[] heap;
    
    public Heap(int n){
	heap = new int[2];
	heap[0]=n;
    }

    public int findMin(){
	return heap[0];
    }

    public void pushDown(int n){ //the number in the array; needs to be rewritten
	while (n.getData() > n.getLeft().getData() || n.getData() > n.getRight().getData()){
	    Node tempL = n.getLeft();
	    Node tempR = n.getLeft();
	    if (tempL.getData() < tempR.getData()){
		Node temp = n;
		n = tempL;
		tempL = temp;
	    } else {
		Node temp = n;
		n = tempR;
		tempR = temp;
	    }
	}
    }
	    
    public void removeMin(){
	heap[0]=heap[heap.length-1];
	
    }

    public void pushUp(int n){
    }

    public void heapSort(){
    }

}
