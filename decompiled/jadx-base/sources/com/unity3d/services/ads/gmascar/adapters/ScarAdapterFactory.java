package com.unity3d.services.ads.gmascar.adapters;

/* JADX INFO: loaded from: classes6.dex */
public class ScarAdapterFactory {

    /* JADX INFO: renamed from: com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion;

        static {
            int[] iArr = new int[com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion.values().length];
            $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion = iArr;
            try {
                iArr[com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion.V20.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion[com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion.V21.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion[com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion.V23.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion[com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion.NA.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public com.unity3d.scar.adapter.common.IScarAdapter createScarAdapter(com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion scarAdapterVersion, com.unity3d.scar.adapter.common.IAdsErrorHandler<com.unity3d.scar.adapter.common.WebViewAdsError> iAdsErrorHandler) {
        int i = com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory.AnonymousClass1.$SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion[scarAdapterVersion.ordinal()];
        if (i == 1) {
            return new com.unity3d.scar.adapter.v2000.ScarAdapter(iAdsErrorHandler);
        }
        if (i == 2) {
            return new com.unity3d.scar.adapter.v2100.ScarAdapter(iAdsErrorHandler, com.unity3d.services.core.properties.SdkProperties.getVersionName());
        }
        if (i == 3) {
            return new com.unity3d.scar.adapter.v2300.ScarAdapter(iAdsErrorHandler, com.unity3d.services.core.properties.SdkProperties.getVersionName());
        }
        reportAdapterFailure(scarAdapterVersion, iAdsErrorHandler);
        return null;
    }

    private void reportAdapterFailure(com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion scarAdapterVersion, com.unity3d.scar.adapter.common.IAdsErrorHandler<com.unity3d.scar.adapter.common.WebViewAdsError> iAdsErrorHandler) {
        java.lang.String str = java.lang.String.format("SCAR version %s is not supported.", scarAdapterVersion.name());
        iAdsErrorHandler.handleError(com.unity3d.scar.adapter.common.GMAAdsError.AdapterCreationError(str));
        com.unity3d.services.core.log.DeviceLog.debug(str);
    }
}
