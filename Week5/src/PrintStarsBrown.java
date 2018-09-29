import java.util.Scanner;

public class PrintStarsBrown {

    private static final int INVALID_NUM_LINES = -1;
    private static final int MIN_NUM_LINES = 0;


    public static void main(String[] args) {

        //Wes Brown
        int numStarLines = getNumOfLines();
        printStarLines(numStarLines);
    }

    private static void printStarLines(int numStarLines){

        int lineCounter = 0;

        do{
            printStarLine();
            lineCounter++;

        } while(moreLinesToPrint(lineCounter, numStarLines));
    }

    private static void printStarLine(){
        System.out.println("*****");
    }

    private static int getNumOfLines(){
        Scanner scanner = new Scanner(System.in);
        int numStarLines = INVALID_NUM_LINES;

        do {

            System.out.print("Enter the number of star lines you would like to print: ");

            if (scanner.hasNextInt()) {
                numStarLines = scanner.nextInt();
            }

            //Clearing the carriage return
            scanner.nextLine();

        } while(!validNumStarLines(numStarLines));

        return numStarLines;
    }

    private static boolean validNumStarLines(int numStarLines){
        return numStarLines >= MIN_NUM_LINES;
    }

    private static boolean moreLinesToPrint(int current, int goal){
        return current < goal;
    }

}
