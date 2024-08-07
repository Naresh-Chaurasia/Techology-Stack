import config.VideoGameConfig1;
import config.VideoGameEndpoints;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class VideoGameTests1 extends VideoGameConfig1 {

    @Test
    public void getAllGames() {
        given()
        .when()
                .get(VideoGameEndpoints.ALL_VIDEO_GAMES)
        .then();
    }
}