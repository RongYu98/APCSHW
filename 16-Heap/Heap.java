public class Heap{

    //public Node root;
    public int[] heap;
    
    public Heap(int n){
	heap = new int[1];
	heap[0]=n;
    }

    public int findMin(){
	return heap[0];
    }

    public void pushDown(int n){
	if (n*2+1>heap.length-1){
	    return;}
	while (heap[n] > heap[2*n+1] || (2*n+2 <heap.length -1 && heap[n] > heap[2*n+2])){
	    if (2*n+2 < heap.length-1){ // if 2*n+2 exists
		if (heap[2*n+1] < heap[2*n+2]){
		    int temp = heap[n];
		    heap[n] = heap[2*n+1];
		    heap[2*n+1] = temp;
		    n = 2*n+1;
		    if (n*2+1>heap.length-1){
	    		return;}
		} else {
		    int temp = heap[n];
		    heap[n] = heap[2*n+2];
		    heap[2*n+2] = temp;
		    n = 2*n + 2;
		    if (n*2+2>heap.length-1){
	    		return;}
	   	}
	    } else {
		int temp = heap[n];
		heap[n] = heap[2*n+1];
		heap[2*n+1] = temp;
		n = 2*n + 1;
		if (n*2+1>heap.length-1){
	    		return;}
	    }
	}
    }
	    
    public void removeMin(){
	heap[0]=heap[heap.length-1];
	int[] temp = new int[heap.length-1];
	for (int i=0; i<temp.length; i++){
	    temp[i]=heap[i];}
	heap = temp;
	pushDown(0);
    }

    public void shiftUp(int n){
	while (n!=0){
	    if (n%2==0){
 	    	if (heap[n] < heap[n/2-1]){
		    int temp = heap[n];
		    heap[n] = heap[n/2-1];
		    heap[n/2-1] = temp;
		    n = n/2-1;
		} else {
		    return;
	    	}
	    } else if (heap[n] < heap[n/2]){
		int temp = heap[n];
		heap[n] = heap[n/2];
		heap[n/2] = temp;
		n = n/2;
	    } else {
		return;
	    }
	}
    }

    public void insert(int n){
	int[] temp = new int[heap.length+1];
	for (int i=0; i<heap.length; i++){
	    temp[i] = heap[i];}
	temp[temp.length-1] = n;
	heap = temp;
	shiftUp(heap.length-1);
    }

    public int[] heapSort(){
	int[] temp = new int[heap.length];
	for (int i = 0; i< heap.length; i++){
	    temp[i]=heap[i];
	}
	int[] ret = new int[heap.length];
	for (int i=0; i<heap.length; i++){
	    ret[i] = findMin();
	    removeMin();}
	heap = temp;
	return ret;
    }

    public static void main(String[] args){
	Heap h = new Heap(0);
	for (int i = 0; i< 10; i++){
	    h.insert(i);
	}
	int[] temp = h.heapSort();
	for (int i=0; i<temp.length; i++){
	    System.out.print(i+"   ");}
	System.out.println();
    }

}
