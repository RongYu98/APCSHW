import java.util.*;

public class MergeSort2{

    public int[] MSort(int[] a){
	if (a.length<=1){
	    return a;}
	else {
	    int[] b = new int[a.length/2];
	    for (int i=0;i<a.length/2;i++){
		b[i]=a[i];}

	    int[] c = new int[a.length/2];
	    if (a.length%2==1){
		c = new int[c.length+1];}
	    for (int i=a.length/2;i<a.length;i++){
		c[i-(a.length/2)] = a[i];}

	    int[] r1= MSort(b);
	    int[] r2= MSort(c);
	    return Merge(r1, r2);}
    }


    public int[] Merge (int[] a, int[] b ) {
	int[] merged=new int[a.length+b.length];
	int i1=0;//for a
	int i2=0;//for b
	int i3=0;//for merged
	int aL=a.length;
	int bL=b.length;
	while (i1 < aL && i2 < bL){
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
	if (i1==aL && i2!=bL){
	    for (int i=0;i2<bL;i2++){
		merged[i3]=b[i2];
		i3++;
	    }
	}
	if (i1!=aL && i2==bL){
	    for (int i=0;i1<aL;i1++){
		merged[i3]=a[i1];
		i3++;
	    }
	}
	return merged;
	
    }

    public static void main(String[] args) {
	MergeSort2 M = new MergeSort2();
	int[] b = new int[20];
	int[] c = new int[10];
	Random R = new Random();
	for (int i=0; i<b.length; i++){
	    b[i]=R.nextInt(20);
	    //c[i]=R.nextInt(20);
	}
	b = M.MSort(b);
	for (int i=0; i<b.length; i++){
	    System.out.print(b[i]+" ");
	}
	System.out.println();

    }

}
