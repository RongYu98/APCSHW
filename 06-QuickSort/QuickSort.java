import java.util.*;
import java.io.*;

public class QuickSort{

    /* I used the class code as the basis for this code */

    public int partition(int[] a, int l, int r) {

	int tmp;			
	int pivotIndex=l;
	int pivot = a[pivotIndex];
	tmp = a[r];
	a[r] = a[pivotIndex];
	a[pivotIndex]=tmp;
				
	int wall=l;
	for (int i=l;i<r;i++) {
	    if (a[i]<pivot) {
		    tmp = a[i];
	 	   a[i]=a[wall];	
	 	   a[wall]=tmp;
		    wall++;	
	    }
	}
				
	// now copy over all the pivots
	int rwall=wall;
	tmp = a[rwall];
	a[wall]=a[r];
	a[r]=tmp;
	rwall++;
	for (int i=rwall+1;i<=r;i++) {
   	    if (a[i]==pivot) {	
		tmp = a[rwall];
		a[rwall]=a[i];
		a[i]=tmp;
		rwall++;			
	    }
	}
	return (wall+rwall)/2;
    }

    public void QSort(int[] a){
	QSort(a, 0, a.length-1);
	for (int i=0; i<a.length; i++){
	    System.out.print(a[i]+ " ");
	}
	System.out.println();
    }

    public void QSort(int[] a, int l, int h){
	if ((h-l)<2){
	    return;
	}
	int pi,pval;
	pi = partition(a,l,h);
	
	QSort(a, l, pi);
	QSort(a, pi +1 , h);
    }

		
    public static void main(String[] args) {
	QuickSort q = new QuickSort();
	int[] a = new int[20];
	Random R = new Random();
	for (int i=0;i<a.length;i++) {
	    a[i]=R.nextInt(60);
	}
	q.QSort(a);

    }
}
