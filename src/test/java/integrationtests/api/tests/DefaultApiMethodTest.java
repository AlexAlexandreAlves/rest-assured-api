package integrationtests.api.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DefaultApiMethodTest {

    @Test
    void getApiDefaultTest() {

        //Default Usage

        Response res =  RestAssured.get("https://test-api.k6.io/public/crocodiles/1");

        System.out.println("Response:  " + res.asString());
        System.out.println("StatusCode:  " + res.getStatusCode());
        System.out.println("Body:  " + res.getBody());
        System.out.println("Time Taken:  " + res.getTime());
        System.out.println("Header:  " + res.getHeader("content-type"));

        Assert.assertEquals(res.body().asString(), "{\"id\":1,\"name\":\"Bert\",\"sex\":\"M\",\"date_of_birth\":\"2010-06-27\",\"age\":13}");

        int statusCode = res.getStatusCode();
        Assert.assertEquals(statusCode, 200);

    }

    @Test
    void simplifyTheSameTest() {

        //Simple Usage

        RestAssured.get("https://test-api.k6.io/public/crocodiles/1").then().statusCode(200);

    }

    @Test
    void getApiGherkinLanguageTest() {

        //Gherkin Usage

        given().get("https://test-api.k6.io/public/crocodiles/1").
                then().statusCode(200);

    }
}
