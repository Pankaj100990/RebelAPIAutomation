package com.thetestingacademy.modules.gson;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SurePointsPayload {

    @SerializedName("brands")
    @Expose
    private List<Brand_SurePoints> brands;
    @SerializedName("charge_details")
    @Expose
    private ChargeDetails chargeDetails;
    @SerializedName("client_os")
    @Expose
    private String clientOs;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("brand_specific_credit_used")
    @Expose
    private Integer brandSpecificCreditUsed;
    @SerializedName("credit_balance")
    @Expose
    private Integer creditBalance;
    @SerializedName("customer_id")
    @Expose
    private String customerId;
    @SerializedName("darthvader")
    @Expose
    private String darthvader;
    @SerializedName("is_freebie_enabled")
    @Expose
    private Boolean isFreebieEnabled;
    @SerializedName("new_version")
    @Expose
    private Integer newVersion;
    @SerializedName("order_partner")
    @Expose
    private String orderPartner;
    @SerializedName("store_id")
    @Expose
    private Integer storeId;

    public List<Brand_SurePoints> getBrands() {
        return brands;
    }

    public void setBrands(List<Brand_SurePoints> brands) {
        this.brands = brands;
    }

    public ChargeDetails getChargeDetails() {
        return chargeDetails;
    }

    public void setChargeDetails(ChargeDetails chargeDetails) {
        this.chargeDetails = chargeDetails;
    }

    public String getClientOs() {
        return clientOs;
    }

    public void setClientOs(String clientOs) {
        this.clientOs = clientOs;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getBrandSpecificCreditUsed() {
        return brandSpecificCreditUsed;
    }

    public void setBrandSpecificCreditUsed(Integer brandSpecificCreditUsed) {
        this.brandSpecificCreditUsed = brandSpecificCreditUsed;
    }

    public Integer getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(Integer creditBalance) {
        this.creditBalance = creditBalance;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDarthvader() {
        return darthvader;
    }

    public void setDarthvader(String darthvader) {
        this.darthvader = darthvader;
    }

    public Boolean getIsFreebieEnabled() {
        return isFreebieEnabled;
    }

    public void setIsFreebieEnabled(Boolean isFreebieEnabled) {
        this.isFreebieEnabled = isFreebieEnabled;
    }

    public Integer getNewVersion() {
        return newVersion;
    }

    public void setNewVersion(Integer newVersion) {
        this.newVersion = newVersion;
    }

    public String getOrderPartner() {
        return orderPartner;
    }

    public void setOrderPartner(String orderPartner) {
        this.orderPartner = orderPartner;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

}