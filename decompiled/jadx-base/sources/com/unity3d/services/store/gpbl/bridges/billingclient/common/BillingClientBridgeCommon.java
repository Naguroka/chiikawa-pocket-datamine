package com.unity3d.services.store.gpbl.bridges.billingclient.common;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BillingClientBridgeCommon extends com.unity3d.services.core.reflection.GenericBridge implements com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient {
    protected static final java.lang.String endConnectionMethodName = "endConnection";
    protected static final java.lang.String isFeatureSupportedMethodName = "isFeatureSupported";
    protected static final java.lang.String isReadyMethodName = "isReady";
    protected static final java.lang.String newBuilderMethodName = "newBuilder";
    protected static final java.lang.String queryPurchaseHistoryAsyncMethodName = "queryPurchaseHistoryAsync";
    protected static final java.lang.String querySkuDetailsAsyncMethodName = "querySkuDetailsAsync";
    protected static final java.lang.String startConnectionMethodName = "startConnection";
    private static final java.util.Map<java.lang.String, java.lang.Class<?>[]> staticMethods = new java.util.HashMap<java.lang.String, java.lang.Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon.1
        {
            put(com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon.newBuilderMethodName, new java.lang.Class[]{android.content.Context.class});
        }
    };
    protected final java.lang.Object _billingClientInternalInstance;

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected java.lang.String getClassName() {
        return "com.android.billingclient.api.BillingClient";
    }

    public BillingClientBridgeCommon(java.lang.Object obj, java.util.Map<java.lang.String, java.lang.Class<?>[]> map) throws java.lang.ClassNotFoundException {
        super(appendFunctionAnParameters(map));
        this._billingClientInternalInstance = obj;
    }

    private static java.util.Map<java.lang.String, java.lang.Class<?>[]> appendFunctionAnParameters(java.util.Map<java.lang.String, java.lang.Class<?>[]> map) throws java.lang.ClassNotFoundException {
        map.putAll(new java.util.HashMap<java.lang.String, java.lang.Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon.2
            {
                put(com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon.newBuilderMethodName, new java.lang.Class[]{android.content.Context.class});
                put(com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon.startConnectionMethodName, new java.lang.Class[]{com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy.getProxyListenerClass()});
                put(com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon.endConnectionMethodName, new java.lang.Class[0]);
                put(com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon.querySkuDetailsAsyncMethodName, new java.lang.Class[]{com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.getClassForBridge(), com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy.getProxyListenerClass()});
                put(com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon.queryPurchaseHistoryAsyncMethodName, new java.lang.Class[]{java.lang.String.class, com.unity3d.services.store.gpbl.proxies.PurchaseHistoryResponseListenerProxy.getProxyListenerClass()});
                put(com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon.isFeatureSupportedMethodName, new java.lang.Class[]{java.lang.String.class});
                put(com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon.isReadyMethodName, new java.lang.Class[0]);
            }
        });
        return map;
    }

    protected static java.lang.Class<?> getClassForBridge() throws java.lang.ClassNotFoundException {
        return java.lang.Class.forName("com.android.billingclient.api.BillingClient");
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void startConnection(com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy billingClientStateListenerProxy) throws java.lang.ClassNotFoundException {
        callVoidMethod(startConnectionMethodName, this._billingClientInternalInstance, billingClientStateListenerProxy.getProxyInstance());
    }

    public void endConnection() {
        callVoidMethod(endConnectionMethodName, this._billingClientInternalInstance, new java.lang.Object[0]);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public com.unity3d.services.store.gpbl.BillingResultResponseCode isFeatureSupported(java.lang.String str) {
        return new com.unity3d.services.store.gpbl.bridges.BillingResultBridge(callNonVoidMethod(isFeatureSupportedMethodName, this._billingClientInternalInstance, str)).getResponseCode();
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public boolean isReady() {
        return ((java.lang.Boolean) callNonVoidMethod(isReadyMethodName, this._billingClientInternalInstance, new java.lang.Object[0])).booleanValue();
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void querySkuDetailsAsync(com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge skuDetailsParamsBridge, com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy skuDetailsResponseListenerProxy) throws java.lang.ClassNotFoundException {
        callVoidMethod(querySkuDetailsAsyncMethodName, this._billingClientInternalInstance, skuDetailsParamsBridge.getInternalInstance(), skuDetailsResponseListenerProxy.getProxyInstance());
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void queryPurchaseHistoryAsync(java.lang.String str, com.unity3d.services.store.gpbl.proxies.PurchaseHistoryResponseListenerProxy purchaseHistoryResponseListenerProxy) throws java.lang.ClassNotFoundException {
        callVoidMethod(queryPurchaseHistoryAsyncMethodName, this._billingClientInternalInstance, str, purchaseHistoryResponseListenerProxy.getProxyInstance());
    }

    public static java.lang.Object callNonVoidStaticMethod(java.lang.String str, java.lang.Object... objArr) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        return getClassForBridge().getMethod(str, staticMethods.get(str)).invoke(null, objArr);
    }
}
