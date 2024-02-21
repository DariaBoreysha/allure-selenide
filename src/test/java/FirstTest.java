/*
import config.TestConfig;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static constants.Constants.JsonPlaceholder.JSON_GET_COMMENTS;
import static constants.Constants.Swapi.SWAPI_GET_PEOPLE;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;

public class FirstTest extends TestConfig {

    @Test
    public void myFirstTest() {
        given()
                .when()
                .queryParam("postId", 1)
                .get(JSON_GET_COMMENTS)
                .then()
                .log().body()
                .statusCode(200);
    }

    @Test
    public void mySecondTest() {
        String putBodyJson = "{\n" +
                "\"title\":\"foo\",\n" +
                "\"body\":\"bar\",\n" +
                "\"userId\":1\n" +
                "}";
        Response response =
                given()
                        .when()
                        .headers("Content-type", "application/json", "charset", "UTF-8")
                        .body(putBodyJson)
                        .get()
                        .then()
                        .extract().response();
        //String jsonResponse = response.asString();
        //String allCookie = response.getCookies().toString();
        //Headers headers = response.getHeaders();
        String contentType = response.getContentType();
        System.out.println(contentType);
    }


    @Test
    public void testXmlSchemaValidation(){
        String postBody = "<Request>\n" +
                "    <Login>login</Login>\n" +
                "    <Password>password</Password>\n" +
                "</Request>";
        given().log().all()
                .spec(requestSpecificationForXml)
                .body(postBody)
                .when()
                .post("post/xml")
                .then().log().body();
        //.body(matchesXsdInClasspath("xmlSchema.xsd")
    }

    @Test
    public void testJsonSchemaValidation(){
        String putBodyJson = "{\n" +
                "\"title\":\"foo\",\n" +
                "\"body\":\"bar\",\n" +
                "\"userId\":1\n" +
                "}";

                given()
                        .when().log().uri()
                        .headers("Content-type", "application/json", "charset", "UTF-8")
                        .body(putBodyJson)
                        .get()
                        .then().assertThat()
                        .body(matchesJsonSchemaInClasspath("jsonSchema.json"));

    }

    @Test
    public void getSomeFieldAssertion() {
        given()
                .when()
                .get(SWAPI_GET_PEOPLE)
                .then()
                .body("results.name[1]", equalTo("C-3PO"))
                .log().body()
                .statusCode(200);
    }

    @Test
    public void Lesson(){

    }

}
*/
