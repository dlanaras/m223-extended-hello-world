package ch.zli.m223;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testAddition() {
        given()
          .when().get("/calculator/add/12/30")
          .then()
             .statusCode(200)
             .body(is("42"));
    }
}