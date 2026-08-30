package com.google.ads.mediation.line;

/* JADX INFO: compiled from: LineMediationAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J&\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J$\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0016J$\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020)2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0$H\u0016J$\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020.2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000$H\u0016J$\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u0002032\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002050$H\u0016J$\u00106\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\"2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0016J$\u00108\u001a\u00020\u000e2\u0006\u00107\u001a\u00020)2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0$H\u0016J$\u00109\u001a\u00020\u000e2\u0006\u00107\u001a\u00020.2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000$H\u0016J$\u0010:\u001a\u00020\u000e2\u0006\u00107\u001a\u0002032\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002050$H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/google/ads/mediation/line/LineMediationAdapter;", "Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;", "()V", "adLoader", "Lcom/five_corp/ad/AdLoader;", "bannerAd", "Lcom/google/ads/mediation/line/LineBannerAd;", "interstitialAd", "Lcom/google/ads/mediation/line/LineInterstitialAd;", "nativeAd", "Lcom/google/ads/mediation/line/LineNativeAd;", "rewardedAd", "Lcom/google/ads/mediation/line/LineRewardedAd;", "collectSignals", "", "signalData", "Lcom/google/android/gms/ads/mediation/rtb/RtbSignalData;", "signalCallbacks", "Lcom/google/android/gms/ads/mediation/rtb/SignalCallbacks;", "getSDKVersionInfo", "Lcom/google/android/gms/ads/VersionInfo;", "getVersionInfo", "versionString", "", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "context", "Landroid/content/Context;", "initializationCompleteCallback", "Lcom/google/android/gms/ads/mediation/InitializationCompleteCallback;", "mediationConfigurations", "", "Lcom/google/android/gms/ads/mediation/MediationConfiguration;", "loadBannerAd", "mediationBannerAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;", "callback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationBannerAd;", "Lcom/google/android/gms/ads/mediation/MediationBannerAdCallback;", "loadInterstitialAd", "mediationInterstitialAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAdConfiguration;", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAd;", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAdCallback;", "loadNativeAd", "mediationNativeAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationNativeAdConfiguration;", "Lcom/google/android/gms/ads/mediation/UnifiedNativeAdMapper;", "Lcom/google/android/gms/ads/mediation/MediationNativeAdCallback;", "loadRewardedAd", "mediationRewardedAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdConfiguration;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAd;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdCallback;", "loadRtbBannerAd", "adConfiguration", "loadRtbInterstitialAd", "loadRtbNativeAd", "loadRtbRewardedAd", "Companion", "line_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LineMediationAdapter extends com.google.android.gms.ads.mediation.rtb.RtbAdapter {
    public static final java.lang.String ADAPTER_ERROR_DOMAIN = "com.google.ads.mediation.line";
    public static final int ERROR_CODE_CONTEXT_NOT_AN_ACTIVITY = 104;
    public static final int ERROR_CODE_FAILED_TO_SHOW_FULLSCREEN = 105;
    public static final int ERROR_CODE_MINIMUM_NATIVE_INFO_NOT_RECEIVED = 106;
    public static final int ERROR_CODE_MISSING_APP_ID = 101;
    public static final int ERROR_CODE_MISSING_SLOT_ID = 102;
    public static final java.lang.String ERROR_MSG_AD_LOADING = "FiveAd SDK returned a load error with code %s.";
    public static final java.lang.String ERROR_MSG_AD_SHOWING = "FiveAd SDK could not show ad with error with code %s.";
    public static final java.lang.String ERROR_MSG_CONTEXT_NOT_AN_ACTIVITY = "Line Interstitial requires an Activity context to load this ad";
    public static final java.lang.String ERROR_MSG_FAILED_TO_SHOW_FULLSCREEN = "Failed to show the ad in fullscreen.";
    public static final java.lang.String ERROR_MSG_MINIMUM_NATIVE_INFO_NOT_RECEIVED = "Complete required data for Native ads was not received. Skipping Ad.";
    public static final java.lang.String ERROR_MSG_MISSING_APP_ID = "Missing or invalid Application ID configured for this ad source instance in the AdMob or Ad Manager UI.";
    public static final java.lang.String ERROR_MSG_MISSING_SLOT_ID = "Missing or invalid Slot ID configured for this ad source instance in the AdMob or Ad Manager UI.";
    public static final java.lang.String ERROR_MSG_NULL_AD_LOADER = "Null AdLoader from Five Ad SDK.";
    public static final java.lang.String KEY_APP_ID = "application_id";
    public static final java.lang.String KEY_SLOT_ID = "slot_id";
    public static final java.lang.String SDK_ERROR_DOMAIN = "com.five_corp.ad";
    private static java.lang.String adapterVersionDelegate;
    private com.five_corp.ad.AdLoader adLoader;
    private com.google.ads.mediation.line.LineBannerAd bannerAd;
    private com.google.ads.mediation.line.LineInterstitialAd interstitialAd;
    private com.google.ads.mediation.line.LineNativeAd nativeAd;
    private com.google.ads.mediation.line.LineRewardedAd rewardedAd;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.ads.mediation.line.LineMediationAdapter.Companion INSTANCE = new com.google.ads.mediation.line.LineMediationAdapter.Companion(null);
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.ads.mediation.line.LineMediationAdapter.class).getSimpleName();

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getSDKVersionInfo() {
        java.util.List listEmptyList;
        java.lang.String sdkVersion = com.google.ads.mediation.line.LineSdkWrapper.INSTANCE.getDelegate$line_release().getSdkVersion();
        java.util.List<java.lang.String> listSplit = new kotlin.text.Regex("\\.").split(sdkVersion, 0);
        if (!listSplit.isEmpty()) {
            java.util.ListIterator<java.lang.String> listIterator = listSplit.listIterator(listSplit.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (!(listIterator.previous().length() == 0)) {
                        listEmptyList = kotlin.collections.CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                        break;
                    }
                } else {
                    listEmptyList = kotlin.collections.CollectionsKt.emptyList();
                    break;
                }
            }
        } else {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
            break;
        }
        java.lang.String[] strArr = (java.lang.String[]) listEmptyList.toArray(new java.lang.String[0]);
        if (strArr.length >= 3) {
            return new com.google.android.gms.ads.VersionInfo(java.lang.Integer.parseInt(strArr[0]), java.lang.Integer.parseInt(strArr[1]), java.lang.Integer.parseInt(strArr[2]));
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", java.util.Arrays.copyOf(new java.lang.Object[]{sdkVersion}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        android.util.Log.w(TAG, str);
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getVersionInfo() {
        com.google.android.gms.ads.VersionInfo versionInfo;
        java.lang.String str = adapterVersionDelegate;
        return (str == null || (versionInfo = getVersionInfo(str)) == null) ? getVersionInfo(com.google.ads.mediation.line.BuildConfig.ADAPTER_VERSION) : versionInfo;
    }

    private final com.google.android.gms.ads.VersionInfo getVersionInfo(java.lang.String versionString) {
        java.util.List listEmptyList;
        java.util.List<java.lang.String> listSplit = new kotlin.text.Regex("\\.").split(versionString, 0);
        if (!listSplit.isEmpty()) {
            java.util.ListIterator<java.lang.String> listIterator = listSplit.listIterator(listSplit.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (!(listIterator.previous().length() == 0)) {
                        listEmptyList = kotlin.collections.CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                        break;
                    }
                } else {
                    listEmptyList = kotlin.collections.CollectionsKt.emptyList();
                    break;
                }
            }
        } else {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
            break;
        }
        java.lang.String[] strArr = (java.lang.String[]) listEmptyList.toArray(new java.lang.String[0]);
        if (strArr.length >= 4) {
            return new com.google.android.gms.ads.VersionInfo(java.lang.Integer.parseInt(strArr[0]), java.lang.Integer.parseInt(strArr[1]), (java.lang.Integer.parseInt(strArr[2]) * 100) + java.lang.Integer.parseInt(strArr[3]));
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", java.util.Arrays.copyOf(new java.lang.Object[]{versionString}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        android.util.Log.w(TAG, str);
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(android.content.Context context, com.google.android.gms.ads.mediation.InitializationCompleteCallback initializationCompleteCallback, java.util.List<? extends com.google.android.gms.ads.mediation.MediationConfiguration> mediationConfigurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationCompleteCallback, "initializationCompleteCallback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationConfigurations, "mediationConfigurations");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = mediationConfigurations.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String string = ((com.google.android.gms.ads.mediation.MediationConfiguration) it.next()).getServerParameters().getString(KEY_APP_ID);
            java.lang.String str = string;
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (z) {
                string = null;
            }
            if (string != null) {
                arrayList.add(string);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            initializationCompleteCallback.onInitializationFailed(ERROR_MSG_MISSING_APP_ID);
            return;
        }
        java.lang.String str2 = (java.lang.String) arrayList2.get(0);
        if (arrayList2.size() > 1) {
            android.util.Log.w(TAG, "Multiple application_id entries found: " + arrayList2 + ". Using '" + str2 + "' to initialize the Line SDK");
        }
        com.five_corp.ad.AdLoader adLoader = com.five_corp.ad.AdLoader.getAdLoader(context, new com.five_corp.ad.FiveAdConfig(str2));
        if (adLoader == null) {
            initializationCompleteCallback.onInitializationFailed(ERROR_MSG_NULL_AD_LOADER);
            return;
        }
        this.adLoader = adLoader;
        try {
            com.google.ads.mediation.line.LineInitializer.INSTANCE.initialize(context, str2);
            initializationCompleteCallback.onInitializationSucceeded();
        } catch (java.lang.IllegalArgumentException e) {
            java.lang.String message = e.getMessage();
            if (message != null) {
                initializationCompleteCallback.onInitializationFailed(message);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(com.google.android.gms.ads.mediation.rtb.RtbSignalData signalData, final com.google.android.gms.ads.mediation.rtb.SignalCallbacks signalCallbacks) {
        com.five_corp.ad.AdLoader adLoader;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signalData, "signalData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signalCallbacks, "signalCallbacks");
        java.util.List<com.google.android.gms.ads.mediation.MediationConfiguration> configurations = signalData.getConfigurations();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(configurations, "signalData.configurations");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = configurations.iterator();
        while (true) {
            adLoader = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String string = ((com.google.android.gms.ads.mediation.MediationConfiguration) it.next()).getServerParameters().getString(KEY_SLOT_ID);
            java.lang.String str = string;
            java.lang.String str2 = str == null || str.length() == 0 ? null : string;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            if (!(((java.lang.CharSequence) kotlin.collections.CollectionsKt.first((java.util.List) arrayList2)).length() == 0)) {
                com.five_corp.ad.AdLoader adLoader2 = this.adLoader;
                if (adLoader2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adLoader");
                } else {
                    adLoader = adLoader2;
                }
                adLoader.collectSignal((java.lang.String) kotlin.collections.CollectionsKt.first((java.util.List) arrayList2), new com.five_corp.ad.AdLoader.CollectSignalCallback() { // from class: com.google.ads.mediation.line.LineMediationAdapter.collectSignals.1
                    @Override // com.five_corp.ad.AdLoader.CollectSignalCallback
                    public void onCollect(java.lang.String signalString) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signalString, "signalString");
                        signalCallbacks.onSuccess(signalString);
                    }

                    @Override // com.five_corp.ad.AdLoader.CollectSignalCallback
                    public void onError(com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdErrorCode, "fiveAdErrorCode");
                        signalCallbacks.onFailure(new com.google.android.gms.ads.AdError(fiveAdErrorCode.value, fiveAdErrorCode.name(), "com.five_corp.ad"));
                    }
                });
                return;
            }
        }
        signalCallbacks.onFailure(new com.google.android.gms.ads.AdError(102, ERROR_MSG_MISSING_SLOT_ID, "com.google.ads.mediation.line"));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationBannerAdConfiguration, "mediationBannerAdConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        java.lang.Object objM722newInstancegIAlus = com.google.ads.mediation.line.LineBannerAd.INSTANCE.m722newInstancegIAlus(mediationBannerAdConfiguration, callback);
        if (kotlin.Result.m1308isSuccessimpl(objM722newInstancegIAlus)) {
            com.google.ads.mediation.line.LineBannerAd lineBannerAd = (com.google.ads.mediation.line.LineBannerAd) objM722newInstancegIAlus;
            this.bannerAd = lineBannerAd;
            if (lineBannerAd == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bannerAd");
                lineBannerAd = null;
            }
            lineBannerAd.loadAd();
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationInterstitialAdConfiguration, "mediationInterstitialAdConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        java.lang.Object objM723newInstancegIAlus = com.google.ads.mediation.line.LineInterstitialAd.INSTANCE.m723newInstancegIAlus(mediationInterstitialAdConfiguration, callback);
        if (kotlin.Result.m1308isSuccessimpl(objM723newInstancegIAlus)) {
            com.google.ads.mediation.line.LineInterstitialAd lineInterstitialAd = (com.google.ads.mediation.line.LineInterstitialAd) objM723newInstancegIAlus;
            this.interstitialAd = lineInterstitialAd;
            if (lineInterstitialAd == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("interstitialAd");
                lineInterstitialAd = null;
            }
            lineInterstitialAd.loadAd();
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationRewardedAdConfiguration, "mediationRewardedAdConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        java.lang.Object objM726newInstancegIAlus = com.google.ads.mediation.line.LineRewardedAd.INSTANCE.m726newInstancegIAlus(mediationRewardedAdConfiguration, callback);
        if (kotlin.Result.m1308isSuccessimpl(objM726newInstancegIAlus)) {
            com.google.ads.mediation.line.LineRewardedAd lineRewardedAd = (com.google.ads.mediation.line.LineRewardedAd) objM726newInstancegIAlus;
            this.rewardedAd = lineRewardedAd;
            if (lineRewardedAd == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("rewardedAd");
                lineRewardedAd = null;
            }
            lineRewardedAd.loadAd();
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationNativeAdConfiguration, "mediationNativeAdConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        java.lang.Object objM724newInstance0E7RQCE$default = com.google.ads.mediation.line.LineNativeAd.Companion.m724newInstance0E7RQCE$default(com.google.ads.mediation.line.LineNativeAd.INSTANCE, mediationNativeAdConfiguration, callback, null, 4, null);
        if (kotlin.Result.m1308isSuccessimpl(objM724newInstance0E7RQCE$default)) {
            com.google.ads.mediation.line.LineNativeAd lineNativeAd = (com.google.ads.mediation.line.LineNativeAd) objM724newInstance0E7RQCE$default;
            this.nativeAd = lineNativeAd;
            if (lineNativeAd == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAd");
                lineNativeAd = null;
            }
            lineNativeAd.loadAd();
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration adConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        java.lang.Object objM722newInstancegIAlus = com.google.ads.mediation.line.LineBannerAd.INSTANCE.m722newInstancegIAlus(adConfiguration, callback);
        if (kotlin.Result.m1308isSuccessimpl(objM722newInstancegIAlus)) {
            com.google.ads.mediation.line.LineBannerAd lineBannerAd = (com.google.ads.mediation.line.LineBannerAd) objM722newInstancegIAlus;
            this.bannerAd = lineBannerAd;
            if (lineBannerAd == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bannerAd");
                lineBannerAd = null;
            }
            lineBannerAd.loadRtbAd();
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration adConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        java.lang.Object objM723newInstancegIAlus = com.google.ads.mediation.line.LineInterstitialAd.INSTANCE.m723newInstancegIAlus(adConfiguration, callback);
        if (kotlin.Result.m1308isSuccessimpl(objM723newInstancegIAlus)) {
            com.google.ads.mediation.line.LineInterstitialAd lineInterstitialAd = (com.google.ads.mediation.line.LineInterstitialAd) objM723newInstancegIAlus;
            this.interstitialAd = lineInterstitialAd;
            if (lineInterstitialAd == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("interstitialAd");
                lineInterstitialAd = null;
            }
            lineInterstitialAd.loadRtbAd();
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration adConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        java.lang.Object objM726newInstancegIAlus = com.google.ads.mediation.line.LineRewardedAd.INSTANCE.m726newInstancegIAlus(adConfiguration, callback);
        if (kotlin.Result.m1308isSuccessimpl(objM726newInstancegIAlus)) {
            com.google.ads.mediation.line.LineRewardedAd lineRewardedAd = (com.google.ads.mediation.line.LineRewardedAd) objM726newInstancegIAlus;
            this.rewardedAd = lineRewardedAd;
            if (lineRewardedAd == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("rewardedAd");
                lineRewardedAd = null;
            }
            lineRewardedAd.loadRtbAd();
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration adConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        java.lang.Object objM724newInstance0E7RQCE$default = com.google.ads.mediation.line.LineNativeAd.Companion.m724newInstance0E7RQCE$default(com.google.ads.mediation.line.LineNativeAd.INSTANCE, adConfiguration, callback, null, 4, null);
        if (kotlin.Result.m1308isSuccessimpl(objM724newInstance0E7RQCE$default)) {
            com.google.ads.mediation.line.LineNativeAd lineNativeAd = (com.google.ads.mediation.line.LineNativeAd) objM724newInstance0E7RQCE$default;
            this.nativeAd = lineNativeAd;
            if (lineNativeAd == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAd");
                lineNativeAd = null;
            }
            lineNativeAd.loadRtbAd();
        }
    }

    /* JADX INFO: compiled from: LineMediationAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/google/ads/mediation/line/LineMediationAdapter$Companion;", "", "()V", "ADAPTER_ERROR_DOMAIN", "", "ERROR_CODE_CONTEXT_NOT_AN_ACTIVITY", "", "ERROR_CODE_FAILED_TO_SHOW_FULLSCREEN", "ERROR_CODE_MINIMUM_NATIVE_INFO_NOT_RECEIVED", "ERROR_CODE_MISSING_APP_ID", "ERROR_CODE_MISSING_SLOT_ID", "ERROR_MSG_AD_LOADING", "ERROR_MSG_AD_SHOWING", "ERROR_MSG_CONTEXT_NOT_AN_ACTIVITY", "ERROR_MSG_FAILED_TO_SHOW_FULLSCREEN", "ERROR_MSG_MINIMUM_NATIVE_INFO_NOT_RECEIVED", "ERROR_MSG_MISSING_APP_ID", "ERROR_MSG_MISSING_SLOT_ID", "ERROR_MSG_NULL_AD_LOADER", "KEY_APP_ID", "KEY_SLOT_ID", "SDK_ERROR_DOMAIN", "TAG", "adapterVersionDelegate", "getAdapterVersionDelegate$annotations", "getAdapterVersionDelegate", "()Ljava/lang/String;", "setAdapterVersionDelegate", "(Ljava/lang/String;)V", "line_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getAdapterVersionDelegate$annotations() {
        }

        private Companion() {
        }

        public final java.lang.String getAdapterVersionDelegate() {
            return com.google.ads.mediation.line.LineMediationAdapter.adapterVersionDelegate;
        }

        public final void setAdapterVersionDelegate(java.lang.String str) {
            com.google.ads.mediation.line.LineMediationAdapter.adapterVersionDelegate = str;
        }
    }
}
