package com.snehalsawant.tests.CRUD;

import com.snehalsawant.Endpoints.APIConstants;
import com.snehalsawant.base.BaseTest;
import com.snehalsawant.pojos.BookingResponse;
import io.qameta.allure.*;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class testCreateBooking extends BaseTest {

    @Owner("Snehal")
    @TmsLink("https://google.com")
    @Link(name = "Link to TC", url = "https://bugz.atlassian.net/browse/RBT-4")
    @Issue("JIRA_RBT-4")
    @Description("Verify that POST request is working fine.")
    @Test(groups = "qa")
    public void testVerifyCreateBookingPOSt01(){
        requestSpecification.basePath(APIConstants.CREATE_UPDATE_BOOKING_URL);

        response = RestAssured.given(requestSpecification)
                .when().body(payloadManager.createPayloadBookingAsString()).post();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

        BookingResponse bookingResponse = payloadManager.bookingResponseJava(response.asString());


        assertActions.verifyStringKey(bookingResponse.getBooking().getFirstname(),"James");
    }



}
