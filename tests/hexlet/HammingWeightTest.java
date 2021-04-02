package hexlet;

import static hexlet.HammingWeight.hammingWeight;

import org.junit.Assert;
import org.junit.Test;


public class HammingWeightTest {

    @Test
    public void testHammingWeight() {

        Assert.assertEquals(hammingWeight(0), 0);
        Assert.assertEquals(hammingWeight(1), 1);
        Assert.assertEquals(hammingWeight(5), 2);
        Assert.assertEquals(hammingWeight(10), 2);
        Assert.assertEquals(hammingWeight(101), 4);
        Assert.assertEquals(hammingWeight(12345), 6);


    }
}
