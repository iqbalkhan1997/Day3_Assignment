		import java.util.Scanner;
public class Line_comparison {
    public double length (int a,int b,int c,int d)
    {
        double lenofline=Math.sqrt(Math.pow((c-a),2) + Math.pow((d-b),2));
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
      double len=e.length(x1,y1,x2,y2);
      System.out.println("length is : "+len+"");
   }
}

