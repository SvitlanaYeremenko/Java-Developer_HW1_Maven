package module1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        User user = new User("Svitlana", "Yeremenko");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(user);

        System.out.println(json);
    }
}
