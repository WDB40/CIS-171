public class MultiIf {

    public static void main(String[] args) {

        System.out.println(numberOfStars(6));
        System.out.println(numberOfStars(20));
        System.out.println(numberOfStars(2));
        System.out.println(numberOfStars(-1));
        System.out.println(numberOfStars(7));

    }

    private static int numberOfStars(int value) {

        int numberOfStars = 0;

        if (value > 10) {
            numberOfStars += 5;
        }

        if (value > 7) {
            numberOfStars += 4;
        }

        if (value > 4) {
            numberOfStars += 3;
        }
        if (value > 1) {
            numberOfStars += 2;
        }

        numberOfStars++;

        return numberOfStars;
    }
}
