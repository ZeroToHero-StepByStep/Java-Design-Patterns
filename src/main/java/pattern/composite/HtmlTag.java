package pattern.composite;

import java.util.List;

/**
 * Created by Jack on Feb 4:55 PM, 2019
 **/
public abstract class HtmlTag {

    public abstract String getTagName();
    public abstract void setStartTag(String tag);
    public abstract void setEndTag(String tag);
    public void setTagBody(String tagBody){
        throw new UnsupportedOperationException("Current operation is not supported for this object");
    }

    public void addChildTag(HtmlTag htmlTag){
        throw new UnsupportedOperationException("Current operation is not supported for this object");
    }

    public void removeChildTag(HtmlTag htmlTag){
        throw new UnsupportedOperationException("Current operation is not supported for this object");
    }

    public List<HtmlTag> getChildren(){
        throw new UnsupportedOperationException("Current operation is not supported for this object");
    }

    public abstract void generateHtml();
}
