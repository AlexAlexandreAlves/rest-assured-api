import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiGetTests {

    @Test
    void getApiDefaultTest() {

        //Default Usage

        Response res =  RestAssured.get("https://test-api.k6.io/public/crocodiles/1");

        System.out.println("Response:  " + res.asString());
        System.out.println("StatusCode:  " + res.getStatusCode());
        System.out.println("Body:  " + res.getBody());
        System.out.println("Time Taken:  " + res.getTime());
        System.out.println("Header:  " + res.getHeader("content-type"));

        int statusCode = res.getStatusCode();
        Assert.assertEquals(statusCode, 200);

    }

    @Test
    void getApiGherkinLanguageTest() {

        //Default Usage

        given().get("https://test-api.k6.io/public/crocodiles/1").
                then().statusCode(200);


    }
}
