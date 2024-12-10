import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.File;
import java.sql.SQLOutput;

public class ApiAutomationTest {

    Helper h = new Helper();

    @BeforeTest
    public void first_run_this(){
        h.intialSetup();
    }

    @Test(enabled = false)
    public void detailsPage(){
        Response response = RestAssured.given()
                .header("Authorization", "Bearer " + h.tokan)
                .when()
                .get(h.end_point);

        Assert.assertEquals(response.statusCode(),200 );
        System.out.println("first test complete");
    }


    @Test(enabled = false)
    public void detailsPage1(){
        Response response = RestAssured.given()
                .header("Authorization", "Bearer " + h.tokan)
                .when()
                .get(h.end_point);

        Assert.assertEquals(response.statusCode(),200 );
        System.out.println("second test complete");
    }

}
