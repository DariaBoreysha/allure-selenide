/*
package config;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured;

import static constants.Constants.JsonPlaceholder.*;
import static constants.Constants.Swapi.SWAPI_PATH;
import static constants.Constants.Swapi.SWAPI_URL;

public class TestConfig {
    protected RequestSpecification requestSpecificationForXml = new RequestSpecBuilder()
            .setBaseUri("https://reqbin.com/")
            .setBasePath("echo/")
            .addHeader("Content-Type", "application/xml; charset=utf-8")
            .addHeader("Accept", "application/xml")
            .addHeader("Access-Control-Allow-Origin", "*")
            .addHeader("Connection", "keep-alive")
            .addHeader("Report-To", "{\"endpoints\":[{\"url\":\"https:\\/\\/a.nel.cloudflare.com\\/report\\/v3?s=AG5D6RoT%2BuU3Q8AHdHxA0wuujdkkoP7oQnZ58K6%2FltycRmb%2BoolFgZy%2FAQs6XO7Go0rbNrYiokEHNsy840sXRCifiopsC4zkr8bJ8QTQ0XlI2rOqIkst0eYdzZE%3D\"}],\"group\":\"cf-nel\",\"max_age\":604800}")
            .build();

    protected RequestSpecification requestSpecificationForCourse = new RequestSpecBuilder()
            .setBaseUri(SWAPI_URL)
            .setBasePath(SWAPI_PATH)
            .addHeader("charset", "UTF-8")
            .addHeader("Content-type", "application/json")
            .build();

    @BeforeClass


    }


}
*/
