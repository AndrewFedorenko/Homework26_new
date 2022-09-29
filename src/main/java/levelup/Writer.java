package levelup;

import org.xml.sax.SAXException;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void writeToFile(String str) throws SAXException {
        try {
            FileWriter fw = new FileWriter("Configuration.java", true);
            fw.write(str);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
