package JsonTask.steps;

import JsonTask.forCreateData.VerifyChildCompanies;


public class IsExistsSteps {
    VerifyChildCompanies verifyChildCompanies;
    boolean isExists;
    public boolean check(Object company){
        verifyChildCompanies=new VerifyChildCompanies();
        isExists=verifyChildCompanies.isExistsCompany(company);
        return isExists;
    }
}

