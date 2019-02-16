package pattern.bridge;

/**
 * Created by jackz on Feb 8:45 AM, 2019
 **/
public class GearLocking implements Product{

    private final String productName;

    public GearLocking(String productName){
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Gear Locking System");
    }
}


