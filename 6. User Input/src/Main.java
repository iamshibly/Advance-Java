import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Lover's Name: ");
        String name = input.nextLine();
        System.out.println("I Love You " + name);
        System.out.println(name + "and You are together for how many year?");
        int year = input.nextInt();
        System.out.println("We are together for " + year +" Years");



    }
}