package com.thetestingacademy.gson;

import org.testng.annotations.Test;

public class TestDummy {
    @Test
    public String  dummyPayload(){
        String testPayload = "{\n" +
                "  \"brands\" : [ {\n" +
                "    \"brand_id\" : 21,\n" +
                "    \"client_source_id\" : 10,\n" +
                "    \"is_future_order\" : 0,\n" +
                "    \"name\" : \"Ovenstory\",\n" +
                "    \"product\" : [ {\n" +
                "      \"cart_display_offer_price\" : 0.0,\n" +
                "      \"cart_display_price\" : 399.0,\n" +
                "      \"customisations_groups\" : [ {\n" +
                "        \"name\" : \"Customize Your Pizza\",\n" +
                "        \"customisations\" : [ {\n" +
                "          \"customisation_id\" : 30534405,\n" +
                "          \"name\" : \"Medium Pizza (Serves 2)\",\n" +
                "          \"price\" : 20.0,\n" +
                "          \"offer_price\" : 0.0,\n" +
                "          \"offer_price_used\" : 0,\n" +
                "          \"cart_display_price\" : 20.0,\n" +
                "          \"cart_display_offer_price\" : 0.0,\n" +
                "          \"is_price_validated\" : false,\n" +
                "          \"is_available\" : 1,\n" +
                "          \"is_product_available\" : false,\n" +
                "          \"is_back_calculate_tax\" : 0,\n" +
                "          \"tax_category\" : 7,\n" +
                "          \"switch_off_msg\" : \"\",\n" +
                "          \"is_switched_off\" : 0,\n" +
                "          \"is_variation\" : false\n" +
                "        } ],\n" +
                "        \"group_id\" : -30534386,\n" +
                "        \"type\" : \"variation\"\n" +
                "      } ],\n" +
                "      \"is_customizable\" : 1,\n" +
                "      \"offer_price\" : 0.0,\n" +
                "      \"offer_price_used\" : 0,\n" +
                "      \"offer_tags\" : [ \"BUY_1_GET_1\" ],\n" +
                "      \"preparation_time\" : 0,\n" +
                "      \"price\" : 399.0,\n" +
                "      \"product_id\" : 30534386,\n" +
                "      \"product_imageUrl\" : \"https://rp-media.faasos.io/catalog/images/8KRD8FJZOUNB.jpeg\",\n" +
                "      \"product_name\" : \"Pesto Margherita Paradiso Medium Pizza (Serves 2)\",\n" +
                "      \"quantity\" : 1,\n" +
                "      \"sure_offer_price\" : 0,\n" +
                "      \"timestamp\" : 1735239741742,\n" +
                "      \"is_veg\" : 1\n" +
                "    } ],\n" +
                "    \"combo\" : [ ],\n" +
                "    \"sp_applied\" : 0,\n" +
                "    \"sp_applied_in_currency\" : 0.0,\n" +
                "    \"store_id\" : 10377,\n" +
                "    \"is_sure_points_applicable\" : 0,\n" +
                "    \"timestamp\" : 1735239858476\n" +
                "  } ],\n" +
                "  \"charge_details\" : {\n" +
                "    \"basket_total_strikethrough_price\" : 0.0,\n" +
                "    \"bxgy_savings\" : 0.0,\n" +
                "    \"effective_cart_total_before_discount\" : 439.95,\n" +
                "    \"sub_total\" : 419.0,\n" +
                "    \"coupon_cashback\" : 0.0,\n" +
                "    \"coupon_discount\" : 0.0,\n" +
                "    \"credits_applied_value\" : 0.0,\n" +
                "    \"delivery_charges\" : 9.45,\n" +
                "    \"discounted_packaging_charges\" : 19.0,\n" +
                "    \"effective_sub_total\" : 419.0,\n" +
                "    \"fp_eligibility_exclusions\" : 0.0,\n" +
                "    \"free_product_savings\" : 0.0,\n" +
                "    \"net_amount\" : 440.0,\n" +
                "    \"order_total\" : 468.0,\n" +
                "    \"original_delivery_charges\" : 59.0,\n" +
                "    \"packaging_charges\" : 49.0,\n" +
                "    \"payable_amount\" : 468.0,\n" +
                "    \"savings_percentage\" : 15.0,\n" +
                "    \"required_amount_for_free_delivery\" : 0.0,\n" +
                "    \"total_without_savings\" : 548.0,\n" +
                "    \"sure_points_applied_value\" : 0.0,\n" +
                "    \"tax_total\" : 20.95,\n" +
                "    \"total_combo_savings\" : 0.0,\n" +
                "    \"total_es_exclusive_savings\" : 0.0,\n" +
                "    \"total_savings\" : 80.0\n" +
                "  },\n" +
                "  \"client_os\" : \"eatsure_android\",\n" +
                "  \"country_code\" : \"IND\",\n" +
                "  \"brand_specific_credit_used\" : 0,\n" +
                "  \"credit_balance\" : 618,\n" +
                "  \"customer_id\" : \"12581822\",\n" +
                "  \"darthvader\" : \"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjdXN0b21lcl9pZCI6MTI1ODE4MjIsInVzZXJfaWQiOm51bGwsImNsaWVudF9vcyI6ImVhdHN1cmVfYW5kcm9pZCIsImRldmljZV9jb2RlIjoiYjhkNmE5MmE0YTEiLCJkZXZpY2VfcHVzaF9pZCI6bnVsbCwiaWF0IjoxNzM1MjM5NzYwLCJleHAiOjE3NDA0MjM3NjAsImlzcyI6IkZAQCRvJCEifQ.4oyLDzdnUKoXkJ7N3-SP8nYJw64joQLYjwlsYL7BWBQ\",\n" +
                "  \"is_freebie_enabled\" : true,\n" +
                "  \"new_version\" : 1,\n" +
                "  \"order_partner\" : \"eatsure\",\n" +
                "  \"store_id\" : 10377\n" +
                "}";
        return testPayload;
    }
}
