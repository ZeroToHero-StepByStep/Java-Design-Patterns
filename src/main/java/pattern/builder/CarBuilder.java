package pattern.builder;

/**
 * Created by Jack on Feb 7:53 PM, 2019
 **/
public interface CarBuilder {

    void buildBodyStyle();
    void buildPower();
    void buildEngine();
    void buildBreaks();
    void buildSeats();
    void buildWindows();
    void buildFuelType();
    Car getCar();
}
