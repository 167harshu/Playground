import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      
      int fact=1,n;
      for(int i=num;i>=1;i--)
      {
        fact=fact*i;
	}
      System.out.println(fact);
}
}