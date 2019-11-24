package HW1;

class View {

    // Text's constants
    static final String INPUT_HELLO = "Input \"Hello\" = ";
    static final String INPUT_JAVA = "Input \"Java!\" = ";
    static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    static final String EXPECTED_INPUT_HELLO = "Hello";
    static final String EXPECTED_INPUT_JAVA = "Java!";

    void printMessage(String message){
        System.out.println(message);
    }

    void printHelloJava(String helloJava){
        System.out.println("\n" + helloJava);
    }


}