package levelup;

import org.xml.sax.Attributes;

public interface Element {
    String printStart(Attributes attributes);
    String printEnd();
}
