package hexlet;

import static hexlet.DictionariesMerge.merged;

import java.util.Set;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;


public class DictionariesMergeTest {

    @Test
    public void testDictionariesMerge() {

        Assert.assertEquals(merged(
                Map.of("A", 1),
                Map.of("B", 2)
        ), Map.of("A", Set.of(1), "B", Set.of(2)));

        Assert.assertEquals(merged(
                Map.of("A", 1),
                Map.of("A", 3),
                Map.of("A", 4),
                Map.of("B", 2)
        ), Map.of("A", Set.of(1,3,4), "B", Set.of(2)));

        Assert.assertEquals(merged(
                Map.of("A", 1),
                Map.of("A", 2)
        ), Map.of("A",  Set.of(1, 2)));

        Assert.assertEquals(merged(
                Map.of(),
                Map.of()
        ), Map.of());


    }
}

