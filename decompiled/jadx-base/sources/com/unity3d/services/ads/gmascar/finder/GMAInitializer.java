package com.unity3d.services.ads.gmascar.finder;

/* JADX INFO: loaded from: classes6.dex */
public class GMAInitializer {
    private com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge _adapterStatusBridge;
    private com.unity3d.services.ads.gmascar.utils.GMAEventSender _gmaEventSender;
    private com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge _initializationListenerBridge;
    private com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge _initializationStatusBridge;
    private com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase _mobileAdsBridge;

    public GMAInitializer(com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase mobileAdsBridgeBase, com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge initializeListenerBridge, com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge initializationStatusBridge, com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge adapterStatusBridge, com.unity3d.services.ads.gmascar.utils.GMAEventSender gMAEventSender) {
        this._mobileAdsBridge = mobileAdsBridgeBase;
        this._initializationListenerBridge = initializeListenerBridge;
        this._initializationStatusBridge = initializationStatusBridge;
        this._adapterStatusBridge = adapterStatusBridge;
        this._gmaEventSender = gMAEventSender;
    }

    public void initializeGMA() {
        if (shouldInitialize()) {
            this._mobileAdsBridge.initialize(com.unity3d.services.core.properties.ClientProperties.getApplicationContext(), this._initializationListenerBridge.createInitializeListenerProxy());
        }
    }

    public boolean initSuccessful(java.lang.Object obj) {
        java.lang.Object obj2 = this._initializationStatusBridge.getAdapterStatusMap(obj).get(this._mobileAdsBridge.getClassName());
        if (obj2 != null) {
            if (this._adapterStatusBridge.isGMAInitialized(obj2)) {
                this._gmaEventSender.send(com.unity3d.scar.adapter.common.GMAEvent.INIT_SUCCESS, new java.lang.Object[0]);
                return true;
            }
            this._gmaEventSender.send(com.unity3d.scar.adapter.common.GMAEvent.INIT_ERROR, new java.lang.Object[0]);
        }
        return false;
    }

    public boolean isInitialized() {
        try {
            return initSuccessful(this._mobileAdsBridge.getInitializationStatus());
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.debug("ERROR: Could not get initialization status of GMA SDK - %s", e.getLocalizedMessage());
            return false;
        }
    }

    public boolean shouldInitialize() {
        if (isInitialized()) {
            this._gmaEventSender.send(com.unity3d.scar.adapter.common.GMAEvent.ALREADY_INITIALIZED, new java.lang.Object[0]);
            return false;
        }
        return this._mobileAdsBridge.shouldInitialize();
    }

    public com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge getInitializeListenerBridge() {
        return this._initializationListenerBridge;
    }
}
