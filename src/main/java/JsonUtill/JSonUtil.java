package JsonUtill;

import Model.Codebeautify;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JSonUtil {
    public Codebeautify jSonToJava() {
        ObjectMapper mapper = new ObjectMapper();
        Codebeautify jSonJava = null;
        try {

            File json = new File("src\\main\\resources\\jsonTask.json");
            jSonJava  = mapper.readValue(json, Codebeautify.class);
        } catch (JsonGenerationException ex) {
            ex.printStackTrace();
        } catch (JsonMappingException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return  jSonJava;
    }
}
