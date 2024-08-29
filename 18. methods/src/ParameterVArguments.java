public class ParameterVArguments {
    public static void main(String[] args) {
       int save = sumTwoNum((int) Math.pow(25,2) , 60/2);
       System.out.print("Total = " + save);

    }
    public static int sumTwoNum(int first, int second){
        System.out.println("First number received: " + first );
        System.out.println("Second number received: " + second);
        return  first+second;

    }
}
