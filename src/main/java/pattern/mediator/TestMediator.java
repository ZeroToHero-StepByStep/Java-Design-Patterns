package pattern.mediator;

/**
 * Created by Jack on Feb 9:39 PM, 2019
 *
 * The Mediator design pattern should be your fist choice any time you have a set of objects that are
 * tightly coupled. If every one of a series of objects has to know the internal of other objects, and
 * maintaining those relationships becomes a problem, think of Mediator.
 *
 * Using a Mediator means the interaction code has to reside in only one place, and that makes it easier
 * to maintain. Using a mediator can hide a more serious problem: If you have any objects that are too
 * tightly coupled, your encapsulation may be faulty. It might be time to rethink how you've broken your
 * program into objects. 
 **/
public class TestMediator {

    public static void main(String [] args){
        MachineMediator mediator;
        Sensor sensor = new Sensor();
        SoilRemoval soilRemoval = new SoilRemoval();
        Machine machine = new Machine();
        Heater heater = new Heater();
        Valve valve = new Valve();
        Button button = new Button();
        Motor motor = new Motor();
        mediator = new CottonMediator(machine, heater, motor, sensor, soilRemoval,valve);
        button.setMediator(mediator);
        machine.setMediator(mediator);
        heater.setMediator(mediator);
        valve.setMediator(mediator);

        button.press();

        System.out.println();

        mediator = new DeniMediator(machine,heater,motor,sensor,soilRemoval,valve);
        button.setMediator(mediator);
        machine.setMediator(mediator);
        heater.setMediator(mediator);
        valve.setMediator(mediator);

        button.press();


    }
}
