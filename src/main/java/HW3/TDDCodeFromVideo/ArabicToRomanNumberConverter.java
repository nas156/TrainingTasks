package HW3.TDDCodeFromVideo;

public class ArabicToRomanNumberConverter {
    public String convert(int arabicNumber){
        boolean noNumber = arabicNumber == 0;
        if (noNumber)
            return getDefaultRomanNumber();
        return "I";
    }

    private String getDefaultRomanNumber(){
        return "";
    }
}
