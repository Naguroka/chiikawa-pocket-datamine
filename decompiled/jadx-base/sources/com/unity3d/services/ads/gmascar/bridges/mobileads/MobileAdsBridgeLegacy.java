package com.unity3d.services.ads.gmascar.bridges.mobileads;

/* JADX INFO: loaded from: classes6.dex */
public class MobileAdsBridgeLegacy extends com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase {
    public static final int CODE_20_0 = 210402000;
    public static final int CODE_21_0 = 221310000;
    public static final java.lang.String versionStringMethodName = "getVersionString";

    @Override // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public int getVersionCodeIndex() {
        return 1;
    }

    @Override // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public java.lang.String getVersionMethodName() {
        return versionStringMethodName;
    }

    @Override // com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase
    public boolean hasSCARBiddingSupport() {
        return false;
    }

    @Override // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public boolean shouldInitialize() {
        return true;
    }

    public MobileAdsBridgeLegacy() {
        super(new java.util.HashMap<java.lang.String, java.lang.Class<?>[]>() { // from class: com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeLegacy.1
            {
                try {
                    put(com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, new java.lang.Class[]{android.content.Context.class, java.lang.Class.forName("com.google.android.gms.ads.initialization.OnInitializationCompleteListener")});
                } catch (java.lang.ClassNotFoundException e) {
                    com.unity3d.services.core.log.DeviceLog.debug("Could not find class \"com.google.android.gms.ads.initialization.OnInitializationCompleteListener\" %s", e.getLocalizedMessage());
                }
                put(com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializationStatusMethodName, new java.lang.Class[0]);
                put(com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeLegacy.versionStringMethodName, new java.lang.Class[0]);
            }
        });
    }

    @Override // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion getAdapterVersion(int i) {
        if (i >= 210402000 && i < 221310000) {
            return com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion.V20;
        }
        return com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion.NA;
    }
}
