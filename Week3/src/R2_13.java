import java.util.Scanner;

public class R2_13 {

    public static void main(String[] args){

        String myWord = getWord();
        dissectWord(myWord);

    }

    static void dissectWord(String word){

        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length() - 1);
        String middleString = word.substring(1, word.length()-2);

        System.out.printf("The first letter: %c", firstLetter);
        System.out.printf("The last letter: %c", lastLetter);
        System.out.printf("The middle letters: %s", middleString);
    }

    static String getWord() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the word to dissect:");
        return scanner.nextLine();
    }
}