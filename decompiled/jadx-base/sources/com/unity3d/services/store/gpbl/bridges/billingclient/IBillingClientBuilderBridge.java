package com.unity3d.services.store.gpbl.bridges.billingclient;

/* JADX INFO: loaded from: classes6.dex */
public interface IBillingClientBuilderBridge {
    com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient build() throws java.lang.ClassNotFoundException;

    com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge enablePendingPurchases();

    com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge setListener(com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy purchaseUpdatedListenerProxy) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException;
}
