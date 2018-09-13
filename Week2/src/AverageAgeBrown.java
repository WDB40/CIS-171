public class AverageAgeBrown {

    public static void main(String[] args) {
        //Wes Brown

        int katyAge = 28;
        int barbaraAge = 53;
        int charleyAge = 55; //My dad's name really is Charley Brown
        int wesAge = 26;

        double averageAge = (double)(katyAge + barbaraAge + charleyAge + wesAge) / 4;

        System.out.println("Katy is " + katyAge + " years old.");
        System.out.println("Barbara is " + barbaraAge + " years old.");
        System.out.println("Charley is " + charleyAge + " years old.");
        System.out.println("Wes is " + wesAge + " years old.");

        System.out.println("The average of age of the Brown family is " + averageAge + ".");
    }
}
