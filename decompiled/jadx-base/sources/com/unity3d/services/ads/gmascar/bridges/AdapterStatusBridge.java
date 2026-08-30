package com.unity3d.services.ads.gmascar.bridges;

/* JADX INFO: loaded from: classes6.dex */
public class AdapterStatusBridge extends com.unity3d.services.core.reflection.GenericBridge {
    private static final java.lang.String initializeStateMethodName = "getInitializationState";
    private java.lang.Class _adapterStateClass;

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected java.lang.String getClassName() {
        return "com.google.android.gms.ads.initialization.AdapterStatus";
    }

    public AdapterStatusBridge() {
        super(new java.util.HashMap<java.lang.String, java.lang.Class<?>[]>() { // from class: com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge.1
            {
                put(com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge.initializeStateMethodName, new java.lang.Class[0]);
            }
        });
        com.unity3d.services.ads.gmascar.bridges.AdapterStatusStateBridge adapterStatusStateBridge = new com.unity3d.services.ads.gmascar.bridges.AdapterStatusStateBridge();
        try {
            this._adapterStateClass = java.lang.Class.forName(adapterStatusStateBridge.getClassName());
        } catch (java.lang.ClassNotFoundException e) {
            com.unity3d.services.core.log.DeviceLog.debug("ERROR: Could not find class %s %s", adapterStatusStateBridge.getClassName(), e.getLocalizedMessage());
        }
    }

    public boolean isGMAInitialized(java.lang.Object obj) {
        java.lang.Object[] adapterStatesEnum = getAdapterStatesEnum();
        if (adapterStatesEnum != null) {
            return callNonVoidMethod(initializeStateMethodName, obj, new java.lang.Object[0]) == adapterStatesEnum[1];
        }
        com.unity3d.services.core.log.DeviceLog.debug("ERROR: Could not get adapter states enum from AdapterStatus.State");
        return false;
    }

    public java.lang.Object[] getAdapterStatesEnum() {
        return this._adapterStateClass.getEnumConstants();
    }
}
