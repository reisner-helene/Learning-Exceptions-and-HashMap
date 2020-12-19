package Learning_exceptions;

public class HasNoPermissionsException extends Exception {

    private static final long serialVersionUID = 1L;

    public HasNoPermissionsException(String message) {
        super (message);
    }
}
