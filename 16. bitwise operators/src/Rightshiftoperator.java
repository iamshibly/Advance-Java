import java.util.Scanner;
public class Rightshiftoperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Showing Rightshift operator");
        System.out.print("Please enter the number: ");
        int first = input.nextInt();


        int result = first >> 2;
        System.out.println("result is: " + result);
    }
}