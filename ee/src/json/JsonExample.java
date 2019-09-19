package json;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JsonExample {

    public static void main(String[] args) throws IOException {
        JsonObject jsonObject = new JsonExample().getJson();
        File file = new File("C:\\student.json");
        JsonWriter writer = Json.createWriter(new FileWriter(file));
        writer.writeObject(jsonObject);
        writer.close();
    }

    private JsonObject getJson() {
        return Json.createObjectBuilder()
                .add("Student", Json.createObjectBuilder()
                        .add("name", "Max")
                        .add("age", 22)
                        .add("adress", Json.createObjectBuilder()
                                .add("street", "Lenin")
                                .build())
                        .build())
                .build();
    }
}
