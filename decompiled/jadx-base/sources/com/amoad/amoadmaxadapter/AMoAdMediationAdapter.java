package com.amoad.amoadmaxadapter;

/* JADX INFO: compiled from: AMoAdMediationAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 '2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004$%&'B\u000f\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J&\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J0\u0010\u0017\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u001f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0010H\u0016J&\u0010\"\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010#\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010 H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/amoad/amoadmaxadapter/AMoAdMediationAdapter;", "Lcom/applovin/mediation/adapters/MediationAdapterBase;", "Lcom/applovin/mediation/adapter/MaxAdViewAdapter;", "Lcom/applovin/mediation/adapter/MaxRewardedAdapter;", "Lcom/applovin/mediation/adapter/MaxInterstitialAdapter;", com.unity3d.services.core.di.ServiceProvider.NAMED_SDK, "Lcom/applovin/sdk/AppLovinSdk;", "(Lcom/applovin/sdk/AppLovinSdk;)V", "adView", "Lcom/amoad/AMoAdView;", "interstitialVideo", "Lcom/amoad/AMoAdInterstitialVideo;", "getAdapterVersion", "", "getSdkVersion", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "", "parameters", "Lcom/applovin/mediation/adapter/parameters/MaxAdapterInitializationParameters;", "activity", "Landroid/app/Activity;", "onCompletionListener", "Lcom/applovin/mediation/adapter/MaxAdapter$OnCompletionListener;", "loadAdViewAd", "Lcom/applovin/mediation/adapter/parameters/MaxAdapterResponseParameters;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "Lcom/applovin/mediation/MaxAdFormat;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/applovin/mediation/adapter/listeners/MaxAdViewAdapterListener;", "loadInterstitialAd", "Lcom/applovin/mediation/adapter/listeners/MaxInterstitialAdapterListener;", "loadRewardedAd", "Lcom/applovin/mediation/adapter/listeners/MaxRewardedAdapterListener;", "onDestroy", "showInterstitialAd", "showRewardedAd", "AMoAdAdCallbackListener", "AMoAdInterstitialCallbackListener", "AMoAdMaxRewardedCallbackListener", "Companion", "AMoAdMaxAdapter_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AMoAdMediationAdapter extends com.applovin.mediation.adapters.MediationAdapterBase implements com.applovin.mediation.adapter.MaxAdViewAdapter, com.applovin.mediation.adapter.MaxInterstitialAdapter, com.applovin.mediation.adapter.MaxRewardedAdapter {
    private static final java.lang.String c = "AMoAdMediationAdapter";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.amoad.AMoAdView f220a;
    private com.amoad.AMoAdInterstitialVideo b;

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public final java.lang.String getSdkVersion() {
        return "5.2.30";
    }

    public AMoAdMediationAdapter(com.applovin.sdk.AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public final void initialize(com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters parameters, android.app.Activity activity, com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener onCompletionListener) {
        com.amoad.AMoAdLogger.getInstance().i("ALAMoAd: Initializing AMoAd SDK...");
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.DOES_NOT_APPLY, null);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public final java.lang.String getAdapterVersion() {
        return com.amoad.amoadmaxadapter.AMoAdMaxAdapterBuildConfig.a() + ".0";
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public final void onDestroy() {
        com.amoad.AMoAdView aMoAdView = this.f220a;
        if (aMoAdView != null) {
            aMoAdView.setCallback(null);
        }
        this.f220a = null;
        com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo = this.b;
        if (aMoAdInterstitialVideo != null) {
            aMoAdInterstitialVideo.setListener(null);
        }
        this.b = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public final void loadAdViewAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters parameters, com.applovin.mediation.MaxAdFormat adFormat, final android.app.Activity activity, final com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener listener) {
        com.amoad.AMoAdView.RotateTransition rotateTransition;
        if (adFormat == null || activity == null) {
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(adFormat, com.applovin.mediation.MaxAdFormat.MREC) && !kotlin.jvm.internal.Intrinsics.areEqual(adFormat, com.applovin.mediation.MaxAdFormat.BANNER)) {
            com.applovin.mediation.adapter.MaxAdapterError maxAdapterError = com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION;
            if (listener != null) {
                listener.onAdViewAdLoadFailed(maxAdapterError);
                return;
            }
            return;
        }
        final java.lang.String thirdPartyAdPlacementId = parameters != null ? parameters.getThirdPartyAdPlacementId() : null;
        if (thirdPartyAdPlacementId == null) {
            com.applovin.mediation.adapter.MaxAdapterError maxAdapterError2 = com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION;
            if (listener != null) {
                listener.onAdViewAdLoadFailed(maxAdapterError2);
                return;
            }
            return;
        }
        android.os.Bundle customParameters = parameters.getCustomParameters();
        java.lang.String string = customParameters != null ? customParameters.getString("rotate_transition") : null;
        if (string != null) {
            switch (string) {
                case "rotate":
                    rotateTransition = com.amoad.AMoAdView.RotateTransition.ROTATE;
                    break;
                case "alpha":
                    rotateTransition = com.amoad.AMoAdView.RotateTransition.ALPHA;
                    break;
                case "scale":
                    rotateTransition = com.amoad.AMoAdView.RotateTransition.SCALE;
                    break;
                case "translate":
                    rotateTransition = com.amoad.AMoAdView.RotateTransition.TRANSLATE;
                    break;
                default:
                    rotateTransition = com.amoad.AMoAdView.RotateTransition.NONE;
                    break;
            }
        } else {
            rotateTransition = com.amoad.AMoAdView.RotateTransition.NONE;
        }
        final com.amoad.AMoAdView.RotateTransition rotateTransition2 = rotateTransition;
        android.os.Bundle customParameters2 = parameters.getCustomParameters();
        java.lang.String string2 = customParameters2 != null ? customParameters2.getString("click_transition") : null;
        final com.amoad.AMoAdView.ClickTransition clickTransition = (string2 != null && string2.hashCode() == 3273774 && string2.equals("jump")) ? com.amoad.AMoAdView.ClickTransition.JUMP : com.amoad.AMoAdView.ClickTransition.NONE;
        com.amoad.AMoAdLogger.getInstance().i("ALAMoAd: Loading " + adFormat.getLabel() + " AdView in AMoAd with sid:" + thirdPartyAdPlacementId + ", rotate_transition:" + rotateTransition2 + ", click_transition:" + clickTransition);
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.amoad.amoadmaxadapter.AMoAdMediationAdapter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.amoadmaxadapter.AMoAdMediationAdapter.a(activity, this, listener, rotateTransition2, clickTransition, thirdPartyAdPlacementId);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(android.app.Activity activity, com.amoad.amoadmaxadapter.AMoAdMediationAdapter this$0, com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener maxAdViewAdapterListener, com.amoad.AMoAdView.RotateTransition rotateTransition, com.amoad.AMoAdView.ClickTransition clickTransition, java.lang.String sid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rotateTransition, "$rotateTransition");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickTransition, "$clickTransition");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sid, "$sid");
        com.amoad.AMoAdView aMoAdView = new com.amoad.AMoAdView(activity);
        aMoAdView.setCallback(new com.amoad.amoadmaxadapter.AMoAdMediationAdapter.a(this$0, maxAdViewAdapterListener, aMoAdView));
        aMoAdView.setRotateTransition(rotateTransition);
        aMoAdView.setClickTransition(clickTransition);
        aMoAdView.setSid(sid, true);
        this$0.f220a = aMoAdView;
        if (maxAdViewAdapterListener != null) {
            maxAdViewAdapterListener.onAdViewAdLoaded(aMoAdView);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public final void loadRewardedAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters parameters, final android.app.Activity activity, final com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener listener) {
        if (activity == null) {
            return;
        }
        final java.lang.String thirdPartyAdPlacementId = parameters != null ? parameters.getThirdPartyAdPlacementId() : null;
        if (thirdPartyAdPlacementId == null) {
            com.applovin.mediation.adapter.MaxAdapterError maxAdapterError = com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION;
            if (listener != null) {
                listener.onRewardedAdLoadFailed(maxAdapterError);
                return;
            }
            return;
        }
        android.os.Bundle customParameters = parameters.getCustomParameters();
        final java.lang.String string = customParameters != null ? customParameters.getString("tag", "tag") : null;
        android.os.Bundle customParameters2 = parameters.getCustomParameters();
        final boolean zAreEqual = kotlin.jvm.internal.Intrinsics.areEqual(customParameters2 != null ? customParameters2.getString("is_cancellable", com.json.mediationsdk.metadata.a.g) : null, com.json.mediationsdk.metadata.a.g);
        com.amoad.AMoAdLogger.getInstance().i("ALAMoAd: Loading rewardedAd in AMoAd with sid:" + thirdPartyAdPlacementId + ", tag:" + string);
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.amoad.amoadmaxadapter.AMoAdMediationAdapter$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.amoadmaxadapter.AMoAdMediationAdapter.a(this.f$0, activity, thirdPartyAdPlacementId, string, zAreEqual, listener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.amoad.amoadmaxadapter.AMoAdMediationAdapter this$0, android.app.Activity activity, java.lang.String sid, java.lang.String str, boolean z, com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener maxRewardedAdapterListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sid, "$sid");
        android.app.Activity activity2 = activity;
        com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideoSharedInstance = com.amoad.AMoAdInterstitialVideo.sharedInstance(activity2, sid, str);
        this$0.b = aMoAdInterstitialVideoSharedInstance;
        if (aMoAdInterstitialVideoSharedInstance != null) {
            aMoAdInterstitialVideoSharedInstance.setCancellable(z);
        }
        com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo = this$0.b;
        if (aMoAdInterstitialVideo != null) {
            aMoAdInterstitialVideo.setListener(this$0.new c(maxRewardedAdapterListener));
        }
        com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo2 = this$0.b;
        if (aMoAdInterstitialVideo2 != null) {
            aMoAdInterstitialVideo2.dismiss(activity2);
        }
        com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo3 = this$0.b;
        if (aMoAdInterstitialVideo3 != null) {
            aMoAdInterstitialVideo3.load(activity2);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public final void showRewardedAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters parameters, final android.app.Activity activity, final com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener listener) {
        if (activity == null) {
            return;
        }
        com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo = this.b;
        boolean z = false;
        if (aMoAdInterstitialVideo != null && aMoAdInterstitialVideo.isLoaded()) {
            z = true;
        }
        if (z) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.amoad.amoadmaxadapter.AMoAdMediationAdapter$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.amoad.amoadmaxadapter.AMoAdMediationAdapter.a(listener, this, activity);
                }
            });
            return;
        }
        com.applovin.mediation.adapter.MaxAdapterError maxAdapterError = com.applovin.mediation.adapter.MaxAdapterError.AD_DISPLAY_FAILED;
        if (listener != null) {
            listener.onRewardedAdDisplayFailed(maxAdapterError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener maxRewardedAdapterListener, com.amoad.amoadmaxadapter.AMoAdMediationAdapter this$0, android.app.Activity activity) {
        com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (maxRewardedAdapterListener != null && (aMoAdInterstitialVideo = this$0.b) != null) {
            aMoAdInterstitialVideo.setListener(this$0.new c(maxRewardedAdapterListener));
        }
        com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo2 = this$0.b;
        if (aMoAdInterstitialVideo2 != null) {
            aMoAdInterstitialVideo2.show(activity);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public final void loadInterstitialAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters parameters, final android.app.Activity activity, final com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener listener) {
        if (activity == null) {
            return;
        }
        final java.lang.String thirdPartyAdPlacementId = parameters != null ? parameters.getThirdPartyAdPlacementId() : null;
        if (thirdPartyAdPlacementId == null) {
            com.applovin.mediation.adapter.MaxAdapterError maxAdapterError = com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION;
            if (listener != null) {
                listener.onInterstitialAdLoadFailed(maxAdapterError);
                return;
            }
            return;
        }
        android.os.Bundle customParameters = parameters.getCustomParameters();
        final java.lang.String string = customParameters != null ? customParameters.getString("tag", "tag") : null;
        android.os.Bundle customParameters2 = parameters.getCustomParameters();
        final boolean zAreEqual = kotlin.jvm.internal.Intrinsics.areEqual(customParameters2 != null ? customParameters2.getString("is_cancellable", com.json.mediationsdk.metadata.a.g) : null, com.json.mediationsdk.metadata.a.g);
        com.amoad.AMoAdLogger.getInstance().i("ALAMoAd: Loading interstitial in AMoAd with sid:" + thirdPartyAdPlacementId + ", tag:" + string);
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.amoad.amoadmaxadapter.AMoAdMediationAdapter$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.amoadmaxadapter.AMoAdMediationAdapter.a(this.f$0, activity, thirdPartyAdPlacementId, string, zAreEqual, listener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.amoad.amoadmaxadapter.AMoAdMediationAdapter this$0, android.app.Activity activity, java.lang.String sid, java.lang.String str, boolean z, com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sid, "$sid");
        android.app.Activity activity2 = activity;
        com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideoSharedInstance = com.amoad.AMoAdInterstitialVideo.sharedInstance(activity2, sid, str);
        this$0.b = aMoAdInterstitialVideoSharedInstance;
        if (aMoAdInterstitialVideoSharedInstance != null) {
            aMoAdInterstitialVideoSharedInstance.setCancellable(z);
        }
        com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo = this$0.b;
        if (aMoAdInterstitialVideo != null) {
            aMoAdInterstitialVideo.setListener(this$0.new b(maxInterstitialAdapterListener));
        }
        com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo2 = this$0.b;
        if (aMoAdInterstitialVideo2 != null) {
            aMoAdInterstitialVideo2.dismiss(activity2);
        }
        com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo3 = this$0.b;
        if (aMoAdInterstitialVideo3 != null) {
            aMoAdInterstitialVideo3.load(activity2);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public final void showInterstitialAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters parameters, final android.app.Activity activity, final com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener listener) {
        if (activity == null) {
            return;
        }
        com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo = this.b;
        boolean z = false;
        if (aMoAdInterstitialVideo != null && aMoAdInterstitialVideo.isLoaded()) {
            z = true;
        }
        if (z) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.amoad.amoadmaxadapter.AMoAdMediationAdapter$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    com.amoad.amoadmaxadapter.AMoAdMediationAdapter.a(listener, this, activity);
                }
            });
            return;
        }
        com.applovin.mediation.adapter.MaxAdapterError maxAdapterError = com.applovin.mediation.adapter.MaxAdapterError.AD_DISPLAY_FAILED;
        if (listener != null) {
            listener.onInterstitialAdDisplayFailed(maxAdapterError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener maxInterstitialAdapterListener, com.amoad.amoadmaxadapter.AMoAdMediationAdapter this$0, android.app.Activity activity) {
        com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (maxInterstitialAdapterListener != null && (aMoAdInterstitialVideo = this$0.b) != null) {
            aMoAdInterstitialVideo.setListener(this$0.new b(maxInterstitialAdapterListener));
        }
        com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo2 = this$0.b;
        if (aMoAdInterstitialVideo2 != null) {
            aMoAdInterstitialVideo2.show(activity);
        }
    }

    /* JADX INFO: compiled from: AMoAdMediationAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amoad/amoadmaxadapter/AMoAdMediationAdapter$AMoAdAdCallbackListener;", "Lcom/amoad/AdCallback2;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/applovin/mediation/adapter/listeners/MaxAdViewAdapterListener;", "adView", "Lcom/amoad/AMoAdView;", "(Lcom/amoad/amoadmaxadapter/AMoAdMediationAdapter;Lcom/applovin/mediation/adapter/listeners/MaxAdViewAdapterListener;Lcom/amoad/AMoAdView;)V", "didClick", "", "didDismissScreen", "didFailToReceiveAdWithError", "didLeaveApplication", "didPresentScreen", "didReceiveAd", "didReceiveEmptyAd", "AMoAdMaxAdapter_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class a implements com.amoad.AdCallback2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.amoad.amoadmaxadapter.AMoAdMediationAdapter f221a;
        private final com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener b;
        private final com.amoad.AMoAdView c;

        public a(com.amoad.amoadmaxadapter.AMoAdMediationAdapter aMoAdMediationAdapter, com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener maxAdViewAdapterListener, com.amoad.AMoAdView adView) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adView, "adView");
            this.f221a = aMoAdMediationAdapter;
            this.b = maxAdViewAdapterListener;
            this.c = adView;
        }

        @Override // com.amoad.AdCallback
        public final void didReceiveAd() {
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AdCallback:didReceiveAd");
            com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener maxAdViewAdapterListener = this.b;
            if (maxAdViewAdapterListener != null) {
                maxAdViewAdapterListener.onAdViewAdDisplayed();
            }
        }

        @Override // com.amoad.AdCallback
        public final void didReceiveEmptyAd() {
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AdCallback:didReceiveEmptyAd");
            com.applovin.mediation.adapter.MaxAdapterError maxAdapterError = com.applovin.mediation.adapter.MaxAdapterError.NO_FILL;
            com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener maxAdViewAdapterListener = this.b;
            if (maxAdViewAdapterListener != null) {
                maxAdViewAdapterListener.onAdViewAdDisplayFailed(maxAdapterError);
            }
        }

        @Override // com.amoad.AdCallback
        public final void didFailToReceiveAdWithError() {
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AdCallback:didFailToReceiveAdWithError");
            com.applovin.mediation.adapter.MaxAdapterError maxAdapterError = com.applovin.mediation.adapter.MaxAdapterError.AD_NOT_READY;
            com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener maxAdViewAdapterListener = this.b;
            if (maxAdViewAdapterListener != null) {
                maxAdViewAdapterListener.onAdViewAdDisplayFailed(maxAdapterError);
            }
        }

        @Override // com.amoad.AdCallback2
        public final void didClick() {
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AdCallback2:didClick");
            com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener maxAdViewAdapterListener = this.b;
            if (maxAdViewAdapterListener != null) {
                maxAdViewAdapterListener.onAdViewAdClicked();
            }
        }

        @Override // com.amoad.AdCallback2
        public final void didPresentScreen() {
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AdCallback2:didPresentScreen");
        }

        @Override // com.amoad.AdCallback2
        public final void didDismissScreen() {
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AdCallback2:didDismissScreen");
        }

        @Override // com.amoad.AdCallback2
        public final void didLeaveApplication() {
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AdCallback2:didLeaveApplication");
        }
    }

    /* JADX INFO: compiled from: AMoAdMediationAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amoad/amoadmaxadapter/AMoAdMediationAdapter$AMoAdMaxRewardedCallbackListener;", "Lcom/amoad/AMoAdInterstitialVideo$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/applovin/mediation/adapter/listeners/MaxRewardedAdapterListener;", "(Lcom/amoad/amoadmaxadapter/AMoAdMediationAdapter;Lcom/applovin/mediation/adapter/listeners/MaxRewardedAdapterListener;)V", "onClick", "", "amoadInterstitialVideo", "Lcom/amoad/AMoAdInterstitialVideo;", "onComplete", "onDismissed", "onFailed", "onLoad", "result", "Lcom/amoad/AdResult;", "onShown", "onStart", "AMoAdMaxAdapter_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class c implements com.amoad.AMoAdInterstitialVideo.Listener {
        private final com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener b;

        /* JADX INFO: compiled from: AMoAdMediationAdapter.kt */
        @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f225a;

            static {
                int[] iArr = new int[com.amoad.AdResult.values().length];
                iArr[com.amoad.AdResult.Empty.ordinal()] = 1;
                iArr[com.amoad.AdResult.Failure.ordinal()] = 2;
                iArr[com.amoad.AdResult.Success.ordinal()] = 3;
                f225a = iArr;
            }
        }

        public c(com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.b = maxRewardedAdapterListener;
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onLoad(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo, com.amoad.AdResult result) {
            com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener maxRewardedAdapterListener;
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AMoAdInterstitialVideo.Listener:onLoad");
            int i = result == null ? -1 : com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c.a.f225a[result.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener maxRewardedAdapterListener2 = this.b;
                    if (maxRewardedAdapterListener2 != null) {
                        maxRewardedAdapterListener2.onRewardedAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError.NO_FILL);
                        return;
                    }
                    return;
                }
                if (i != 2) {
                    if (i == 3 && (maxRewardedAdapterListener = this.b) != null) {
                        maxRewardedAdapterListener.onRewardedAdLoaded();
                        return;
                    }
                    return;
                }
            }
            com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener maxRewardedAdapterListener3 = this.b;
            if (maxRewardedAdapterListener3 != null) {
                maxRewardedAdapterListener3.onRewardedAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError.AD_NOT_READY);
            }
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onStart(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo) {
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AMoAdInterstitialVideo.Listener:onStart");
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onComplete(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo) {
            com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener maxRewardedAdapterListener;
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AMoAdInterstitialVideo.Listener:onComplete");
            com.applovin.mediation.MaxReward reward = com.amoad.amoadmaxadapter.AMoAdMediationAdapter.this.getReward();
            if (reward == null || (maxRewardedAdapterListener = this.b) == null) {
                return;
            }
            maxRewardedAdapterListener.onUserRewarded(reward);
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onFailed(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo) {
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AMoAdInterstitialVideo.Listener:onFailed");
            com.applovin.mediation.adapter.MaxAdapterError maxAdapterError = com.applovin.mediation.adapter.MaxAdapterError.AD_NOT_READY;
            com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener maxRewardedAdapterListener = this.b;
            if (maxRewardedAdapterListener != null) {
                maxRewardedAdapterListener.onRewardedAdDisplayFailed(maxAdapterError);
            }
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onShown(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo) {
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AMoAdInterstitialVideo.Listener:onShown");
            com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener maxRewardedAdapterListener = this.b;
            if (maxRewardedAdapterListener != null) {
                maxRewardedAdapterListener.onRewardedAdDisplayed();
            }
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onDismissed(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo) {
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AMoAdInterstitialVideo.Listener:onDismissed");
            com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener maxRewardedAdapterListener = this.b;
            if (maxRewardedAdapterListener != null) {
                maxRewardedAdapterListener.onRewardedAdHidden();
            }
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onClick(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo) {
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AMoAdInterstitialVideo.Listener:onClick");
            com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener maxRewardedAdapterListener = this.b;
            if (maxRewardedAdapterListener != null) {
                maxRewardedAdapterListener.onRewardedAdClicked();
            }
        }
    }

    /* JADX INFO: compiled from: AMoAdMediationAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amoad/amoadmaxadapter/AMoAdMediationAdapter$AMoAdInterstitialCallbackListener;", "Lcom/amoad/AMoAdInterstitialVideo$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/applovin/mediation/adapter/listeners/MaxInterstitialAdapterListener;", "(Lcom/amoad/amoadmaxadapter/AMoAdMediationAdapter;Lcom/applovin/mediation/adapter/listeners/MaxInterstitialAdapterListener;)V", "onClick", "", "amoadInterstitialVideo", "Lcom/amoad/AMoAdInterstitialVideo;", "onComplete", "onDismissed", "onFailed", "onLoad", "result", "Lcom/amoad/AdResult;", "onShown", "onStart", "AMoAdMaxAdapter_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class b implements com.amoad.AMoAdInterstitialVideo.Listener {
        private final com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener b;

        /* JADX INFO: compiled from: AMoAdMediationAdapter.kt */
        @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f223a;

            static {
                int[] iArr = new int[com.amoad.AdResult.values().length];
                iArr[com.amoad.AdResult.Empty.ordinal()] = 1;
                iArr[com.amoad.AdResult.Failure.ordinal()] = 2;
                iArr[com.amoad.AdResult.Success.ordinal()] = 3;
                f223a = iArr;
            }
        }

        public b(com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.b = maxInterstitialAdapterListener;
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onLoad(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo, com.amoad.AdResult result) {
            com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener maxInterstitialAdapterListener;
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AMoAdInterstitialVideo.Listener:onLoad");
            int i = result == null ? -1 : com.amoad.amoadmaxadapter.AMoAdMediationAdapter.b.a.f223a[result.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener maxInterstitialAdapterListener2 = this.b;
                    if (maxInterstitialAdapterListener2 != null) {
                        maxInterstitialAdapterListener2.onInterstitialAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError.NO_FILL);
                        return;
                    }
                    return;
                }
                if (i != 2) {
                    if (i == 3 && (maxInterstitialAdapterListener = this.b) != null) {
                        maxInterstitialAdapterListener.onInterstitialAdLoaded();
                        return;
                    }
                    return;
                }
            }
            com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener maxInterstitialAdapterListener3 = this.b;
            if (maxInterstitialAdapterListener3 != null) {
                maxInterstitialAdapterListener3.onInterstitialAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError.AD_NOT_READY);
            }
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onStart(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo) {
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AMoAdInterstitialVideo.Listener:onStart");
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onComplete(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo) {
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AMoAdInterstitialVideo.Listener:onComplete");
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onFailed(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo) {
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AMoAdInterstitialVideo.Listener:onFailed");
            com.applovin.mediation.adapter.MaxAdapterError maxAdapterError = com.applovin.mediation.adapter.MaxAdapterError.AD_NOT_READY;
            com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener maxInterstitialAdapterListener = this.b;
            if (maxInterstitialAdapterListener != null) {
                maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(maxAdapterError);
            }
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onShown(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo) {
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AMoAdInterstitialVideo.Listener:onShown");
            com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener maxInterstitialAdapterListener = this.b;
            if (maxInterstitialAdapterListener != null) {
                maxInterstitialAdapterListener.onInterstitialAdDisplayed();
            }
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onDismissed(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo) {
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AMoAdInterstitialVideo.Listener:onDismissed");
            com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener maxInterstitialAdapterListener = this.b;
            if (maxInterstitialAdapterListener != null) {
                maxInterstitialAdapterListener.onInterstitialAdHidden();
            }
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onClick(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo) {
            com.amoad.Logger.d(com.amoad.amoadmaxadapter.AMoAdMediationAdapter.c, "AMoAdInterstitialVideo.Listener:onClick");
            com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener maxInterstitialAdapterListener = this.b;
            if (maxInterstitialAdapterListener != null) {
                maxInterstitialAdapterListener.onInterstitialAdClicked();
            }
        }
    }
}
