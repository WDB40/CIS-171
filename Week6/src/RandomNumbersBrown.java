import java.util.Scanner;

public class RandomNumbersBrown {



    public static void main(String[] args) {
        runRandomNumbers();
    }

    private static void runRandomNumbers(){
        int count = getInteger("How many random numbers do you want printed (int): ");
        int min = getInteger("What's the minimum value (int): ");
        int max = getInteger("What's the maximum value (int): ");
        int[] randomNumbers = getRandomNumbers(count, min, max);
        printRandomNumbers(randomNumbers);
    }

    private static void printRandomNumbers(int[] randomNumbers){

        for(int randomNumber: randomNumbers){
            System.out.println(randomNumber);
        }
    }

    private static int[] getRandomNumbers(int count, int min, int max){

        int[] randomNumbers = new int[count];

        for(int i = 0; i < count; i++){
            randomNumbers[i] = getRandomNumber(min, max);
        }
        return randomNumbers;
    }

    private static int getRandomNumber(int min, int max){
        return (int) ((Math.random()*(max-min + 1)) + min);
    }

    private static int getInteger(String message){
        Scanner scanner = new Scanner(System.in);

        System.out.print(message);
        while(!scanner.hasNextInt()){
            System.out.print(message);
            scanner.next();
        }

        return scanner.nextInt();
    }
}
