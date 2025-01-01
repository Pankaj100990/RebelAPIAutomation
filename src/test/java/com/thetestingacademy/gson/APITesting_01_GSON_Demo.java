package com.thetestingacademy.gson;
import com.thetestingacademy.modules.gson.Brand_SurePoints;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


public class APITesting_01_GSON_Demo {
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;

    @Test
    public void testPositive() {

        // Step1 - POST
        // URL -> Base URI + base Path
        // HEADER
        // BODY
        // Auth - NO


        // Step 2
        // prepare the Payload ( Object -> JSON String)
        // send the request

        //Step 3
        // Validate Response ( JSON String -> Object)
        // FirstName,
        // Status Code
        // Time Response
        Brand_SurePoints brand_surePoints = new Brand_SurePoints();
        brand_surePoints.setBrandId(21);
        brand_surePoints.setClientSourceId(10);
        brand_surePoints.setIsFutureOrder(0);
        brand_surePoints.setName("Ovenstory");
        brand_surePoints.setSpApplied(0);
        brand_surePoints.setSpAppliedInCurrency(0.0);
        brand_surePoints.setStoreId(10377);
        brand_surePoints.setIsSurePointsApplicable(0);
//        brand_surePoints.setTimestamp(1735239858476);


    }
}
