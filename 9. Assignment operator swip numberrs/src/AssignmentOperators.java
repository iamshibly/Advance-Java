import java.util.Scanner;

public class AssignmentOperators {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int myInt = enter.nextInt();
        System.out.print("Enter Second Number: ");
        int newInt = enter.nextInt();

        int swap = myInt;
        myInt = newInt;
        newInt = swap;

        System.out.println("New First Number = " +myInt);
        System.out.println("New Second Number = " + newInt);
    }
}