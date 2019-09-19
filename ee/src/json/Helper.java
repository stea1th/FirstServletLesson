package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.Book;

import java.io.File;
import java.io.IOException;

public class Helper {

    public boolean saveBookAsJson(Book book) {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("C:\\student.json");
        try {
            objectMapper.writeValue(file, book);
        } catch (IOException e) {
            return false;
        }
        return true;
    }

}
