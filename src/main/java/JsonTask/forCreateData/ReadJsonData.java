package JsonTask.forCreateData;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJsonData {
    private JSONObject jsonObject;
    public ReadJsonData(){
        getJsonObjectJsonData();
    }

    private void  getJsonObjectJsonData() {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("src\\main\\resources\\jsonTask.json"));
            jsonObject = (JSONObject) obj;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

}
