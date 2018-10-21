import java.util.Arrays;

public class RandomTenBrown {

    public static void main(String[] args) {

        //Wes Brown

        int min = 1;
        int max = 20;
        int count = 10;

        int[] randomNumbers = getRandomNumbers(min, max, count);
        System.out.println("All Array Items: " + intArrayToString(randomNumbers));
        System.out.println("Even Index Items: " + intArrayToString(getEvenIndexElements(randomNumbers)));
        System.out.println("Event Value Elements: " + intArrayToString(getEvenValueElements(randomNumbers)));
        System.out.println("Reversed Array: " + intArrayToString(reverseElementOrder(randomNumbers)));
        System.out.println("First Element: " + firstElement(randomNumbers));
        System.out.println("Last Element: " + lastElement(randomNumbers));
        System.out.println("Highest Value: " + getHighestValue(randomNumbers,min));
        System.out.println("Lowest Value: " + getLowestValue(randomNumbers, max));
    }

    private static int getRandomNumber(int min, int max){
        return (int) (Math.random()*((max - min) +1) +  min);
    }

    static int[] getRandomNumbers(int min, int max, int count){
        int[] randomNumbers = new int[count];

        for(int i = 0; i < count; i++) {
            randomNumbers[i] = getRandomNumber(min, max);
        }

        return randomNumbers;
    }

    private static int[] getEvenIndexElements(int[] values){
        int[] result = new int[values.length];
        int currentSize = 0;

        for(int i = 0; i < values.length; i++){

            if(isEven(i)){
                currentSize++;
                result[currentSize - 1] = values[i];
            }
        }
        return Arrays.copyOf(result, currentSize);
    }

    private static boolean isEven(int value){
        return value % 2 == 0;
    }

    private static int[] getEvenValueElements(int[] values){
        int[] result = new int[values.length];
        int currentSize = 0;

        for(int value : values){

            if(isEven(value)){
                currentSize++;
                result[currentSize - 1] = value;
            }
        }
        return Arrays.copyOf(result, currentSize);
    }

    private static int[] reverseElementOrder(int[] values){
        int size = values.length;
        int lastElement = size - 1;
        int[] result = new int[size];

        for(int i = 0; i < size; i++){

            result[lastElement - i] = values[i];
        }
        return result;
    }

    private static int firstElement(int[] values){
        return values[0];
    }

    private static int lastElement(int[] values){
        return values[values.length - 1];
    }

    private static int getHighestValue(int[] values, int min){
        int highestValue = min;

        for(int value : values){
            if(value > highestValue){
                highestValue = value;
            }
        }
        return highestValue;
    }

    private static int getLowestValue(int[] values, int max){
        int lowestValue = max;

        for(int value : values){
            if(value < lowestValue){
                lowestValue = value;
            }
        }
        return lowestValue;
    }

    private static String intArrayToString(int[] values){
        return Arrays.toString(values);
    }
}
