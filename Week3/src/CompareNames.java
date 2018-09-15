import java.util.Scanner;

public class CompareNames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter a name: ");
        String name2 = scanner.nextLine();

        if(name1.equalsIgnoreCase(name2)) {
            System.out.println("They are equal.");
        }
        else {
            System.out.println("They are not equal.");
        }


    }
}
