package pattern.mediator;

/**
 * Created by Jack on Feb 8:07 PM, 2019
 **/
public class Valve implements Colleague {

    public MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void open(){
        System.out.println("Valve is opened ...");
        System.out.println("Filling water ...");
        mediator.close();
    }

    public void closed(){
        System.out.println("Valve is closed ...");
        mediator.on();
    }

}
