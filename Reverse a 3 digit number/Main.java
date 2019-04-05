import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
            Scanner in =new Scanner(System.in);
      int num=in.nextInt();
    int n1,rev=0;
      while(num>0)
      {
		 n1=num%10;
        num=num/10;
        rev=rev*10+n1;
      }
      System.out.println(rev);
  }
}