import java.util.Scanner;
public class OccurrencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Enter the number you want to find: ");
        int number = input.nextInt();
        int occurrences = noOfOccurrences(numArray, number);
        System.out.println("Your element was found " + occurrences + " times in the array");

    }

    public static int noOfOccurrences(int[] numArray, int number) {
        int occ = 0;
        int i = 0;
        while (i < numArray.length) {
            if (numArray[i] == number) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}