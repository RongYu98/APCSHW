public class MergeSort2{

    public int[] Merge (int[] a, int[] b ) {
	int[] merged=new int[a.length+b.length];
	int i1=0;//for a
	int i2=0;//for b
	int i3=0;//for merged
	int aL=a.length;
	int bL=b.length;
	while (i1 < aL && bL < i2){
	    if (a[i1]<b[i2]){
		merged[i3]=a[i1];
		i3++;
		i1++;}
	    else {
		merged[i3]=b[i2];
		i3++;
		i2++;
	    }
	}
	if (i1==AL && i2!=bL){
	    for (int i=0;i2<bL;i2++){
		merged[i3]=b[i2];
		i3++;
	    }
	}
	if (i1!=AL && i2==bL){
	    for (int i=0;i1<aL;i1++){
		merged[i3]=a[i1];
		i3++;
	    }
	}
	return merged;
	
    }

    public static void main( String[] args ) {
	MergeSort2 M = new MergeSort2();
	int[] b = int[10];
	int[] c = int[10];
	Random R = new Random();
	for (int i=0; i<11; i++){
	    b.add(R.nextInt(20));
	    c.add(R.nextInt(10));
	}
	
	//System.out.println(M.MSort(b));
	ArrayList<Integer> a = M.Merge(b, c);
	System.out.println(a);
    }

}
