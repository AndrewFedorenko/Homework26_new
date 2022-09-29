package levelup;

import org.xml.sax.Attributes;

public class Element_method implements Element{
    @Override
    public String printStart(Attributes attributes) {
        return
        attributes.getValue("access_modifier")+" "+
                attributes.getValue("type")+" "+
                attributes.getValue("return_type") +" "+
                attributes.getValue("name");
    }

    @Override
    public String printEnd() {
        return "";
    }
}
