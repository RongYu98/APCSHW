import java.util.*;

public class Driver{
    public static void main(String[] args) {
	lists L = new lists();
	for (int i=0;i<100000;i++){
	    L.add(i);
	}
	ArrayList<Integer> l = new ArrayList<Integer>();
	for (int i=0;i<100000;i++){
	    l.add(i);
	}
	LinkedList<Integer> LL = new LinkedList<Integer>();
	for (int i=0;i<100000;i++){
	    LL.add(i);
	}

	int sum = 0;
	long timeNow = System.currentTimeMillis();
	for (int i=0;i<L.getSize(); i++){
    	    sum = sum + L.get(i);
	}
	System.out.println(System.currentTimeMillis()-timeNow);
	//21,682 milliseconds for 100,000

	sum = 0;
	timeNow = System.currentTimeMillis();
	for (int i=0;i<l.size(); i++){
    	    sum = sum + l.get(i);
	}
	System.out.println(System.currentTimeMillis()-timeNow);
	//20 milliseconds for 100,000

	sum = 0;
	timeNow = System.currentTimeMillis();
	for (int i=0;i<LL.size(); i++){
    	    sum = sum + LL.get(i);
	}
	System.out.println(System.currentTimeMillis()-timeNow);
	//8857 milliseconds for 100,000

	/*
	System.out.println(l);
	System.out.println("zeroth is: " +l.get(0));
	System.out.println("fifth is: " +l.get(5));
	System.out.println("fourth is: "+l.get(4));
	System.out.println("three is: "+l.get(3));
	System.out.println("seventh is: "+l.get(7));
	l.add(4, 4);
	l.add(3, 333);
	l.add(6, 666);
	System.out.println(l);
	l.remove2(1);
	System.out.println("removed 1: "+l);
	l.remove2(5);
	System.out.println("removed 5: "+l);
	l.remove2(8);
	System.out.println("removed 8: "+l);
	*/
    }
}
