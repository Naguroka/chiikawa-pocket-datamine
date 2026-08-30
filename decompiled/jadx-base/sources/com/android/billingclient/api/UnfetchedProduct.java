package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class UnfetchedProduct {
    private final java.lang.String jsonString;
    private final java.lang.String productId;
    private final java.lang.String productType;
    private final java.lang.String serializedDocid;
    private final int statusCode;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StatusCode {
        public static final int INVALID_PRODUCT_ID_FORMAT = 2;
        public static final int NO_ELIGIBLE_OFFER = 4;
        public static final int PRODUCT_NOT_FOUND = 3;
        public static final int UNKNOWN = 0;
    }

    UnfetchedProduct(java.lang.String str) throws org.json.JSONException {
        this.jsonString = str;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        this.productId = jSONObject.optString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID);
        java.lang.String strOptString = jSONObject.optString("type");
        this.productType = strOptString;
        this.statusCode = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (android.text.TextUtils.isEmpty(strOptString)) {
            throw new java.lang.IllegalArgumentException("Product type cannot be empty.");
        }
        this.serializedDocid = jSONObject.optString("serializedDocid");
    }

    public static com.android.billingclient.api.UnfetchedProduct fromJson(java.lang.String str) throws org.json.JSONException {
        return new com.android.billingclient.api.UnfetchedProduct(str);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.android.billingclient.api.UnfetchedProduct) {
            return android.text.TextUtils.equals(this.jsonString, ((com.android.billingclient.api.UnfetchedProduct) obj).jsonString);
        }
        return false;
    }

    public java.lang.String getProductId() {
        return this.productId;
    }

    public java.lang.String getProductType() {
        return this.productType;
    }

    public java.lang.String getSerializedDocid() {
        return this.serializedDocid;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return this.jsonString.hashCode();
    }

    public java.lang.String toString() {
        return "UnfetchedProduct{productId='" + this.productId + "', productType='" + this.productType + "', statusCode=" + this.statusCode + "}";
    }
}
