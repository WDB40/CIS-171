import java.util.Scanner;

public class RockPaperScissorsRevisedBrown {

    private static final int PLAYER_ONE = 0;
    private static final int PLAYER_TWO = 1;
    private static final int NUM_OF_PLAYERS = 2;
    private static final String SCISSORS = "scissors";
    private static final String ROCK = "rock";
    private static final String SPOCK = "spock";
    private static final String PAPER = "paper";
    private static final String LIZARD = "lizard";
    private static final int TIE = 3;
    private static final int GAME_FAILED = -1;


    public static void main(String[] args) {
        //Wes Brown

        String[] playerChoices = getBothPlayerChoices();
        int winner = getWinner(playerChoices);
        printWinner(winner);

    }

    private static void printWinner(int winner){

        if(winner == PLAYER_ONE){
            System.out.println("Player One Wins!");
        } else if(winner == PLAYER_TWO){
            System.out.println("Player Two Wins!");
        } else if(winner == TIE){
            System.out.println("It is a tie!");
        } else {
            System.out.println("Something went wrong. Try again.");
        }

    }

    private static int getWinner(String[] playerChoices){

        if(playerChoices[PLAYER_ONE].equalsIgnoreCase(playerChoices[PLAYER_TWO])){
            return TIE;
        }

        switch (playerChoices[PLAYER_ONE]){

            case ROCK: {
                if(doesRockWin(playerChoices[PLAYER_TWO])){
                    return PLAYER_ONE;
                } else {
                    return PLAYER_TWO;
                }
            }
            case PAPER: {
                if(doesPaperWin(playerChoices[PLAYER_TWO])){
                    return PLAYER_ONE;
                } else {
                    return PLAYER_TWO;
                }
            }
            case SCISSORS: {
                if(doesScissorsWin(playerChoices[PLAYER_TWO])){
                    return PLAYER_ONE;
                } else {
                    return PLAYER_TWO;
                }
            }
            case LIZARD: {
                if(doesLizardWin(playerChoices[PLAYER_TWO])){
                    return PLAYER_ONE;
                } else{
                    return PLAYER_TWO;
                }
            }
            case SPOCK: {
                if(doesSpockWin(playerChoices[PLAYER_TWO])){
                    return PLAYER_ONE;
                } else {
                    return PLAYER_TWO;
                }
            }
            default: return GAME_FAILED;
        }
    }

    private static boolean doesScissorsWin(String against){

        return against.equalsIgnoreCase(LIZARD)||against.equalsIgnoreCase(PAPER);
    }

    private static boolean doesSpockWin(String against){

        return against.equalsIgnoreCase(SCISSORS)||against.equalsIgnoreCase(ROCK);
    }

    private static boolean doesLizardWin(String against){

        return against.equalsIgnoreCase(SPOCK)||against.equalsIgnoreCase(PAPER);
    }

    private static boolean doesRockWin(String against){

        return against.equalsIgnoreCase(LIZARD) || against.equalsIgnoreCase(SCISSORS);
    }

    private static boolean doesPaperWin(String against){

        return against.equalsIgnoreCase(ROCK) || against.equalsIgnoreCase(SPOCK);
    }

    private static String[] getBothPlayerChoices(){

        String playerChoices[] = new String[NUM_OF_PLAYERS];

        System.out.println("Player One");
        playerChoices[PLAYER_ONE] = getPlayerChoice();

        System.out.println("Player Two");
        playerChoices[PLAYER_TWO] = getPlayerChoice();

        return playerChoices;
    }

    private static String getPlayerChoice(){

        Scanner scanner = new Scanner(System.in);
        String playerChoice;

        do {
            System.out.print("Enter your choice: ");
            playerChoice = scanner.nextLine();

        } while(!validEntry(playerChoice));

        playerChoice = playerChoice.toLowerCase();

        return playerChoice;
    }

    private static boolean validEntry(String choice){

        return choice.equalsIgnoreCase(SPOCK) || choice.equalsIgnoreCase(LIZARD) ||
                choice.equalsIgnoreCase(ROCK) || choice.equalsIgnoreCase(PAPER) ||
                choice.equalsIgnoreCase(SCISSORS);
    }
}
