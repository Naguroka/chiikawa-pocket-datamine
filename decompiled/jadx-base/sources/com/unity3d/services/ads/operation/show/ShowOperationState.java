package com.unity3d.services.ads.operation.show;

/* JADX INFO: loaded from: classes6.dex */
public class ShowOperationState extends com.unity3d.services.ads.operation.OperationState {
    public java.lang.ref.WeakReference<android.app.Activity> activity;
    public com.unity3d.ads.IUnityAdsShowListener listener;
    public com.unity3d.ads.UnityAdsShowOptions showOptions;

    public ShowOperationState(java.lang.String str, com.unity3d.ads.IUnityAdsShowListener iUnityAdsShowListener, android.app.Activity activity, com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions, com.unity3d.services.core.configuration.Configuration configuration) {
        super(str, configuration);
        this.listener = iUnityAdsShowListener;
        this.activity = new java.lang.ref.WeakReference<>(activity);
        this.showOptions = unityAdsShowOptions;
    }

    public void onUnityAdsShowFailure(final com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, final java.lang.String str) {
        if (this.listener != null) {
            com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowOperationState$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1215xb9c9007a(unityAdsShowError, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onUnityAdsShowFailure$0$com-unity3d-services-ads-operation-show-ShowOperationState, reason: not valid java name */
    /* synthetic */ void m1215xb9c9007a(com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, java.lang.String str) {
        this.listener.onUnityAdsShowFailure(this.placementId, unityAdsShowError, str);
    }

    public void onUnityAdsShowClick() {
        if (this.listener != null) {
            com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowOperationState$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1213x2e86f59b();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onUnityAdsShowClick$1$com-unity3d-services-ads-operation-show-ShowOperationState, reason: not valid java name */
    /* synthetic */ void m1213x2e86f59b() {
        this.listener.onUnityAdsShowClick(this.placementId);
    }

    public void onUnityAdsShowStart(final java.lang.String str) {
        if (this.listener != null) {
            com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowOperationState$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1216xce119060(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onUnityAdsShowStart$2$com-unity3d-services-ads-operation-show-ShowOperationState, reason: not valid java name */
    /* synthetic */ void m1216xce119060(java.lang.String str) {
        this.listener.onUnityAdsShowStart(str);
    }

    public void onUnityAdsShowComplete(final com.unity3d.ads.UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        if (this.listener != null) {
            com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowOperationState$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1214x43b2ea60(unityAdsShowCompletionState);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onUnityAdsShowComplete$3$com-unity3d-services-ads-operation-show-ShowOperationState, reason: not valid java name */
    /* synthetic */ void m1214x43b2ea60(com.unity3d.ads.UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        this.listener.onUnityAdsShowComplete(this.placementId, unityAdsShowCompletionState);
    }
}
