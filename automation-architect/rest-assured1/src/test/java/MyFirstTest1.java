import org.junit.Test;

import io.restassured.response.ResponseOptions;

import static io.restassured.RestAssured.*;

public class MyFirstTest1 {

    @Test
    public void myFirstTest() {
        given()
                .log().all()
        .when()
                .get("https://videogamedb.uk/api/videogame")
        .then()
                .log().all();

    }
    @Test
    public void myFirstTest_x() {
        ResponseOptions responseOptions = given()
                .log().all()
        .when()
                .get("https://videogamedb.uk/api/videogame");

        System.out.println("-------------------");

        System.out.println(responseOptions.getStatusCode());
        System.out.println(responseOptions.body().prettyPrint());

    }
}