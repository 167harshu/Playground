


import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      for(int i=1,j=1;i<=num;j++)
      {
			if(j%2==1)
            {
              System.out.println(j);
              i++;
              
            }
      }
	}
}


