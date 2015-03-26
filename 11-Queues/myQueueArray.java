public class myQueueArray<E>{

    E[] Line = (E[])new Object[1];

    public myQueueArray(E thing){
	Line[0] = thing;
    }
    
    public void enqueue(E data){
	// add something to the tail/last
	E[] temp = (E[])new Object[Line.length+1];
	int i=0;
	for (i<Line.length;i++){
	    temp[i]=Line[i];
	}
	temp[i]=data;
	line=temp;
    }

    public E dequeue(){
	// remove and return the head/front item from the stack
    }

    public boolean empty(){
	return Line.length==0;
    }

    public E head(){
	return Line[0];
    }

}
//second is no adjustment, fixed size and all constant, no shifting
