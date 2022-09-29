package levelup;


import org.reflections.Reflections;
import org.reflections.scanners.Scanners;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class ConfigurationSAXParser extends DefaultHandler {
    static ElementsFactory elFactory;
    @Override
    public void startDocument() throws SAXException {
        elFactory = ElementsFactory.GetFactory();
    }
    @Override
    public void endDocument() throws SAXException {
        System.out.println(elFactory.returnAllString());
        Writer.writeToFile(elFactory.returnAllString());
    }
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        elFactory.SetStartTag(qName, attributes);
    }
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException{
        elFactory.SetEndTag(qName);
    }
}
