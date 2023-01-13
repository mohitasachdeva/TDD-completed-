
public class Exception extends RuntimeException {
    public enum ExceptionType {
        ENTER_VALID_INPUT
    }

    public ExceptionType type;

    public Exception(ExceptionType type, String message) {
        super((message));
        this.type = type;
    }
}
