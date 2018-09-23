import java.util.Scanner;

public class EFScaleBrown {

    private static final double INVALID_GUST = -1;
    private static final double MIN_GUST = 65;
    private static final double ZERO = 0; //Not really needed

    private static final int TIER_ZER0_EF_RATING = 0;
    private static final double TIER_ONE_THRESHOLD = 85;
    private static final int TIER_ONE_EF_RATING = 1;
    private static final double TIER_TWO_THRESHOLD = 110;
    private static final int TIER_TWO_EF_RATING = 2;
    private static final double TIER_THREE_THRESHOLD = 135;
    private static final int TIER_THREE_EF_RATING = 3;
    private static final double TIER_FOUR_THRESHOLD = 165;
    private static final int TIER_FOUR_EF_RATING = 4;
    private static final double TIER_FIVE_THRESHOLD = 200;
    private static final int TIER_FIVE_EF_RATING = 5;

    public static void main(String[] args) {

        //Wes Brown
        double gust = getWindGust();
        int efRating = getEFRating(gust);
        printEFRating(efRating);

    }

    private static void printEFRating(int efRating){
        System.out.printf("The EF Rating is %d.", efRating);
    }

    private static int getEFRating(double gust){

        if(gust > TIER_FIVE_THRESHOLD){
            return TIER_FIVE_EF_RATING;
        } else if(gust > TIER_FOUR_THRESHOLD){
            return TIER_FOUR_EF_RATING;
        } else if(gust > TIER_THREE_THRESHOLD){
            return TIER_THREE_EF_RATING;
        } else if(gust > TIER_TWO_THRESHOLD) {
            return TIER_TWO_EF_RATING;
        } else if(gust > TIER_ONE_THRESHOLD) {
            return TIER_ONE_EF_RATING;
        } else {
            return TIER_ZER0_EF_RATING;
        }
    }

    private static double getWindGust(){

        Scanner scanner = new Scanner(System.in);
        double gust = INVALID_GUST;

        do{
            System.out.print("Enter the 3 second wind gust (65+ MPH): ");

            if(scanner.hasNextDouble()){

                gust = scanner.nextDouble();

                if(!validGust(gust)) {
                    gust = INVALID_GUST;
                }

            } else {
                System.out.println("Please enter actual numbers.");
            }
            scanner.nextLine(); //Used to clear out the carriage return;

        } while (gust == INVALID_GUST);

        return gust;
    }

    private static boolean validGust(double gust){

        if(gust < ZERO){
            System.out.println("Do not enter negative numbers.");
            return false;
        } else if(gust < MIN_GUST) {
            System.out.println("Please enter a value greater than or equal to 65.");
            return false;
        } else {
            return true;
        }

    }

}
