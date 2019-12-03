import Model.Taxes.Tax;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestingTaxes {
    static Tax tax;
    @BeforeClass
    public static void runner(){
        tax = new Tax(10000, 2);
    }

    @Test
    public void hashCodeTest(){
        int expected = 310002;
        int real = tax.hashCode();
        Assert.assertEquals(expected, real);
    }

    @Test
    public void equalsTestForTrue(){
        Tax tax1 = new Tax(10000, 2);
        Assert.assertTrue(tax1.equals(tax));
    }

    @Test
    public void equalsTestForFalse(){
        Tax tax1 = new Tax(10001, 2);
        Assert.assertFalse(tax1.equals(tax));
    }

    @Test
    public void getTaxTest(){
        double expected = 1800;
        double real = tax.getTaxToPay();
        Assert.assertEquals(expected, real, 0);
    }

}
