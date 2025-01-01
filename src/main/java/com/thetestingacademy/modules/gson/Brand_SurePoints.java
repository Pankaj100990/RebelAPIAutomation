package com.thetestingacademy.modules.gson;

import java.math.BigInteger;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.math3.stat.descriptive.summary.Product;

public class Brand_SurePoints {

    @SerializedName("brand_id")
    @Expose
    private Integer brandId;
    @SerializedName("client_source_id")
    @Expose
    private Integer clientSourceId;
    @SerializedName("is_future_order")
    @Expose
    private Integer isFutureOrder;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("product")
    @Expose
    private List<Product> product;
    @SerializedName("combo")
    @Expose
    private List<Object> combo;
    @SerializedName("sp_applied")
    @Expose
    private Integer spApplied;
    @SerializedName("sp_applied_in_currency")
    @Expose
    private Double spAppliedInCurrency;
    @SerializedName("store_id")
    @Expose
    private Integer storeId;
    @SerializedName("is_sure_points_applicable")
    @Expose
    private Integer isSurePointsApplicable;
    @SerializedName("timestamp")
    @Expose
    private BigInteger timestamp;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getClientSourceId() {
        return clientSourceId;
    }

    public void setClientSourceId(Integer clientSourceId) {
        this.clientSourceId = clientSourceId;
    }

    public Integer getIsFutureOrder() {
        return isFutureOrder;
    }

    public void setIsFutureOrder(Integer isFutureOrder) {
        this.isFutureOrder = isFutureOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public List<Object> getCombo() {
        return combo;
    }

    public void setCombo(List<Object> combo) {
        this.combo = combo;
    }

    public Integer getSpApplied() {
        return spApplied;
    }

    public void setSpApplied(Integer spApplied) {
        this.spApplied = spApplied;
    }

    public Double getSpAppliedInCurrency() {
        return spAppliedInCurrency;
    }

    public void setSpAppliedInCurrency(Double spAppliedInCurrency) {
        this.spAppliedInCurrency = spAppliedInCurrency;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getIsSurePointsApplicable() {
        return isSurePointsApplicable;
    }

    public void setIsSurePointsApplicable(Integer isSurePointsApplicable) {
        this.isSurePointsApplicable = isSurePointsApplicable;
    }

    public BigInteger getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(BigInteger timestamp) {
        this.timestamp = timestamp;
    }

}