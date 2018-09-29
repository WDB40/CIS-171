import java.util.Scanner;

public class AverageAgeBrown {

    private static final int MIN_AGE = 1;
    private static final int MAX_AGE = 100;
    private static final int MIN_NUM_AGES = 1;

    public static void main(String[] args) {
        //Wes Brown

        int numOfAges = getNumberOfAges();
        int ages[] = getAges(numOfAges);
        double averageAge = getAverageAge(ages);
        printAverageAge(averageAge);
    }

    private static void printAverageAge(double averageAge){

        System.out.printf("The average age is %.2f.", averageAge);
    }

    private static double getAverageAge(int[] ages) {

        double sumOfAges = 0;
        double averageOfAges;

        for(int age: ages){
            sumOfAges += age;
        }

        averageOfAges = sumOfAges/ages.length;

        return averageOfAges;
    }

    private static int[] getAges(int numberOfAges){
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[numberOfAges];
        int counter = 0;

        while(counter < numberOfAges){

            do{
                System.out.print("Enter a valid age (1-100): ");

                if(scanner.hasNextInt()){
                    ages[counter] = scanner.nextInt();
                }

                //Clear out the extra line from the carriage return
                scanner.nextLine();

            }while(!validAge(ages[counter]));

            counter++;
        }

        return ages;
    }

    private static boolean validAge(int age){
        return age >= MIN_AGE && age <= MAX_AGE;
    }

    private static int getNumberOfAges() {
        Scanner scanner = new Scanner(System.in);

        int numberOfAges = 0;

        do{
            System.out.print("Enter the number of ages you will enter (min = 1): ");

            if(scanner.hasNextInt()){
                numberOfAges = scanner.nextInt();
            }

            //Clear out the carriage return
            scanner.nextLine();

        } while(numberOfAges < MIN_NUM_AGES);

        return numberOfAges;
    }
}
