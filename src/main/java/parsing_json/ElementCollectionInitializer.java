package parsing_json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;


public class ElementCollectionInitializer {
    public static ElementCollection generate() throws IOException {
        Gson gson = new Gson();
        Type type = new TypeToken<ElementCollection>() {
        }.getType();
        ClassLoader classLoader = new ElementCollectionInitializer().getClass().getClassLoader();
        File file = new File(classLoader.getResource("periodic_table.json").getFile());

        JsonReader reader = new JsonReader(new FileReader(file));
        ElementCollection elements = gson.fromJson(reader, type);

        // loads the json from the file periodic_table.json into an Element Collection
        return elements; //Return Element collection
    }
}
