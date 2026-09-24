package java_class;

import java.util.Scanner;

public class Communication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your nice name");

        String name = sc.nextLine();

        System.out.print("welcome" +name);
    }
}