import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Helper {


    String tokan = "put_your_tokan_here";
    String end_point ="koi_bhi";

    public void intialSetup(){
        RestAssured.baseURI = "koi_bhi" ;// base url setup done before each test APi Case
    }

}
