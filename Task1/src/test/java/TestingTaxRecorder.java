import Model.PersonalTaxRecorder;
import Model.User.UserProperty;
import Model.User.User;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestingTaxRecorder {
    static User user;
    static PersonalTaxRecorder personalTaxRecorder;

    @BeforeClass
    public static void runner() {
        user = new User(70000, 3, 8000, UserProperty.values());
        personalTaxRecorder = new PersonalTaxRecorder(user);
    }

    @Test
    public void getFullTaxToPayTest() {
        double expected = 12444 + 1156 + 13005 + 10115 + 72.25;
        double real = personalTaxRecorder.getFullTaxToPay();
        Assert.assertEquals(expected, real, 0.00000001);
    }

}
