package integrationtests.api.assertions;
import io.restassured.response.Response;

public class ApiAssertions {

    public static void AssertStatusCode(int expectedStatusCode, Response res) {
        res.then().statusCode(expectedStatusCode);
    }

    // Adicionar outras asserções comuns aqui
}
