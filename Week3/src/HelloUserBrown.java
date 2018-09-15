import javax.swing.*;

public class HelloUserBrown {

    public static void main(String[] args) {

        String name = getName();
        int age = getAge();
        int ageNextYear = getAgeNextYear(age);
        displayAgeNextYear(ageNextYear, name);
    }

    private static String getName(){

        //Get the name from the user and then correct the format of it.
        String name = JOptionPane.showInputDialog("Enter your name: ");
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();

        return name;
    }

    private static int getAge(){

        //Get the current age of the user
        Integer age = null;

        //Continue asking for a valid age until the user provides one
        while(age==null){

            try{
                age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "A valid age is an integer. Please try again.");
            }
        }
        return age;
    }

    private static int getAgeNextYear(int age) {

        return ++age;
    }

    private static void displayAgeNextYear(int ageNextYear, String name) {

        String message = String.format("Howdy, %s. Next year, you will be %d years old!", name, ageNextYear);
        JOptionPane.showMessageDialog(null, message);
    }
}
