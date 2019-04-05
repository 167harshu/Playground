import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      char ch=in.next().charAt(0);
      int key=in.nextInt();
      if(ch==99)
      {
        char res1=(char)(125-key);
        System.out.println(res1);
      }
      else
      {char res=(char)(ch-key);
      System.out.println(res);
      }
    }
}