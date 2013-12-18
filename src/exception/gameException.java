package exception;

/**
 *
 * @author Robert
 */
public class gameException extends Exception {

    public gameException() {
    }

    public gameException(String message) {
        super(message);
    }
     public gameException(String message, Throwable cause) {
        super(message, cause);
    }

    public gameException(Throwable cause) {
        super(cause);
    }
}
