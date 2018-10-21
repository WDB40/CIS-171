import java.util.Scanner;

public class ChildcareChargesBrown {

    private static final int MAX_AGE = 4;
    private static final int MIN_AGE = 0;
    private static final int MAX_DAYS_PER_WEEK = 5;
    private static final int MIN_DAYS_PER_WEEK = 1;
    public static final int INVALID_INPUT = -1;

    public static void main(String[] args) {

        //Wes Brown

        //If I were to go back, I would put the validations on the when getting the input from the user
        //instead of getting it then validating and looping while invalid (daysPerWeek)

        int age = INVALID_INPUT;
        int daysPerWeek = INVALID_INPUT;

        do{
           age = getIntInput("Enter the age of the child (0-4): ");

           if(userWantsToContinue(age) && validChildAge(age)){

               do {
                   daysPerWeek = getIntInput("Enter the number of days per week for the childcare (1-5): ");
               }while(!validDaysPerWeek(daysPerWeek) && userWantsToContinue(daysPerWeek));

               if(userWantsToContinue(daysPerWeek)){
                   System.out.printf("The cost of childcare would be: $%d per week.\n" , getCost(age, daysPerWeek));
               }
           }

        }while(userWantsToContinue(age) && userWantsToContinue(daysPerWeek));

    }

    private static int getIntInput(String message){
        Scanner scanner = new Scanner(System.in);
        int input = INVALID_INPUT;

        do{
            System.out.print(message);
            if(scanner.hasNextInt()){
                input = scanner.nextInt();
            }

            scanner.nextLine();

        }while(input == INVALID_INPUT);

        return input;
    }

    private static boolean validChildAge(int age){
        return age >= MIN_AGE && age <= MAX_AGE;
    }

    private static boolean validDaysPerWeek(int daysPerWeek){
        return daysPerWeek >= MIN_DAYS_PER_WEEK && daysPerWeek <= MAX_DAYS_PER_WEEK;
    }

    private static boolean userWantsToContinue(int input){
        return !(input == 999);
    }

    private static int getCost(int age, int daysPerWeek){

        int[][] rates = {
                {30,60,88,115,140},
                {26,52,70,96,120},
                {24,46,67,89,110},
                {22,40,60,75,88},
                {20,35,50,66,84} };

        return rates[age][daysPerWeek-1];
    }

}
