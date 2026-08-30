package com.unity3d.services.store.gpbl.bridges;

/* JADX INFO: loaded from: classes6.dex */
public abstract class CommonJsonResponseBridge extends com.unity3d.services.core.reflection.GenericBridge implements com.unity3d.services.store.gpbl.IBillingResponse, com.unity3d.services.store.JsonSerializable {
    private static final java.lang.String getOriginalJsonMethodName = "getOriginalJson";
    private final java.lang.Object _internalBridgeRef;

    protected CommonJsonResponseBridge(java.lang.Object obj) {
        this(obj, new java.util.HashMap());
    }

    protected CommonJsonResponseBridge(java.lang.Object obj, java.util.Map<java.lang.String, java.lang.Class<?>[]> map) {
        super(appendCommonResponseMethods(map));
        this._internalBridgeRef = obj;
    }

    private static java.util.Map<java.lang.String, java.lang.Class<?>[]> appendCommonResponseMethods(java.util.Map<java.lang.String, java.lang.Class<?>[]> map) {
        map.putAll(new java.util.HashMap<java.lang.String, java.lang.Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.CommonJsonResponseBridge.1
            {
                put(com.unity3d.services.store.gpbl.bridges.CommonJsonResponseBridge.getOriginalJsonMethodName, new java.lang.Class[0]);
            }
        });
        return map;
    }

    @Override // com.unity3d.services.store.gpbl.IBillingResponse
    public org.json.JSONObject getOriginalJson() {
        try {
            return new org.json.JSONObject((java.lang.String) callNonVoidMethod(getOriginalJsonMethodName, this._internalBridgeRef, new java.lang.Object[0]));
        } catch (org.json.JSONException e) {
            com.unity3d.services.core.log.DeviceLog.error("Couldn't parse BillingResponse JSON : %s", e.getMessage());
            return null;
        }
    }

    @Override // com.unity3d.services.store.JsonSerializable
    public org.json.JSONObject toJson() {
        return getOriginalJson();
    }
}
