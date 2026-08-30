package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public interface PurchasesResponseListener {
    void onQueryPurchasesResponse(com.android.billingclient.api.BillingResult billingResult, java.util.List<com.android.billingclient.api.Purchase> list);
}
