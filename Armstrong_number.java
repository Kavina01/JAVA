import java.util.Scanner;

public class Armstrong_number{
    static int digitcount(int num){
        int count = 0;
        while(num > 0)
        {
            num = num/10;
            count++;
        }
        return count;
    }
       static int power(int digit , int count)
       {
           int product = 1;
           for(int i = 1; i <= count; i++)
           {
               product = product * digit;
           }
           return product;
       }
       static boolean isArmstrongNumber(int num)
       {
           int temp = num;
           int count = digitcount(num);
           int result = 0;
           while(num> 0)
           {
               int digit = num % 10;
              result+= power(digit,count);
              num = num /10;
           }
           num = temp;

           return num == result;
       }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int num = sc.nextInt();

        if(isArmstrongNumber(num))
        {
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not an Armstrong number");
        }

    }
}
