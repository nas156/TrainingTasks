package model.my_exception;

public class MyException extends Exception {
    private String existingName;

    public MyException(String exceptionMessage,String existingName){
        super(exceptionMessage);
        this.existingName = existingName;
    }

    public String getExistingLogin() {
        return existingName;
    }

}
