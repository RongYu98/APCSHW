public class KnightsTour{

    int[][] board;
    int counter=0;
    
    public KnightsTour(int n){
	board = new int[n+4][n+4];
	for (int r=0;r<2;r++){
	    for (int c=0;c<board[0].length;c++){
		board[r][c]=-1;
	    }
	}
	for (int r=board.length-1;r>n+1;r--){
	    for (int c=0;c<board[0].length;c++){
		board[r][c]=-1;
	    }
	}
	for (int r=0;r<board.length;r++){
	}
	board[2][2]=1;
    }

    public void Printing(){
	for (int r=0; r<board.length; r++){
	    for (int c=0;c<board[0].length;c++){
		System.out.printf("%3d", board[r][c]);
	    }
	    System.out.printf("\n");
	}
    }

    public void Solve(){
	
    }

    public static void main(String[] args){
	KnightsTour KT = new KnightsTour(5);
	KT.Printing();

    }

}
