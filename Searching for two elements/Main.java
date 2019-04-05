import java.util.*;
class Main
{
public static void main(String args[])
{
//Try out your code here
  Scanner in=new Scanner(System.in);
  int size=in.nextInt();
  int array[]=new int[size];
  int flag=0;
  for(int i=0;i<size;i++)
  {
    array[i]=in.nextInt();
  }
  
  int ele1=in.nextInt();
  int ele2=in.nextInt();
  
  for(int i=0;i<size;i++)
  {
    if(array[i]==ele1)
    {
      System.out.println(i);
      
    }
    if(array[i]==ele2)
    {
      System.out.println(i);
      flag=1;
    }
   /* else
    {
      System.out.println("-1");
    }       */
    
  /*  else
    {
      System.out.println("-1");
    }           */
  }
  if(flag==0)
  {
    System.out.println("-1");
  }
}
}
