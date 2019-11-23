import HW3.RewritedGame.Model;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestModel {
    static Model model;

    @BeforeClass
    public static void runT() {
        model = new Model();
        model.setSecreteValue(50);
    }

    @Ignore
    public void testRandom() {
        int i = 0;
        while (i < 100000) {
            int num = model.myRand();
            Assert.assertTrue((num > 0) && (num < 100));
            i++;
        }
    }

    @Test
    public void testAnalyzeInputForBigger() {
        boolean b = model.analyzeInput(60);
        Assert.assertTrue(b);
    }

    @Test
    public void testAnalyzeInputForLower() {
        boolean b = model.analyzeInput(40);
        Assert.assertTrue(b);

    }

    @Test
    public void testAnalyzeInputForRight() {
        boolean b = model.analyzeInput(50);
        Assert.assertFalse(b);
    }

}
