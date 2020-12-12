package JsonTask.steps;


public class IsExists {

    public boolean check(Object company){
        VerifyChildCompanies verifyChildCompanies=new VerifyChildCompanies();
        return verifyChildCompanies.isExistsCompany(company);

    }
}

