package hexlet;

import static hexlet.QueryStringBuilder.buildQueryString;

import java.util.Map;
import org.junit.Assert;
import org.junit.Test;


public class QueryStringBuilderTest {

    @Test
    public void testBuildQueryString() {

        Assert.assertEquals(buildQueryString(Map.of("page", "1")), "page=1");

        Assert.assertEquals(buildQueryString(Map.of("per", "10", "page", "1")), "page=1&per=10");

        Assert.assertEquals(buildQueryString(Map.of(
                "a", "10",
                "s", "Wow",
                "d", "3.2",
                "z", "89"
        )), "a=10&d=3.2&s=Wow&z=89");


    }
}

