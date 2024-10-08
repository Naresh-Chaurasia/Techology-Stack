import config.FootballConfig;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;

import static io.restassured.RestAssured.*;

public class FootballTests extends FootballConfig {

    //@Test
    public void getDetailsOfOneArea() {
        given()
                .queryParam("areas", 2076)
        .when()
                .get("/areas");
    }

    @Test
    public void getDetailsOfMultipleAreas() {
        String areaIds = "2076,2077,2080";

        given()
                .urlEncodingEnabled(false)
                .queryParam("areas", areaIds)
        .when()
                .get("/areas");
    }

    @Test
    public void getDateFounded() {
        given()
        .when()
                .get("teams/57")
        .then()
                .body("founded", equalTo(1886));
    }

    @Test
    public void getFirstTeamName() {
        given()
        .when()
                .get("competitions/2021/teams");
    }
}