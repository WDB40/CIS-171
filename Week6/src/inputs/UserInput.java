package inputs;

import java.util.Scanner;

public abstract class UserInput {

    private String promoteMessage;

    protected abstract boolean validateInput(String input);
    public abstract Object getValue();

    UserInput(){

    }

    UserInput(String promoteMessage){
        this.promoteMessage = promoteMessage;
    }

    public void setPromoteMessage(String promoteMessage){
        this.promoteMessage = promoteMessage;
    }

    private void promoteForInput(){
        System.out.print(this.promoteMessage);
    }

    String getInput(){
        Scanner scanner = new Scanner(System.in);
        String input;

        do{
            promoteForInput();
            input = scanner.nextLine();

        }while(emptyInput(input));

        return input;
    }

    private boolean emptyInput(String input){
        return input == null || input.equals("");
    }

}
