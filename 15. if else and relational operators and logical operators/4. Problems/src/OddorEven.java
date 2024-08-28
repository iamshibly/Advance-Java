import java.util.Scanner;
public class OddorEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an positive integer: ");
        int number = input.nextInt();
        if(number == 1){
            System.out.println("Odd");
        }
        else if(number %2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}