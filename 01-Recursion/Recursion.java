public class Recursion{

    public int fib(int num){
	if (num==0){
	    return 0;}
	if (num==1){
	    return 1;}
	else {
	    return fib(num-1)+fib(num-2);}

    }

    public int len(String str){
	if (str.equals("")){
	    return 0;}
	else {
	    return 1+len(str.substring(1));
	}
    }

    public int count(String s, String c){
	if (s.equals("")){
	    return 0;}
	if (c.equals(s.substring(0,1))){
	    return 1+count(s.substring(1), c);}
	else {
	    return count(s.substring(1), c);}
    }

    public int bunnyEars2(int bunnies) {

	if (bunnies==0){
	    return 0;}
	if (bunnies%2==0){
	    return 3+bunnyEars2(bunnies-1);}
	else {
	    return 2+bunnyEars2(bunnies-1);}
    }
    
    public int bunnyEars2(int bunnies) {

	if (bunnies==0){
	    return 0;}
	if (bunnies%2==0){
	    return 3+bunnyEars2(bunnies-1);}
	else {
	    return 2+bunnyEars2(bunnies-1
				}


    public static void main(String[] args){
	Recursion R = new Recursion();
	/*
	System.out.println(R.fib(8));
	System.out.println(R.fib(10));
	System.out.println(R.fib(5));
	System.out.println(R.len("HI"));
	System.out.println(R.len("HaI"));
	System.out.println(R.len("HsaI"));
	System.out.println(R.count("HHH", "a"));
	System.out.println(R.count("HHH", "H"));
	System.out.println(R.count("dasdaHHH", "a"));
	System.out.println(R.count("HHdfsH", "d"));*/
    }

}
