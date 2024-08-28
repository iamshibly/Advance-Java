import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        if(number < 0){
            System.out.println("Negative Integer");
        }
        else if(number > 0){
            System.out.println("Positive Integer");
        }
        else{
            System.out.println("Zero");
        }
    }
}