package com.snehalsawant.base;

import com.snehalsawant.Asserts.AssertActions;
import com.snehalsawant.Endpoints.APIConstants;
import com.snehalsawant.Modules.PayloadManager;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    //Common to All Testcases
    //Base URL, Content Type - json - common

    public RequestSpecification requestSpecification;
    public AssertActions assertActions;
    public PayloadManager payloadManager;
    public JsonPath jsonPath;
    public Response response;
    public ValidatableResponse validatableResponse;




    @BeforeTest
    public void setUp(){

        //Base URL, Content type JSON
        payloadManager = new PayloadManager();
        assertActions = new AssertActions();

//        requestSpecification = RestAssured
//                .given()
//                .baseUri(APIConstants.Base_URL)
//                .contentType(ContentType.JSON)
//                .log().all();
//

        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(APIConstants.Base_URL)
                .addHeader("Content-Type","application/json")
                .build().log().all();

    }
}
