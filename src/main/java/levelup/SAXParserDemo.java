package levelup;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class SAXParserDemo {
    public static void main(String[] args) {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            saxParser.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("type.xml"),
                    new ConfigurationSAXParser());
        } catch (ParserConfigurationException | SAXException | IOException e){
            throw new RuntimeException(e);
        }
    }

    public static class Element_method implements Element{
        @Override
        public String printStart(Attributes attributes) {
            return attributes.getValue("access_modifier") + " " +
                    attributes.getValue("type") + " "+
                    attributes.getValue("return_type") + " " +
                    attributes.getValue("name");
        }
        @Override
        public String printEnd() {
            return "";
        }
    }
}
