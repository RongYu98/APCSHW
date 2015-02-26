import java.io.*;
import java.util.*;

public class makelake{

    int[][] pasture;
    int maxX, maxY;
    int[] data;
    public makelake(int R, int C, int E, int N) {
	maxX = C;
	maxY = R;
	pasture = new int[maxY][maxX];
    }
    public String toString() {
	String s = "";
	for (int i=0;i<pasture.length;i++) {
	    for (int j=0;j<pasture[i].length;j++) {
		s = s + pasture[i][j] + " ";
	    }
	    s = s + "\n";
	}
	return s;
    }
    private void setData( int[] d ) {
	data = new int[d.length];
	for (int i=0;i<data.length;i++) {
	    data[i] = d[i];
	}
	int x = 0;
	for (int j=0;j<pasture.length;j++) {
	    for (int h=0;h<pasture[j].length;h++) {
		pasture[j][h] = data[x];
		x = x + 1;
	    }
	}
    }


    public int calculate(){
	int counter = 0;
	for (int i=0; i<pasture.length; i++){
	    for (int i2=0; i2<pasture[0].length; i2++){
		if (pasture[i][i2]<0){
		    counter += pasture[i][i2]*6*6*12*12;}
	    }
	}
	return counter;
    }

    public static void main( String[] args ) {
	makelake M = new makelake(4, 6, 22, 2);
	int[] data = { 28, 25, 20, 32, 34, 36,
		       27, 25, 20, 20, 30, 34,
		       24, 20, 20, 20, 20, 30,
		       20, 20, 14, 14, 20, 20 };
	M.setData(data);
	System.out.println(M);
    }

}
