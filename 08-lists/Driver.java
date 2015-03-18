public class Driver{
    public static void main(String[] args) {
	lists l = new lists();
	for (int i=0;i<10;i++){
	    l.add(i);
	}
	System.out.println(l);
	System.out.println("zeroth is: " +l.get(0));
	System.out.println("fifth is: " +l.get(5));
	System.out.println("fourth is: "+l.get(4));
	System.out.println("three is: "+l.get(3));
	System.out.println("seventh is: "+l.get(7));
	l.add(0, 990);
	l.add(3, 333);
	l.add(6, 666);
	System.out.println(l);
	l.remove(1);
	System.out.println("removed first: "+l);
	l.remove(5);
	System.out.println("removed fifth: "+l);
	l.remove(8);
	System.out.println("removed eighth: "+l);
    }
}
