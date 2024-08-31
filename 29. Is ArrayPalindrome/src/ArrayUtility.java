import java.util.Scanner;
public class ArrayUtility{
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int [] numArray = new int [size];
        int i=0;
        while(i < size){
            System.out.print("Enter the element no " + (i+1) + ": ");
            numArray[i] = input.nextInt();
            i++;
        }
        return numArray;

    }
    /*public static void displayArray(int [] numArray){
        int i=0;
        while(i<numArray.length){
            System.out.print(numArray[i] + "\t");

            i++;
        }

    }*/
}