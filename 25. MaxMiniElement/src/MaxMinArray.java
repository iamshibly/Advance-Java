public class MaxMinArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Max and Min\n");
        int[] numArray = ArrayUtility.inputArray();
        int max = max(numArray);
        int min = min(numArray);
        System.out.println("Max of the Array is: " + max);
        System.out.println("Min of the Array is: " + min);
    }

    public static int min(int[] numArray) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < numArray.length) {
            if (min > numArray[i]) {
                min = numArray[i];
            }
            i++;
        }
        return min;
    }
    public static int max(int[] numArray) {
        if (numArray.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = numArray[0];
        int i = 1;
        while (i < numArray.length) {
            if (max < numArray[i]) {
                max = numArray[i];
            }
            i++;
        }
        return max;
    }
}