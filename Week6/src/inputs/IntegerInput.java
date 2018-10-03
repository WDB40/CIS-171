package inputs;

public class IntegerInput extends UserInput {

    public IntegerInput(String promoteMessage){
        super(promoteMessage);
    }

    protected boolean validateInput(String input){
        try{
            Integer.parseInt(input);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public Integer getValue(){
        String input;

        do {

            input = super.getInput();

        }while(!validateInput(input));

        return Integer.parseInt(input);
    }
}
