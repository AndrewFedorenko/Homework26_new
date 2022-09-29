package levelup;

import org.xml.sax.Attributes;

public class Element_operation implements Element{
    @Override
    public String printStart(Attributes attributes) {
        return attributes.getValue("variable") + " = " +
                attributes.getValue("value") + ";\n";
    }

    @Override
    public String printEnd() {
        return "";
    }
}
