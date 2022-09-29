package levelup;

import org.reflections.Reflections;
import org.reflections.scanners.Scanners;
import org.xml.sax.Attributes;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ElementsFactory {
    private static ElementsFactory elementFactory;
    private static Map<String, Element> classContainer = new HashMap<>();

    private StringBuilder sb = new StringBuilder();
    static {
        classContainer = initClassContainer();
    }
    private ElementsFactory(){}
    public static synchronized ElementsFactory GetFactory(){
        if (elementFactory==null){
            elementFactory=new ElementsFactory();
        }
        return elementFactory;
    }
    public void SetStartTag(String tagName, Attributes attr){
        Element value = classContainer.get(tagName);
        if (value==null){return;}
        sb.append(value.printStart(attr));
    }
    public void SetEndTag(String tagName){
        Element value = classContainer.get(tagName);
        if (value==null){return;}
        sb.append(value.printEnd());
    }
    public String returnAllString(){
        return sb.toString();
    }
    public static Map<String, Element> initClassContainer(){
        Reflections ref = new Reflections("levelup", Scanners.SubTypes);
        Class[] cl = new Class[0];
        for (Class elem:ref.getSubTypesOf(Element.class).toArray(cl)){
            Constructor<? extends Element> constructor = null;
            try {
                constructor = elem.getDeclaredConstructor();
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            try {
                    classContainer.put(
                            elem.getName().replace("Element_","").replace("levelup.",""),
                            constructor.newInstance());
                } catch (InstantiationException|IllegalAccessException|InvocationTargetException e) {
                    throw new RuntimeException(e);
            }
        }
        return classContainer;
    }
}
