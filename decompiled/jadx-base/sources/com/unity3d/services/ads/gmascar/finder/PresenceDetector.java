package com.unity3d.services.ads.gmascar.finder;

/* JADX INFO: loaded from: classes6.dex */
public class PresenceDetector {
    private com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge _adapterStatusBridge;
    private com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge _initializationListenerBridge;
    private com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge _initializationStatusBridge;
    private com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase _mobileAdsBridge;

    public PresenceDetector(com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase mobileAdsBridgeBase, com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge initializeListenerBridge, com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge initializationStatusBridge, com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge adapterStatusBridge) {
        this._mobileAdsBridge = mobileAdsBridgeBase;
        this._initializationListenerBridge = initializeListenerBridge;
        this._initializationStatusBridge = initializationStatusBridge;
        this._adapterStatusBridge = adapterStatusBridge;
    }

    public boolean areGMAClassesPresent() {
        com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase mobileAdsBridgeBase = this._mobileAdsBridge;
        return mobileAdsBridgeBase != null && this._initializationListenerBridge != null && this._initializationStatusBridge != null && this._adapterStatusBridge != null && mobileAdsBridgeBase.exists() && this._initializationListenerBridge.exists() && this._initializationStatusBridge.exists() && this._adapterStatusBridge.exists();
    }
}
