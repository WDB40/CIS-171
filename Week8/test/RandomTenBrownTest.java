import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class RandomTenBrownTest {

    private int count;
    private int min;
    private int max;
    private int[] results;

    @Before
    public void setUp(){
        count = 0;
        min = 0;
        max = 0;
    }

    @Test
    public void shouldReturnArrayOfCorrectSize(){

        count = 10;
        min = 5;
        max = 10;

        results = RandomTenBrown.getRandomNumbers(min, max, count);

        assertEquals(count, results.length);
    }

    @Test
    public void shouldBeWithinSetRange(){

        count = 100;
        min = 1;
        max = 2;

        results = RandomTenBrown.getRandomNumbers(min, max, count);

        for(int i = 0; i < count; i++){
            assertTrue(results[i] <= max && results[i] >= min);
        }
    }

}