package pattern.prototype;

/**
 * Created by Jack on Mar 10:50 PM, 2019
 **/
public class TestPrototypePattern {

    public static void main(String [] args){
        AccessControl userAccessControl = AccessControlProvider.getAccessControlObject("USER");
        User user = new User("User A","User Level", userAccessControl);
        System.out.println("****************************");
        System.out.println(user);

        userAccessControl = AccessControlProvider.getAccessControlObject("USER");
        user = new User("User B", "User Level", userAccessControl);
        System.out.println("Changing access control of: "+ user.getUserName());
        user.getAccessControl().setAccess("READ REPORTS");
        System.out.println(user);
        System.out.println("*****************************");

        AccessControl manageAccessControl = AccessControlProvider.getAccessControlObject("MANAGER");
        user = new User("User C", "MANAGER LEVEL", manageAccessControl);
        System.out.println(user);
    }
}
