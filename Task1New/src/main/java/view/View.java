package view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    static final String MESSAGES_BUNDLE_NAME = "message";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ua", "UA"));
                    //new Locale("en"));

    public String concatenateString(String... strings){
        StringBuilder resultString = new StringBuilder();
        for (String str: strings) {
            resultString.append(str);
        }
        return resultString.toString();
    }

    public void printMessage(Object message){
        System.out.print(message);
    }

    public String getLocaledMessage(String message){
        return bundle.getString(message);
    }

}
