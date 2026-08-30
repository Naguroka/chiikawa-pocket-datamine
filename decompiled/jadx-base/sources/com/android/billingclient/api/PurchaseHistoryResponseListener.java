package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public interface PurchaseHistoryResponseListener {
    void onPurchaseHistoryResponse(com.android.billingclient.api.BillingResult billingResult, java.util.List<com.android.billingclient.api.PurchaseHistoryRecord> list);
}
