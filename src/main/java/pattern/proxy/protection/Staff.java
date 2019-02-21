package pattern.proxy.protection;

/**
 * Created by Jack on Feb 8:16 PM, 2019
 **/
public interface Staff {

    boolean isOwner();

    void setReportGenerator(ReportGeneratorProxy reportGeneratator);

}
