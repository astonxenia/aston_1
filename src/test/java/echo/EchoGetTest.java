package echo;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class EchoGetTest {

        @Test
        public void testGetRequest() {
            RestAssured
                    .given().log().all()
                    .baseUri("https://postman-echo.com")
                    .queryParam("foo1", "bar1")
                    .queryParam("foo2","bar2")
                    .when()
                    .get("/get")
                    .then()
                    .statusCode(200)
                    .body("args.foo1", equalTo("bar1"))
                    .body("args.foo2", equalTo("bar2"));

        }

    }

