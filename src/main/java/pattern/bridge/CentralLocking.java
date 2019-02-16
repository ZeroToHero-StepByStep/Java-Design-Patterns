package pattern.bridge;

/**
 * Created by jackz on Feb 8:41 AM, 2019
 **/
public class CentralLocking implements Product {

    private final String productName;

    public CentralLocking(String productName){
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Central Locking System");
    }
}


