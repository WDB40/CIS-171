import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BillingBrownTest {

    private double price;
    private int quantity;
    private double couponDiscount;
    private double expectedTotal;
    private double total;
    private final double DELTA = 1e-15;

    @Before
    public void before(){
        price = 0;
        quantity = 0;
        couponDiscount = 0;
        expectedTotal = 0;
        total = 0;
    }

    @Test
    public void canCalcWithJustPhotoPrice(){

        price = 19.99;

        total = BillingBrown.computePhotoBill(price);

        expectedTotal = 21.19;
        assertEquals(expectedTotal, total, DELTA);
    }

    @Test
    public void canCalcForPhotoBook(){

        price = 19.99;
        quantity = 2;

        total = BillingBrown.computePhotoBill(price, quantity);

        expectedTotal = 42.38;
        assertEquals(expectedTotal, total, DELTA);
    }

    @Test
    public void canCalcWithCoupon(){

        price = 19.22;
        quantity = 2;
        couponDiscount = 0.1;

        total = BillingBrown.computePhotoBill(price, quantity, couponDiscount);

        expectedTotal = 36.67;
        assertEquals(expectedTotal, total, DELTA);
    }

}