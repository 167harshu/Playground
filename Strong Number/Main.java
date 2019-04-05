import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int sum=0,x,fact;
      int temp=num;
      while(num>0)
      {
        fact=1;
        x=num%10;
        for(int i=x;i>=1;i--)
        {
				fact=fact*i;
        }
        sum=sum+fact;
        num=num/10;
      }
      if(temp==sum)
      {
      	System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
        
	}
}