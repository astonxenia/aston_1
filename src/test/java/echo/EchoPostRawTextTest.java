package echo;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class EchoPostRawTextTest {

    @Test
    public void testResponseIsOkAndBodyHasData() {
        String expectedData = "This is expected to be sent back as part of response body.";

        RestAssured
                .given().log().all()
                .baseUri("https://postman-echo.com")
                .body(expectedData)
                .contentType("text/plain")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(expectedData));
    }
}
