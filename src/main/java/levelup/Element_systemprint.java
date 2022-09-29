package levelup;

import org.xml.sax.Attributes;

public class Element_systemprint implements Element{
    @Override
    public String printStart(Attributes attributes) {
        String[] args = attributes.getValue("arg").split(",");
        StringBuilder resultString = new StringBuilder("System.out.println(");
        for (int i = 0; i < args.length; i++) {
            resultString.append((i==0?"":" + \" \" + ") + args[i]);
        }
        return resultString.append(");\n").toString();
    }

    @Override
    public String printEnd() {
        return "";
    }
}
