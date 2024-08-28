public class Ifelse {
    public static void main(String[] args) {
        boolean isMale = false;
        String name = "Jhon";
        if(isMale){
            System.out.println("Mr. " + name);
        }
        else{
            System.out.println("Mr. Wick");
        }

        boolean isSeniorCitizen = false;
        boolean isAnAdult = true;

        if(isSeniorCitizen){
            System.out.println("As Salamu Walaikum");
        }
        else{
            if(isAnAdult){
                System.out.println("Hello boss");
            }
            else{
                    System.out.println("Hey mimo");
                }
        }

    }
}