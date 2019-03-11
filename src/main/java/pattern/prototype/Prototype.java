package pattern.prototype;

/**
 * Created by Jack on Mar 10:26 PM, 2019
 **/
public interface Prototype extends Cloneable {

    AccessControl clone() throws CloneNotSupportedException;
}
