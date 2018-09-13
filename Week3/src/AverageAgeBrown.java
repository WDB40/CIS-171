import java.util.Scanner;

public class AverageAgeBrown {

    public static void main(String[] args) {
        //Wes Brown

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many ages are we entering?: ");
        int numPeople = scanner.nextInt();

        int[] ages = new int[numPeople];
        int totalAges = 0;
        double averageAge;

        for(int personCounter =0; personCounter<ages.length; personCounter++) {

            System.out.print("Enter the age for person " + (personCounter+1) + ": ");
            ages[personCounter] = scanner.nextInt();
            totalAges = totalAges + ages[personCounter];
        }

        averageAge = (double)totalAges/ages.length;

        System.out.printf("The average age of the %d people is %.2f.", ages.length, averageAge);

        scanner.close();
    }
}
