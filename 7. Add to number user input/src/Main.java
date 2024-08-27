import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = number.nextInt();
        System.out.print("Enter the second number: ");
        float secondNumber = number.nextFloat();

        float answer = firstNumber+secondNumber;
        System.out.print("The sum of the two numbers is: " + answer);
    }
}