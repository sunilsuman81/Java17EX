import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadJson {

    public static void main(String[] args) {
        String jsonFilePath = "path/to/your/json/file.json"; // Replace with your file path
        StringBuilder jsonContent = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(jsonFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                jsonContent.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONObject jsonObject = new JSONObject(jsonContent.toString());
        System.out.println(jsonObject.toString(4)); // Pretty print JSON with 4-space indentation
    }
}
