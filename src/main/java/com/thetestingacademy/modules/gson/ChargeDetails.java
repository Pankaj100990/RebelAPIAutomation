package com.thetestingacademy.modules.gson;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChargeDetails {

    @SerializedName("basket_total_strikethrough_price")
    @Expose
    private Double basketTotalStrikethroughPrice;
    @SerializedName("bxgy_savings")
    @Expose
    private Double bxgySavings;
    @SerializedName("effective_cart_total_before_discount")
    @Expose
    private Double effectiveCartTotalBeforeDiscount;
    @SerializedName("sub_total")
    @Expose
    private Double subTotal;
    @SerializedName("coupon_cashback")
    @Expose
    private Double couponCashback;
    @SerializedName("coupon_discount")
    @Expose
    private Double couponDiscount;
    @SerializedName("credits_applied_value")
    @Expose
    private Double creditsAppliedValue;
    @SerializedName("delivery_charges")
    @Expose
    private Double deliveryCharges;
    @SerializedName("discounted_packaging_charges")
    @Expose
    private Double discountedPackagingCharges;
    @SerializedName("effective_sub_total")
    @Expose
    private Double effectiveSubTotal;
    @SerializedName("fp_eligibility_exclusions")
    @Expose
    private Double fpEligibilityExclusions;
    @SerializedName("free_product_savings")
    @Expose
    private Double freeProductSavings;
    @SerializedName("net_amount")
    @Expose
    private Double netAmount;
    @SerializedName("order_total")
    @Expose
    private Double orderTotal;
    @SerializedName("original_delivery_charges")
    @Expose
    private Double originalDeliveryCharges;
    @SerializedName("packaging_charges")
    @Expose
    private Double packagingCharges;
    @SerializedName("payable_amount")
    @Expose
    private Double payableAmount;
    @SerializedName("savings_percentage")
    @Expose
    private Double savingsPercentage;
    @SerializedName("required_amount_for_free_delivery")
    @Expose
    private Double requiredAmountForFreeDelivery;
    @SerializedName("total_without_savings")
    @Expose
    private Double totalWithoutSavings;
    @SerializedName("sure_points_applied_value")
    @Expose
    private Double surePointsAppliedValue;
    @SerializedName("tax_total")
    @Expose
    private Double taxTotal;
    @SerializedName("total_combo_savings")
    @Expose
    private Double totalComboSavings;
    @SerializedName("total_es_exclusive_savings")
    @Expose
    private Double totalEsExclusiveSavings;
    @SerializedName("total_savings")
    @Expose
    private Double totalSavings;

    public Double getBasketTotalStrikethroughPrice() {
        return basketTotalStrikethroughPrice;
    }

    public void setBasketTotalStrikethroughPrice(Double basketTotalStrikethroughPrice) {
        this.basketTotalStrikethroughPrice = basketTotalStrikethroughPrice;
    }

    public Double getBxgySavings() {
        return bxgySavings;
    }

    public void setBxgySavings(Double bxgySavings) {
        this.bxgySavings = bxgySavings;
    }

    public Double getEffectiveCartTotalBeforeDiscount() {
        return effectiveCartTotalBeforeDiscount;
    }

    public void setEffectiveCartTotalBeforeDiscount(Double effectiveCartTotalBeforeDiscount) {
        this.effectiveCartTotalBeforeDiscount = effectiveCartTotalBeforeDiscount;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getCouponCashback() {
        return couponCashback;
    }

    public void setCouponCashback(Double couponCashback) {
        this.couponCashback = couponCashback;
    }

    public Double getCouponDiscount() {
        return couponDiscount;
    }

    public void setCouponDiscount(Double couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public Double getCreditsAppliedValue() {
        return creditsAppliedValue;
    }

    public void setCreditsAppliedValue(Double creditsAppliedValue) {
        this.creditsAppliedValue = creditsAppliedValue;
    }

    public Double getDeliveryCharges() {
        return deliveryCharges;
    }

    public void setDeliveryCharges(Double deliveryCharges) {
        this.deliveryCharges = deliveryCharges;
    }

    public Double getDiscountedPackagingCharges() {
        return discountedPackagingCharges;
    }

    public void setDiscountedPackagingCharges(Double discountedPackagingCharges) {
        this.discountedPackagingCharges = discountedPackagingCharges;
    }

    public Double getEffectiveSubTotal() {
        return effectiveSubTotal;
    }

    public void setEffectiveSubTotal(Double effectiveSubTotal) {
        this.effectiveSubTotal = effectiveSubTotal;
    }

    public Double getFpEligibilityExclusions() {
        return fpEligibilityExclusions;
    }

    public void setFpEligibilityExclusions(Double fpEligibilityExclusions) {
        this.fpEligibilityExclusions = fpEligibilityExclusions;
    }

    public Double getFreeProductSavings() {
        return freeProductSavings;
    }

    public void setFreeProductSavings(Double freeProductSavings) {
        this.freeProductSavings = freeProductSavings;
    }

    public Double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Double netAmount) {
        this.netAmount = netAmount;
    }

    public Double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Double getOriginalDeliveryCharges() {
        return originalDeliveryCharges;
    }

    public void setOriginalDeliveryCharges(Double originalDeliveryCharges) {
        this.originalDeliveryCharges = originalDeliveryCharges;
    }

    public Double getPackagingCharges() {
        return packagingCharges;
    }

    public void setPackagingCharges(Double packagingCharges) {
        this.packagingCharges = packagingCharges;
    }

    public Double getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(Double payableAmount) {
        this.payableAmount = payableAmount;
    }

    public Double getSavingsPercentage() {
        return savingsPercentage;
    }

    public void setSavingsPercentage(Double savingsPercentage) {
        this.savingsPercentage = savingsPercentage;
    }

    public Double getRequiredAmountForFreeDelivery() {
        return requiredAmountForFreeDelivery;
    }

    public void setRequiredAmountForFreeDelivery(Double requiredAmountForFreeDelivery) {
        this.requiredAmountForFreeDelivery = requiredAmountForFreeDelivery;
    }

    public Double getTotalWithoutSavings() {
        return totalWithoutSavings;
    }

    public void setTotalWithoutSavings(Double totalWithoutSavings) {
        this.totalWithoutSavings = totalWithoutSavings;
    }

    public Double getSurePointsAppliedValue() {
        return surePointsAppliedValue;
    }

    public void setSurePointsAppliedValue(Double surePointsAppliedValue) {
        this.surePointsAppliedValue = surePointsAppliedValue;
    }

    public Double getTaxTotal() {
        return taxTotal;
    }

    public void setTaxTotal(Double taxTotal) {
        this.taxTotal = taxTotal;
    }

    public Double getTotalComboSavings() {
        return totalComboSavings;
    }

    public void setTotalComboSavings(Double totalComboSavings) {
        this.totalComboSavings = totalComboSavings;
    }

    public Double getTotalEsExclusiveSavings() {
        return totalEsExclusiveSavings;
    }

    public void setTotalEsExclusiveSavings(Double totalEsExclusiveSavings) {
        this.totalEsExclusiveSavings = totalEsExclusiveSavings;
    }

    public Double getTotalSavings() {
        return totalSavings;
    }

    public void setTotalSavings(Double totalSavings) {
        this.totalSavings = totalSavings;
    }

}
