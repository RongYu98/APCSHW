import java.io.*;
import java.util.*;

public class makelake{
    
    int[][] lake;
    public makelake(){
	int X, Y;
	try{
	    Scanner sc = new Scanner(new file("lake.txt"));
	}
	catch(Exception e){}
    }	    

    public int calculate(){
	int counter = 0;
	for (int i=0; i<lake.length; i++){
	    for (int i2=0; i2<lake[0].length; i2++){
		if (lake[i][i2]<0){
		    counter += lake[i][i2]*6*6*12*12;}
	    }
	}
	return counter;
    }

    public static void main(String args[]){

    }
}
