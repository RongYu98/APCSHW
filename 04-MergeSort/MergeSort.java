import java.util.*;

public class MergeSort {

    public ArrayList<Integer> one, two;
    public ArrayList<Integer> merge;
/*
    public MergeSort( ArrayList<Integer> a, ArrayList<Integer> b ) {
	one = a;
	two = b;
    }
*/
    public ArrayList<Integer> Merge ( ArrayList<Integer> a, ArrayList<Integer> b ) {
	ArrayList<Integer> merged= new ArrayList<Integer>();
	while ( a.size() > 0 && b.size() > 0 ) {
	    if ( a.get(0) < b.get(0) ) {
		//System.out.println(a.get(0) + b.get(0));
		merged.add(a.get(0));
		a.remove(0);
	    } else { 
		merged.add(b.get(0));
		b.remove(0);
	    }
	}
	if (a.size()==0 && b.size()!=0){
	    for (int i=0;i<b.size();i++){
		merged.add(b.get(i));
	    }
	}
	if (a.size()!=0 && b.size()==0){
	    for (int i=0;i<a.size();i++){
		merged.add(a.get(i));
	    }
	}
	//for (int i=0;i<merged.size();i++){
		//System.out.println(merged.get(i));}
	return merged;
	
    }

    public static void main( String[] args ) {
	MergeSort M = new MergeSort();
	ArrayList<Integer> b = new ArrayList<Integer>();
	ArrayList<Integer> c = new ArrayList<Integer>();
	for (int i=0; i<10; i++){
	    b.add(i);
	    c.add(i*2);}
	ArrayList<Integer> a = M.Merge(b, c);
	System.out.println(a);
    }

}