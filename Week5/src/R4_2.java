public class R4_2 {

    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {

        System.out.println(evenNumberSum());
        System.out.println(sumOfSquare());
        System.out.println(sumOfOddBetween(0,100));
        System.out.println(sumOfOddDigits(32677));
    }

    private static int evenNumberSum() {

        int sum = 0;

        for(int i = 1; i <= MAX_VALUE; i++){

            if(i%2 == 0){
                sum += i;
            }
        }

        return sum;
    }

    private static int sumOfSquare(){

        int sumOfSquare = 0;

        for(int i = 1; i<= MAX_VALUE; i++){

            sumOfSquare += Math.pow(i,2);
        }

        return sumOfSquare;
    }

    private static int sumOfOddBetween(int start, int end) {

        int sumOfOddBetween = 0;

        for(int i = start; i <= end; i++) {
            if(i % 2 == 1){
                sumOfOddBetween += i;
            }
        }
        return sumOfOddBetween;
    }

    private static int sumOfOddDigits(int base){

        int sumOfOddDigits = 0;

        while(base > 0){
            int lastDigit = base % 10;

            if(lastDigit % 2 == 1){
                sumOfOddDigits += lastDigit;
            }

            base /= 10;
        }

        return sumOfOddDigits;
    }
}
