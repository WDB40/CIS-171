import java.util.Scanner;

public class VowelFoundBrown {

    private static final String STOP = "exit";

    public static void main(String[] args) {
        playFindTheVowels();
    }

    private static void playFindTheVowels(){

        String input;

        while(continueLookingForVowels(input = getInput())){
            vowelMessage(containsVowel(input));
        }
    }

    private static boolean continueLookingForVowels(String input){
        return !input.equalsIgnoreCase(STOP);
    }

    private static void vowelMessage(boolean containsVowel){

        if(containsVowel){
            System.out.println("That contained a vowel!");
        } else{
            System.out.println("That doesn't contain a vowel...");
        }
    }

    private static boolean containsVowel(String input){

        boolean containsVowel = false;

        for(int i = 0; i < input.length(); i++){

            if(isVowel(input.charAt(i))){
                containsVowel = true;
                break;
            }
        }
        return containsVowel;
    }

    private static String getInput(){
        Scanner scanner = new Scanner(System.in);
        String input;

        do{
            System.out.print("Enter some word(s) or exit to stop: ");
        }while(invalidInput(input = scanner.nextLine()));

        return input;
    }

    private static boolean invalidInput(String input){
        return input == null || input.equals("");
    }

    private static boolean isVowel(char c){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for(char vowel: vowels){
            if(vowel == c){ return true; }
        }
        return false;
    }
}
