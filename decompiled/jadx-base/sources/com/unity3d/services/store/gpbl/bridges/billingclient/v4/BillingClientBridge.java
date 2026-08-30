package com.unity3d.services.store.gpbl.bridges.billingclient.v4;

/* JADX INFO: loaded from: classes6.dex */
public class BillingClientBridge extends com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon {
    private static final java.lang.String queryPurchasesAsyncMethodName = "queryPurchasesAsync";

    public BillingClientBridge(java.lang.Object obj) throws java.lang.ClassNotFoundException {
        super(obj, new java.util.HashMap<java.lang.String, java.lang.Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.v4.BillingClientBridge.1
            {
                put(com.unity3d.services.store.gpbl.bridges.billingclient.v4.BillingClientBridge.queryPurchasesAsyncMethodName, new java.lang.Class[]{java.lang.String.class, com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy.getProxyListenerClass()});
            }
        });
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void queryPurchasesAsync(java.lang.String str, com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy purchasesResponseListenerProxy) throws java.lang.ClassNotFoundException {
        callVoidMethod(queryPurchasesAsyncMethodName, this._billingClientInternalInstance, str, purchasesResponseListenerProxy.getProxyInstance());
    }

    public static boolean isAvailable() {
        try {
            getClassForBridge().getMethod(queryPurchasesAsyncMethodName, java.lang.String.class, com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy.getProxyListenerClass());
            return true;
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
            return false;
        }
    }

    public static com.unity3d.services.store.gpbl.bridges.billingclient.v4.BillingClientBridge.BuilderBridge newBuilder(android.content.Context context) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        return new com.unity3d.services.store.gpbl.bridges.billingclient.v4.BillingClientBridge.BuilderBridge(callNonVoidStaticMethod("newBuilder", context));
    }

    public static class BuilderBridge extends com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon {
        public BuilderBridge(java.lang.Object obj) throws java.lang.ClassNotFoundException {
            super(obj);
        }

        @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
        public com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon build() throws java.lang.ClassNotFoundException {
            return new com.unity3d.services.store.gpbl.bridges.billingclient.v4.BillingClientBridge(callNonVoidMethod("build", this._billingClientBuilderInternalInstance, new java.lang.Object[0]));
        }
    }
}
