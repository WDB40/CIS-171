import java.util.Scanner;

public class BookOrderBrown {

    private static final double SHIPPING_CHARGE = 2.95;
    private static final double SALES_TAX = 0.065;

    public static void main(String[] args) {
        //Wes Brown
        completeBookOrder();
    }

    private static void completeBookOrder(){

        int numBooks = getNumBooks();
        double[] priceOfEachBook = getPriceOfEachBook(numBooks);
        double bookSubtotal = calcTotalBookPrice(priceOfEachBook);
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

    private static double calcTotalBookPrice(double[] bookPrices){

        double totalBookPrice = 0;

        for(double bookPrice: bookPrices){
            totalBookPrice += bookPrice;
        }

        return totalBookPrice;
    }

    private static double[] getPriceOfEachBook(int numBooks){

        double[] priceOfEachBook = new double[numBooks];

        for(int i = 0; i < numBooks; i++){

            int bookNum = i + 1;

            System.out.printf("For book #%d -\n", bookNum);
            priceOfEachBook[i] = getBookPrice();
        }

        return priceOfEachBook;
    }

    private static double getBookPrice(){
        Scanner scanner = new Scanner(System.in);

        double bookPrice = 0;

        do{

            System.out.print("Enter the book price: ");

            if (scanner.hasNextDouble()){
                bookPrice = scanner.nextDouble();
            }

            //Clearing out the carriage return
            scanner.nextLine();

        } while(!validBookPrice(bookPrice));

        return bookPrice;
    }

    private static int getNumBooks(){
        Scanner scanner = new Scanner(System.in);

        int numBooks = 0;

        do{
            System.out.print("Enter the number of books: ");

            if(scanner.hasNextInt()){
                numBooks = scanner.nextInt();
            }

            //Clearing out the carriage return
            scanner.nextLine();

        } while(!validNumBooks(numBooks));

        return numBooks;
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

    private static boolean validNumBooks(int numBooks){
        return numBooks > 0;
    }

    private static boolean validBookPrice(double bookPrice) {
        return bookPrice > 0;
    }

}
