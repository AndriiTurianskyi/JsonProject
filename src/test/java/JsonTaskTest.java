import JsonTask.forCreateData.Company;
import JsonTask.forCreateData.CreateCompanies;
import JsonTask.steps.IsExists;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JsonTaskTest {
//    @DataProvider
//    public Object[][] hardcodeCompany() {
//        return new Object[][]{
//                {"Google", (new CreateCompanies()).getGoogle()},
//                {"Apple", (new CreateCompanies()).getApple()}
//        };
//    }

    @Test
    public void verifyIfGoogleExistsInJsonData() {
        IsExists isExistsSteps = new IsExists();
        Company google= (new CreateCompanies()).getGoogle();
        Assert.assertTrue(isExistsSteps.check(google));
    }

    @Test
    public void verifyIfAppleExistsInJsonData() {
        IsExists isExistsSteps = new IsExists();
        Company apple= (new CreateCompanies()).getApple();
        Assert.assertFalse(isExistsSteps.check(apple));
    }
}
