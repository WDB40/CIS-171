import java.util.Scanner;

public class VowelCountBrown {

    private static final int NO_VOWELS = 0;
    private static final int ONE_VOWEL = 1;

    public static void main(String[] args) {
        countVowels();
    }

    private static void countVowels(){

        String input = getInput();
        int vowelCount = countVowelOrY(input);
        printResults(input, vowelCount);
    }

    private static void printResults(String input, int vowelCount){

        if(vowelCount == NO_VOWELS){
            System.out.println("You must have made a mistake somewhere in there...");
        } else if (vowelCount == ONE_VOWEL){
            System.out.printf("%s contains %d vowel.", input, vowelCount);
        } else{
            System.out.printf("%s contains %d vowels.", input, vowelCount);
        }
    }

    private static int countVowelOrY(String input){

        int count = countTraditionalVowels(input);

        if(count == NO_VOWELS){
            count = countYChars(input);
        }
        return count;
    }

    private static int countTraditionalVowels(String input){
        input = input.toLowerCase();
        int vowelCount = 0;

        for(int i = 0; i < input.length(); i++){

            if(isVowel(input.charAt(i))){
                vowelCount++;
            }
        }
        return vowelCount;
    }

    private static boolean isVowel(char c){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for(char vowel: vowels){
            if(vowel == c){
                return true;
            }
        }
        return false;
    }

    private static int countYChars(String input){
        input = input.toLowerCase();
        int yCount = 0;

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i)== 'y'){
                yCount++;
            }
        }
        return yCount;
    }

    private static String getInput(){
        Scanner scanner = new Scanner(System.in);
        String input;

        do{
            System.out.print("Enter some word(s): ");
            input = scanner.nextLine();

        }while(invalidInput(input));

        return input;
    }

    private static boolean invalidInput(String input){
        return input == null || input.equals("");
    }
}