import java.text.DecimalFormat;

public class BillingBrown {

    private static final double TAX_RATE = 0.06;

    public static void main(String[] args) {

        //Wes Brown
        System.out.println(computePhotoBill(19.99));
        System.out.println(computePhotoBill(19.99, 2));
        System.out.println(computePhotoBill(19.22, 2, 0.1));

    }

    public static double computePhotoBill(final double photoPrice){
        return formatCurrency(photoPrice + calcTax(photoPrice));
    }

    public static double computePhotoBill(final double photoBookPrice, final int quantity){
        double totalPrice = photoBookPrice * quantity;
        double tax = calcTax(totalPrice);
        return formatCurrency(totalPrice + tax);
    }

    public static double computePhotoBill(final double photoBookPrice, final int quantity, final double couponDiscount){
        double totalPrice = (photoBookPrice * quantity) * (1-couponDiscount);
        double tax = calcTax(totalPrice);
        return formatCurrency(totalPrice + tax);
    }

    private static double calcTax(double input){
        return input * TAX_RATE;
    }

    private static double formatCurrency(double input){

        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return Double.parseDouble(decimalFormat.format(input));
    }

}
