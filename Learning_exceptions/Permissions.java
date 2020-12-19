package Learning_exceptions;

public class Permissions {

    private boolean read;
    private boolean write;
    private boolean execute;

    public Permissions(boolean read, boolean write, boolean execute){
        this.read = read;
        this.write = write;
        this.execute = execute;
    }

    public boolean canRead() {
        return read;
    }

    public boolean canWrite() {
        return write;
    }

    public boolean canExecute() {
        return execute;
    }

    @Override
    public String toString() {
        return "Permissions [ " + read + ", " + write + ", " + execute + ", " + " ]";
    }

}
