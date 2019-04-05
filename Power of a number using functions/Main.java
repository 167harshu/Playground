import java.util.Scanner;
class Main{
  
  public static int power(int m,int n)
  {
    int sum=1,i=1;
		while(i<=n)
        {
			 sum=sum*m;
          i++;
        }
    	return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num1=in.nextInt();
       int num2=in.nextInt();
      int sq=power(num1,num2);
      System.out.println(sq);
      
      
}
}