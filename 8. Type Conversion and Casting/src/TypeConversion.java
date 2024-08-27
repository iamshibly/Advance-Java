public class TypeConversion {
    public static void main(String[] args) {
        float myFloat = 5;//implicit+ value is lower than the variable type in terms of bytes
        System.out.println(myFloat);

        int myInt = (int) 5.45d;//explicit+ value is lower than the variable type in terms of bytes
        System.out.println(myInt);
    }
}