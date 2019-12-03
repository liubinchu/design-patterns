package top.ericcliu.actional.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liubi
 **/
public class ObjectStructure {
    private List<Element> lists = new ArrayList<Element>();

    public void addElement(Element element)
    {
        lists.add(element);
    }

    public void deleteElement(Element element)
    {
        lists.remove(element);
    }

    public void Accept(Visitor visitor)
    {
        for (Element element : lists)
        {
            element.accept(visitor);
        }
    }
}
