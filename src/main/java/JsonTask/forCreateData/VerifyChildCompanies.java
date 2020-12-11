package JsonTask.forCreateData;

import org.json.simple.JSONObject;

import java.util.Set;

public class VerifyChildCompanies {
    private  JSONObject childCompanies;

    public JSONObject getChildCompanies() {
        JSONObject jsonData=(new ReadJsonData()).getJsonObject();
        childCompanies=(JSONObject) ((JSONObject) jsonData.get("manufacturers")).get("childCompanies");
        return childCompanies;
    }

    public boolean isExists(Object company) {
        boolean isContains = false;
        Set list = getChildCompanies().entrySet();
        for (Object childCompanies : list) {
            if (childCompanies.toString().equals(company.toString())) {
                isContains = true;
            }
        }
        return isContains;
    }
}
