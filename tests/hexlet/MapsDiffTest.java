package hexlet;

import static hexlet.MapsDiff.genDiff;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class MapsDiffTest {

    HashMap<String, String> result = new HashMap<String, String>();
    HashMap<String, String> data1 = new HashMap<String, String>();
    HashMap<String, String> data2 = new HashMap<String, String>();

    @BeforeEach
    public void clearMaps() {
        data1.clear();
        data2.clear();
        result.clear();
    }

    @Test
    public void testFirstEmptyMap() {
        data2.put("two", "own");
        result.put("two", "added");
        Assert.assertEquals(genDiff(data1, data2), result);
    }

    @Test
    public void testSecondEmptyMap() {

        data1.put("one", "eon");
        result.put("one", "deleted");
        Assert.assertEquals(genDiff(data1, data2), result);
    }

    @Test
    public void testMapDiff1() {

        data1.put("three", "eerht");
        data2.put("four", "ruof");

        result = new HashMap<String, String>() {{
            put("three", "deleted");
            put("four", "added");
        }};

        Assert.assertEquals(genDiff(data1, data2), result);

    }

    @Test
    public void testMapDiff2() {

        data1 = new HashMap<String, String>() {{
            put("five", "5");
            put("six", "6");
        }};

        data2 = new HashMap<String, String>() {{
            put("six", "xis");
            put("five", "5");
        }};

        result = new HashMap<String, String>() {{
            put("six", "changed");
            put("five", "unchanged");
        }};

        Assert.assertEquals(genDiff(data1, data2), result);

    }

    @Test
    public void testMapDiff3() {

        data1.put("seven", "neves");
        data2.put("eighth", "True");

        result = new HashMap<String, String>() {{
            put("seven", "deleted");
            put("eighth", "added");
        }};
        Assert.assertEquals(genDiff(data1, data2), result);

    }

}