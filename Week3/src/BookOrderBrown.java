import java.util.Scanner;

public class BookOrderBrown {

    public static void main(String[] args) {

        //Wes Brown

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int numBooks = scanner.nextInt();

        System.out.print("Enter the subtotal for the books: $");
        double bookSubtotal = scanner.nextDouble();

        double orderTotal =calcOrderTotal(numBooks, bookSubtotal);
        System.out.printf("The order total for %d books with a subtotal of $%.2f is: $%.2f", numBooks,bookSubtotal, orderTotal);

    }

    static double calcOrderTotal(int numBooks, double bookSubtotal) {

        final double SALES_TAX = 0.065; //6.5%
        final double SHIPPING_CHARGE = 2.95;

        double tax = bookSubtotal * SALES_TAX;
        double shippingCost = numBooks * SHIPPING_CHARGE;

        return bookSubtotal + tax + shippingCost;
    }

}
