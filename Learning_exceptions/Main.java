package Learning_exceptions;

public class Main {

    public static void main(String[] args){

    AccessControlList acl = new AccessControlList();

    Permissions p1 = new Permissions(false,false,false);
    Permissions p2 = new Permissions(false,true,false);
    Permissions p3 = new Permissions(false,true,true);
    Permissions p4 = new Permissions(true,false,false);
    Permissions p5 = new Permissions(true,true,false);
    Permissions p6 = new Permissions(true,true,true);

    Subject s1 = new Subject("Tom");

    System.out.println("__________________");

    System.out.println(acl);

    try{
        acl.grantPermissions(s1, p6);
    } catch (CannotChangePermissionsException ex){
        System.out.println(ex + "Cannot have dublicate Permission.");
    }

    // try{
    //     acl.grantPermissions(s1, p5);
    // } catch (CannotChangePermissionsException ex){
    //     System.out.println(ex + "Cannot have dublicate Permission.");
    // }

    try{
        acl.getPermissions(s1);
    } catch (HasNoPermissionsException ex){
        System.out.println(ex);
    }
    System.out.print("Does the subject have full access? ");
    System.out.println(acl.hasFullAccess(s1));
    System.out.println(s1.toString());
    //System.out.println(acl.toString());
    System.out.println("this" + acl);

    }
}