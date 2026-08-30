package com.google.ads.mediation.line;

/* JADX INFO: compiled from: LineRewardedAd.kt */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002,-BU\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0018\u0010&\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u001fH\u0016J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020+H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/google/ads/mediation/line/LineRewardedAd;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAd;", "Lcom/five_corp/ad/FiveAdLoadListener;", "Lcom/five_corp/ad/FiveAdVideoRewardEventListener;", "activityReference", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "appId", "", "slotId", "bidResponse", "watermark", "mediationAdLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdCallback;", "networkExtras", "Landroid/os/Bundle;", "(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;Landroid/os/Bundle;)V", "mediationRewardedAdCallback", "rewardedAd", "Lcom/five_corp/ad/FiveAdVideoReward;", "loadAd", "", "loadRtbAd", "onClick", "fiveAdVideoReward", "onFiveAdLoad", "ad", "Lcom/five_corp/ad/FiveAdInterface;", "onFiveAdLoadError", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "Lcom/five_corp/ad/FiveAdErrorCode;", "onFullScreenClose", "onFullScreenOpen", "onImpression", com.ironsource.y8.h.t0, "onPlay", "onReward", "onViewError", "fiveAdErrorCode", "onViewThrough", "showAd", "context", "Landroid/content/Context;", "Companion", "LineRewardItem", "line_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LineRewardedAd implements com.google.android.gms.ads.mediation.MediationRewardedAd, com.five_corp.ad.FiveAdLoadListener, com.five_corp.ad.FiveAdVideoRewardEventListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.ads.mediation.line.LineRewardedAd.Companion INSTANCE = new com.google.ads.mediation.line.LineRewardedAd.Companion(null);
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.ads.mediation.line.LineRewardedAd.class).getSimpleName();
    private final java.lang.ref.WeakReference<android.app.Activity> activityReference;
    private final java.lang.String appId;
    private final java.lang.String bidResponse;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback;
    private com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback;
    private final android.os.Bundle networkExtras;
    private com.five_corp.ad.FiveAdVideoReward rewardedAd;
    private final java.lang.String slotId;
    private final java.lang.String watermark;

    /* JADX INFO: compiled from: LineRewardedAd.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/ads/mediation/line/LineRewardedAd$LineRewardItem;", "Lcom/google/android/gms/ads/rewarded/RewardItem;", "()V", "getAmount", "", "getType", "", "line_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LineRewardItem implements com.google.android.gms.ads.rewarded.RewardItem {
        @Override // com.google.android.gms.ads.rewarded.RewardItem
        public int getAmount() {
            return 1;
        }

        @Override // com.google.android.gms.ads.rewarded.RewardItem
        public java.lang.String getType() {
            return "";
        }
    }

    public /* synthetic */ LineRewardedAd(java.lang.ref.WeakReference weakReference, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.google.android.gms.ads.mediation.MediationAdLoadCallback mediationAdLoadCallback, android.os.Bundle bundle, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(weakReference, str, str2, str3, str4, mediationAdLoadCallback, bundle);
    }

    private LineRewardedAd(java.lang.ref.WeakReference<android.app.Activity> weakReference, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback, android.os.Bundle bundle) {
        this.activityReference = weakReference;
        this.appId = str;
        this.slotId = str2;
        this.bidResponse = str3;
        this.watermark = str4;
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.networkExtras = bundle;
    }

    public final void loadAd() {
        android.app.Activity activity = this.activityReference.get();
        if (activity == null) {
            return;
        }
        java.lang.String str = this.slotId;
        if (str == null || str.length() == 0) {
            this.mediationAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(102, com.google.ads.mediation.line.LineMediationAdapter.ERROR_MSG_MISSING_SLOT_ID, "com.google.ads.mediation.line"));
            return;
        }
        this.rewardedAd = com.google.ads.mediation.line.LineSdkFactory.INSTANCE.getDelegate$line_release().createFiveVideoRewarded(activity, this.slotId);
        com.google.ads.mediation.line.LineInitializer.INSTANCE.initialize(activity, this.appId);
        com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward = this.rewardedAd;
        com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward2 = null;
        if (fiveAdVideoReward == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("rewardedAd");
            fiveAdVideoReward = null;
        }
        fiveAdVideoReward.setLoadListener(this);
        if (this.networkExtras != null) {
            com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward3 = this.rewardedAd;
            if (fiveAdVideoReward3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("rewardedAd");
                fiveAdVideoReward3 = null;
            }
            fiveAdVideoReward3.enableSound(this.networkExtras.getBoolean(com.google.ads.mediation.line.LineExtras.KEY_ENABLE_AD_SOUND, true));
        }
        com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward4 = this.rewardedAd;
        if (fiveAdVideoReward4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("rewardedAd");
        } else {
            fiveAdVideoReward2 = fiveAdVideoReward4;
        }
        fiveAdVideoReward2.loadAdAsync();
    }

    public final void loadRtbAd() {
        android.app.Activity activity = this.activityReference.get();
        if (activity == null) {
            return;
        }
        com.five_corp.ad.AdLoader adLoader = com.five_corp.ad.AdLoader.getAdLoader(activity, new com.five_corp.ad.FiveAdConfig(this.appId));
        if (adLoader == null) {
            return;
        }
        adLoader.loadRewardAd(new com.five_corp.ad.BidData(this.bidResponse, this.watermark), new com.five_corp.ad.AdLoader.LoadRewardAdCallback() { // from class: com.google.ads.mediation.line.LineRewardedAd.loadRtbAd.1
            @Override // com.five_corp.ad.AdLoader.LoadRewardAdCallback
            public void onLoad(com.five_corp.ad.FiveAdVideoReward fiveAdRewarded) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdRewarded, "fiveAdRewarded");
                com.google.ads.mediation.line.LineRewardedAd.this.rewardedAd = fiveAdRewarded;
                com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward = null;
                if (com.google.ads.mediation.line.LineRewardedAd.this.networkExtras != null) {
                    com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward2 = com.google.ads.mediation.line.LineRewardedAd.this.rewardedAd;
                    if (fiveAdVideoReward2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("rewardedAd");
                        fiveAdVideoReward2 = null;
                    }
                    fiveAdVideoReward2.enableSound(com.google.ads.mediation.line.LineRewardedAd.this.networkExtras.getBoolean(com.google.ads.mediation.line.LineExtras.KEY_ENABLE_AD_SOUND, true));
                }
                com.google.ads.mediation.line.LineRewardedAd lineRewardedAd = com.google.ads.mediation.line.LineRewardedAd.this;
                lineRewardedAd.mediationRewardedAdCallback = (com.google.android.gms.ads.mediation.MediationRewardedAdCallback) lineRewardedAd.mediationAdLoadCallback.onSuccess(com.google.ads.mediation.line.LineRewardedAd.this);
                com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward3 = com.google.ads.mediation.line.LineRewardedAd.this.rewardedAd;
                if (fiveAdVideoReward3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("rewardedAd");
                } else {
                    fiveAdVideoReward = fiveAdVideoReward3;
                }
                fiveAdVideoReward.setEventListener(com.google.ads.mediation.line.LineRewardedAd.this);
            }

            @Override // com.five_corp.ad.AdLoader.LoadRewardAdCallback
            public void onError(com.five_corp.ad.FiveAdErrorCode adErrorCode) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adErrorCode, "adErrorCode");
                com.google.ads.mediation.line.LineRewardedAd.this.mediationAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(adErrorCode.value, adErrorCode.name(), "com.five_corp.ad"));
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward = this.rewardedAd;
        if (fiveAdVideoReward == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("rewardedAd");
            fiveAdVideoReward = null;
        }
        fiveAdVideoReward.showAd();
    }

    @Override // com.five_corp.ad.FiveAdLoadListener
    public void onFiveAdLoad(com.five_corp.ad.FiveAdInterface ad) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        android.util.Log.d(TAG, "Finished loading Line Rewarded Ad for slotId: " + ad.getSlotId());
        this.mediationRewardedAdCallback = this.mediationAdLoadCallback.onSuccess(this);
        com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward = this.rewardedAd;
        if (fiveAdVideoReward == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("rewardedAd");
            fiveAdVideoReward = null;
        }
        fiveAdVideoReward.setEventListener(this);
    }

    @Override // com.five_corp.ad.FiveAdLoadListener
    public void onFiveAdLoadError(com.five_corp.ad.FiveAdInterface ad, com.five_corp.ad.FiveAdErrorCode errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        int i = errorCode.value;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format(com.google.ads.mediation.line.LineMediationAdapter.ERROR_MSG_AD_LOADING, java.util.Arrays.copyOf(new java.lang.Object[]{errorCode.name()}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(i, str, "com.five_corp.ad");
        android.util.Log.w(TAG, adError.getMessage());
        this.mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.five_corp.ad.FiveAdVideoRewardEventListener
    public void onViewError(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward, com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdVideoReward, "fiveAdVideoReward");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdErrorCode, "fiveAdErrorCode");
        int i = fiveAdErrorCode.value;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format(com.google.ads.mediation.line.LineMediationAdapter.ERROR_MSG_AD_SHOWING, java.util.Arrays.copyOf(new java.lang.Object[]{fiveAdErrorCode.name()}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(i, str, "com.five_corp.ad");
        android.util.Log.w(TAG, adError.getMessage());
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.five_corp.ad.FiveAdVideoRewardEventListener
    public void onClick(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdVideoReward, "fiveAdVideoReward");
        android.util.Log.d(TAG, "Line rewarded ad did record a click.");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.five_corp.ad.FiveAdVideoRewardEventListener
    public void onFullScreenClose(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdVideoReward, "fiveAdVideoReward");
        android.util.Log.d(TAG, "Line rewarded ad closed");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.five_corp.ad.FiveAdVideoRewardEventListener
    public void onPlay(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdVideoReward, "fiveAdVideoReward");
        android.util.Log.d(TAG, "Line rewarded ad played");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
        }
    }

    @Override // com.five_corp.ad.FiveAdVideoRewardEventListener
    public void onPause(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdVideoReward, "fiveAdVideoReward");
        android.util.Log.d(TAG, "Line rewarded ad paused");
    }

    @Override // com.five_corp.ad.FiveAdVideoRewardEventListener
    public void onReward(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdVideoReward, "fiveAdVideoReward");
        android.util.Log.d(TAG, "Line rewarded ad user earned reward");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onUserEarnedReward(new com.google.ads.mediation.line.LineRewardedAd.LineRewardItem());
        }
    }

    @Override // com.five_corp.ad.FiveAdVideoRewardEventListener
    public void onViewThrough(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdVideoReward, "fiveAdVideoReward");
        android.util.Log.d(TAG, "Line rewarded video ad viewed");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
        }
    }

    @Override // com.five_corp.ad.FiveAdVideoRewardEventListener
    public void onImpression(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdVideoReward, "fiveAdVideoReward");
        android.util.Log.d(TAG, "Line rewarded ad recorded an impression.");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.five_corp.ad.FiveAdVideoRewardEventListener
    public void onFullScreenOpen(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdVideoReward, "fiveAdVideoReward");
        android.util.Log.d(TAG, "Line rewarded ad opened");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    /* JADX INFO: compiled from: LineRewardedAd.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/google/ads/mediation/line/LineRewardedAd$Companion;", "", "()V", "TAG", "", "newInstance", "Lkotlin/Result;", "Lcom/google/ads/mediation/line/LineRewardedAd;", "mediationRewardedAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdConfiguration;", "mediationAdLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAd;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdCallback;", "newInstance-gIAlu-s", "(Lcom/google/android/gms/ads/mediation/MediationRewardedAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)Ljava/lang/Object;", "line_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: newInstance-gIAlu-s, reason: not valid java name */
        public final java.lang.Object m726newInstancegIAlus(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationRewardedAdConfiguration, "mediationRewardedAdConfiguration");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationAdLoadCallback, "mediationAdLoadCallback");
            android.content.Context context = mediationRewardedAdConfiguration.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null) {
                com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(104, com.google.ads.mediation.line.LineMediationAdapter.ERROR_MSG_CONTEXT_NOT_AN_ACTIVITY, "com.google.ads.mediation.line");
                mediationAdLoadCallback.onFailure(adError);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                return kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(new java.util.NoSuchElementException(adError.getMessage())));
            }
            android.os.Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serverParameters, "mediationRewardedAdConfiguration.serverParameters");
            java.lang.String string = serverParameters.getString(com.google.ads.mediation.line.LineMediationAdapter.KEY_APP_ID);
            java.lang.String str = string;
            if (str == null || str.length() == 0) {
                com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(101, com.google.ads.mediation.line.LineMediationAdapter.ERROR_MSG_MISSING_APP_ID, "com.google.ads.mediation.line");
                mediationAdLoadCallback.onFailure(adError2);
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                return kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(new java.util.NoSuchElementException(adError2.getMessage())));
            }
            java.lang.String string2 = serverParameters.getString(com.google.ads.mediation.line.LineMediationAdapter.KEY_SLOT_ID);
            java.lang.String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bidResponse, "mediationRewardedAdConfiguration.bidResponse");
            java.lang.String watermark = mediationRewardedAdConfiguration.getWatermark();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(watermark, "mediationRewardedAdConfiguration.watermark");
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            return kotlin.Result.m1301constructorimpl(new com.google.ads.mediation.line.LineRewardedAd(new java.lang.ref.WeakReference(activity), string, string2, bidResponse, watermark, mediationAdLoadCallback, mediationRewardedAdConfiguration.getMediationExtras(), null));
        }
    }
}
