package pattern.bridge;

/**
 * Created by jackz on Feb 8:58 AM, 2019
 * The Bridge Pattern decouples the interface and the implementation.
 * The implementation of an abstraction can be configured at run-time.
 * It also eliminates compile-time dependencies on the implementation.
 * Changing an implementation class doesn't required recompiling the
 * abstraction class. Client only needs to know the abstraction and you
 * hide the implementation from them.
 **/
public class TestBridgePattern {

    public static void main(String []args){
        Product product1 = new CentralLocking("Central Locking System");
        Product product2 = new GearLocking("Gear Locking System");
        Car car = new BigWheel(product1, "Big Wheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        System.out.println();

        car = new BigWheel(product2, "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        System.out.println();

        car = new Motoren(product1, "Motoren 1m model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new Motoren(product2, "Motoren 1m model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
    }
}


