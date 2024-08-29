public class Main {
    public static void main(String[] args) {

        /*int [] arr = new int[5];
        arr[0]=6 ;
        arr[1]=8 ;
        arr[2]= 33;
        arr[3]=67 ;
        arr[4]=0 ;*/
        /*int [] arr = {23,25,26,34,99};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);*/
        int [] arr = {55,67,99,33,0};
        int index = 0;
        while(index<arr.length){
            System.out.println(arr[index]);

            index++;
        }
        String[] strArr = new String[3];
        strArr[0] = "My String";
        strArr[1] = "Us String";
        strArr[2] = "Your String";
        int indexx=0;
        while(indexx< strArr.length) {
            System.out.println(strArr[indexx]);
            indexx++;
        }

        String[] newStrArr = {"first", "second", "third"};
        System.out.println("Length of the array: " + newStrArr.length);


    }
}