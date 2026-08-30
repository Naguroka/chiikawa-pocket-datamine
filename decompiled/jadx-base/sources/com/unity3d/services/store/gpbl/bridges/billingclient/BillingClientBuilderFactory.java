package com.unity3d.services.store.gpbl.bridges.billingclient;

/* JADX INFO: loaded from: classes6.dex */
public class BillingClientBuilderFactory {
    public static com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge getBillingClientBuilder(android.content.Context context) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        return com.unity3d.services.store.gpbl.bridges.billingclient.v4.BillingClientBridge.newBuilder(context);
    }
}
