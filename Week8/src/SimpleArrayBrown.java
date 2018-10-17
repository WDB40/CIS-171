import java.text.DecimalFormat;
import java.util.Random;

public class SimpleArrayBrown {

    public static void main(String[] args) {

        double[] randomNumbers = getRandomNumbers(15, 10);
        printDoubleArray(randomNumbers);

    }

    private static void printDoubleArray(double[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.printf("numbers element at index[%d] = %.1f.\n", i, numbers[i]);
        }
    }

    public static double[] getRandomNumbers(int count, int max){

        double[] randomNumbers = new double[count];

        for(int i = 0; i < count; i++){
            randomNumbers[i] = getRandomNumber(max);
        }
        return randomNumbers;
    }

    private static double getRandomNumber(int max){
        return formatCurrency(new Random().nextDouble() * max);
    }

    private static double formatCurrency(double input){

        DecimalFormat decimalFormat = new DecimalFormat("##.#");
        return Double.parseDouble(decimalFormat.format(input));
    }
}
