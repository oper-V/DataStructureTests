package hexlet;

import static hexlet.SumOfIntervals.sumOfIntervals;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;


public class SumOfIntervalsTest {

    @Test
    public void testSumOfIntervals() {

        Assert.assertEquals(sumOfIntervals(Arrays.asList(Arrays.asList(5, 5))), 0);
        Assert.assertEquals(sumOfIntervals(Arrays.asList(Arrays.asList(3, 10))), 7);
        Assert.assertEquals(sumOfIntervals(Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(11, 12)
        )), 2);
        Assert.assertEquals(sumOfIntervals(Arrays.asList(
                Arrays.asList(2, 7),
                Arrays.asList(6, 6)
        )), 5);
        /*
        Assert.assertEquals(sumOfIntervals(Arrays.asList(
                Arrays.asList(1, 5),
                Arrays.asList(1, 10)
        )), 9);
        Assert.assertEquals(sumOfIntervals(Arrays.asList(
                Arrays.asList(1, 9),
                Arrays.asList(7, 12),
                Arrays.asList(3, 4)
        )), 11);
        Assert.assertEquals(sumOfIntervals(Arrays.asList(
                Arrays.asList(7, 10),
                Arrays.asList(1, 4),
                Arrays.asList(2, 5)
        )), 7);
        Assert.assertEquals(sumOfIntervals(Arrays.asList(
                Arrays.asList(1, 5),
                Arrays.asList(9, 19),
                Arrays.asList(1, 7),
                Arrays.asList(16, 19),
                Arrays.asList(5, 11)
        )), 18);
        Assert.assertEquals(sumOfIntervals(Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(20, 25)
        )), 7);

         */
    }
}

