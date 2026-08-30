package com.unity3d.services.ads.operation.show;

/* JADX INFO: loaded from: classes6.dex */
public interface IShowModule extends com.unity3d.services.ads.operation.IAdModule<com.unity3d.services.ads.operation.show.IShowOperation, com.unity3d.services.ads.operation.show.ShowOperationState> {
    void onUnityAdsShowClick(java.lang.String str);

    void onUnityAdsShowComplete(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState);

    void onUnityAdsShowConsent(java.lang.String str);

    void onUnityAdsShowFailure(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, java.lang.String str2);

    void onUnityAdsShowStart(java.lang.String str);
}
