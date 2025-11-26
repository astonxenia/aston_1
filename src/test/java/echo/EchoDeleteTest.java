package echo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EchoDeleteTest {

    @Test
    public void testDeleteResponseBody() {
        Response response = RestAssured.given()
                .log().all()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body("This is expected to be sent back as part of response body.")
                .when()
                .delete("/delete");
        response.then().statusCode(200);
        String dataResponse = response.path("data");
        assertEquals("This is expected to be sent back as part of response body.", dataResponse);


    }
}
