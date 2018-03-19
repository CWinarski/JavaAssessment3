package user_management;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;

public class UserCollectionInitializer {
    public static UserCollection generate() throws IOException{
        Gson gson = new Gson();
        Type type = new TypeToken<UserCollection>() {
        }.getType();
        ClassLoader classLoader = new UserCollectionInitializer().getClass().getClassLoader();
        File file = new File(classLoader.getResource("users.json").getFile());

        JsonReader reader = new JsonReader(new FileReader(file));
        UserCollection users = gson.fromJson(reader, type);

        return users;
    }
}
