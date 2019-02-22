package pattern.chainofResponsibility;


/**
 * Created by Jack on Feb 6:59 PM, 2019
 **/
public class TextFileHandler implements Handler {

    private Handler handler;
    private String handlerName;


    public TextFileHandler(String handlerName){
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {
       if(file.getFileType().equals("text")){
           System.out.println("Process and saving txt file... by "+ handlerName);
       }
       else if (handler != null){
           System.out.println(handlerName + " forwards request to " + handler.getHandlerName());
           handler.process(file);
       }
       else{
           System.out.println("File not found");
       }

    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
