import java.util.Scanner;
public class SumofAllOddFromN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Sum");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        oddSum(num);

    }

    public static void oddSum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;
        }
        System.out.println("OddSum till " + num + " is: " + sum);
    }
}

