public class Methodnoreturntype {
    public static void main(String[] args) {
        goodmorning();
        goodmorning();
        rightHalfPyramid();
        reverseRightHalfPyramid();
        leftHlafPyramid();
    }
        public static void goodmorning(){
            System.out.println("Hlw dude");
        }
        public static void rightHalfPyramid() {
            System.out.print("Right Half Pyramid: \n");
            /*System.out.println("*");
            System.out.println("* *");
            System.out.println("* * *");
            System.out.println("* * * *");
            System.out.println("* * * * *\n");*/
            int i=0;
            while(i<5){
                System.out.print("*");
                int j=0;
                while(i>j){
                    System.out.print(" *");
                    j++;
                }
                System.out.print("\n");
                i++;

            }


        }
        public static void reverseRightHalfPyramid() {
            System.out.print("Reverse Right Half Pyramid: \n");
            /*System.out.println("* * * * *");
            System.out.println("* * * *");
            System.out.println("* * *");
            System.out.println("* *");
            System.out.println("*\n");*/
            int rev = 0;
            while(rev < 5){
                System.out.print("*");
                int xx = 4;
                while(rev < xx){
                    System.out.print(" *");
                    xx--;
                }
                rev++;
                System.out.print("\n");
            }


        }
        public static void leftHlafPyramid() {
            System.out.print("Left Half Pyramid: \n");
            /*System.out.println("        *");
            System.out.println("      * *");
            System.out.println("    * * *");
            System.out.println("  * * * *");
            System.out.println("* * * * *");*/
            int rows = 5;
            int ii = 0;
            while (ii < rows) {
                int jj = 0;
                while (jj < (2*(rows - ii)-1)) {
                    System.out.print(" ");
                    jj++;
                }
                int k=0;
                while(k<=ii){
                    System.out.print("* ");
                    k++;
                }
                // Move to the next line
                System.out.print("\n");
                ii++;

            }
        }
}