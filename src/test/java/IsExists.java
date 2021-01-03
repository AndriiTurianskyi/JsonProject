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
        Assert.assertTrue(jSon.jSonToJava().getManufacturers().getChildCompanies().contains(google));
        Assert.assertFalse(jSon.jSonToJava().getManufacturers().getChildCompanies().contains(apple));
    }
}
