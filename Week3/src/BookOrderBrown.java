public class BookOrderBrown {

    public static void main(String[] args) {

        //Wes Brown

        int numBooks;
        double bookSubtotal;
        double orderTotal;

        //Test Data #1
        numBooks = 5;
        bookSubtotal = 68.45;
        orderTotal =calcOrderTotal(numBooks, bookSubtotal);
        System.out.println(printOrder(numBooks,bookSubtotal,orderTotal));

        //Test Data #2
        numBooks = 8;
        bookSubtotal = 125.37;
        orderTotal = calcOrderTotal(numBooks,bookSubtotal);
        System.out.println(printOrder(numBooks, bookSubtotal, orderTotal));

        //Test Data #3
        numBooks = 500;
        bookSubtotal = 6784.97;
        orderTotal = calcOrderTotal(numBooks,bookSubtotal);
        System.out.println(printOrder(numBooks, bookSubtotal,orderTotal));

    }

    static double calcOrderTotal(int numBooks, double bookSubtotal) {

        final double SALES_TAX = 0.065; //6.5%
        final double SHIPPING_CHARGE = 2.95;

        double tax = bookSubtotal * SALES_TAX;
        double shippingCost = numBooks * SHIPPING_CHARGE;

        return bookSubtotal + tax + shippingCost;
    }

    static String printOrder(int numBooks, double bookSubtotal, double orderTotal) {

        return String.format("The order total for %d books with a subtotal of $%.2f is: $%.2f", numBooks,bookSubtotal, orderTotal);

    }
}
