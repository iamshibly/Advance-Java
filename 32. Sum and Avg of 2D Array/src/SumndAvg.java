public class SumndAvg {
    public static void main(String[] args) {

        int [][]numArray= ArrayUtility.input2DArray();
        int sum = addition(numArray);
        System.out.print("sum = " + sum);
        int ave = bag(numArray,sum);
        System.out.print("\nAverage = " + ave);

    }
    public static int addition(int [][]numA){
        int i=0;
        int gather=0;
        while(i<numA.length){

            int j=0;
            while(j<numA[i].length){
                gather += numA[i][j];
                j++;
            }
            i++;

        }
        return gather;
    }
    public static int bag(int [][] numA, int summ){
        int i=0;

        int rett = summ/(numA.length*numA[i].length);
                return rett;
    }
}