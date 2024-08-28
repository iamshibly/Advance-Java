import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your principle amount tk: ");
        int principle = input.nextInt();
        System.out.print("Enter rate of interest: ");
        float rate = input.nextFloat();
        System.out.print("How many years are you borrowing this money: ");
        float years = input.nextFloat();

        double ComInt = principle* Math.pow((1+rate/100),years);
        System.out.println("The Compound Interest is " + ComInt + "tk");
    }
}