import java.util.Scanner;
public class CheckGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks you got (between 0-100): ");
        int marks = input.nextInt();
        if(marks > 89){
            System.out.println("Grade is A");
        }
        else if(marks > 74){
            System.out.println("Grade is B");
        }
        else if(marks > 59){
            System.out.println("Grade is C");
        }
        else if(marks > 30){
            System.out.println("Grade is D");
        }
        else{
            System.out.println("Grade is F");
        }
    }
}