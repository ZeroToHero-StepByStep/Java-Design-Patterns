package pattern.proxy.protection;

/**
 * Created by Jack on Feb 8:31 PM, 2019
 **/
public class TestProtectionProxy {

    public static void main(String []args){
        Owner owner = new Owner();
        ReportGeneratorProtectionProxy reportGenerator = new ReportGeneratorProtectionProxy(owner);
        owner.setReportGenerator(reportGenerator);

        Employee employee = new Employee();
        reportGenerator = new ReportGeneratorProtectionProxy(employee);
        employee.setReportGenerator(reportGenerator);
        System.out.println("For owner:");
        System.out.println(owner.generateDailyReport());
        System.out.println("For employee");
        System.out.println(employee.generatorDailyReport());

    }
}
