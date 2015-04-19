public class AStar extends BestFirstSearch{

    private int Counter=0;

    public AStar(){
	super();
    }

    public void addToFront(int tx,int ty, Node current){
	Node tmp = null;
	if (board[tx][ty]=='#' || board[tx][ty]=='$'){
	    int far = Math.abs(tx-Ex)+Math.abs(ty-Ey);
	    tmp = new Node(tx,ty,far + Counter);
	    tmp.setPrev(current);
	    f.add(tmp);
	}
						
    }

    public void solve(int x, int y){
	f = new Frontier();

	f.add(new Node(x,y,0));

	int tx=0,ty=0;
	Node current = null;
	while (!f.isEmpty()){
	    current = f.remove();
	    int cx = current.getX();
	    int cy = current.getY();

	    if (board[cx][cy]=='$')
		break;
						
	    board[cx][cy]='z';

	    addToFront(cx+1,cy,current);
	    addToFront(cx-1,cy,current);
	    addToFront(cx,cy+1,current);
	    addToFront(cx,cy-1,current);

	    Counter++;
	    delay(50);
	    System.out.println(this);
	}

	// path recovery
	for (Node p = current.getPrev(); p != null ; p = p.getPrev()){
	    board[p.getX()][p.getY()] = 'P';
	    delay(100);
	    System.out.println(this);
	}
    }

    public static void main(String[] args){
	AStar AS = new AStar();
	System.out.println(AS);
	AS.solve(1,1);
	System.out.println(AS);
		
    }


}