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
    
    public int strCount(String str, String sub) {
  	int count = 0;
  	for (int i=0;i+sub.length()<=str.length();i++){
      	    if (sub.equals(str.substring(i,i+sub.length()))){
          	    	count++;
         	    	i+=sub.length()-1;
          	    }
  	}
	return count;
    }

    public int sumDigits(int n) {
  	if (n<10){
      	    return n;}
 	return n%10 + sumDigits(n/10);
    }

    public String allStar(String str) {
  	if (str.length()<=1){
      	    return str;}
  	return str.substring(0,1)+"*"+allStar(str.substring(1));
    }


    public static void main(String[] args){
	Recursion R = new Recursion();
	
	System.out.println(R.fib(8));
	System.out.println(R.fib(10));
	System.out.println(R.fib(5));
	System.out.println(R.len("HI"));
	System.out.println(R.len("HaI"));
	System.out.println(R.len("HsaI"));
	System.out.println(R.count("HHH", "a"));
	System.out.println(R.count("HHH", "H"));
	System.out.println(R.count("dasdaHHH", "a"));
	System.out.println(R.count("HHdfsH", "d"));
    }

}
