import java.util.*;

public class Selection{

    public void selection(int[] L, int SI, int EI){
	int[] D = new int[L.length];
	for (int i=0;i<SI;i++){
	    D[i]=L[i];
	}
	for (int i=EI;i<L.length;i++){
	    D[i]=L[i];
	}
	int pivot = L[SI];
	SI++;
	int EI2 = EI;
	for (int i=SI;i<EI;i++){
	    if (L[i]<pivot){
		D[SI]=L[i];
		SI++;}
	    else if (L[i]>pivot){
		D[EI2]=L[i];
		EI2--;}
	}
	D[EI2]=pivot;
	//System.out.println(EI2);
	//System.out.println(SI);
	for (int i=0;i<D.length;i++){
	    System.out.print(D[i]+" ");
	}
	System.out.println();
	System.out.println(pivot);
    }

    public static void main(String args[]){
	Selection S = new Selection();
	int[] Stuff = new int[20];
	Random R = new Random();
	for (int i=0;i<Stuff.length;i++){
	    Stuff[i]= R.nextInt(50);
	}
	S.selection(Stuff, 0, Stuff.length-1);
    }
}