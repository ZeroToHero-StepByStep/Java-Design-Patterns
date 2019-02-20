package pattern.proxy.virtual;

import java.util.List;

/**
 * Created by Jack on Feb 10:10 PM, 2019
 **/
public class ContactListProxyImpl implements ContactList {

    private ContactList contactList;
    @Override
    public List<Employee> getEmployeeList() {
        if(contactList == null){
            System.out.println("Creating contact list and fetching list of employees ...");
            contactList = new ContactListImpl();
        }
        return contactList.getEmployeeList();
    }




}
