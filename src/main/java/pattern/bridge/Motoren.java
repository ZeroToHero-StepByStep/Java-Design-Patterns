package pattern.bridge;

/**
 * Created by jackz on Feb 9:27 AM, 2019
 **/
public class Motoren extends Car {

    private final Product product;
    private final String carType;
    public Motoren(Product product, String carType){
        super(product,carType);
        this.product = product;
        this.carType = carType;
    }
    @Override
    public void assemble() {
        System.out.println("Assembling " + product.productName());
    }

    @Override
    public void produceProduct() {
        product.produce();
        System.out.println("Modifing prodcut " + product.productName() + " according to " + carType);
    }
}


