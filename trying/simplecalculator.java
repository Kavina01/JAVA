package trying;
import java.util.Scanner;
public class simplecalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1,num2;
        System.out.println("enter first number");
        num1 = sc.nextInt();
        System.out.println("enter second number");
        num2 = sc.nextInt();

        System.out.println("enter a operator");
        char opt = sc.next().charAt(0);
        double result;

         switch(opt)
         {
             case '+' :
                 result = num1 + num2;
                 break;
             case'-':
                 result = num1 - num2;
                 break;
             case'*':
                 result = num1 * num2;
                 break;
             case'/':
                  result = (num1 * 1.0)/ num2;
                 break;
             case'%':
                 result = num1 % num2;
                 break;
             default:
                 result = -1;
                 System.out.println("Invalid");

         }
            System.out.println(" result" + result);

    }

}

