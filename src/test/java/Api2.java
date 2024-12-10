import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.File;
import java.sql.SQLOutput;

public class Api2 extends ApiAutomationTest {

    @Test
    public void detailPage3(){
        Response response = RestAssured.given()
                .header("Authorization", "Bearer " + h.tokan)
                .when()
                .get(h.end_point);

        Assert.assertEquals(response.statusCode(),200 );
        System.out.println("third test complete from different file");

    }

}
