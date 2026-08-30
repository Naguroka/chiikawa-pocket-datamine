package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbq implements com.android.billingclient.api.AcknowledgePurchaseResponseListener, com.android.billingclient.api.BillingClientStateListener, com.android.billingclient.api.ConsumeResponseListener, com.android.billingclient.api.PurchaseHistoryResponseListener, com.android.billingclient.api.PurchasesResponseListener, com.android.billingclient.api.PurchasesUpdatedListener, com.android.billingclient.api.SkuDetailsResponseListener {
    private final long zza;

    zzbq() {
        this.zza = 0L;
    }

    zzbq(long j) {
        this.zza = j;
    }

    public static native void nativeOnAcknowledgePurchaseResponse(int i, java.lang.String str, long j);

    public static native void nativeOnBillingServiceDisconnected();

    public static native void nativeOnBillingSetupFinished(int i, java.lang.String str, long j);

    public static native void nativeOnConsumePurchaseResponse(int i, java.lang.String str, java.lang.String str2, long j);

    public static native void nativeOnPriceChangeConfirmationResult(int i, java.lang.String str, long j);

    public static native void nativeOnPurchaseHistoryResponse(int i, java.lang.String str, com.android.billingclient.api.PurchaseHistoryRecord[] purchaseHistoryRecordArr, long j);

    public static native void nativeOnPurchasesUpdated(int i, java.lang.String str, com.android.billingclient.api.Purchase[] purchaseArr);

    public static native void nativeOnQueryPurchasesResponse(int i, java.lang.String str, com.android.billingclient.api.Purchase[] purchaseArr, long j);

    public static native void nativeOnSkuDetailsResponse(int i, java.lang.String str, com.android.billingclient.api.SkuDetails[] skuDetailsArr, long j);

    @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
    public final void onAcknowledgePurchaseResponse(com.android.billingclient.api.BillingResult billingResult) {
        nativeOnAcknowledgePurchaseResponse(billingResult.getResponseCode(), billingResult.getDebugMessage(), this.zza);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
        nativeOnBillingServiceDisconnected();
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(com.android.billingclient.api.BillingResult billingResult) {
        nativeOnBillingSetupFinished(billingResult.getResponseCode(), billingResult.getDebugMessage(), this.zza);
    }

    @Override // com.android.billingclient.api.ConsumeResponseListener
    public final void onConsumeResponse(com.android.billingclient.api.BillingResult billingResult, java.lang.String str) {
        nativeOnConsumePurchaseResponse(billingResult.getResponseCode(), billingResult.getDebugMessage(), str, this.zza);
    }

    @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
    public final void onPurchaseHistoryResponse(com.android.billingclient.api.BillingResult billingResult, java.util.List<com.android.billingclient.api.PurchaseHistoryRecord> list) {
        if (list == null) {
            list = java.util.Collections.emptyList();
        }
        nativeOnPurchaseHistoryResponse(billingResult.getResponseCode(), billingResult.getDebugMessage(), (com.android.billingclient.api.PurchaseHistoryRecord[]) list.toArray(new com.android.billingclient.api.PurchaseHistoryRecord[list.size()]), this.zza);
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public final void onPurchasesUpdated(com.android.billingclient.api.BillingResult billingResult, java.util.List<com.android.billingclient.api.Purchase> list) {
        if (list == null) {
            list = java.util.Collections.emptyList();
        }
        nativeOnPurchasesUpdated(billingResult.getResponseCode(), billingResult.getDebugMessage(), (com.android.billingclient.api.Purchase[]) list.toArray(new com.android.billingclient.api.Purchase[list.size()]));
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public final void onQueryPurchasesResponse(com.android.billingclient.api.BillingResult billingResult, java.util.List<com.android.billingclient.api.Purchase> list) {
        nativeOnQueryPurchasesResponse(billingResult.getResponseCode(), billingResult.getDebugMessage(), (com.android.billingclient.api.Purchase[]) list.toArray(new com.android.billingclient.api.Purchase[list.size()]), this.zza);
    }

    @Override // com.android.billingclient.api.SkuDetailsResponseListener
    public final void onSkuDetailsResponse(com.android.billingclient.api.BillingResult billingResult, java.util.List<com.android.billingclient.api.SkuDetails> list) {
        if (list == null) {
            list = java.util.Collections.emptyList();
        }
        nativeOnSkuDetailsResponse(billingResult.getResponseCode(), billingResult.getDebugMessage(), (com.android.billingclient.api.SkuDetails[]) list.toArray(new com.android.billingclient.api.SkuDetails[list.size()]), this.zza);
    }
}
