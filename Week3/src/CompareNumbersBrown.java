import java.util.Scanner;

public class CompareNumbersBrown {

    public static void main(String[] args) {

        //Wes Brown

        double[] numbers = getTwoNumbers();
        boolean[] compareResults = compareTwoNumbers(numbers);
        printCompareResults(compareResults, numbers);

    }

    private static double[] getTwoNumbers() {

        //Declare variables
        Scanner scanner = new Scanner(System.in);
        int NUMBERS_TO_COMPARE = 2; //Only comparing two right now
        double[] numbers = new double[NUMBERS_TO_COMPARE];

        //Get a number for each value
        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number to compare: ");
            numbers[i] = scanner.nextDouble();
        }

        return numbers;
    }

    private static boolean[] compareTwoNumbers(double[] numbers){

        //Declare variables
        int NUMBER_OF_COMPARISONS = 3;
        boolean[] compareResults = new boolean[NUMBER_OF_COMPARISONS];

        //Do each comparison
        compareResults[0] = numbers[0] == numbers[1];
        compareResults[1] = numbers[0] > numbers[1];
        compareResults[2] = numbers[0] < numbers[1];

        //Return the comparison results
        return compareResults;
    }

    private static void printCompareResults(boolean[] compareResults, double[] numbers) {

        //Print the results of each comparison
        System.out.printf("Is %.2f equal to %.2f? %b.\n", numbers[0], numbers[1], compareResults[0]);
        System.out.printf("Is %.2f greater than %.2f? %b.\n", numbers[0], numbers[1], compareResults[1]);
        System.out.printf("Is %.2f less than %.2f? %b.\n", numbers[0], numbers[1], compareResults[2]);

    }

}
