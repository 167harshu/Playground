
import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int x=num;
      for(int i=1;i<=num;i++)
      {
       	x=(num+1)-i;
        for(int j=1;j<=num;j++)
        {
          
			if(j<=(num+1)-i)
            {
				System.out.print(x);
              x--;
              
            }
          else
          {
            System.out.print(" ");
          }
        }
        System.out.println();
    }
}
}

