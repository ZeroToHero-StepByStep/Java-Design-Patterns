package pattern.mediator;

/**
 * Created by Jack on Feb 8:03 PM, 2019
 **/
public class Button implements Colleague{

    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void press(){
        System.out.println("Button pressed.");
        mediator.start();
    }

}
