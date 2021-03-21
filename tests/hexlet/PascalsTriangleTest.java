package hexlet;

import static hexlet.PascalsTriangle.triangle;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class PascalsTriangleTest {

    @Test
    public void testTriangle() {

        //Assert.assertEquals(triangle(0), Arrays.asList(1));
        Assert.assertEquals(triangle(1), Arrays.asList(1,1));
        Assert.assertEquals(triangle(2), Arrays.asList(1,2,1));
        Assert.assertEquals(triangle(3), Arrays.asList(1,3,3,1));
        Assert.assertEquals(triangle(4), Arrays.asList(1,4,6,4,1));
    }
}
