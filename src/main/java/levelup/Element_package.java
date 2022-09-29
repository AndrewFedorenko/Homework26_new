package levelup;

import org.xml.sax.Attributes;

public class Element_package implements Element{

    @Override
    public String printStart(Attributes attributes) {
        return "package " + attributes.getValue("name") + ";"+'\n';
    }

    @Override
    public String printEnd() {
        return "";
    }
}
