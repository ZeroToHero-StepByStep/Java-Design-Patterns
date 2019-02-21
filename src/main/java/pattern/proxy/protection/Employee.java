package pattern.proxy.protection;

/**
 * Created by Jack on Feb 8:19 PM, 2019
 **/
public class Employee implements Staff {

    private ReportGeneratorProxy reportGenerator;
    @Override
    public boolean isOwner() {
        return false;
    }

    @Override
    public void setReportGenerator(ReportGeneratorProxy reportGenerator) {
            this.reportGenerator = reportGenerator;
    }


    public String generatorDailyReport(){
        try{
            return reportGenerator.generateDailyReport();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "";

    }
}
