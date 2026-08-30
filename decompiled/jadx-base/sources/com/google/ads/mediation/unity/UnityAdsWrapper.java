package com.google.ads.mediation.unity;

/* JADX INFO: loaded from: classes4.dex */
class UnityAdsWrapper {
    UnityAdsWrapper() {
    }

    public void initialize(android.content.Context context, java.lang.String str, com.unity3d.ads.IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        com.unity3d.ads.UnityAds.initialize(context, str, false, iUnityAdsInitializationListener);
    }

    public boolean isInitialized() {
        return com.unity3d.ads.UnityAds.isInitialized();
    }

    public java.lang.String getVersion() {
        return com.unity3d.ads.UnityAds.getVersion();
    }

    public com.unity3d.ads.metadata.MediationMetaData getMediationMetaData(android.content.Context context) {
        return new com.unity3d.ads.metadata.MediationMetaData(context);
    }
}
