import java.util.Scanner;
public class FactorialOfANumber {
    public static void main(String[] args) {
        System.out.println("Factorial of a number");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an intger number: ");
        int take = input.nextInt();
        int joma = fact(take);
        System.out.println("factorial of " + take + " is " + joma);
    }
    public static int fact(int num){
        int i=2;
        int fact = 1;
        if(num<2){
            return 1;
        }
        while(i<=num){
            fact = fact *i;
            i++;
        }
        return fact;
    }

}
