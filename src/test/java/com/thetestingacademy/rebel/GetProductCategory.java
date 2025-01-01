package com.thetestingacademy.rebel;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class GetProductCategory {

    @Test
    public void get_Product_Category(){
        RestAssured
                .given()
                .baseUri("https://thanos.faasos.io")
                .basePath("/v3/mami/get_products.json")
                .queryParam("store_id",10377)
                .queryParam("category_id",-1)
                .queryParam("lat",19.148586)
                .queryParam("lng",72.931207)
                .queryParam("virtual_store_codes","")
                .queryParam("sub_categories",true)
                .queryParam("anakin","eab8102088f011e894012940773d1c99")
                .queryParam("client_os","eatsure_android")
                .queryParam("app_version",10319)
                .queryParam("device_id","b8d6a92a4a10b28e")
                .headers("App-Version","10120", "Client-Os","eatsure_android")
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
    }

    }

