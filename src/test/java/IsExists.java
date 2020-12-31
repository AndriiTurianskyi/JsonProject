import JsonUtill.JSonUtil;
import Model.Company;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class IsExists {
    @Test
    public void test1(){
        //init Google company
        Company google=new Company();
        google.setAddress("Google Address");
        google.setState("FL");
        google.setPhone("133756");

        //init Apple company
        Company apple=new Company();
        apple.setAddress("Apple Address");
        apple.setState("Fn");
        apple.setPhone("3756");

        JSonUtil jSon=new JSonUtil();
        Assert.assertTrue(isExistsInchildCompany(jSon.jSonToJava().getManufacturers().getChildCompanies(),google));
        Assert.assertFalse(isExistsInchildCompany(jSon.jSonToJava().getManufacturers().getChildCompanies(),apple));
    }
    public boolean isExistsInchildCompany(List<Company> childCompany, Company verifyCompany){
        for (Company company:childCompany){
            if (company.equals(verifyCompany)){
                return true;
            }
        }
        return false;
    }
}
