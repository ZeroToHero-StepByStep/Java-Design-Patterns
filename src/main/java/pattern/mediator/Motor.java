package pattern.mediator;

/**
 * Created by Jack on Feb 9:55 PM, 2019
 **/
public class Motor {

    public void startMotor(){
        System.out.println("Start motor...");
    }

    public void rotateDrum(int number){
        System.out.println("Rotating drum at "+ number + " rpm");
    }


}
