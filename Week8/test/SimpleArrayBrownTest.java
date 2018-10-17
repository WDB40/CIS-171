import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleArrayBrownTest {

    private int size;
    private int max;
    private double[] numbers;

    @Before
    public void beforeEachTest(){
        size = 0;
        max = 0;
    }

    @Test
    public void shouldReturnProperSizedArray(){

        size = 15;
        max = 10;

        numbers = SimpleArrayBrown.getRandomNumbers(size, max);

        assertEquals(size, numbers.length);
    }

    @Test
    public void shouldHaveNonZeroValues(){

        size = 10;
        max = 5;

        numbers = SimpleArrayBrown.getRandomNumbers(size, max);

        for(double number: numbers){
            assertNotEquals(0, number);
        }
    }

}