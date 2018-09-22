import java.util.Scanner;

public class ShopperRewardsBrown {

    public static void main(String[] args) {

        double groceriesCost = getGroceriesCost();
        double couponAmount = calcCouponAmount(groceriesCost);
        int gasDiscount = getGasPerGallonDiscount(groceriesCost);
        printOrderSummary(couponAmount, gasDiscount);

    }

    private static void printOrderSummary(double couponAmount, int gasDiscount){

        System.out.printf("You have a received a coupon valued at $%.2f.\n", couponAmount);
        System.out.printf("You have earned a gas discount of ¢%d per gallon.", gasDiscount);
    }

    private static double getGroceriesCost(){

        Scanner scanner = new Scanner(System.in);

        double INVALID_DOUBLE = -1.0;
        double groceriesCost = INVALID_DOUBLE;

        do{
            System.out.print("Enter the cost of groceries: ");

            if(scanner.hasNextDouble()){
                groceriesCost = scanner.nextDouble();
            }

            //Clears the carriage return
            scanner.nextLine();

        } while(groceriesCost == INVALID_DOUBLE);

        return groceriesCost;
    }

    private static int getGasPerGallonDiscount(double groceriesCost){

        final int DEFAULT_DISCOUNT = 0;

        final double TIER_ONE_THRESHOLD = 1;
        final int TIER_ONE_DISCOUNT = 1;

        final double TIER_TWO_THRESHOLD = 49;
        final int TIER_TWO_DISCOUNT = 2;

        final double TIER_THREE_THRESHOLD = 99;
        final int TIER_THREE_DISCOUNT = 3;

        int gasPerGallonDiscount = DEFAULT_DISCOUNT;

        if(groceriesCost> TIER_THREE_THRESHOLD) {
            gasPerGallonDiscount = TIER_THREE_DISCOUNT;
        } else if (groceriesCost > TIER_TWO_THRESHOLD) {
            gasPerGallonDiscount = TIER_TWO_DISCOUNT;
        } else if(groceriesCost >= TIER_ONE_THRESHOLD) {
            gasPerGallonDiscount = TIER_ONE_DISCOUNT;
        }

        return gasPerGallonDiscount;
    }

    private static double calcCouponAmount(double groceriesCost){

        final double DEFAULT_DISCOUNT = 0;

        final double TIER_ONE_THRESHOLD = 10;
        final double TIER_ONE_DISCOUNT = 0.08;

        final double TIER_TWO_THRESHOLD = 60;
        final double TIER_TWO_DISCOUNT = 0.1;

        final double TIER_THREE_THRESHOLD = 150;
        final double TIER_THREE_DISCOUNT = 0.12;

        final double TIER_FOUR_THRESHOLD = 210;
        final double TIER_FOUR_DISCOUNT = 0.14;

        double couponAmount = DEFAULT_DISCOUNT;

        if(groceriesCost > TIER_FOUR_THRESHOLD){
            couponAmount = groceriesCost * TIER_FOUR_DISCOUNT;

        } else if(groceriesCost > TIER_THREE_THRESHOLD) {
            couponAmount = groceriesCost * TIER_THREE_DISCOUNT;

        } else if(groceriesCost > TIER_TWO_THRESHOLD) {
            couponAmount = groceriesCost * TIER_TWO_DISCOUNT;

        } else if(groceriesCost >= TIER_ONE_THRESHOLD) {
            couponAmount = groceriesCost * TIER_ONE_DISCOUNT;
        }

        return couponAmount;
    }
}
