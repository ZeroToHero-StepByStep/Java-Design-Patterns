package pattern.proxy.protection;

/**
 * Created by Jack on Feb 8:23 PM, 2019
 **/
public class Owner implements Staff{

    private boolean isOwner = true;
    private ReportGeneratorProxy reportGenerator;
    @Override
    public boolean isOwner() {
        return isOwner;
    }

    @Override
    public void setReportGenerator(ReportGeneratorProxy reportGenerator) {
        this.reportGenerator =reportGenerator;
    }

    public String generateDailyReport(){
        try {

            return reportGenerator.generateDailyReport();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
}
