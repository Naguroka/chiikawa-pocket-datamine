package com.google.ads.mediation.unity;

/* JADX INFO: loaded from: classes4.dex */
public class UnityInitializer {
    static final java.lang.String ADMOB = "AdMob";
    static final java.lang.String KEY_ADAPTER_VERSION = "adapter_version";
    private static com.google.ads.mediation.unity.UnityInitializer unityInitializerInstance;
    private final com.google.ads.mediation.unity.UnityAdsWrapper unityAdsWrapper;

    static synchronized com.google.ads.mediation.unity.UnityInitializer getInstance() {
        if (unityInitializerInstance == null) {
            unityInitializerInstance = new com.google.ads.mediation.unity.UnityInitializer();
        }
        return unityInitializerInstance;
    }

    private UnityInitializer() {
        this.unityAdsWrapper = new com.google.ads.mediation.unity.UnityAdsWrapper();
    }

    UnityInitializer(com.google.ads.mediation.unity.UnityAdsWrapper unityAdsWrapper) {
        this.unityAdsWrapper = unityAdsWrapper;
    }

    public void initializeUnityAds(android.content.Context context, java.lang.String str, com.unity3d.ads.IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        if (this.unityAdsWrapper.isInitialized()) {
            iUnityAdsInitializationListener.onInitializationComplete();
            return;
        }
        com.unity3d.ads.metadata.MediationMetaData mediationMetaData = this.unityAdsWrapper.getMediationMetaData(context);
        mediationMetaData.setName(ADMOB);
        mediationMetaData.setVersion(this.unityAdsWrapper.getVersion());
        mediationMetaData.set(KEY_ADAPTER_VERSION, com.google.ads.mediation.unity.BuildConfig.ADAPTER_VERSION);
        mediationMetaData.commit();
        this.unityAdsWrapper.initialize(context, str, iUnityAdsInitializationListener);
    }
}
