package levelup;

import org.xml.sax.Attributes;

public class Element_field implements Element{
    @Override
    public String printStart(Attributes attributes) {
        return "static "+attributes.getValue("type") + " " + attributes.getValue("name");
    }

    @Override
    public String printEnd() {
        return ";\n";
    }
}
