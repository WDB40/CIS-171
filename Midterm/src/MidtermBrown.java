import java.util.Scanner;

public class MidtermBrown {

    private static final double ALL_STAR_BONUS_PERCENTAGE = 0.03;
    private static final double REGULAR_BONUS_PERCENTAGE = 0.02;
    private static final int LEVEL_2_BONUS = 2;
    private static final double LEVEL_2_BONUS_THRESHOLD = 100;
    private static final int LEVEL_1_BONUS = 1;
    private static final double LEVEL_1_BONUS_THRESHOLD = 50;
    private static final int LEVEL_0_BONUS = 0;


    public static void main(String[] args) {

        //Wes Brown
        /*

        I had to change the looping on ZZZ slightly because I did not see that
        requirement until the VERY end. It still loops on a sentinel, but I just made it
        a yes/no question.

        */

        do{

            getEmployeeBonusInfo();

        }while(userWantsToProceed());

    }

    private static boolean userWantsToProceed(){

        Scanner scanner = new Scanner(System.in);
        String input;

        do{
            System.out.print("Do you want to enter another employee? (yes/no): ");
            input = scanner.nextLine();
        }while(isInvalidYesNo(input));

        return isYes(input);
    }


    private static void getEmployeeBonusInfo(){

        String firstName = getNameInput("Enter employee first name: ");
        String lastName = getNameInput("Enter employee last name: ");
        double sales = getSalesInput();
        boolean allStar = getAllStarStatusInput();
        double bonus = calcBonus(sales, allStar);
        String bonusStars = getBonusStars(sales);
        printEmployeeBonusInfo(firstName,lastName, bonusStars, bonus);
    }

    private static void printEmployeeBonusInfo(String firstName, String lastName, String bonusStars, double bonus){

        System.out.printf("%s, %s %s - $%.2f\n", lastName, firstName, bonusStars, bonus);

    }

    private static String getBonusStars(double bonus){

        int bonusLevel = getBonusLevel(bonus);

        if(bonusLevel == LEVEL_2_BONUS){
            return "****";
        } else if(bonusLevel == 1){
            return "**";
        } else{
            return "";
        }

    }

    private static int getBonusLevel(double bonus){

        if(bonus > LEVEL_2_BONUS_THRESHOLD){
            return LEVEL_2_BONUS;
        } else if(bonus > LEVEL_1_BONUS_THRESHOLD){
            return LEVEL_1_BONUS;
        } else {
            return LEVEL_0_BONUS;
        }
    }

    private static double calcBonus(double sales, boolean allStar){

        if(allStar){
            return sales * ALL_STAR_BONUS_PERCENTAGE;
        } else {
            return sales * REGULAR_BONUS_PERCENTAGE;
        }
    }

    private static boolean getAllStarStatusInput(){
        Scanner scanner = new Scanner(System.in);
        String allStarStatus;

        do{
            System.out.print("Is this employee an all-star (yes/no): ");
            allStarStatus = scanner.nextLine();
        } while(isInvalidYesNo(allStarStatus));

        return isYes(allStarStatus);
    }

    private static boolean isYes(String input){
        return input.equalsIgnoreCase("yes");
    }

    private static boolean isInvalidYesNo(String input){

        return isEmptyString(input) || (!input.equalsIgnoreCase("no") && !input.equalsIgnoreCase("yes"));
    }

    private static double getSalesInput(){

        Scanner scanner = new Scanner(System.in);
        double sales = 0;

        do{
            System.out.print("Enter employee sales: ");

            if (scanner.hasNextDouble()){
                sales = scanner.nextDouble();
            }

            //Clear out the extra carriage return
            scanner.nextLine();
        }while(isInvalidSales(sales));

        return sales;
    }

    private static boolean isInvalidSales(double sales){
        return sales <= 0;
    }

    private static String getNameInput(String promptMessage){

        Scanner scanner = new Scanner(System.in);
        String nameInput;

        do{

            System.out.print(promptMessage);
            nameInput = scanner.nextLine();

        }while(isEmptyString(nameInput));

        return applyNameFormat(nameInput);
    }

    private static boolean isEmptyString(String input){
        return input == null || input.equals("");
    }

    private static String applyNameFormat(String name){
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }

}
