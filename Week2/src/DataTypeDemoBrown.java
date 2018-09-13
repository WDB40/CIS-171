public class DataTypeDemoBrown {

    public static void main(String[] args) {

        //Wes Brown

        int numSandwiches = 2;
        double timeToCompleteAssignment = 30.5;
        float timeToWorkToday = 20.4f; //Was defaulting to double with decimal
        boolean late = false;
        short workFloor = 9;
        long feetToGround = 90;
        byte numDesks = 2;
        char assignmentGrade = 'A';

        System.out.println("First Set:");
        System.out.println("I have eaten " + numSandwiches + " sandwiches today.");
        System.out.println("It took me " + timeToCompleteAssignment + " minutes to complete this assignment.");
        System.out.println("It took me " + timeToWorkToday + " minutes to get to work today.");
        System.out.println("Was I late for work? " + late);
        System.out.println("I work on floor " + workFloor + ".");
        System.out.println("That floor is " + feetToGround + " feet above the ground.");
        System.out.println("I have " + numDesks + " desks at work.");
        System.out.println("I am hoping to get an " + assignmentGrade + " on this assignment.");

        final int NUM_STATES = 50;
        final double BOTTLE_SIZE = 16.8;
        final float CAN_SIZE = 12.7f;
        final boolean WORLD_FLAT = false;
        final short NUM_CONTINENTS = 7;
        final long NUM_COUNTRIES = 195;
        final byte NUM_EARTHS = 1;
        final char LAST_LETTER = 'Z';

        System.out.println("\nSecond Set:");
        System.out.println("There are " + NUM_STATES + "states in the United States");
        System.out.println("The size of a bottle is " + BOTTLE_SIZE + " ounces.");
        System.out.println("The size of a can is " + CAN_SIZE + " ounces.");
        System.out.println("Is the world flat? " + WORLD_FLAT);
        System.out.println("There are " + NUM_CONTINENTS + " continents in the world.");
        System.out.println("There are " + NUM_COUNTRIES + " countries in the world.");
        System.out.println("There are " + NUM_EARTHS + " Earths in the world");
        System.out.println("The last letter of the alphabet is " + LAST_LETTER + ".");
    }


}
