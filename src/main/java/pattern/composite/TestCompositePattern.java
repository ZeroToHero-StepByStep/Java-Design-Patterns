package pattern.composite;

/**
 * Created by Jack on Feb 5:19 PM, 2019
 *
 * The Composite Pattern allows you to compose objects into a tree data structure in your code. There are variations
 * to the tree data structure, but sometimes there is a need of a tree in which both branches as well as leafs of the
 * the tree should be treated as uniformly.
 **/
public class TestCompositePattern {

    public static void main(String[] args){
        HtmlTag parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");

        HtmlTag p1 = new HtmlParentElement("<body>");
        p1.setStartTag("<body>");
        p1.setEndTag("</body>");

        parentTag.addChildTag(p1);
        HtmlTag child1 = new HtmlElement("<p>");
        child1.setStartTag("<p>");
        child1.setEndTag("</p>");
        child1.setTagBody("Testing html tag library");
        p1.addChildTag(child1);

        child1 = new HtmlElement("<p>");
        child1.setStartTag("<p>");
        child1.setEndTag("</p>");
        child1.setTagBody("Paragraph 2");
        p1.addChildTag(child1);
        parentTag.generateHtml();


    }
}
