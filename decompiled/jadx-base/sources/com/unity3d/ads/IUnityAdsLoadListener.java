package com.unity3d.ads;

/* JADX INFO: loaded from: classes4.dex */
public interface IUnityAdsLoadListener {
    void onUnityAdsAdLoaded(java.lang.String str);

    void onUnityAdsFailedToLoad(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError, java.lang.String str2);
}
