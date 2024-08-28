import java.util.Scanner;
public class LogicalOp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your age: ");
        int age = input.nextInt();
        System.out.print("Are you a female? (true/false):  ");
        boolean isFemale = input.nextBoolean();

        if(age<5){
            System.out.println("You get 75% discount");
        }
        else if(age>60 && isFemale){
            System.out.println("You get 55% discount");
        }
        else if(age>60 && !isFemale){
            System.out.println("You get 25% discount");
        }
        else{
            System.out.println("Zero discount");
        }
    }
}