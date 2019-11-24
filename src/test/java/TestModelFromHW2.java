import HW2.Model;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestModelFromHW2 {
    private static Model m;

    @BeforeClass
    public static void runT() {
        m = new Model();
        m.setNumberToGuess(10, 12);
    }

    @Test
    public void testMyRand() {
        int a = m.myRand(10, 19);
        Assert.assertTrue(a >= 10 && a <= 19);
    }

    @Test
    public void testAnalyzeForBiggerInput() {
        boolean a = m.analyzeForBiggerInput(17);
        Assert.assertTrue(a);
    }

    @Test
    public void testAnalyzeForLowerInput() {
        boolean a = m.analyzeForLowerInput(7);
        Assert.assertTrue(a);
    }
}
