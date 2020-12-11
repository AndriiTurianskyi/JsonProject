package JsonTask.steps;

import JsonTask.forCreateData.ReadJsonData;
import org.json.simple.JSONObject;
import JsonTask.forCreateData.VerifyChildCompanies;


public class IsExistsSteps {
    VerifyChildCompanies verifyChildCompanies;
    JSONObject childCompanies;
    JSONObject jsonDataObj;
    boolean isExists;
    public boolean check(Object company){
        jsonDataObj=(new ReadJsonData()).getJsonObject();
        childCompanies=(new VerifyChildCompanies()).getChildCompanies();
        verifyChildCompanies=new VerifyChildCompanies();
        isExists=verifyChildCompanies.isExists(company);
        return isExists;
    }
}

