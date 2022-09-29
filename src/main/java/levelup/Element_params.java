package levelup;

import org.xml.sax.Attributes;

public class Element_params implements Element{
    @Override
    public String printStart(Attributes attributes) {
        return "(";
    }

    @Override
    public String printEnd() {
        return ")";
    }
}
