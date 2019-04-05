import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here  
      Scanner in=new Scanner(System.in);
  int size=in.nextInt();
  int array[]=new int[size];
  for(int i=0;i<size;i++)
  {
    array[i]=in.nextInt();
  }
  int max=array[0];
   for(int i=0;i<size;i++)
   {
     if(max<array[i])
     {
       max=array[i];
     }
   }
   System.out.println(max);
    
    }
}