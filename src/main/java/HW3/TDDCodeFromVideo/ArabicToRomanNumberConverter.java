package HW3.TDDCodeFromVideo;

public class ArabicToRomanNumberConverter {
    public String convert(int arabicNumber){
        boolean noNumber = arabicNumber == 0;
        if (noNumber)
            return getDefaultRomanNumber();

        return getSimpleRomanNumber(arabicNumber);
    }

    private String getSimpleRomanNumber(int arabicNumber){
        String romanNumber = "";
        while (arabicNumber>=1){
            romanNumber +="I";
            arabicNumber--;
        }
        return romanNumber;
    }

    private String getDefaultRomanNumber(){
        return "";
    }
}
