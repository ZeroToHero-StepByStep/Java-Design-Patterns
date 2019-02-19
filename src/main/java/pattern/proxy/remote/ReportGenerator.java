package pattern.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Jack on Feb 9:21 PM, 2019
 **/
public interface ReportGenerator extends Remote{

    String generateDailyReport() throws RemoteException;
}
