package pattern.mediator;

/**
 * Created by Jack on Feb 9:20 PM, 2019
 **/
public class Sensor {

    public boolean checkTemperature(int temp){
        System.out.println("Temperature reached " + temp + " *C");
        return true;
    }
}
