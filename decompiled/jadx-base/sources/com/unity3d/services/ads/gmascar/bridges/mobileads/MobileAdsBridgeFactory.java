package com.unity3d.services.ads.gmascar.bridges.mobileads;

/* JADX INFO: loaded from: classes6.dex */
public class MobileAdsBridgeFactory {
    public com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase createMobileAdsBridge() {
        com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge mobileAdsBridge = new com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge();
        if (mobileAdsBridge.exists()) {
            return mobileAdsBridge;
        }
        com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeLegacy mobileAdsBridgeLegacy = new com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeLegacy();
        if (mobileAdsBridgeLegacy.exists()) {
            return mobileAdsBridgeLegacy;
        }
        return null;
    }
}
