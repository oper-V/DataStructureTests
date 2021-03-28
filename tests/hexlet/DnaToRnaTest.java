package hexlet;

import static hexlet.DnaToRna.dnaToRna;

import org.junit.Assert;
import org.junit.Test;

public class DnaToRnaTest {

    @Test
    public void testDnaToRna() {

        Assert.assertEquals(dnaToRna("ACNTG"), null);
        Assert.assertEquals(dnaToRna(""), "");
        Assert.assertEquals(dnaToRna("C"), "G");
        Assert.assertEquals(dnaToRna("G"), "C");
        Assert.assertEquals(dnaToRna("T"), "A");
        Assert.assertEquals(dnaToRna("A"), "U");
        Assert.assertEquals(dnaToRna("ACGTGGTCTTAA"), "UGCACCAGAAUU");
    }
}
