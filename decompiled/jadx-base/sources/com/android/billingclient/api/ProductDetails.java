package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProductDetails {
    private final java.lang.String zza;
    private final org.json.JSONObject zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final java.lang.String zzg;
    private final java.lang.String zzh;
    private final java.lang.String zzi;
    private final java.util.List zzj;
    private final java.util.List zzk;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static final class InstallmentPlanDetails {
        private final int commitmentPaymentsCount;
        private final int subsequentCommitmentPaymentsCount;

        InstallmentPlanDetails(org.json.JSONObject jSONObject) throws org.json.JSONException {
            this.commitmentPaymentsCount = jSONObject.getInt("commitmentPaymentsCount");
            this.subsequentCommitmentPaymentsCount = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        public int getInstallmentPlanCommitmentPaymentsCount() {
            return this.commitmentPaymentsCount;
        }

        public int getSubsequentInstallmentPlanCommitmentPaymentsCount() {
            return this.subsequentCommitmentPaymentsCount;
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static final class OneTimePurchaseOfferDetails {
        private final java.lang.String zza;
        private final long zzb;
        private final java.lang.String zzc;
        private final java.lang.String zzd;
        private final java.lang.String zze;
        private final java.lang.String zzf;
        private final java.util.List zzg;
        private final java.lang.Long zzh;
        private final com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails.DiscountDisplayInfo zzi;
        private final com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails.ValidTimeWindow zzj;
        private final com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails.LimitedQuantityInfo zzk;
        private final java.lang.String zzl;
        private final com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails.RentalDetails zzm;
        private final com.android.billingclient.api.zzcs zzn;

        /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
        public static final class DiscountDisplayInfo {
            private final java.lang.Integer zza;
            private final com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails.DiscountDisplayInfo.DiscountAmount zzb;

            /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
            public static final class DiscountAmount {
                private final java.lang.String zza;
                private final long zzb;
                private final java.lang.String zzc;

                DiscountAmount(org.json.JSONObject jSONObject) {
                    this.zza = jSONObject.optString("formattedDiscountAmount");
                    this.zzb = jSONObject.optLong("discountAmountMicros");
                    this.zzc = jSONObject.optString("discountAmountCurrencyCode");
                }

                public java.lang.String getDiscountAmountCurrencyCode() {
                    return this.zzc;
                }

                public long getDiscountAmountMicros() {
                    return this.zzb;
                }

                public java.lang.String getFormattedDiscountAmount() {
                    return this.zza;
                }
            }

            DiscountDisplayInfo(org.json.JSONObject jSONObject) throws org.json.JSONException {
                this.zza = jSONObject.has("percentageDiscount") ? java.lang.Integer.valueOf(jSONObject.optInt("percentageDiscount")) : null;
                org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountAmount");
                this.zzb = jSONObjectOptJSONObject != null ? new com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails.DiscountDisplayInfo.DiscountAmount(jSONObjectOptJSONObject) : null;
            }

            public com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails.DiscountDisplayInfo.DiscountAmount getDiscountAmount() {
                return this.zzb;
            }

            public java.lang.Integer getPercentageDiscount() {
                return this.zza;
            }
        }

        /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
        public static final class LimitedQuantityInfo {
            private final int zza;
            private final int zzb;

            LimitedQuantityInfo(org.json.JSONObject jSONObject) throws org.json.JSONException {
                this.zza = jSONObject.getInt("maximumQuantity");
                this.zzb = jSONObject.getInt("remainingQuantity");
            }

            public int getMaximumQuantity() {
                return this.zza;
            }

            public int getRemainingQuantity() {
                return this.zzb;
            }
        }

        /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
        public static final class RentalDetails {
            private final java.lang.String rentalExpirationPeriod;
            private final java.lang.String rentalPeriod;

            RentalDetails(org.json.JSONObject jSONObject) throws org.json.JSONException {
                this.rentalPeriod = jSONObject.getString("rentalPeriod");
                java.lang.String strOptString = jSONObject.optString("rentalExpirationPeriod");
                this.rentalExpirationPeriod = true == strOptString.isEmpty() ? null : strOptString;
            }

            public java.lang.String getRentalExpirationPeriod() {
                return this.rentalExpirationPeriod;
            }

            public java.lang.String getRentalPeriod() {
                return this.rentalPeriod;
            }
        }

        /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
        public static final class ValidTimeWindow {
            private final java.lang.Long zza;
            private final java.lang.Long zzb;

            ValidTimeWindow(org.json.JSONObject jSONObject) throws org.json.JSONException {
                this.zza = jSONObject.has("startTimeMillis") ? java.lang.Long.valueOf(jSONObject.optLong("startTimeMillis")) : null;
                this.zzb = jSONObject.has("endTimeMillis") ? java.lang.Long.valueOf(jSONObject.optLong("endTimeMillis")) : null;
            }

            public java.lang.Long getEndTimeMillis() {
                return this.zzb;
            }

            public java.lang.Long getStartTimeMillis() {
                return this.zza;
            }
        }

        OneTimePurchaseOfferDetails(org.json.JSONObject jSONObject) throws org.json.JSONException {
            this.zza = jSONObject.optString("formattedPrice");
            this.zzb = jSONObject.optLong("priceAmountMicros");
            this.zzc = jSONObject.optString("priceCurrencyCode");
            java.lang.String strOptString = jSONObject.optString("offerIdToken");
            this.zzd = true == strOptString.isEmpty() ? null : strOptString;
            java.lang.String strOptString2 = jSONObject.optString("offerId");
            this.zze = true == strOptString2.isEmpty() ? null : strOptString2;
            java.lang.String strOptString3 = jSONObject.optString("purchaseOptionId");
            this.zzf = true == strOptString3.isEmpty() ? null : strOptString3;
            jSONObject.optInt("offerType");
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            this.zzg = new java.util.ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    this.zzg.add(jSONArrayOptJSONArray.getString(i));
                }
            }
            this.zzh = jSONObject.has("fullPriceMicros") ? java.lang.Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.zzi = jSONObjectOptJSONObject == null ? null : new com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails.DiscountDisplayInfo(jSONObjectOptJSONObject);
            org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.zzj = jSONObjectOptJSONObject2 == null ? null : new com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails.ValidTimeWindow(jSONObjectOptJSONObject2);
            org.json.JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.zzk = jSONObjectOptJSONObject3 == null ? null : new com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails.LimitedQuantityInfo(jSONObjectOptJSONObject3);
            this.zzl = jSONObject.optString("serializedDocid");
            org.json.JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.getLong("preorderReleaseTimeMillis");
                jSONObjectOptJSONObject4.getLong("preorderPresaleEndTimeMillis");
            }
            org.json.JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.zzm = jSONObjectOptJSONObject5 == null ? null : new com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails.RentalDetails(jSONObjectOptJSONObject5);
            org.json.JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.zzn = jSONObjectOptJSONObject6 != null ? new com.android.billingclient.api.zzcs(jSONObjectOptJSONObject6) : null;
            org.json.JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pricingPhases");
            if (jSONArrayOptJSONArray2 == null) {
                return;
            }
            new com.android.billingclient.api.ProductDetails.PricingPhases(jSONArrayOptJSONArray2);
        }

        public com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails.DiscountDisplayInfo getDiscountDisplayInfo() {
            return this.zzi;
        }

        public java.lang.String getFormattedPrice() {
            return this.zza;
        }

        public java.lang.Long getFullPriceMicros() {
            return this.zzh;
        }

        public com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails.LimitedQuantityInfo getLimitedQuantityInfo() {
            return this.zzk;
        }

        public java.lang.String getOfferId() {
            return this.zze;
        }

        public java.util.List<java.lang.String> getOfferTags() {
            return this.zzg;
        }

        public java.lang.String getOfferToken() {
            return this.zzd;
        }

        public long getPriceAmountMicros() {
            return this.zzb;
        }

        public java.lang.String getPriceCurrencyCode() {
            return this.zzc;
        }

        public java.lang.String getPurchaseOptionId() {
            return this.zzf;
        }

        public com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails.RentalDetails getRentalDetails() {
            return this.zzm;
        }

        public com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails.ValidTimeWindow getValidTimeWindow() {
            return this.zzj;
        }

        public final com.android.billingclient.api.zzcs zza() {
            return this.zzn;
        }

        final java.lang.String zzb() {
            return this.zzl;
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static final class PricingPhase {
        private final java.lang.String zza;
        private final long zzb;
        private final java.lang.String zzc;
        private final java.lang.String zzd;
        private final int zze;
        private final int zzf;

        PricingPhase(org.json.JSONObject jSONObject) {
            this.zzd = jSONObject.optString("billingPeriod");
            this.zzc = jSONObject.optString("priceCurrencyCode");
            this.zza = jSONObject.optString("formattedPrice");
            this.zzb = jSONObject.optLong("priceAmountMicros");
            this.zzf = jSONObject.optInt("recurrenceMode");
            this.zze = jSONObject.optInt("billingCycleCount");
        }

        public int getBillingCycleCount() {
            return this.zze;
        }

        public java.lang.String getBillingPeriod() {
            return this.zzd;
        }

        public java.lang.String getFormattedPrice() {
            return this.zza;
        }

        public long getPriceAmountMicros() {
            return this.zzb;
        }

        public java.lang.String getPriceCurrencyCode() {
            return this.zzc;
        }

        public int getRecurrenceMode() {
            return this.zzf;
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static class PricingPhases {
        private final java.util.List zza;

        PricingPhases(org.json.JSONArray jSONArray) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new com.android.billingclient.api.ProductDetails.PricingPhase(jSONObjectOptJSONObject));
                    }
                }
            }
            this.zza = arrayList;
        }

        public java.util.List<com.android.billingclient.api.ProductDetails.PricingPhase> getPricingPhaseList() {
            return this.zza;
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RecurrenceMode {
        public static final int FINITE_RECURRING = 2;
        public static final int INFINITE_RECURRING = 1;
        public static final int NON_RECURRING = 3;
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static final class SubscriptionOfferDetails {
        private final java.lang.String zza;
        private final java.lang.String zzb;
        private final java.lang.String zzc;
        private final com.android.billingclient.api.ProductDetails.PricingPhases zzd;
        private final java.util.List zze;
        private final com.android.billingclient.api.ProductDetails.InstallmentPlanDetails zzf;

        SubscriptionOfferDetails(org.json.JSONObject jSONObject) throws org.json.JSONException {
            this.zza = jSONObject.optString("basePlanId");
            java.lang.String strOptString = jSONObject.optString("offerId");
            this.zzb = true == strOptString.isEmpty() ? null : strOptString;
            this.zzc = jSONObject.getString("offerIdToken");
            this.zzd = new com.android.billingclient.api.ProductDetails.PricingPhases(jSONObject.getJSONArray("pricingPhases"));
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.zzf = jSONObjectOptJSONObject != null ? new com.android.billingclient.api.ProductDetails.InstallmentPlanDetails(jSONObjectOptJSONObject) : null;
            org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID);
                jSONObjectOptJSONObject2.optString(com.ironsource.y8.h.D0);
                jSONObjectOptJSONObject2.optString("name");
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString("basePlanId");
                org.json.JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new com.android.billingclient.api.ProductDetails.PricingPhase(jSONObjectOptJSONObject3);
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                }
            }
            this.zze = arrayList;
        }

        public java.lang.String getBasePlanId() {
            return this.zza;
        }

        public com.android.billingclient.api.ProductDetails.InstallmentPlanDetails getInstallmentPlanDetails() {
            return this.zzf;
        }

        public java.lang.String getOfferId() {
            return this.zzb;
        }

        public java.util.List<java.lang.String> getOfferTags() {
            return this.zze;
        }

        public java.lang.String getOfferToken() {
            return this.zzc;
        }

        public com.android.billingclient.api.ProductDetails.PricingPhases getPricingPhases() {
            return this.zzd;
        }
    }

    ProductDetails(java.lang.String str) throws org.json.JSONException {
        this.zza = str;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        this.zzb = jSONObject;
        java.lang.String strOptString = jSONObject.optString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.zzc = strOptString;
        java.lang.String strOptString2 = jSONObject.optString("type");
        this.zzd = strOptString2;
        if (android.text.TextUtils.isEmpty(strOptString)) {
            throw new java.lang.IllegalArgumentException("Product id cannot be empty.");
        }
        if (android.text.TextUtils.isEmpty(strOptString2)) {
            throw new java.lang.IllegalArgumentException("Product type cannot be empty.");
        }
        this.zze = jSONObject.optString(com.ironsource.y8.h.D0);
        this.zzf = jSONObject.optString("name");
        this.zzg = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.zzh = jSONObject.optString("skuDetailsToken");
        this.zzi = jSONObject.optString("serializedDocid");
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(new com.android.billingclient.api.ProductDetails.SubscriptionOfferDetails(jSONArrayOptJSONArray.getJSONObject(i)));
            }
            this.zzj = arrayList;
        } else {
            this.zzj = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new java.util.ArrayList() : null;
        }
        org.json.JSONObject jSONObjectOptJSONObject = this.zzb.optJSONObject("oneTimePurchaseOfferDetails");
        org.json.JSONArray jSONArrayOptJSONArray2 = this.zzb.optJSONArray("oneTimePurchaseOfferDetailsList");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayList2.add(new com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails(jSONArrayOptJSONArray2.getJSONObject(i2)));
            }
            this.zzk = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.zzk = null;
        } else {
            arrayList2.add(new com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails(jSONObjectOptJSONObject));
            this.zzk = arrayList2;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.android.billingclient.api.ProductDetails) {
            return android.text.TextUtils.equals(this.zza, ((com.android.billingclient.api.ProductDetails) obj).zza);
        }
        return false;
    }

    public java.lang.String getDescription() {
        return this.zzg;
    }

    public java.lang.String getName() {
        return this.zzf;
    }

    public com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {
        java.util.List list = this.zzk;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails) list.get(0);
    }

    public java.util.List<com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails> getOneTimePurchaseOfferDetailsList() {
        return this.zzk;
    }

    public java.lang.String getProductId() {
        return this.zzc;
    }

    public java.lang.String getProductType() {
        return this.zzd;
    }

    public java.util.List<com.android.billingclient.api.ProductDetails.SubscriptionOfferDetails> getSubscriptionOfferDetails() {
        return this.zzj;
    }

    public java.lang.String getTitle() {
        return this.zze;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    public java.lang.String toString() {
        java.util.List list = this.zzj;
        return "ProductDetails{jsonString='" + this.zza + "', parsedJson=" + this.zzb.toString() + ", productId='" + this.zzc + "', productType='" + this.zzd + "', title='" + this.zze + "', productDetailsToken='" + this.zzh + "', subscriptionOfferDetails=" + java.lang.String.valueOf(list) + "}";
    }

    public final java.lang.String zza() {
        return this.zzb.optString(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }

    final java.lang.String zzb() {
        return this.zzh;
    }

    public java.lang.String zzc() {
        return this.zzi;
    }

    final java.util.List zzd() {
        return this.zzk;
    }
}
