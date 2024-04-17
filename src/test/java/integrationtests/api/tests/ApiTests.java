package integrationtests.api.tests;

import integrationtests.api.assertions.ApiAssertions;
import integrationtests.api.utils.ApiTestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ApiTests extends ApiTestBase {

    @Test
    public void TestGetUser() {
        // Executa a requisição e armazena a resposta
        Response res = given()
                .spec(requestSpec)
                .when()
                .get("/crocodiles/1")
                .then()
                .log().all()
                .extract().response();

        // Executa a asserção de código de status usando a classe de asserções
        ApiAssertions.AssertStatusCode(200, res);
    }

}
