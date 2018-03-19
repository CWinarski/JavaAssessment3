package parsing_json;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class ElementCollection extends ArrayList<Element> {

    public ElementCollection() {

    }

    public Element findByAtomicNumber(int atomic_number)  {
        //returns element with that specific number
        for (Element element : this) {
            if (element.getNumber() == atomic_number) return element;
        }
       return null;
    }

    public Element findByName(String name) {
        // returns element with that specific name
        for (Element element : this){
            if (element.getName().equals(name)) return element;
        }
        return null;
    }

    public ElementCollection where(String fieldName, Object value) {
        /* if  element has the name field then the method goes through each element in
          the element collection and returns a new element collection which has
          all the elements whose fields match the object value.
          if no attribute is called field then the method returns an empty collection
        */
        ElementCollection newCollection = new ElementCollection();
        try {
            Field field = Element.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            for (Element element : this){
                if (element.getClass().getDeclaredField(fieldName).equals(fieldName) && field.getGenericType().equals(value)){
                   newCollection.add(element);
                   return newCollection;
                }
            }
        }catch (NoSuchFieldException e){
            e.getMessage();
            e.printStackTrace();
        }
        return null;
    }
}
