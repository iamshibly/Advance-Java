import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Base of a triangle in cm: ");
        double Base = input.nextDouble();
        System.out.print("Enter the Height of a triangle in cm ");
        double Height = input.nextDouble();

        System.out.println("Area of a Triangle: " + (0.5*Base*Height) + "cm^2");

    }
}
