package pattern.chainofResponsibility;

/**
 * Created by Jack on Feb 7:32 PM, 2019
 *
 * The Chain of Responsibility pattern is a behaviour pattern in which a group of objects is chained
 * together in a sequence and a responsibility ( a request ) is provide in order to be handled by the
 * group. If an object in the group can process the particular request, it does not return the
 * corresponding response. Otherwise, it forwards the request to the subsequent object in the group.
 *
 * The intent of this pattern is avoid coupling the sender of a request to its receiver by giving more
 * than one object a chance to handle the request. We chain the receiving objects and pass the request
 * along the chain until an object handles it.
 **/
public class TestChainofResponsibility {

    public static void main(String []args){
        File file;
        Handler textHandler = new TextFileHandler("Text Handler");
        Handler docHandler = new DocFileHandler("Doc Handler");
        Handler excelHandler = new ExcelFileHandler("Excel Handler");
        Handler audioHandler = new AudioFileHandler("Audio Handler");
        Handler videoHandler = new VideoFileHandler("Doc Handler");
        Handler imageHandler = new ImageFileHandler("Image Handler");

        textHandler.setHandler(docHandler);
        docHandler.setHandler(excelHandler);
        excelHandler.setHandler(audioHandler);
        audioHandler.setHandler(videoHandler);
        videoHandler.setHandler(imageHandler);

        file =new File("Abc.mp3", "audio", "C:");
        textHandler.process(file);
        System.out.println();
        file =new File("Abc.jpg", "image", "C:");
        textHandler.process(file);

        System.out.println();
        file =new File("Abc.doc", "doc", "C:");
        textHandler.process(file);

        System.out.println();
        file =new File("Abc.bat", "bat", "C:");
        textHandler.process(file);


    }
}
