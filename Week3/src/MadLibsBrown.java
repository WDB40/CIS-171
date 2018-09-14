import java.util.Scanner;

public class MadLibsBrown {

    public static void main(String[] args) {

        String name = getName();
        String[] objects = getObjects();
        String verb = getVerb();
        String adjective = getAdjective();

        createMadLib(name, objects, verb, adjective);
    }

    private static String getName(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name: ");
        String name = scanner.nextLine();

        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();

        return name;
    }

    private static String[] getObjects(){

        Scanner scanner = new Scanner(System.in);
        int NUM_OBJECTS = 4;
        String[] objects = new String[4];

        for(int i = 0; i<NUM_OBJECTS; i++) {

            System.out.print("Enter an object: ");
            objects[i] = scanner.nextLine().toLowerCase();
        }

        return objects;
    }

    private static String getVerb(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a past-tense verb: ");
        String verb = scanner.nextLine().toLowerCase();

        return verb;
    }

    private static String getAdjective(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine().toLowerCase();

        return adjective;
    }

    private static void createMadLib(String name, String[] objects, String verb, String adjective){

        System.out.printf("There once was a person name %s, who had things.\n", name);
        System.out.printf("%s had a %s and a %s.\n", name, objects[0], objects[1]);
        System.out.printf("Both of those had a %s %s.\n", adjective, objects[2]);
        System.out.printf("While neither %s a %s.\n", verb, objects[3]);
    }

}
