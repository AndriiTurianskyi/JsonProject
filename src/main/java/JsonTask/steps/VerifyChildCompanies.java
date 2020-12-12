package JsonTask.steps;

import JsonTask.forCreateData.ReadJsonData;
import org.json.simple.JSONObject;

import java.util.Set;

public class VerifyChildCompanies {

    private JSONObject getChildCompanies() {
        JSONObject jsonData=(new ReadJsonData()).getJsonObject();
        return (JSONObject) ((JSONObject) jsonData.get("manufacturers")).get("childCompanies");
    }

    public boolean isExistsCompany(Object company) {
        boolean isContains = false;
        Set<Object> list = getChildCompanies().entrySet();
        for (Object childCompanies : list) {
            if (childCompanies.toString().equals(company.toString())) {
                isContains = true;
            }
        }
        return isContains;
    }
}
