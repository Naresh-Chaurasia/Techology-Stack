import config.VideoGameConfig;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class MyFirstTest2 extends VideoGameConfig {

    @Test
    public void myFirstTest() {
        given()
                .log().all()
        .when()
                .get("/videogame")
        .then()
                .log().all();

    }
}