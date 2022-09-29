package levelup;

import org.xml.sax.Attributes;

public class Element_type implements Element{
    @Override
    public String printStart(Attributes attributes) {
        return attributes.getValue("access_modifier") + " class " + attributes.getValue("name") + "{\n";
    }

    @Override
    public String printEnd() {
        return '\n' + "}";
    }
}
