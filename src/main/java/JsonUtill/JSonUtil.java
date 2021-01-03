package JsonUtill;

import Model.Codebeautify;
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
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return  jSonJava;
    }
}
