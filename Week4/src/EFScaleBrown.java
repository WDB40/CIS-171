import java.util.Scanner;

public class EFScaleBrown {

    private static final int INVALID_GUST = -1;
    private static final int MIN_GUST = 65;
    private static final int ZERO = 0; //Not really needed

    private static final int TIER_ZER0_EF_RATING = 0;
    private static final int TIER_ONE_THRESHOLD = 85;
    private static final int TIER_ONE_EF_RATING = 1;
    private static final int TIER_TWO_THRESHOLD = 110;
    private static final int TIER_TWO_EF_RATING = 2;
    private static final int TIER_THREE_THRESHOLD = 135;
    private static final int TIER_THREE_EF_RATING = 3;
    private static final int TIER_FOUR_THRESHOLD = 165;
    private static final int TIER_FOUR_EF_RATING = 4;
    private static final int TIER_FIVE_THRESHOLD = 200;
    private static final int TIER_FIVE_EF_RATING = 5;

    public static void main(String[] args) {

        //Wes Brown
        int gust = getWindGust();
        int efRating = getEFRating(gust);
        printEFRating(efRating);

    }

    private static void printEFRating(int efRating){
        System.out.printf("The EF Rating is %d.", efRating);
    }

    private static int getEFRating(int gust){

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

    private static int getWindGust(){

        Scanner scanner = new Scanner(System.in);
        int gust = INVALID_GUST;

        do{
            System.out.print("Enter the 3 second wind gust (65+ MPH): ");

            if(scanner.hasNextInt()){

                gust = scanner.nextInt();

                if(!validGust(gust)) {
                    gust = INVALID_GUST;
                }

            } else {
                System.out.println("Please enter an integer number.");
            }
            scanner.nextLine(); //Used to clear out the carriage return;

        } while (gust == INVALID_GUST);

        return gust;
    }

    private static boolean validGust(int gust){

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
