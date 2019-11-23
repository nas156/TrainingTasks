package HW3.RewritedGame;

public class View {
    public static final String WRONG_INPUT_MESSAGE = "Wrong input! Try again: ";
    public static final String EQUAL_SING = "=";
    public static final String SPACE_SING = " ";
    public static final String OPENS_SQUARE_BRACKET = "]";
    public static final String CLOSING_SQUARE_BRACKET = "[";
    public static final String INPUT_INT_DATA = "Input INT value ";
    public static final String CONGRATULATION = "CONGRATULATION! You WIN! Secret value = ";
    public static final String YOUR_WAY = "YOUR WAY = ";


    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concatenateString(String... strings) {
        StringBuilder concString = new StringBuilder();
        for (String s : strings) {
            concString.append(s);
        }
        return concString.toString();
    }
}
