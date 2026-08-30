package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class AlternativeBillingOnlyReportingDetails {
    private final java.lang.String externalTransactionToken;

    AlternativeBillingOnlyReportingDetails(java.lang.String str) throws org.json.JSONException {
        this.externalTransactionToken = new org.json.JSONObject(str).optString("externalTransactionToken");
    }

    public java.lang.String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }
}
