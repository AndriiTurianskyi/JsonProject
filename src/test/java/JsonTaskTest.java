import JsonTask.forCreateData.Company;
import JsonTask.forCreateData.CreateCompanies;
import JsonTask.steps.IsExistsSteps;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
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
        IsExistsSteps isExistsSteps = new IsExistsSteps();
        Company google= (new CreateCompanies()).getGoogle();
        Assert.assertTrue(isExistsSteps.check(google));
    }

    @Test
    public void verifyIfAppleExistsInJsonData() {
        IsExistsSteps isExistsSteps = new IsExistsSteps();
        Company apple= (new CreateCompanies()).getApple();
        Assert.assertFalse(isExistsSteps.check(apple));
    }
}
