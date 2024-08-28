import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your principle amount tk: ");
        int principle = input.nextInt();
        System.out.print("Enter your rate of interest: ");
        float rate = input.nextFloat();
        System.out.print("Enter how many years are you borrowing this money: ");
        float years = input.nextFloat();

        float interest = (principle *  rate * years) / 100;
        System.out.println("The Simple Interest is : " + interest + "tk");

    }
}