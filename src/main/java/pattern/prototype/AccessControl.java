package pattern.prototype;

/**
 * Created by Jack on Mar 10:27 PM, 2019
 **/
public class AccessControl implements Prototype{

    private final String controlLevel;
    private String access;

    public AccessControl(String controlLevel, String access){
        this.controlLevel = controlLevel;
        this.access = access;
    }

    @Override
    public AccessControl clone() throws CloneNotSupportedException {

        try{
            return (AccessControl)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }

    public String getControlLevel(){
        return controlLevel;
    }

    public String getAccess(){
        return access;
    }

    public void setAccess(String access){
        this.access = access;
    }
}
