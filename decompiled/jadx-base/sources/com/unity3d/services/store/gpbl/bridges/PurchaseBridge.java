package com.unity3d.services.store.gpbl.bridges;

/* JADX INFO: loaded from: classes6.dex */
public class PurchaseBridge extends com.unity3d.services.store.gpbl.bridges.CommonJsonResponseBridge {
    private static final java.lang.String getSignatureMethodName = "getSignature";
    private final java.lang.Object _purchase;

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected java.lang.String getClassName() {
        return "com.android.billingclient.api.Purchase";
    }

    public PurchaseBridge(java.lang.Object obj) {
        super(obj, new java.util.HashMap<java.lang.String, java.lang.Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.PurchaseBridge.1
            {
                put(com.unity3d.services.store.gpbl.bridges.PurchaseBridge.getSignatureMethodName, new java.lang.Class[0]);
            }
        });
        this._purchase = obj;
    }

    public java.lang.String getSignature() {
        return (java.lang.String) callNonVoidMethod(getSignatureMethodName, this._purchase, new java.lang.Object[0]);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.CommonJsonResponseBridge, com.unity3d.services.store.JsonSerializable
    public org.json.JSONObject toJson() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("purchaseData", getOriginalJson());
            jSONObject.put(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE, getSignature());
        } catch (org.json.JSONException e) {
            com.unity3d.services.core.log.DeviceLog.warning("Could not build Purchase result Json: ", e.getMessage());
        }
        return jSONObject;
    }
}
