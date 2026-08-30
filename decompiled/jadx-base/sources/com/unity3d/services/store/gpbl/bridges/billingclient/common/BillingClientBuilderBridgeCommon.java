package com.unity3d.services.store.gpbl.bridges.billingclient.common;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BillingClientBuilderBridgeCommon extends com.unity3d.services.core.reflection.GenericBridge implements com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge {
    protected static final java.lang.String buildMethodName = "build";
    private static final java.lang.String enablePendingPurchasesMethodName = "enablePendingPurchases";
    private static final java.lang.String setListenerMethodName = "setListener";
    protected java.lang.Object _billingClientBuilderInternalInstance;

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected java.lang.String getClassName() {
        return "com.android.billingclient.api.BillingClient$Builder";
    }

    public BillingClientBuilderBridgeCommon(java.lang.Object obj) throws java.lang.ClassNotFoundException {
        super(new java.util.HashMap<java.lang.String, java.lang.Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon.1
            {
                put(com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon.setListenerMethodName, new java.lang.Class[]{com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy.getProxyListenerClass()});
                put(com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon.enablePendingPurchasesMethodName, new java.lang.Class[0]);
                put(com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon.buildMethodName, new java.lang.Class[0]);
            }
        });
        this._billingClientBuilderInternalInstance = obj;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    public com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge setListener(com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy purchaseUpdatedListenerProxy) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        this._billingClientBuilderInternalInstance = callNonVoidMethod(setListenerMethodName, this._billingClientBuilderInternalInstance, purchaseUpdatedListenerProxy.getProxyInstance());
        return this;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    public com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge enablePendingPurchases() {
        this._billingClientBuilderInternalInstance = callNonVoidMethod(enablePendingPurchasesMethodName, this._billingClientBuilderInternalInstance, new java.lang.Object[0]);
        return this;
    }
}
