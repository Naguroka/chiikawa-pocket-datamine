package com.google.ads.mediation.line;

/* JADX INFO: compiled from: LineInterstitialAd.kt */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 *2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001*BU\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J\u0018\u0010%\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J\u0010\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/google/ads/mediation/line/LineInterstitialAd;", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAd;", "Lcom/five_corp/ad/FiveAdLoadListener;", "Lcom/five_corp/ad/FiveAdInterstitialEventListener;", "activityReference", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "appId", "", "slotId", "bidResponse", "watermark", "mediationAdLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAdCallback;", "networkExtras", "Landroid/os/Bundle;", "(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;Landroid/os/Bundle;)V", "interstitialAd", "Lcom/five_corp/ad/FiveAdInterstitial;", "mediationInterstitialAdCallback", "loadAd", "", "loadRtbAd", "onClick", "fiveAdInterstitial", "onFiveAdLoad", "ad", "Lcom/five_corp/ad/FiveAdInterface;", "onFiveAdLoadError", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "Lcom/five_corp/ad/FiveAdErrorCode;", "onFullScreenClose", "onFullScreenOpen", "onImpression", com.ironsource.y8.h.t0, "onPlay", "onViewError", "onViewThrough", "showAd", "context", "Landroid/content/Context;", "Companion", "line_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LineInterstitialAd implements com.google.android.gms.ads.mediation.MediationInterstitialAd, com.five_corp.ad.FiveAdLoadListener, com.five_corp.ad.FiveAdInterstitialEventListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.ads.mediation.line.LineInterstitialAd.Companion INSTANCE = new com.google.ads.mediation.line.LineInterstitialAd.Companion(null);
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.ads.mediation.line.LineInterstitialAd.class).getSimpleName();
    private final java.lang.ref.WeakReference<android.app.Activity> activityReference;
    private final java.lang.String appId;
    private final java.lang.String bidResponse;
    private com.five_corp.ad.FiveAdInterstitial interstitialAd;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback;
    private com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback;
    private final android.os.Bundle networkExtras;
    private final java.lang.String slotId;
    private final java.lang.String watermark;

    public /* synthetic */ LineInterstitialAd(java.lang.ref.WeakReference weakReference, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.google.android.gms.ads.mediation.MediationAdLoadCallback mediationAdLoadCallback, android.os.Bundle bundle, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(weakReference, str, str2, str3, str4, mediationAdLoadCallback, bundle);
    }

    private LineInterstitialAd(java.lang.ref.WeakReference<android.app.Activity> weakReference, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback, android.os.Bundle bundle) {
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
        this.interstitialAd = com.google.ads.mediation.line.LineSdkFactory.INSTANCE.getDelegate$line_release().createFiveAdInterstitial(activity, this.slotId);
        com.google.ads.mediation.line.LineInitializer.INSTANCE.initialize(activity, this.appId);
        com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial = this.interstitialAd;
        com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial2 = null;
        if (fiveAdInterstitial == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("interstitialAd");
            fiveAdInterstitial = null;
        }
        fiveAdInterstitial.setLoadListener(this);
        if (this.networkExtras != null) {
            com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial3 = this.interstitialAd;
            if (fiveAdInterstitial3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("interstitialAd");
                fiveAdInterstitial3 = null;
            }
            fiveAdInterstitial3.enableSound(this.networkExtras.getBoolean(com.google.ads.mediation.line.LineExtras.KEY_ENABLE_AD_SOUND, true));
        }
        com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial4 = this.interstitialAd;
        if (fiveAdInterstitial4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("interstitialAd");
        } else {
            fiveAdInterstitial2 = fiveAdInterstitial4;
        }
        fiveAdInterstitial2.loadAdAsync();
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
        adLoader.loadInterstitialAd(new com.five_corp.ad.BidData(this.bidResponse, this.watermark), new com.five_corp.ad.AdLoader.LoadInterstitialAdCallback() { // from class: com.google.ads.mediation.line.LineInterstitialAd.loadRtbAd.1
            @Override // com.five_corp.ad.AdLoader.LoadInterstitialAdCallback
            public void onLoad(com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdInterstitial, "fiveAdInterstitial");
                com.google.ads.mediation.line.LineInterstitialAd.this.interstitialAd = fiveAdInterstitial;
                com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial2 = null;
                if (com.google.ads.mediation.line.LineInterstitialAd.this.networkExtras != null) {
                    com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial3 = com.google.ads.mediation.line.LineInterstitialAd.this.interstitialAd;
                    if (fiveAdInterstitial3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("interstitialAd");
                        fiveAdInterstitial3 = null;
                    }
                    fiveAdInterstitial3.enableSound(com.google.ads.mediation.line.LineInterstitialAd.this.networkExtras.getBoolean(com.google.ads.mediation.line.LineExtras.KEY_ENABLE_AD_SOUND, true));
                }
                com.google.ads.mediation.line.LineInterstitialAd lineInterstitialAd = com.google.ads.mediation.line.LineInterstitialAd.this;
                lineInterstitialAd.mediationInterstitialAdCallback = (com.google.android.gms.ads.mediation.MediationInterstitialAdCallback) lineInterstitialAd.mediationAdLoadCallback.onSuccess(com.google.ads.mediation.line.LineInterstitialAd.this);
                com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial4 = com.google.ads.mediation.line.LineInterstitialAd.this.interstitialAd;
                if (fiveAdInterstitial4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("interstitialAd");
                } else {
                    fiveAdInterstitial2 = fiveAdInterstitial4;
                }
                fiveAdInterstitial2.setEventListener(com.google.ads.mediation.line.LineInterstitialAd.this);
            }

            @Override // com.five_corp.ad.AdLoader.LoadInterstitialAdCallback
            public void onError(com.five_corp.ad.FiveAdErrorCode adErrorCode) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adErrorCode, "adErrorCode");
                com.google.ads.mediation.line.LineInterstitialAd.this.mediationAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(adErrorCode.value, adErrorCode.name(), "com.five_corp.ad"));
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial = this.interstitialAd;
        if (fiveAdInterstitial == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("interstitialAd");
            fiveAdInterstitial = null;
        }
        fiveAdInterstitial.showAd();
    }

    @Override // com.five_corp.ad.FiveAdLoadListener
    public void onFiveAdLoad(com.five_corp.ad.FiveAdInterface ad) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        android.util.Log.d(TAG, "Finished loading Line Interstitial Ad for slotId: " + ad.getSlotId());
        this.mediationInterstitialAdCallback = this.mediationAdLoadCallback.onSuccess(this);
        com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial = this.interstitialAd;
        if (fiveAdInterstitial == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("interstitialAd");
            fiveAdInterstitial = null;
        }
        fiveAdInterstitial.setEventListener(this);
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

    @Override // com.five_corp.ad.FiveAdInterstitialEventListener
    public void onViewError(com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial, com.five_corp.ad.FiveAdErrorCode errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdInterstitial, "fiveAdInterstitial");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        int i = errorCode.value;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format(com.google.ads.mediation.line.LineMediationAdapter.ERROR_MSG_AD_SHOWING, java.util.Arrays.copyOf(new java.lang.Object[]{errorCode.name()}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(i, str, "com.five_corp.ad");
        android.util.Log.w(TAG, adError.getMessage());
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.mediationInterstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.five_corp.ad.FiveAdInterstitialEventListener
    public void onClick(com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdInterstitial, "fiveAdInterstitial");
        android.util.Log.d(TAG, "Line interstitial ad did record a click.");
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.mediationInterstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.five_corp.ad.FiveAdInterstitialEventListener
    public void onFullScreenClose(com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdInterstitial, "fiveAdInterstitial");
        android.util.Log.d(TAG, "Line interstitial ad closed");
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.mediationInterstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.five_corp.ad.FiveAdInterstitialEventListener
    public void onPlay(com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdInterstitial, "fiveAdInterstitial");
        android.util.Log.d(TAG, "Line interstitial video ad played");
    }

    @Override // com.five_corp.ad.FiveAdInterstitialEventListener
    public void onPause(com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdInterstitial, "fiveAdInterstitial");
        android.util.Log.d(TAG, "Line interstitial video ad paused");
    }

    @Override // com.five_corp.ad.FiveAdInterstitialEventListener
    public void onFullScreenOpen(com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdInterstitial, "fiveAdInterstitial");
        android.util.Log.d(TAG, "Line interstitial video ad opened");
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.mediationInterstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.five_corp.ad.FiveAdInterstitialEventListener
    public void onViewThrough(com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdInterstitial, "fiveAdInterstitial");
        android.util.Log.d(TAG, "Line interstitial video ad viewed");
    }

    @Override // com.five_corp.ad.FiveAdInterstitialEventListener
    public void onImpression(com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdInterstitial, "fiveAdInterstitial");
        android.util.Log.d(TAG, "Line interstitial ad recorded an impression.");
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.mediationInterstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    /* JADX INFO: compiled from: LineInterstitialAd.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/google/ads/mediation/line/LineInterstitialAd$Companion;", "", "()V", "TAG", "", "newInstance", "Lkotlin/Result;", "Lcom/google/ads/mediation/line/LineInterstitialAd;", "mediationInterstitialAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAdConfiguration;", "mediationAdLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAd;", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAdCallback;", "newInstance-gIAlu-s", "(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)Ljava/lang/Object;", "line_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: newInstance-gIAlu-s, reason: not valid java name */
        public final java.lang.Object m723newInstancegIAlus(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationInterstitialAdConfiguration, "mediationInterstitialAdConfiguration");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationAdLoadCallback, "mediationAdLoadCallback");
            android.content.Context context = mediationInterstitialAdConfiguration.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null) {
                com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(104, com.google.ads.mediation.line.LineMediationAdapter.ERROR_MSG_CONTEXT_NOT_AN_ACTIVITY, "com.google.ads.mediation.line");
                mediationAdLoadCallback.onFailure(adError);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                return kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(new java.util.NoSuchElementException(adError.getMessage())));
            }
            android.os.Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serverParameters, "mediationInterstitialAdC…guration.serverParameters");
            java.lang.String string = serverParameters.getString(com.google.ads.mediation.line.LineMediationAdapter.KEY_APP_ID);
            java.lang.String str = string;
            if (str == null || str.length() == 0) {
                com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(101, com.google.ads.mediation.line.LineMediationAdapter.ERROR_MSG_MISSING_APP_ID, "com.google.ads.mediation.line");
                mediationAdLoadCallback.onFailure(adError2);
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                return kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(new java.util.NoSuchElementException(adError2.getMessage())));
            }
            java.lang.String string2 = serverParameters.getString(com.google.ads.mediation.line.LineMediationAdapter.KEY_SLOT_ID);
            java.lang.String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bidResponse, "mediationInterstitialAdConfiguration.bidResponse");
            java.lang.String watermark = mediationInterstitialAdConfiguration.getWatermark();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(watermark, "mediationInterstitialAdConfiguration.watermark");
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            return kotlin.Result.m1301constructorimpl(new com.google.ads.mediation.line.LineInterstitialAd(new java.lang.ref.WeakReference(activity), string, string2, bidResponse, watermark, mediationAdLoadCallback, mediationInterstitialAdConfiguration.getMediationExtras(), null));
        }
    }
}
