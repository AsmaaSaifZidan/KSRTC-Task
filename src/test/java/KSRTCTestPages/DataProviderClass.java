package KSRTCTestPages;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.util.Map;
public class DataProviderClass {

    @DataProvider(name = "getData")
    public static Object[][] getData() {
        return new Object[][] {
                { loadDataFromJson() }  // Load data from the JSON file
        };
    }

    // Helper method to read data from the JSON file
    public static Map<String, Object> loadDataFromJson() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new File("src/main/resources/KSRTCData.json"), new TypeReference<Map<String, Object>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
