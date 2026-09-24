package java_class;

public class Reverse {
    static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        return rev;
    }
    public static void main(String[] args){
        int num1  = 786;
        int num2 = 987;
        int num3 = 000;
   //     int reverse = reverse(num); for one means use this
        System.out.println(reverse(num1));
        System.out.println(reverse(num2));
        System.out.println(reverse(num3));
    }
}
