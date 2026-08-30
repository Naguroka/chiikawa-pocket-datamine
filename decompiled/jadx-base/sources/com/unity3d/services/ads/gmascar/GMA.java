package com.unity3d.services.ads.gmascar;

/* JADX INFO: loaded from: classes6.dex */
public class GMA {
    private static com.unity3d.services.ads.gmascar.GMAScarAdapterBridge _gmaScarAdapterBridge = new com.unity3d.services.ads.gmascar.GMAScarAdapterBridge(new com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeFactory().createMobileAdsBridge(), new com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge(), new com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge(), new com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge(), new com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler(), new com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory(), new com.unity3d.services.ads.gmascar.utils.GMAEventSender());
    private static com.unity3d.services.ads.gmascar.GMA instance;

    private GMA() {
    }

    public static com.unity3d.services.ads.gmascar.GMA getInstance() {
        if (instance == null) {
            instance = new com.unity3d.services.ads.gmascar.GMA();
        }
        return instance;
    }

    public com.unity3d.services.ads.gmascar.GMAScarAdapterBridge getBridge() {
        return _gmaScarAdapterBridge;
    }

    public boolean hasSCARBiddingSupport() {
        return _gmaScarAdapterBridge.hasSCARBiddingSupport();
    }

    public void getSCARBiddingSignals(boolean z, com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener iBiddingSignalsListener) {
        _gmaScarAdapterBridge.getSCARBiddingSignals(z, new com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler(z, iBiddingSignalsListener));
    }
}
