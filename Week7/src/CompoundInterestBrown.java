public class CompoundInterestBrown {

    public static void main(String[] args) {

        //Wes Brown
        System.out.printf("Your total is $%.2f.\n", computeBalance(1000, 0.045,3 ));
        System.out.printf("Your total is $%.2f.\n", computeBalance(2000, 0.03,5 ));
        System.out.printf("Your total is $%.2f.\n", computeBalance(3000, 0.01,10 ));
    }

    /**
     * @param startingBalance the balance at the start of the method
     * @param interestRate the interest rate for each year
     * @param years number of years we are compounding the interest
     * @return the balance after compounding the balance for the number of years
     */

    public static double computeBalance(double startingBalance, double interestRate, int years){

        double currentBalance = startingBalance;

        for(int i = 0; i < years; i++){

            currentBalance += currentBalance * interestRate;

        }
        return currentBalance;
    }
}
