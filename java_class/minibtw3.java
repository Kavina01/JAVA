package java_class;
import java.util.Scanner;
public class minibtw3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

      int a,b,c;
      System.out.println("Enter a number :");
      a = sc.nextInt();
        System.out.println("Enter a number :");
        b = sc.nextInt();
        System.out.println("Enter a number :");
        c = sc.nextInt();
      int min = a;

      if( b<min )
      {
          min = b;
      }
      if (c<min)
      {
         min = c;
      }
       System.out.println("min" + min);

    }
}
