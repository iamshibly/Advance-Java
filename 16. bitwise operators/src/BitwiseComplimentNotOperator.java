import java.util.Scanner;
public class BitwiseComplimentNotOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Showing Bitwise Not operator");
        System.out.print("Please enter the number: ");
        int first = input.nextInt();


        int result = ~first;
        System.out.println("result is: " + result);
    }
}