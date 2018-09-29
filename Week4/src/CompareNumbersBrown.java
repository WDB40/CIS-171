import java.util.Scanner;

public class CompareNumbersBrown {

    public static void main(String[] args) {

        //Wes Brown

        double[] numbers = getTwoNumbers();
        compareTwoNumbers(numbers);

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

    private static void compareTwoNumbers(double[] numbers){

        if(numbers[0]>numbers[1]){
            System.out.printf("%.2f is greater than %.2f", numbers[0], numbers[1]);
        } else if (numbers[0]<numbers[1]){
            System.out.printf("%.2f is less than %.2f", numbers[0], numbers[1]);
        } else if (numbers[0] == numbers[1]){
            System.out.printf("%.2f is equal to %.2f", numbers[0], numbers[1]);
        }

    }


}
