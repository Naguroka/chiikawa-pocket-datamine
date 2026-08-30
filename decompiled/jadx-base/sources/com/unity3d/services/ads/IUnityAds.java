package com.unity3d.services.ads;

/* JADX INFO: loaded from: classes6.dex */
public interface IUnityAds {
    boolean getDebugMode();

    java.lang.String getToken();

    void getToken(com.unity3d.ads.IUnityAdsTokenListener iUnityAdsTokenListener);

    java.lang.String getVersion();

    void initialize(android.content.Context context, java.lang.String str, boolean z, com.unity3d.ads.IUnityAdsInitializationListener iUnityAdsInitializationListener);

    boolean isInitialized();

    boolean isSupported();

    void load(java.lang.String str, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, com.unity3d.ads.IUnityAdsLoadListener iUnityAdsLoadListener);

    void setDebugMode(boolean z);

    void show(android.app.Activity activity, java.lang.String str, com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions, com.unity3d.ads.IUnityAdsShowListener iUnityAdsShowListener);
}
