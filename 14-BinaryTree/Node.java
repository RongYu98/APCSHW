public class Node {
    private int data;
    private Node left=null;
    private Node right=null;
		
    public Node(int data){
	this.data=data;
    }
		
    public int getData() {
	return data;
    }

    public Node getRight() {
	return right;
    }

    public Node getLeft(){
	return left;
    }

    public void setRight(Node Right){
	right = Right;
    }

    public void setLeft(Node Left){
	left = Left;
    }
}








