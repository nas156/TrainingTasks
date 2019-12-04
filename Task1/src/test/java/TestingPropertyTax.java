import Model.Taxes.PropertyTax;
import Model.User.Property;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestingPropertyTax {
    static PropertyTax propertyTax;
    @BeforeClass
    public static void runner(){
        propertyTax = new PropertyTax(3700,0, Property.CAR);
    }

    @Test
    public void hashCodeTest(){
        int expected = 5929700;
        int real = propertyTax.hashCode();
        Assert.assertEquals(expected,real);
    }

    @Test
    public void equalsTestForTrue(){
        PropertyTax propertyTax1 = new PropertyTax(3700,0,Property.CAR);
        Assert.assertTrue(propertyTax1.equals(propertyTax));
    }

    @Test
    public void equalsTestForFalse(){
        PropertyTax propertyTax1 = new PropertyTax(3700,1, Property.CAR);
        Assert.assertFalse(propertyTax1.equals(propertyTax));
    }

    @Test
    public void countTaxToPayTest(){
        double expected = 12240.0;
        double real = propertyTax.getTaxToPay();
        Assert.assertEquals(expected, real, 0.0000001);
    }
}
