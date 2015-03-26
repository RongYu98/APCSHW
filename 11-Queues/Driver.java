public class Driver{

    public static void main(String[] args){
	myQueue<String> Q = new myQueue<String>("hi");
	System.out.println(Q.empty()); //false
	Q.enqueue("stuff");
	Q.enqueue("more");
	System.out.println(Q.head());// hi
	System.out.println(Q.dequeue()); //hi
	System.out.println(Q.dequeue()); //stuff
	System.out.println(Q.dequeue()); //more
	System.out.println(Q.dequeue()); //null
	System.out.println(Q.empty()); //true
    }
	
}
