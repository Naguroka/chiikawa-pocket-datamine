package com.unity3d.services.ads.operation.load;

/* JADX INFO: loaded from: classes6.dex */
public interface ILoadModule extends com.unity3d.services.ads.operation.IAdModule<com.unity3d.services.ads.operation.load.ILoadOperation, com.unity3d.services.ads.operation.load.LoadOperationState> {
    void onUnityAdsAdLoaded(java.lang.String str);

    void onUnityAdsFailedToLoad(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError, java.lang.String str2);
}
