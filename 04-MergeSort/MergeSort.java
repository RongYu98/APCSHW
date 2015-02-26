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
    public ArrayList<Integer> MSort(ArrayList<Integer> a){
	if (a.size()<=1){
	    return a;}
	else {
	    ArrayList<Integer> b =new ArrayList<Integer>();
	    for (int i=0;i<a.size()/2;i++){
		b.add(a.get(i));}
	    ArrayList<Integer> c = new ArrayList<Integer>();
	    for (int i=a.size()/2;i<a.size();i++){
		c.add(a.get(i));}
	    ArrayList<Integer> r1 = MSort(b);
	    ArrayList<Integer> r2 = MSort(c);
	    return Merge(r1, r2);}
    } 

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
	//ArrayList<Integer> c = new ArrayList<Integer>();
	Random R = new Random();
	for (int i=0; i<11; i++){
	    b.add(R.nextInt(20));
	    //c.add(R.nextInt(10));
	}
	
	System.out.println(M.MSort(b));
	//ArrayList<Integer> a = M.Merge(b, c);
	//System.out.println(a);
    }

}
