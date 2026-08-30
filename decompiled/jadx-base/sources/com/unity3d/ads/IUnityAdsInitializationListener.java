package com.unity3d.ads;

/* JADX INFO: loaded from: classes4.dex */
public interface IUnityAdsInitializationListener {
    void onInitializationComplete();

    void onInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError unityAdsInitializationError, java.lang.String str);
}
