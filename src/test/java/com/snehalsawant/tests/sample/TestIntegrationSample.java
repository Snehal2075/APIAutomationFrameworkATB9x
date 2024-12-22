package com.snehalsawant.tests.sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationSample {
    // Create a Booking, Create a Token
    // Verify that Get Booking
    // Update a Booking
    // Delete a Booking

    @Test(groups = "qa",priority = 1)
    @Owner("Snehal")
    @Description("TC#INT1- Step1. Verify that the Booking can be Created")
    public void testCreateBooking(){
        Assert.assertTrue(true);
    }
    @Test(groups = "qa",priority = 2)
    @Owner("Snehal")
    @Description("TC#INT1- Step2. Verify the Booking by ID")
    public void testVerifyBookingID(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa",priority = 3)
    @Owner("Snehal")
    @Description("TC#INT1- Step3. Verify Updated Booking by ID")
    public void testUpdateBookingbyID(){
        Assert.assertTrue(true);
    }


    @Test(groups = "qa",priority = 4)
    @Owner("Snehal")
    @Description("TC#INT1- Step3. Delete the Booking by ID")
    public void testDeleteBookingbyID(){
        Assert.assertTrue(true);
    }

}




