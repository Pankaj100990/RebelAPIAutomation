package com.thetestingacademy.rebel;

import com.thetestingacademy.gson.TestDummy;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class SurePointsBreakupPostApi {
    @Description("Verify the POST Request - Non BDD Style")
    @Test
    public String test_sure_points_breakup_post() {
        TestDummy td = new TestDummy();
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://thanos.faasos.io");
        r.basePath("/v4/sure_points_breakup.json");
        r.queryParam("client_os","eatsure_android");
        r.queryParam("app_version","10319");
        r.queryParam("device_id","b8d6a92a4a10b28e");
        r.header("App-Version","10319","Client-Os","eatsure_android",
                "darthvader","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjdXN0b21lcl9pZCI6MTI1ODE4MjIsInVzZXJfaWQiOm51bGwsImNsaWVudF9vcyI6ImVhdHN1cmVfYW5kcm9pZCIsImRldmljZV9jb2RlIjoiYjhkNmE5MmE0YTEiLCJkZXZpY2VfcHVzaF9pZCI6bnVsbCwiaWF0IjoxNzM1MjM5NzYwLCJleHAiOjE3NDA0MjM3NjAsImlzcyI6IkZAQCRvJCEifQ.4oyLDzdnUKoXkJ7N3-SP8nYJw64joQLYjwlsYL7BWBQ");
        r.contentType(ContentType.JSON).log().all();


        r.body(td.dummyPayload());

        //When- Response
        Response response=r.when().post();

        //Then - Validatable Response
        ValidatableResponse validatableResponse=response.then();
        validatableResponse.statusCode(200);

 //       r.then().log().all().statusCode(200);
        //Extract the message of sure point breakup
        String message=response.jsonPath().getString("sure_points_breakup.message");
        System.out.println("Message is : " + message);
        //Assetions using RestAssured
        validatableResponse.body("sure_points_breakup.message", Matchers.equalTo("Surepoints is revamping - Update app now!"));
        //Assertions Using AssertJ
        assertThat(message).isNotNull().isNotBlank().isNotEmpty();


        //Extract image url
        String imageUrl=response.jsonPath().getString("coupon_info[0].data[0].freebie_product[0].product_image_url");
        System.out.println("Image Url is : " + imageUrl);
        assertThat(imageUrl).isNotNull().isNotBlank().isNotEmpty();

        return message;

        //Assertions
 //       validatableResponse.body("sure_points_breakup.message", Matchers.equalTo("Surepoints is revamping - Update app now!"));
    }
    @Test
    public void getMessage(){
        String methodMessage=test_sure_points_breakup_post();
        System.out.println("Message method :" + methodMessage);
    }
}
