package myList.CapacityExceededEcpeption;

public class CapacityExceededException extends RuntimeException {
    CapacityExceededException(){
        super();
    }

    public CapacityExceededException(String message){
        super(message);
    }
}
