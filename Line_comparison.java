		import java.util.Scanner;
public class Line_comparison {
    public int length (int a,int b,int c,int d)
    {
        int lenofline=a+b+c+d;
        return lenofline;
    }
   public static void main(String args[]){

      System.out.println("Welcome to line comparison");
      Scanner input=new Scanner(System.in);
      System.out.println("enter x1");
      int x1=input.nextInt();
      System.out.println("enter y1");
      int y1=input.nextInt();
      System.out.println("enter x2");
      int x2=input.nextInt();
      System.out.println("enter y2");
      int y2=input.nextInt();
      Line_comparison e=new Line_comparison();
      int len=e.length(x1,y1,x2,y2);
      System.out.println("length is : "+len+"");
   }
}

