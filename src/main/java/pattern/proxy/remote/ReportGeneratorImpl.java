package pattern.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

/**
 * Created by Jack on Feb 9:22 PM, 2019
 **/
public class ReportGeneratorImpl extends UnicastRemoteObject implements ReportGenerator{

    protected ReportGeneratorImpl() throws RemoteException {
    }

    @Override
    public String generateDailyReport() throws RemoteException {

        StringBuilder sb = new StringBuilder();
        sb.append("********************Location X Daily Report******************");
        sb.append("\\n Location ID: 012");
        sb.append("\\n Today's Date: " + new Date());
        sb.append("\\n Total Pizza's Sell: 112");
        sb.append("\\n Total Price: $2534");
        sb.append("\\n Net Profit: $1985");
        sb.append("*************************************************************");
        return sb.toString();
    }

    public static void main(String []args){
        try {
            ReportGenerator reportGenerator = new ReportGeneratorImpl();
            try {
                Naming.bind("PizzaCoRemoteGenerator", reportGenerator);
            } catch (AlreadyBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

}
