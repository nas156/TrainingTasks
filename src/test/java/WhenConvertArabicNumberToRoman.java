import HW3.TDDCodeFromVideo.ArabicToRomanNumberConverter;
import org.junit.Assert;
import org.junit.Test;

public class WhenConvertArabicNumberToRoman {
    @Test
    public void Convert_0_To_EmptyString(){
        ArabicToRomanNumberConverter converter = new ArabicToRomanNumberConverter();

        String romanNumber = converter.convert(0);

        Assert.assertEquals("", romanNumber);
    }

    @Test
    public void Convert_1_To_I(){
        ArabicToRomanNumberConverter converter = new ArabicToRomanNumberConverter();

        String romanNumeber = converter.convert(1);

        Assert.assertEquals("I", romanNumeber);
    }
}
