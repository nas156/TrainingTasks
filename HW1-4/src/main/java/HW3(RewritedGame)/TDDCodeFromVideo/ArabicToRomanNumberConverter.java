package HW3.TDDCodeFromVideo;

import javafx.util.Pair;

import java.util.ArrayList;

public class ArabicToRomanNumberConverter {
    private ArrayList<Pair<Integer, String>> map;

    public ArabicToRomanNumberConverter(){
        map = new ArrayList<>();
        map.add(new Pair<Integer, String>(5, "V"));
        map.add(new Pair<Integer, String>(1, "I"));
    }

    public String convert(int arabicNumber) {
        boolean noNumber = arabicNumber == 0;
        if (noNumber)
            return getDefaultRomanNumber();

        String romanNumber = getRoughRomanNumber(arabicNumber);
        for (int i = 3; i < romanNumber.length(); i++){
            if (romanNumber.charAt(i-3)== romanNumber.charAt(i-2) &&
                    romanNumber.charAt(i-2) == romanNumber.charAt(i-2)&&
                    romanNumber.charAt(i-1) == romanNumber.charAt(i)) {
            }
        }
        return romanNumber;
    }

    private String getRoughRomanNumber(int arabicNumber) {
        String romanNumber = "";

        for (Pair<Integer, String> digit : map) {
            while (arabicNumber >= digit.getKey()) {
                romanNumber += digit.getValue();
                arabicNumber -= digit.getKey();
            }
        }
        return romanNumber;
    }

    private String getDefaultRomanNumber() {
        return "";
    }
}
