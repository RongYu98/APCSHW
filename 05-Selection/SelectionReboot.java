import java.util.*;

public class SelectionReboot{

    public int selection(int[] A,int k, int L, int H){
	//for (int i=0;i<A.length; i++){
	//   System.out.print(A[i]+" ");}
	//System.out.println();
	int Pivot=A[L];
	A[L]=A[H];
	A[H]=Pivot;
	int Pi=H;
	int Li=L;
	int Hi=H-1;
	int temp;
	//System.out.println(Pivot);
	while (Hi!=Li){
	    if (A[Li]<Pivot){
		Li++;
	    } else {
		temp=A[Hi];
		A[Hi]=A[Li];
		A[Li]=temp;
		Hi--;
	    } 
	}

	if (A[Li]>Pivot){
	    A[H]=A[Li];
	    A[Li]=Pivot;
	    Pi=Li;
	}else {
	    A[H]=A[Li+1];
	    A[Li+1]=Pivot;
	    Pi=Li+1;
	}
	//for (int i=0;i<A.length; i++){
	//   System.out.print(A[i]+" ");}
	//System.out.println();

	if  (Pi!=k){
	    if (Pi > k){
		selection(A,k,L,Pi-1);
	    } else{
		selection(A,k,Pi+1,H);
	    }
	} else {
	    return A[Pi];
	}	
	return -1;
    }

    public static void main(String args[]){
	SelectionReboot S = new SelectionReboot();
	int[] Stuff = new int[20];
	Random R = new Random();
	for (int i=0;i<Stuff.length;i++){
	    Stuff[i]= R.nextInt(50);
	    System.out.print(Stuff[i]+" ");
	}
	System.out.println();
	System.out.println(S.selection(Stuff, 0, 0, Stuff.length-1));
    }
}