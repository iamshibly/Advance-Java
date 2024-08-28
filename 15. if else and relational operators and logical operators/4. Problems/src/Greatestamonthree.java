import java.util.Scanner;
public class Greatestamonthree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three different positive integer: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        if(number1 > number2 && number2 > number3){
            System.out.println("Number1 is Greatest");
        }
        else if(number3 > number1){
            System.out.println("Number3 is Greatest");
        }
        else{
            System.out.println("Number2 is Greatest");
        }
    }
}