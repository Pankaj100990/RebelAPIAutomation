package com.thetestingacademy.modules.gson;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("cart_display_offer_price")
    @Expose
    private Double cartDisplayOfferPrice;
    @SerializedName("cart_display_price")
    @Expose
    private Double cartDisplayPrice;
    @SerializedName("customisations_groups")
    @Expose
    private List<CustomisationsGroup> customisationsGroups;
    @SerializedName("is_customizable")
    @Expose
    private Integer isCustomizable;
    @SerializedName("offer_price")
    @Expose
    private Double offerPrice;
    @SerializedName("offer_price_used")
    @Expose
    private Integer offerPriceUsed;
    @SerializedName("offer_tags")
    @Expose
    private List<String> offerTags;
    @SerializedName("preparation_time")
    @Expose
    private Integer preparationTime;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("product_id")
    @Expose
    private Integer productId;
    @SerializedName("product_imageUrl")
    @Expose
    private String productImageUrl;
    @SerializedName("product_name")
    @Expose
    private String productName;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;
    @SerializedName("sure_offer_price")
    @Expose
    private Integer sureOfferPrice;
    @SerializedName("timestamp")
    @Expose
    private Long timestamp;
    @SerializedName("is_veg")
    @Expose
    private Integer isVeg;

    public Double getCartDisplayOfferPrice() {
        return cartDisplayOfferPrice;
    }

    public void setCartDisplayOfferPrice(Double cartDisplayOfferPrice) {
        this.cartDisplayOfferPrice = cartDisplayOfferPrice;
    }

    public Double getCartDisplayPrice() {
        return cartDisplayPrice;
    }

    public void setCartDisplayPrice(Double cartDisplayPrice) {
        this.cartDisplayPrice = cartDisplayPrice;
    }

    public List<CustomisationsGroup> getCustomisationsGroups() {
        return customisationsGroups;
    }

    public void setCustomisationsGroups(List<CustomisationsGroup> customisationsGroups) {
        this.customisationsGroups = customisationsGroups;
    }

    public Integer getIsCustomizable() {
        return isCustomizable;
    }

    public void setIsCustomizable(Integer isCustomizable) {
        this.isCustomizable = isCustomizable;
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

    public List<String> getOfferTags() {
        return offerTags;
    }

    public void setOfferTags(List<String> offerTags) {
        this.offerTags = offerTags;
    }

    public Integer getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(Integer preparationTime) {
        this.preparationTime = preparationTime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getSureOfferPrice() {
        return sureOfferPrice;
    }

    public void setSureOfferPrice(Integer sureOfferPrice) {
        this.sureOfferPrice = sureOfferPrice;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getIsVeg() {
        return isVeg;
    }

    public void setIsVeg(Integer isVeg) {
        this.isVeg = isVeg;
    }

}