package Learning_exceptions;

public class CannotChangePermissionsException extends Exception {

    private static final long serialVersionUID = 1L;

    public CannotChangePermissionsException(String message) {
        super (message); 
       }
}