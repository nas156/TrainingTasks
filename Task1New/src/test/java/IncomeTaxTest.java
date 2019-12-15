import model.entity.tax.IncomeTax;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class IncomeTaxTest {
    static IncomeTax incomeTax;

    @BeforeClass
    public static void runner(){
        incomeTax = new IncomeTax(15000, 1, 900);
    }

    @Test
    public void countTaxToPayTest(){
        double expected = 2918.4;
        double real = incomeTax.getTaxToPay();
        Assert.assertEquals(expected, real, 0.0001);
    }
}
