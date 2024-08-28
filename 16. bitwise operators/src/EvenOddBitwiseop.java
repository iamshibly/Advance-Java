import java.util.Scanner;
public class EvenOddBitwiseop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = input.nextInt();
        if((number & 1) == 1){
            System.out.print("Odd");
        }
        else{
            System.out.print("Even");
        }

    }
}