package com.google.ads.mediation.unity;

/* JADX INFO: loaded from: classes4.dex */
class UnityAdsLoader {
    UnityAdsLoader() {
    }

    public void load(java.lang.String str, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, com.unity3d.ads.IUnityAdsLoadListener iUnityAdsLoadListener) {
        com.unity3d.ads.UnityAds.load(str, unityAdsLoadOptions, iUnityAdsLoadListener);
    }

    public void show(android.app.Activity activity, java.lang.String str, com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions, com.unity3d.ads.IUnityAdsShowListener iUnityAdsShowListener) {
        com.unity3d.ads.UnityAds.show(activity, str, unityAdsShowOptions, iUnityAdsShowListener);
    }

    public com.unity3d.ads.UnityAdsLoadOptions createUnityAdsLoadOptions() {
        return new com.unity3d.ads.UnityAdsLoadOptions();
    }

    public com.unity3d.ads.UnityAdsLoadOptions createUnityAdsLoadOptionsWithId(java.lang.String str) {
        com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptionsCreateUnityAdsLoadOptions = createUnityAdsLoadOptions();
        unityAdsLoadOptionsCreateUnityAdsLoadOptions.setObjectId(str);
        return unityAdsLoadOptionsCreateUnityAdsLoadOptions;
    }

    public com.unity3d.ads.UnityAdsShowOptions createUnityAdsShowOptionsWithId(java.lang.String str) {
        com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions = new com.unity3d.ads.UnityAdsShowOptions();
        unityAdsShowOptions.setObjectId(str);
        return unityAdsShowOptions;
    }
}
