public class Driver{
    public static void main(String[] args) {
	LList l = new LList();
	l.add("hello");
	l.add("world");
	for (int i=0;i<5;i++){
	    l.add(""+i);
	}
	System.out.println(l);
	System.out.println("zeroth is: " +l.find(0));
	System.out.println("fifth is: " +l.find(5));
	System.out.println("fourth is: "+l.find(4));
	System.out.println("three is: "+l.find(3));
	System.out.println("seventh is: "+l.find(7));
	l.insert(0, "zeroth");
	l.insert(3, "third");
	l.insert(6, "sixth");
	System.out.println(l);
    }
}
