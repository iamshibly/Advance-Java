public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] myArr = new int[2][3];
        myArr[0][0] = 39;
        myArr[0][1] = 94;
        myArr[0][2] = 92;
        myArr[1][0] = 91;
        myArr[1][1] = 19;
        myArr[1][2] = 33;

        int i =0;
        while(i<myArr.length){
            int j=0;
            while(j<myArr[i].length){
                System.out.print( myArr[i][j]+ " ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        //System.out.println(arr[0].length);

        // Traversal
        int x = 0;
        while (x < arr.length) {
            int y = 0;
            while (y < arr[i].length) {
                System.out.print(arr[x][y] + " ");
                y++;
            }
            System.out.println();
            x++;
        }
    }
}