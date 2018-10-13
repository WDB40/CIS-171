import java.util.Scanner;

public class PasswordValidationBrown {

    private static final int MIN_PASSWORD_LENGTH = 8;

    public static void main(String[] args) {

        //Wes Brown
        String password;
        String confirmedPassword;
        boolean validPassword;

        do {
            password = getPassword("Enter your new password: ");
            confirmedPassword = getPassword("Confirm your new password: ");
            validPassword = validatePassword(password, confirmedPassword);
            printPasswordValidation(validPassword);
        }while(!validPassword);

    }

    private static void printPasswordValidation(boolean validPassword){

        if(validPassword){
            System.out.println("Password Changed");
        } else{
            System.out.println("Invalid Password");
        }

    }

    private static String getPassword(String promptMessage){
        Scanner scanner = new Scanner(System.in);
        String input;

        do{
            System.out.print(promptMessage);
            input = scanner.nextLine();
        } while(isEmpty(input));
        return input;
    }

    public static boolean validatePassword(String password, String confirmedPassword){
        return twoPasswordsMatch(password, confirmedPassword) && validPasswordLength(password) &&
                containsUppercase(password) && containsLowercase(password) &&
                containsDigit(password);
    }

    private static boolean twoPasswordsMatch(String password, String confirmedPassword){
        return password.equals(confirmedPassword);
    }

    private static boolean validPasswordLength(String password){
        return password.length() >= MIN_PASSWORD_LENGTH;
    }

    private static boolean containsUppercase(String password){
        return !password.equals(password.toLowerCase());
    }

    private static boolean containsLowercase(String password){
        return !password.equals(password.toUpperCase());
    }

    private static boolean containsDigit(String password){

        for(int i = 0; i < password.length(); i++){
            if(Character.isDigit(password.charAt(i)))
                return true;
        }
        return false;
    }

    private static boolean isEmpty(String input){
        return input == null || input.trim().equals("");
    }
}
