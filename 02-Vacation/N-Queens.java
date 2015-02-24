public class N-Queens{

    int[][] board;
    int count=1;

    public N-Queens(int n){
	for (int r=0; r<n; r++){
	     for (int c=0;c<n; c++){
		board[r][c]=0;
	    }
	}
    }

    public void Solve(){
	for (int col = 0; col<board.length; c++){}
    }

    public void Printing(){
	for (int r=0; r<board.length; r++){
	    for (int c=0;c<board[0].length;c++){
		System.out.printf("%3d", board[r][c]);
	    }
	    System.out.printf("\n");
	}
    }

	    
    public void delay(int n){	
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }


    public static void main(String args[]){
	N-Queens Q = new N-Queens(5);
    }


}