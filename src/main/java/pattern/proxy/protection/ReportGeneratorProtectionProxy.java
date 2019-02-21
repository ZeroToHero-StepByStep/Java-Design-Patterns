package pattern.proxy.protection;

import pattern.proxy.remote.ReportGenerator;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by Jack on Feb 8:27 PM, 2019
 **/
public class ReportGeneratorProtectionProxy implements ReportGeneratorProxy {

    ReportGenerator reportGenerator;
    Staff staff;

    public ReportGeneratorProtectionProxy(Staff staff){
        this.staff = staff;
    }

    @Override
    public String generateDailyReport() {
        if(staff.isOwner()){
            ReportGenerator reportGenerator = null;
            try {
                reportGenerator = (ReportGenerator) Naming.lookup("rmi://127.0.0.1/PizzaCoRemoteGenerator");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "";
        }
        else{
            return "Not Authorized to view report.";
        }
    }
}
