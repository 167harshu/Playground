import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int x,sum=0;
      int temp=num;
     	while(num>0)
        {
          x=num%10;
          sum=sum+x*x*x;
          num=num/10;
        }
      	if(temp==sum)
        {
       		 System.out.println("Armstrong Number");
        }
      else
      {
        	 System.out.println("Not a Armstrong Number");
      }
        
	}
}