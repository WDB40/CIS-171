import java.util.Scanner;

public class HalfFullBrown {

    public static void main(String[] args) {

        int amountFull = getAmountFull();
        boolean isHalfFull = isHalfFull(amountFull);
        printFullness(isHalfFull);

    }

    private static void printFullness(boolean isHalfFull){

        if(isHalfFull){
            System.out.println("The glass is half full.");
        } else{
            System.out.println("The glass is half empty.");
        }

    }

    private static boolean isHalfFull(int amountFull) {
        return amountFull >= 50;
    }

    private static int getAmountFull(){
        Scanner scanner = new Scanner(System.in);

        int amountFull = -1;

        do {
            System.out.print("Enter the amount in the glass (1-100): ");

            if (scanner.hasNextInt()) {
                amountFull = scanner.nextInt();
            } else {
                System.out.println("Invalid Value.");
            }

            scanner.nextLine();

        } while (amountFull == -1);

        return amountFull;
    }
}
