import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        System.out.println("Arithmetic Operators With Integer Type: ");
        int a = 8;
        int b =5;
        System.out.println("Addition = " + (a+b));
        System.out.println("Subtraction = " + (a-b));
        System.out.println("Multiplication = " + (a*b));
        System.out.println("Division = " + (a/b));
        System.out.println("Remainder = " + ((a%b)));
        System.out.println("\nArithmetic Operators With Double Type: ");
        double c = 12;
        double d = 7;
        System.out.println("Addition = " + (c+d));
        System.out.println("Subtraction = " + (c-d));
        System.out.println("Multiplication = " + (c*d));
        System.out.println("Division = " + (c/d));
        System.out.println("Remainder = " + ((c%d)));

        System.out.println("\nOrder of Operation: ");
        System.out.println(8-3*3);
        System.out.println(9/(3/3 + 2));

        System.out.println("\nShorthand Operators: ");
        int aaa = 5;
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        aaa = aaa + x1;
        //aaa += x1; same as aaa = aaa + x1;
        System.out.println(aaa);
        int x2 = input.nextInt();
        aaa = aaa - x2;
        System.out.println(aaa);
        int x3 = input.nextInt();
        aaa = aaa * x3;
        System.out.println(aaa);
        int x4 = input.nextInt();
        aaa = aaa / x4;
        System.out.println(aaa);
        int x5 = input.nextInt();
        aaa = aaa % x5;
        System.out.println(aaa);
    }
}
