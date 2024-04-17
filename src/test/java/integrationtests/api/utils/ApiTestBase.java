package integrationtests.api.utils;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class ApiTestBase {

    protected RequestSpecification requestSpec;

    public ApiTestBase() {
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://test-api.k6.io/public/")
                .setContentType(ContentType.JSON)
                .build();
    }
}
