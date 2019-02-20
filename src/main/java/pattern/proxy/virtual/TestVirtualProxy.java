package pattern.proxy.virtual;

import java.util.List;

/**
 * Created by Jack on Feb 10:15 PM, 2019
 *
 * The Virtual Proxy pattern is a memory technique that recommends postponing an object creation until
 * it is needed; it is used when creating an object is expensive in terms of memory usage or processing
 * involved.
 *
 * In a typical application, different objects makes up different parts of functionality. When an application
 * is started, it may not need all of it objects to be available immediately. In such case, the Virtual
 * Proxy pattern suggests objects creation until it is needed by application. The object that the first time
 * is referenced in the application and the same time instance is reused from that point onwards.
 *
 * The advantage of this approach is a faster application start-up time, as it is not required to create
 * and load all of the application objects. 
 **/
public class TestVirtualProxy {


    public static void main(String [] args){
        ContactList contactList = new ContactListProxyImpl();
        Company company = new Company("ABC company", "Indian",
                "+91-011-28458965", contactList);
        System.out.println("Company Name:" + company.getCompanyName());
        System.out.println("Company Address:" + company.getCompanyAddress());
        System.out.println("Company Contact No.:" + company.getCompanyContactNo());

        System.out.println("Requesting for contact list");
        contactList = company.getContactList();
        List<Employee> empList = contactList.getEmployeeList();
        for(Employee emp: empList){
            System.out.println(emp);
        }


    }


}
