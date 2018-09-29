import java.util.Scanner;

public class BookOrderBrown {

    public static void main(String[] args) {

        //Wes Brown


    }

    static double calcOrderTotal(int numBooks, double bookSubtotal) {

        final double SALES_TAX = 0.065; //6.5%
        final double SHIPPING_CHARGE = 2.95;

        double tax = bookSubtotal * SALES_TAX;
        double shippingCost = numBooks * SHIPPING_CHARGE;

        return bookSubtotal + tax + shippingCost;
    }

}
