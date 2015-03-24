public class myStackArray<E>{
    
    E[] stack = (E[])new Object[1];

    public myStackArray(E thing){
	stack[0]=thing;
    }

    public void push(E data){
	E[] temp = (E[]) new Object[stack.length+1];
	temp[0]=data;
	for (int i=1; i<temp.length;i++){
	    temp[i]=stack[i-1];
	}
	stack = temp;
    }

    public E pop(){
	if (empty()){
	    return null;
	}
	else {
	    E data = stack[0];
	    E[] temp = (E[]) new Object[stack.length-1];
	    for (int i=0; i<temp.length; i++){
		temp[i] = stack[i+1];
	        
	    }
	    stack = temp;
	    return data;
	    
	}
    }

    public boolean empty(){
	return stack.length==0;
    }

    public E top(){
	if (!empty()){
	    return stack[0];
	} else {
	    return null;
	}
    }
	    

}
