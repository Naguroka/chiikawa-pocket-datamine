package com.unity3d.services.store.gpbl.listeners;

/* JADX INFO: compiled from: PurchaseHistoryResponseListener.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&¨\u0006\t"}, d2 = {"Lcom/unity3d/services/store/gpbl/listeners/PurchaseHistoryResponseListener;", "", "onPurchaseHistoryUpdated", "", "billingResult", "Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;", "purchaseHistoryRecordList", "", "Lcom/unity3d/services/store/gpbl/bridges/PurchaseHistoryRecordBridge;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PurchaseHistoryResponseListener {
    void onPurchaseHistoryUpdated(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResult, java.util.List<? extends com.unity3d.services.store.gpbl.bridges.PurchaseHistoryRecordBridge> purchaseHistoryRecordList);
}
