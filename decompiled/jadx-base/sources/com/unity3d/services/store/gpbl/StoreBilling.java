package com.unity3d.services.store.gpbl;

/* JADX INFO: loaded from: classes6.dex */
public class StoreBilling {
    private final com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient _billingClientBridge;

    public StoreBilling(android.content.Context context, com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener purchaseUpdatedResponseListener) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        this._billingClientBridge = com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientBuilderFactory.getBillingClientBuilder(context).setListener(new com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy(purchaseUpdatedResponseListener)).enablePendingPurchases().build();
    }

    public void initialize(com.unity3d.services.store.gpbl.listeners.BillingClientStateListener billingClientStateListener) throws java.lang.ClassNotFoundException {
        this._billingClientBridge.startConnection(new com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy(billingClientStateListener));
    }

    public int isFeatureSupported(java.lang.String str) {
        boolean zIsReady;
        if (str.equals("inapp")) {
            zIsReady = this._billingClientBridge.isReady();
        } else {
            if (str.equals("subs")) {
                str = com.android.billingclient.api.BillingClient.FeatureType.SUBSCRIPTIONS;
            }
            zIsReady = this._billingClientBridge.isFeatureSupported(str) == com.unity3d.services.store.gpbl.BillingResultResponseCode.OK;
        }
        return zIsReady ? 0 : -1;
    }

    public void getPurchases(java.lang.String str, com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener purchasesResponseListener) throws java.lang.ClassNotFoundException {
        this._billingClientBridge.queryPurchasesAsync(str, new com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy(purchasesResponseListener));
    }

    public void getSkuDetails(java.lang.String str, java.util.List<java.lang.String> list, com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener skuDetailsResponseListener) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        this._billingClientBridge.querySkuDetailsAsync(com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.newBuilder().setSkuList(list).setType(str).build(), new com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy(skuDetailsResponseListener));
    }

    public void getPurchaseHistory(java.lang.String str, int i, com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener purchaseHistoryResponseListener) throws java.lang.ClassNotFoundException {
        this._billingClientBridge.queryPurchaseHistoryAsync(str, new com.unity3d.services.store.gpbl.proxies.PurchaseHistoryResponseListenerProxy(purchaseHistoryResponseListener, i));
    }
}
