package com.thetestingacademy.modules.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Customisation {

    @SerializedName("customisation_id")
    @Expose
    private Integer customisationId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("offer_price")
    @Expose
    private Double offerPrice;
    @SerializedName("offer_price_used")
    @Expose
    private Integer offerPriceUsed;
    @SerializedName("cart_display_price")
    @Expose
    private Double cartDisplayPrice;
    @SerializedName("cart_display_offer_price")
    @Expose
    private Double cartDisplayOfferPrice;
    @SerializedName("is_price_validated")
    @Expose
    private Boolean isPriceValidated;
    @SerializedName("is_available")
    @Expose
    private Integer isAvailable;
    @SerializedName("is_product_available")
    @Expose
    private Boolean isProductAvailable;
    @SerializedName("is_back_calculate_tax")
    @Expose
    private Integer isBackCalculateTax;
    @SerializedName("tax_category")
    @Expose
    private Integer taxCategory;
    @SerializedName("switch_off_msg")
    @Expose
    private String switchOffMsg;
    @SerializedName("is_switched_off")
    @Expose
    private Integer isSwitchedOff;
    @SerializedName("is_variation")
    @Expose
    private Boolean isVariation;

    public Integer getCustomisationId() {
        return customisationId;
    }

    public void setCustomisationId(Integer customisationId) {
        this.customisationId = customisationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(Double offerPrice) {
        this.offerPrice = offerPrice;
    }

    public Integer getOfferPriceUsed() {
        return offerPriceUsed;
    }

    public void setOfferPriceUsed(Integer offerPriceUsed) {
        this.offerPriceUsed = offerPriceUsed;
    }

    public Double getCartDisplayPrice() {
        return cartDisplayPrice;
    }

    public void setCartDisplayPrice(Double cartDisplayPrice) {
        this.cartDisplayPrice = cartDisplayPrice;
    }

    public Double getCartDisplayOfferPrice() {
        return cartDisplayOfferPrice;
    }

    public void setCartDisplayOfferPrice(Double cartDisplayOfferPrice) {
        this.cartDisplayOfferPrice = cartDisplayOfferPrice;
    }

    public Boolean getIsPriceValidated() {
        return isPriceValidated;
    }

    public void setIsPriceValidated(Boolean isPriceValidated) {
        this.isPriceValidated = isPriceValidated;
    }

    public Integer getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Integer isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Boolean getIsProductAvailable() {
        return isProductAvailable;
    }

    public void setIsProductAvailable(Boolean isProductAvailable) {
        this.isProductAvailable = isProductAvailable;
    }

    public Integer getIsBackCalculateTax() {
        return isBackCalculateTax;
    }

    public void setIsBackCalculateTax(Integer isBackCalculateTax) {
        this.isBackCalculateTax = isBackCalculateTax;
    }

    public Integer getTaxCategory() {
        return taxCategory;
    }

    public void setTaxCategory(Integer taxCategory) {
        this.taxCategory = taxCategory;
    }

    public String getSwitchOffMsg() {
        return switchOffMsg;
    }

    public void setSwitchOffMsg(String switchOffMsg) {
        this.switchOffMsg = switchOffMsg;
    }

    public Integer getIsSwitchedOff() {
        return isSwitchedOff;
    }

    public void setIsSwitchedOff(Integer isSwitchedOff) {
        this.isSwitchedOff = isSwitchedOff;
    }

    public Boolean getIsVariation() {
        return isVariation;
    }

    public void setIsVariation(Boolean isVariation) {
        this.isVariation = isVariation;
    }

}