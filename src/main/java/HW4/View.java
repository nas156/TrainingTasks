package HW4;

public class View {
    public static final String MESSAGE_TO_INPUT_SURNAME = "Input your surname: ";
    public static final String MESSAGE_TO_INPUT_NAME = "Input your name: ";
    public static final String MESSAGE_TO_INPUT_THIRD_NAME = "Input your third name: ";
    public static final String MESSAGE_TO_INPUT_NICKNAME = "Input your nickname: ";
    public static final String MESSAGE_TO_INPUT_COMMENT = "Input comment: ";
    public static final String MESSAGE_TO_INPUT_GROUP = "Input your group Admin(A) or User(U): ";
    public static final String MESSAGE_TO_INPUT_HOME_PHONE = "Input home phone number(8 digits): ";
    public static final String MESSAGE_TO_INPUT_CELLPHONE = "Input cellphone number(+380xxxxxxxxx): ";
    public static final String MESSAGE_TO_INPUT_SECOND_CELLPHONE = "Input second cellphone number(unnecessary type:\"-\"): ";
    public static final String MESSAGE_TO_INPUT_EMAIL = "Input your email address: ";
    public static final String MESSAGE_TO_INPUT_SKYPE = "Input your skype: ";
    public static final String MESSAGE_TO_INPUT_INDEX = "Input post index: ";
    public static final String MESSAGE_TO_INPUT_CITY = "Input your city: ";
    public static final String MESSAGE_TO_INPUT_STREET = "Input your street: ";
    public static final String MESSAGE_TO_INPUT_FLAT_NUMBER = "Input your flat number: ";
    public static final String MESSAGE_TO_INPUT_HOUSE_NUMBER = "Input your house number: ";
    public static final String MESSAGE_TO_INPUT_DATE_OF_INSERTING = "Input inserting date(x.x.20xx): ";
    public static final String MESSAGE_TO_INPUT_DATE_OF_UPDATING = "Input changing date(x.x.20xx): ";
    public static final String SPACE_BLANK = " ";
    public static final String DOT = ".";
    public static final String COMMA = ",";


    public void printMessageAboutWrongInput(String message) {
        System.out.println("Wrong input. " + message);
    }


    public void printMessage(String message) {
        System.out.println(message);
    }
}
