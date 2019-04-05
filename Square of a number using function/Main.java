import java.util.Scanner;
class Main{
  
  public static int square(int m)
  {
		int s=m*m;
    	return s;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int sq=square(num);
      System.out.println(sq);
      
      
}
}