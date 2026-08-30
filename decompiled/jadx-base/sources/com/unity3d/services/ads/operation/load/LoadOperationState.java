package com.unity3d.services.ads.operation.load;

/* JADX INFO: loaded from: classes6.dex */
public class LoadOperationState extends com.unity3d.services.ads.operation.OperationState {
    public com.unity3d.ads.IUnityAdsLoadListener listener;
    public com.unity3d.ads.UnityAdsLoadOptions loadOptions;

    public LoadOperationState(java.lang.String str, com.unity3d.ads.IUnityAdsLoadListener iUnityAdsLoadListener, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, com.unity3d.services.core.configuration.Configuration configuration) {
        super(str, configuration);
        this.listener = iUnityAdsLoadListener;
        this.loadOptions = unityAdsLoadOptions;
    }

    public void onUnityAdsFailedToLoad(final com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError, final java.lang.String str) {
        if (this.listener != null) {
            com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.services.ads.operation.load.LoadOperationState$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1212x5da5719b(unityAdsLoadError, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onUnityAdsFailedToLoad$0$com-unity3d-services-ads-operation-load-LoadOperationState, reason: not valid java name */
    /* synthetic */ void m1212x5da5719b(com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError, java.lang.String str) {
        this.listener.onUnityAdsFailedToLoad(this.placementId, unityAdsLoadError, str);
    }

    public void onUnityAdsAdLoaded() {
        if (this.listener != null) {
            com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.services.ads.operation.load.LoadOperationState$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1211xadf8d050();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onUnityAdsAdLoaded$1$com-unity3d-services-ads-operation-load-LoadOperationState, reason: not valid java name */
    /* synthetic */ void m1211xadf8d050() {
        this.listener.onUnityAdsAdLoaded(this.placementId);
    }

    public boolean isBanner() {
        return this instanceof com.unity3d.services.ads.operation.load.LoadBannerOperationState;
    }

    public boolean isHeaderBidding() {
        com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions == null || unityAdsLoadOptions.getData() == null) {
            return false;
        }
        return this.loadOptions.getData().has("adMarkup");
    }
}
