import java.util.Scanner;
public class ArrayUtility{
    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row of the array: ");
        int row = input.nextInt();
        System.out.print("Enter the column of the array: ");
        int column = input.nextInt();
        int [][] numArray = new int [row][column];
        int i=0;

        while(i < row){
            int j=0;
            while(j<column){
                System.out.print("Enter the element no " + (i+1)+ "," +(j+1) + ": ");
                numArray[i][j] = input.nextInt();
                j++;
            }
            System.out.print("\n");
            i++;
        }
        return numArray;

    }
    public static void displayArray(int [] [] numArray){
        int i=0;
        while(i<numArray.length){
            int j=0;
            while(j < numArray[i].length){
            System.out.print(numArray[i][j] + "\t");
            j++;
            }
            System.out.print("\n");
            i++;
        }

    }
}

