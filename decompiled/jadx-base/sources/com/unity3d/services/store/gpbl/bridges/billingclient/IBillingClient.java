package com.unity3d.services.store.gpbl.bridges.billingclient;

/* JADX INFO: loaded from: classes6.dex */
public interface IBillingClient {
    com.unity3d.services.store.gpbl.BillingResultResponseCode isFeatureSupported(java.lang.String str);

    boolean isReady();

    void queryPurchaseHistoryAsync(java.lang.String str, com.unity3d.services.store.gpbl.proxies.PurchaseHistoryResponseListenerProxy purchaseHistoryResponseListenerProxy) throws java.lang.ClassNotFoundException;

    void queryPurchasesAsync(java.lang.String str, com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy purchasesResponseListenerProxy) throws java.lang.ClassNotFoundException;

    void querySkuDetailsAsync(com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge skuDetailsParamsBridge, com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy skuDetailsResponseListenerProxy) throws java.lang.ClassNotFoundException;

    void startConnection(com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy billingClientStateListenerProxy) throws java.lang.ClassNotFoundException;
}
