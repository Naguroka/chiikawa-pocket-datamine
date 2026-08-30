package com.unity3d.services.ads.gmascar.managers;

/* JADX INFO: loaded from: classes6.dex */
public class BiddingManagerFactory {
    private static com.unity3d.services.ads.gmascar.managers.BiddingManagerFactory instance;

    private BiddingManagerFactory() {
    }

    public static com.unity3d.services.ads.gmascar.managers.BiddingManagerFactory getInstance() {
        if (instance == null) {
            instance = new com.unity3d.services.ads.gmascar.managers.BiddingManagerFactory();
        }
        return instance;
    }

    public com.unity3d.services.ads.gmascar.managers.BiddingBaseManager createManager(com.unity3d.ads.IUnityAdsTokenListener iUnityAdsTokenListener, com.unity3d.services.core.configuration.IExperiments iExperiments) {
        if (com.unity3d.services.ads.gmascar.GMA.getInstance().hasSCARBiddingSupport()) {
            return getExperiment(iUnityAdsTokenListener, iExperiments);
        }
        return new com.unity3d.services.ads.gmascar.managers.BiddingDisabledManager(iUnityAdsTokenListener);
    }

    private com.unity3d.services.ads.gmascar.managers.BiddingBaseManager getExperiment(com.unity3d.ads.IUnityAdsTokenListener iUnityAdsTokenListener, com.unity3d.services.core.configuration.IExperiments iExperiments) {
        if (iExperiments == null || iExperiments.getScarBiddingManager() == null) {
            return new com.unity3d.services.ads.gmascar.managers.BiddingDisabledManager(iUnityAdsTokenListener);
        }
        if (com.unity3d.services.ads.gmascar.managers.BiddingManagerFactory.AnonymousClass1.$SwitchMap$com$unity3d$services$ads$gmascar$managers$ScarBiddingManagerType[com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType.fromName(iExperiments.getScarBiddingManager()).ordinal()] == 1) {
            return new com.unity3d.services.ads.gmascar.managers.BiddingEagerManager(iExperiments.isScarBannerHbEnabled(), iUnityAdsTokenListener);
        }
        return new com.unity3d.services.ads.gmascar.managers.BiddingDisabledManager(iUnityAdsTokenListener);
    }

    /* JADX INFO: renamed from: com.unity3d.services.ads.gmascar.managers.BiddingManagerFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$ads$gmascar$managers$ScarBiddingManagerType;

        static {
            int[] iArr = new int[com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType.values().length];
            $SwitchMap$com$unity3d$services$ads$gmascar$managers$ScarBiddingManagerType = iArr;
            try {
                iArr[com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType.EAGER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$ads$gmascar$managers$ScarBiddingManagerType[com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType.DISABLED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }
}
