import Model.Taxes.IncomeTax;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestingIncomeTax {
    static IncomeTax incomeTax;

    @BeforeClass
    public static void runner(){
        incomeTax = new IncomeTax(15000, 1, 900);
    }

    @Test
    public void equalsTestForTrue(){
        IncomeTax incomeTax1 = new IncomeTax(15000, 1, 900);
        Assert.assertTrue(incomeTax1.equals(incomeTax));
    }

    @Test
    public void equalsTestForFalse(){
        IncomeTax incomeTax1 = new IncomeTax(15001,1,900);
        Assert.assertFalse(incomeTax1.equals(incomeTax));
    }

    @Test
    public void hashCodeTest(){
        int expected = 14415931;
        int real = incomeTax.hashCode();
        Assert.assertEquals(expected, real);
    }

    @Test
    public void countTaxToPayTest(){
        double expected = 2918.4;
        double real = incomeTax.getTaxToPay();
        Assert.assertEquals(expected, real, 0.0001);
    }
}
