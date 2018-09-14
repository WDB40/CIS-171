import java.util.Scanner;

public class R2_13 {

    public static void main(String[] args){

        String myWord = getWord();
        dissectWord(myWord);

    }

    private static void dissectWord(String word){

        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length() - 1);
        String middleString = word.substring(1, word.length()-1);

        System.out.printf("The first letter: %c\n", firstLetter);
        System.out.printf("The last letter: %c\n", lastLetter);
        System.out.printf("The middle letters: %s\n", middleString);
    }

    private static String getWord() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the word to dissect: ");
        return scanner.nextLine();
    }
}