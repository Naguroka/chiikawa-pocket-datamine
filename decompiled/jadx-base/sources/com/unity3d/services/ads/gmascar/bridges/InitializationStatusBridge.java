package com.unity3d.services.ads.gmascar.bridges;

/* JADX INFO: loaded from: classes6.dex */
public class InitializationStatusBridge extends com.unity3d.services.core.reflection.GenericBridge {
    private static final java.lang.String adapterStatusMapMethodName = "getAdapterStatusMap";

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public java.lang.String getClassName() {
        return "com.google.android.gms.ads.initialization.InitializationStatus";
    }

    public InitializationStatusBridge() {
        super(new java.util.HashMap<java.lang.String, java.lang.Class<?>[]>() { // from class: com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge.1
            {
                put(com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge.adapterStatusMapMethodName, new java.lang.Class[0]);
            }
        });
    }

    public java.util.Map<java.lang.String, java.lang.Object> getAdapterStatusMap(java.lang.Object obj) {
        return (java.util.Map) callNonVoidMethod(adapterStatusMapMethodName, obj, new java.lang.Object[0]);
    }
}
