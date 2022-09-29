package levelup;

import org.xml.sax.Attributes;

public class Element_body implements Element{
    @Override
    public String printStart(Attributes attributes) {
        return "{\n";
    }

    @Override
    public String printEnd() {
        return "}\n";
    }
}
