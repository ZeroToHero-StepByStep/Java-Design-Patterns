package pattern.builder;

/**
 * Created by Jack on Feb 9:02 PM, 2019
 **/
public class CarDirector {

    CarBuilder carBuilder;
    public CarDirector(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public Car build(){
        this.carBuilder.buildBodyStyle();
        this.carBuilder.buildPower();
        this.carBuilder.buildEngine();
        this.carBuilder.buildBreaks();
        this.carBuilder.buildSeats();
        this.carBuilder.buildWindows();
        this.carBuilder.buildFuelType();
        return this.carBuilder.getCar();
    }

}
