import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("One: ");
        while(a<=10){
            System.out.println(a);
            a++;
        }

        System.out.println("\nTwo: ");
        int count = 500;
        while(count >= 400){
            System.out.println(count);
            count --;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter a integer number: ");
        int number = input.nextInt();

        while(number>10){
            System.out.println(number);
            number--;
        }
    }
}