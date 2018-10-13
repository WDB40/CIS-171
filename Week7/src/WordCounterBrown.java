import java.util.Scanner;

public class WordCounterBrown {

    public static void main(String[] args) {

        System.out.println(countWords(getStringFromUser()));
    }

    /**
     * Get a non-empty string form the user
     * @return the string from the user
     */

    public static String getStringFromUser(){
        Scanner scanner = new Scanner(System.in);
        String input;

        do{
            System.out.print("Enter a string: ");
            input = scanner.nextLine();

        }while(isEmpty(input));

        return input;
    }

    /**
     * Returns the number of words in a string
     * @param str string to be search for words
     * @return the number of words in the string
     */

    public static int countWords(String str){

        if(isEmpty(str)) {return 0;}

        String cleanedStr = str.trim();
        int wordCount = 1;

        for(int i = 0; i < cleanedStr.length(); i++){
            if(cleanedStr.charAt(i)== ' ')
                wordCount++;
        }
        return wordCount;
    }

    /**
     * Determines if a string has any values in it
     * @param str string to be checked
     * @return true or false if it empty
     */

    private static boolean isEmpty(String str){
        return str == null || str.trim().equals("");
    }

}
