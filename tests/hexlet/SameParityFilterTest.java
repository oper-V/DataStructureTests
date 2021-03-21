package hexlet;

import static hexlet.SameParityFilter.same_parity_filter;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class SameParityFilterTest {

    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> listResult = new ArrayList<>();

    @Test
    public void testEmptyList() {

        Assert.assertEquals(same_parity_filter(list), listResult);
    }

    @Test
    public void testEvenParity() {

        list.addAll(Arrays.asList(5, 0, 1, -3, 10));
        listResult.addAll(Arrays.asList(5, 1, -3));
        Assert.assertTrue(same_parity_filter(list).containsAll(listResult));
    }

    @Test
    public void testNotEvenParity() {

        list.addAll(Arrays.asList(2, 0, 1, -3, 10, -2));
        listResult.addAll(Arrays.asList(2, 0, 10, -2));
        Assert.assertTrue(same_parity_filter(list).containsAll(listResult));
    }


}
