public class Driver{
    public static void main(String[] args){
	/*
	myStack<String> ms = new myStack<String>("blah");
	System.out.println(ms.top());//blah
	System.out.println(ms.pop());//blah
	System.out.println(ms.pop());//null
	System.out.println(ms.empty());//true
	ms.push("BLAH");//nothing
	System.out.println(ms.top());//BLAH
	*/
	
	myStackArray<String> ms = new myStackArray<String>("blah");
	System.out.println(ms.top());//blah
	System.out.println(ms.pop());//blah
	System.out.println(ms.pop());//null
	System.out.println(ms.empty());//true
	ms.push("BLAH");//nothing
	System.out.println(ms.top());//BLAH
    }
}
