import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int[] arr = {4, 5, 88, 34, 77, 0, 777, -87, 99, 121};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number that you want to search: ");
        int num = input.nextInt();
        boolean answerEd = searchEd(arr, num);
        if (answerEd) {
            System.out.print("Your number was found in the array");
        } else {
            System.out.print("Your number was not found in the array");
        }
    }
    public static boolean searchEd(int [] arr, int num){
        int index=0;
        while(index<arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
            }
        return false;
        }
}

