package com.google.ads.mediation.line;

/* JADX INFO: compiled from: LineBannerAd.kt */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 *2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001*BW\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0014H\u0016J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0014H\u0016J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0014H\u0016J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0014H\u0016J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0014H\u0016J\u0018\u0010'\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\"H\u0016J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0014H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/google/ads/mediation/line/LineBannerAd;", "Lcom/google/android/gms/ads/mediation/MediationBannerAd;", "Lcom/five_corp/ad/FiveAdLoadListener;", "Lcom/five_corp/ad/FiveAdCustomLayoutEventListener;", "context", "Landroid/content/Context;", "appId", "", "slotId", "bidResponse", "watermark", "mediationAdLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationBannerAdCallback;", com.ironsource.y8.h.O, "Lcom/google/android/gms/ads/AdSize;", "networkExtras", "Landroid/os/Bundle;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;Lcom/google/android/gms/ads/AdSize;Landroid/os/Bundle;)V", "adView", "Lcom/five_corp/ad/FiveAdCustomLayout;", "mediationBannerAdCallback", "getView", "Landroid/view/View;", "loadAd", "", "loadRtbAd", "onClick", "fiveAdCustomLayout", "onFiveAdLoad", "ad", "Lcom/five_corp/ad/FiveAdInterface;", "onFiveAdLoadError", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "Lcom/five_corp/ad/FiveAdErrorCode;", "onImpression", com.ironsource.y8.h.t0, "onPlay", "onRemove", "onViewError", "fiveAdErrorCode", "onViewThrough", "Companion", "line_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LineBannerAd implements com.google.android.gms.ads.mediation.MediationBannerAd, com.five_corp.ad.FiveAdLoadListener, com.five_corp.ad.FiveAdCustomLayoutEventListener {
    public static final int ERROR_CODE_MISMATCH_AD_SIZE = 103;
    public static final java.lang.String ERROR_MSG_MISMATCH_AD_SIZE = "Unexpected ad size loaded. Expected %sx%s but received %sx%s.";
    private final com.google.android.gms.ads.AdSize adSize;
    private com.five_corp.ad.FiveAdCustomLayout adView;
    private final java.lang.String appId;
    private final java.lang.String bidResponse;
    private final android.content.Context context;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback;
    private com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback;
    private final android.os.Bundle networkExtras;
    private final java.lang.String slotId;
    private final java.lang.String watermark;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.ads.mediation.line.LineBannerAd.Companion INSTANCE = new com.google.ads.mediation.line.LineBannerAd.Companion(null);
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.ads.mediation.line.LineBannerAd.class).getSimpleName();

    public /* synthetic */ LineBannerAd(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.google.android.gms.ads.mediation.MediationAdLoadCallback mediationAdLoadCallback, com.google.android.gms.ads.AdSize adSize, android.os.Bundle bundle, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, str3, str4, mediationAdLoadCallback, adSize, bundle);
    }

    private LineBannerAd(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback, com.google.android.gms.ads.AdSize adSize, android.os.Bundle bundle) {
        this.context = context;
        this.appId = str;
        this.slotId = str2;
        this.bidResponse = str3;
        this.watermark = str4;
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.adSize = adSize;
        this.networkExtras = bundle;
    }

    public final void loadAd() {
        java.lang.String str = this.slotId;
        if (str == null || str.length() == 0) {
            this.mediationAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(102, com.google.ads.mediation.line.LineMediationAdapter.ERROR_MSG_MISSING_SLOT_ID, "com.google.ads.mediation.line"));
            return;
        }
        com.google.ads.mediation.line.LineInitializer.INSTANCE.initialize(this.context, this.appId);
        com.google.ads.mediation.line.SdkFactory delegate$line_release = com.google.ads.mediation.line.LineSdkFactory.INSTANCE.getDelegate$line_release();
        android.content.Context context = this.context;
        com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayoutCreateFiveAdCustomLayout = delegate$line_release.createFiveAdCustomLayout(context, this.slotId, this.adSize.getWidthInPixels(context));
        this.adView = fiveAdCustomLayoutCreateFiveAdCustomLayout;
        com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout = null;
        if (fiveAdCustomLayoutCreateFiveAdCustomLayout == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adView");
            fiveAdCustomLayoutCreateFiveAdCustomLayout = null;
        }
        fiveAdCustomLayoutCreateFiveAdCustomLayout.setLoadListener(this);
        if (this.networkExtras != null) {
            com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout2 = this.adView;
            if (fiveAdCustomLayout2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adView");
                fiveAdCustomLayout2 = null;
            }
            fiveAdCustomLayout2.enableSound(this.networkExtras.getBoolean(com.google.ads.mediation.line.LineExtras.KEY_ENABLE_AD_SOUND, false));
        }
        com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout3 = this.adView;
        if (fiveAdCustomLayout3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adView");
        } else {
            fiveAdCustomLayout = fiveAdCustomLayout3;
        }
        fiveAdCustomLayout.loadAdAsync();
    }

    public final void loadRtbAd() {
        com.five_corp.ad.AdLoader adLoader = com.five_corp.ad.AdLoader.getAdLoader(this.context, new com.five_corp.ad.FiveAdConfig(this.appId));
        if (adLoader == null) {
            return;
        }
        adLoader.loadBannerAd(new com.five_corp.ad.BidData(this.bidResponse, this.watermark), new com.five_corp.ad.AdLoader.LoadBannerAdCallback() { // from class: com.google.ads.mediation.line.LineBannerAd.loadRtbAd.1
            @Override // com.five_corp.ad.AdLoader.LoadBannerAdCallback
            public void onLoad(com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdCustomLayout, "fiveAdCustomLayout");
                com.google.ads.mediation.line.LineBannerAd.this.adView = fiveAdCustomLayout;
                com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout2 = null;
                if (com.google.ads.mediation.line.LineBannerAd.this.networkExtras != null) {
                    com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout3 = com.google.ads.mediation.line.LineBannerAd.this.adView;
                    if (fiveAdCustomLayout3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adView");
                        fiveAdCustomLayout3 = null;
                    }
                    fiveAdCustomLayout3.enableSound(com.google.ads.mediation.line.LineBannerAd.this.networkExtras.getBoolean(com.google.ads.mediation.line.LineExtras.KEY_ENABLE_AD_SOUND, false));
                }
                com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout4 = com.google.ads.mediation.line.LineBannerAd.this.adView;
                if (fiveAdCustomLayout4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adView");
                } else {
                    fiveAdCustomLayout2 = fiveAdCustomLayout4;
                }
                fiveAdCustomLayout2.setEventListener(com.google.ads.mediation.line.LineBannerAd.this);
                com.google.ads.mediation.line.LineBannerAd lineBannerAd = com.google.ads.mediation.line.LineBannerAd.this;
                lineBannerAd.mediationBannerAdCallback = (com.google.android.gms.ads.mediation.MediationBannerAdCallback) lineBannerAd.mediationAdLoadCallback.onSuccess(com.google.ads.mediation.line.LineBannerAd.this);
            }

            @Override // com.five_corp.ad.AdLoader.LoadBannerAdCallback
            public void onError(com.five_corp.ad.FiveAdErrorCode adErrorCode) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adErrorCode, "adErrorCode");
                com.google.ads.mediation.line.LineBannerAd.this.mediationAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(adErrorCode.value, adErrorCode.name(), "com.five_corp.ad"));
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public android.view.View getView() {
        com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout = this.adView;
        if (fiveAdCustomLayout == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adView");
            fiveAdCustomLayout = null;
        }
        return fiveAdCustomLayout;
    }

    @Override // com.five_corp.ad.FiveAdLoadListener
    public void onFiveAdLoad(com.five_corp.ad.FiveAdInterface ad) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        java.lang.String str = TAG;
        android.util.Log.d(str, "Finished loading Line Banner Ad for slotId: " + ad.getSlotId());
        com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout = null;
        com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout2 = ad instanceof com.five_corp.ad.FiveAdCustomLayout ? (com.five_corp.ad.FiveAdCustomLayout) ad : null;
        if (fiveAdCustomLayout2 != null) {
            float f = this.context.getResources().getDisplayMetrics().density;
            com.google.android.gms.ads.AdSize adSize = new com.google.android.gms.ads.AdSize(kotlin.math.MathKt.roundToInt(fiveAdCustomLayout2.getLogicalWidth() / f), kotlin.math.MathKt.roundToInt(fiveAdCustomLayout2.getLogicalHeight() / f));
            android.util.Log.d(str, "Received Banner Ad dimensions: " + adSize.getWidth() + " x " + adSize.getHeight());
            if (com.google.android.gms.ads.MediationUtils.findClosestSize(this.context, this.adSize, kotlin.collections.CollectionsKt.listOf(adSize)) == null) {
                java.lang.String str2 = java.lang.String.format(ERROR_MSG_MISMATCH_AD_SIZE, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(this.adSize.getWidth()), java.lang.Integer.valueOf(this.adSize.getHeight()), java.lang.Integer.valueOf(fiveAdCustomLayout2.getLogicalWidth()), java.lang.Integer.valueOf(fiveAdCustomLayout2.getLogicalHeight())}, 4));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "format(this, *args)");
                android.util.Log.w(str, str2);
                this.mediationAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(103, str2, "com.google.ads.mediation.line"));
                return;
            }
        }
        com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout3 = this.adView;
        if (fiveAdCustomLayout3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adView");
        } else {
            fiveAdCustomLayout = fiveAdCustomLayout3;
        }
        fiveAdCustomLayout.setEventListener(this);
        this.mediationBannerAdCallback = this.mediationAdLoadCallback.onSuccess(this);
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

    @Override // com.five_corp.ad.FiveAdCustomLayoutEventListener
    public void onViewError(com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout, com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdCustomLayout, "fiveAdCustomLayout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdErrorCode, "fiveAdErrorCode");
        android.util.Log.w(TAG, "There was an error displaying the ad.");
    }

    @Override // com.five_corp.ad.FiveAdCustomLayoutEventListener
    public void onClick(com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdCustomLayout, "fiveAdCustomLayout");
        android.util.Log.d(TAG, "Line banner ad did record a click.");
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.five_corp.ad.FiveAdCustomLayoutEventListener
    public void onRemove(com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdCustomLayout, "fiveAdCustomLayout");
        android.util.Log.d(TAG, "Line banner ad removed");
    }

    @Override // com.five_corp.ad.FiveAdCustomLayoutEventListener
    public void onPlay(com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdCustomLayout, "fiveAdCustomLayout");
        android.util.Log.d(TAG, "Line banner ad played");
    }

    @Override // com.five_corp.ad.FiveAdCustomLayoutEventListener
    public void onPause(com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdCustomLayout, "fiveAdCustomLayout");
        android.util.Log.d(TAG, "Line banner ad paused");
    }

    @Override // com.five_corp.ad.FiveAdCustomLayoutEventListener
    public void onViewThrough(com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdCustomLayout, "fiveAdCustomLayout");
        android.util.Log.d(TAG, "Line banner ad viewed");
    }

    @Override // com.five_corp.ad.FiveAdCustomLayoutEventListener
    public void onImpression(com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdCustomLayout, "fiveAdCustomLayout");
        android.util.Log.d(TAG, "Line banner ad recorded an impression.");
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    /* JADX INFO: compiled from: LineBannerAd.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/google/ads/mediation/line/LineBannerAd$Companion;", "", "()V", "ERROR_CODE_MISMATCH_AD_SIZE", "", "ERROR_MSG_MISMATCH_AD_SIZE", "", "TAG", "newInstance", "Lkotlin/Result;", "Lcom/google/ads/mediation/line/LineBannerAd;", "mediationBannerAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;", "mediationAdLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationBannerAd;", "Lcom/google/android/gms/ads/mediation/MediationBannerAdCallback;", "newInstance-gIAlu-s", "(Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)Ljava/lang/Object;", "line_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: newInstance-gIAlu-s, reason: not valid java name */
        public final java.lang.Object m722newInstancegIAlus(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationBannerAdConfiguration, "mediationBannerAdConfiguration");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationAdLoadCallback, "mediationAdLoadCallback");
            android.content.Context context = mediationBannerAdConfiguration.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "mediationBannerAdConfiguration.context");
            android.os.Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serverParameters, "mediationBannerAdConfiguration.serverParameters");
            com.google.android.gms.ads.AdSize adSize = mediationBannerAdConfiguration.getAdSize();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adSize, "mediationBannerAdConfiguration.adSize");
            java.lang.String string = serverParameters.getString(com.google.ads.mediation.line.LineMediationAdapter.KEY_APP_ID);
            java.lang.String str = string;
            if (str == null || str.length() == 0) {
                com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, com.google.ads.mediation.line.LineMediationAdapter.ERROR_MSG_MISSING_APP_ID, "com.google.ads.mediation.line");
                mediationAdLoadCallback.onFailure(adError);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                return kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(new java.util.NoSuchElementException(adError.getMessage())));
            }
            java.lang.String string2 = serverParameters.getString(com.google.ads.mediation.line.LineMediationAdapter.KEY_SLOT_ID);
            java.lang.String bidResponse = mediationBannerAdConfiguration.getBidResponse();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bidResponse, "mediationBannerAdConfiguration.bidResponse");
            java.lang.String watermark = mediationBannerAdConfiguration.getWatermark();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(watermark, "mediationBannerAdConfiguration.watermark");
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m1301constructorimpl(new com.google.ads.mediation.line.LineBannerAd(context, string, string2, bidResponse, watermark, mediationAdLoadCallback, adSize, mediationBannerAdConfiguration.getMediationExtras(), null));
        }
    }
}
