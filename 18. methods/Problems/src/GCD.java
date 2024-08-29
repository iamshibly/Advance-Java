import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GCD");
        System.out.print("Please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Please enter your second number: ");
        int second = input.nextInt();
        int gcd = findgcd(first, second);
        System.out.println("GCD of the numbers is: " + gcd);
    }

    public static int findgcd(int num1, int num2) {
        int gcd = 1;
        int i = 2;
        int least = small(num1, num2);
        while (i <= least) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int small(int numB, int numS) {
        if (numB < numS) {
            return numB;
        } else {
            return numS;
        }
    }
}