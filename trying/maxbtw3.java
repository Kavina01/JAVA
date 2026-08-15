package trying;

import java.util.Scanner;

public class maxbtw3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the num1 ");
            int num1 = sc.nextInt();
            System.out.println("Enter the num2");
            int num2 = sc.nextInt();
            System.out.println("Enter the num3");
            int num3 = sc.nextInt();

            int maximum = -1;

            if (maximum < num1)
            {
                System.out.println("num3 is maximum");
            }
            else if(maximum < num2)
            {
                System.out.println("num2 is maximum");
            }
            else if(maximum < num3)
            {
                System.out.println("num3 is maxmimum");
            }
        else
            {
                System.out.println("All are equal");
            }
        }
    }
