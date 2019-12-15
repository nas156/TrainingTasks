import model.entity.tax.PropertyTax;
import model.entity.user.UserProperty;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PropertyTaxTest {
    static PropertyTax propertyTax;

    @BeforeClass
    public static void runner(){
        propertyTax = new PropertyTax(3700,0, UserProperty.CAR);
    }

    @Test
    public void countTaxToPayTest(){
        double expected = 1224.0;
        double real = propertyTax.getTaxToPay();
        Assert.assertEquals(expected, real, 0.0000001);
    }
}
