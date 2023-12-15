package bridge.util;

public class ErrorMessage {
    private static final String ERROR_HEAD = "[ERROR]" ;

    public static void throwError(String errorMessage){
        System.out.println(ERROR_HEAD + errorMessage);
        throw new IllegalArgumentException();
    }

}