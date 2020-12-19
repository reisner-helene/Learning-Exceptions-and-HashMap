package Learning_exceptions;

import java.util.HashMap;
import java.util.Map;

public class AccessControlList {

    private Map<Subject, Permissions> perms;

    public AccessControlList() {
        Map<Subject, Permissions> perms = new HashMap();     
        this.perms = perms;
    }

    public boolean hasReadPermission(Subject subject){
        return perms.get(subject).canRead();
    }

    public boolean hasFullAccess(Subject subject){
        return perms.get(subject).canRead()
            && perms.get(subject).canWrite()
            && perms.get(subject).canExecute();
    }

    public void grantPermissions(Subject subject, Permissions permissions) throws CannotChangePermissionsException {

        if (perms.containsKey(subject)){     

            if(perms.get(subject).canRead() && permissions.canRead() || 
                    perms.get(subject).canWrite() && permissions.canWrite() || 
                    perms.get(subject).canExecute() && permissions.canExecute()) {
                        throw new CannotChangePermissionsException("One of these Persmissons are already assigned to the subject, so granting permissions failed. ");
                            } else {
                                perms.put(subject, permissions); 
                            } 

            } else {
                perms.put(subject, permissions); 
            }
    }

    public void getPermissions(Subject subject) throws HasNoPermissionsException {
        if(!perms.get(subject).canRead()
            && !perms.get(subject).canWrite()
            && !perms.get(subject).canExecute()) {
                System.out.println("__________________");
            throw new HasNoPermissionsException("Subject has no permissions associated.");  
            } else {
                Permissions p = perms.get(subject);
                System.out.println("Subject indeed has some permissions they are " + p);
            }
    }

}