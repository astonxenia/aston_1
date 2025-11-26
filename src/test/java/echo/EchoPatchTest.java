package echo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EchoPatchTest {
    @Test
    public void testResponseIsOkAndBodyHasData() {
        String expectedBody = "This is expected to be sent back as part of response body.";
        Response response = RestAssured.given()
                .log().all()
                .baseUri("https://postman-echo.com")
                .body(expectedBody)
                .contentType("text/plain")
                .when()
                .patch("/patch");

        response.then().statusCode(200);
        String actualData = response.path("data");
        assertEquals(expectedBody, actualData);
    }
}
