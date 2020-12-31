import JsonUtill.JSonUtil;
import org.testng.annotations.Test;

public class IsExists {
    @Test
    public void test1(){
        //в процесі
        JSonUtil jSon=new JSonUtil();
        System.out.println(jSon.jSonToJava().getManufacturers().getChildCompanies());
        // Assert.assertTrue(jSon.jSonToJava().getManufacturers().getChildCompanies().toString());
    }
}
