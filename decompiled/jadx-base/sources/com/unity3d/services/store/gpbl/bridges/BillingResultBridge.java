package com.unity3d.services.store.gpbl.bridges;

/* JADX INFO: loaded from: classes6.dex */
public class BillingResultBridge extends com.unity3d.services.core.reflection.GenericBridge {
    private static final java.lang.String getResponseCodeMethodName = "getResponseCode";
    private final java.lang.Object _billingResult;

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected java.lang.String getClassName() {
        return "com.android.billingclient.api.BillingResult";
    }

    public BillingResultBridge(java.lang.Object obj) {
        super(new java.util.HashMap<java.lang.String, java.lang.Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.BillingResultBridge.1
            {
                put(com.unity3d.services.store.gpbl.bridges.BillingResultBridge.getResponseCodeMethodName, new java.lang.Class[0]);
            }
        });
        this._billingResult = obj;
    }

    public com.unity3d.services.store.gpbl.BillingResultResponseCode getResponseCode() {
        return com.unity3d.services.store.gpbl.BillingResultResponseCode.fromResponseCode(((java.lang.Integer) callNonVoidMethod(getResponseCodeMethodName, this._billingResult, new java.lang.Object[0])).intValue());
    }
}
