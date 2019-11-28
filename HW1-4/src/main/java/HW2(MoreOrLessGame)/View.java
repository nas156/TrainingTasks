package HW2;

public class View {

    public static final String WRONG_INPUT_MESSAGE = "Wrong input! Please input int value: ";
    public static final String MESSAGE_ABOUT_LOWER = "Real number is lower";
    public static final String MESSAGE_ABOUT_BIGGER = "Real number is bigger";
    public static final String WRONG_RANGE_MESSAGE = "You are out of range, please guess again: ";
    public static final String CONGRATULATION_MESSAGE = "You are right! Congratulations!!! ";
    public static String userGuessesInfo = "Your guesses:";

    public void inputMessage(int min, int max) {
        System.out.printf("Make a guess from %s to %s: ", min, max);
    }

    public void printMessage(String mes) {
        System.out.println(mes);
    }

    public String updateUserInfo(int a) {
        return userGuessesInfo += " " + a;
    }

}