package pattern.mediator;

/**
 * Created by Jack on Feb 8:01 PM, 2019
 **/
public interface MachineMediator{
    void start();
    void wash();
    void open();
    void close();
    void on();
    void off();
    boolean checkTemperature(int temp);

}
