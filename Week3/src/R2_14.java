import java.util.Scanner;

public class R2_14 {

    public static void main(String[] args) {

        String fullName = getName();
        String myInitials = getInitals(fullName);
        System.out.printf("The initials for the name is: %s", myInitials);

    }

    private static String getInitals(String name){

        String initials = Character.toString(name.charAt(0));

        while(name.indexOf(" ")>0){

            name = name.substring(name.indexOf(" ")+1);
            initials = initials + Character.toString(name.charAt(0));
        }

        initials = initials.toUpperCase();

        return initials;
    }

    private static String getName() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the name of the person: ");
        return scanner.nextLine();
    }
}
