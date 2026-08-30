package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class BillingConfig {
    private final java.lang.String countryCode;

    BillingConfig(java.lang.String str) throws org.json.JSONException {
        this.countryCode = new org.json.JSONObject(str).optString("countryCode");
    }

    private BillingConfig(java.lang.String str, java.lang.String str2) {
        this.countryCode = str2;
    }

    static com.android.billingclient.api.BillingConfig forCountryCode(java.lang.String str) {
        return new com.android.billingclient.api.BillingConfig(null, str);
    }

    public java.lang.String getCountryCode() {
        return this.countryCode;
    }
}
