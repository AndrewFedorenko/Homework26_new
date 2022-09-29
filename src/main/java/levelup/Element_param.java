package levelup;

import org.xml.sax.Attributes;

public class Element_param implements Element{
    @Override
    public String printStart(Attributes attributes) {
        return attributes.getValue("type") + " " +
                (attributes.getValue("isArray").toCharArray()[0]=='T'?"[]":"") + " " +
                attributes.getValue("name") ;
    }

    @Override
    public String printEnd() {
        return "";
    }
}
