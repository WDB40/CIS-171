public class YearIncreaseBrown {

    private static final int START_YEAR = 2015;
    private static final int FACTOR = 5;

    //This needs to be updated to be on the year same year scale
    private static final int END_YEAR = START_YEAR + 30;

    public static void main(String[] args) {

        printYears();
    }

    private static void printYears(){

        int year = START_YEAR;

        //Previous loop was going to 30 as opposed to 30 years after the start
        while(year <= END_YEAR){

            //There was no logic to check if the year met the condition
            if(year % FACTOR == 0){
                System.out.println(year);
            }

            //There was no increment within the loop
            year++;
        }
    }

}
