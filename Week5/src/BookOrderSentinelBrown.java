import java.util.Scanner;

public class BookOrderSentinelBrown {

    private static final double SHIPPING_CHARGE = 2.95;
    private static final double SALES_TAX = 0.065;
    private static final int EXIT_LOOP_VALUE = -1;

    public static void main(String[] args) {
        //Wes Brown
        completeBookOrder();
    }

    private static void completeBookOrder(){

        Scanner scanner = new Scanner(System.in);
        int numBooks = 0;
        double bookSubtotal = 0;
        double input = 0;

        do{

            System.out.print("Enter the book price (enter -1 to exit): ");

            if (scanner.hasNextDouble()){
                input = scanner.nextDouble();
            }

            //Clearing out the carriage return
            scanner.nextLine();

            if(validBookPrice(input)){
                bookSubtotal += input;
                numBooks++;
            }

        } while(keepAddingBooks(input));


        double shippingCharge = calcShippingCharge(numBooks);
        double tax = calcTax(bookSubtotal);
        double orderTotal = calcOrderTotal(bookSubtotal,shippingCharge, tax);
        printOrder(numBooks, bookSubtotal, shippingCharge,tax, orderTotal);
    }

    private static void printOrder(int numBooks, double bookSubtotal, double shippingCharge, double tax, double orderTotal){

        System.out.println("----------------------");
        System.out.println("Order Complete!");
        System.out.printf("Number of Books: %d\n", numBooks);
        System.out.printf("Book Subtotal: $%.2f\n", bookSubtotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Shipping Charge: $%.2f\n", shippingCharge);
        System.out.println("----------------------");
        System.out.printf("Order Total: $%.2f", orderTotal);
    }

    private static double calcShippingCharge(int numBooks){
        return numBooks * SHIPPING_CHARGE;
    }

    private static double calcTax(double bookSubtotal){
        return bookSubtotal * SALES_TAX;
    }

    private static double calcOrderTotal(double bookSubtotal, double shippingCharge, double tax) {
        return bookSubtotal + shippingCharge + tax;
    }

    private static boolean validBookPrice(double bookPrice) {
        return bookPrice > 0;
    }

    private static boolean keepAddingBooks(double input){
        return input != EXIT_LOOP_VALUE;
    }
}
