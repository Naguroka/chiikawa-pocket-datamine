package com.unity3d.services.ads.gmascar.bridges.mobileads;

/* JADX INFO: loaded from: classes6.dex */
public class MobileAdsBridge extends com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase {
    public static final int CODE_21 = 21;
    public static final java.lang.String versionMethodName = "getVersion";
    private com.unity3d.services.core.configuration.ConfigurationReader _configurationReader;

    @Override // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public int getVersionCodeIndex() {
        return 0;
    }

    @Override // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public java.lang.String getVersionMethodName() {
        return versionMethodName;
    }

    @Override // com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase
    public boolean hasSCARBiddingSupport() {
        return true;
    }

    public MobileAdsBridge() {
        super(new java.util.HashMap<java.lang.String, java.lang.Class<?>[]>() { // from class: com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge.1
            {
                try {
                    put(com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, new java.lang.Class[]{android.content.Context.class, java.lang.Class.forName("com.google.android.gms.ads.initialization.OnInitializationCompleteListener")});
                } catch (java.lang.ClassNotFoundException e) {
                    com.unity3d.services.core.log.DeviceLog.debug("Could not find class \"com.google.android.gms.ads.initialization.OnInitializationCompleteListener\" %s", e.getLocalizedMessage());
                }
                put(com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializationStatusMethodName, new java.lang.Class[0]);
                put(com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge.versionMethodName, new java.lang.Class[0]);
            }
        });
        this._configurationReader = new com.unity3d.services.core.configuration.ConfigurationReader();
    }

    @Override // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion getAdapterVersion(int i) {
        if (i == -1) {
            return com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion.NA;
        }
        if (i < 23) {
            return com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion.V21;
        }
        return com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion.V23;
    }

    @Override // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public boolean shouldInitialize() {
        return this._configurationReader.getCurrentConfiguration().getExperiments().isScarInitEnabled();
    }
}
