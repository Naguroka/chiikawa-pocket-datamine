package com.applovin.mediation.unity;

/* JADX INFO: loaded from: classes3.dex */
public class MaxUnityAdManager implements com.applovin.mediation.MaxAdListener, com.applovin.mediation.MaxAdViewAdListener, com.applovin.mediation.MaxRewardedAdListener, com.applovin.mediation.MaxAdRevenueListener, com.applovin.mediation.MaxAdReviewListener, com.applovin.sdk.AppLovinCmpService.OnCompletedListener, com.applovin.mediation.unity.MaxUnityApplicationStateChangeTracker.MaxUnityApplicationStateCallback {
    private static final java.lang.String DEFAULT_AD_VIEW_POSITION = "top_left";
    private static final java.lang.String KEY_RENDER_OUTSIDE_SAFE_AREA = "render_outside_safe_area";
    private static final java.lang.String SDK_TAG = "AppLovinSdk";
    private static final java.lang.String TAG = "MaxUnityAdManager";
    private static com.applovin.mediation.unity.MaxUnityAdManager.BackgroundCallback backgroundCallback;
    private static java.lang.ref.WeakReference<android.app.Activity> currentActivity;
    private static com.applovin.mediation.unity.MaxUnityAdManager instance;
    private final java.util.List<java.lang.String> AdUnitsToShowAfterCreate;
    private final java.util.Map<java.lang.String, java.lang.String> AdViewCustomDataToSetAfterCreate;
    private final java.util.Map<java.lang.String, com.applovin.mediation.MaxAd> adInfoMap;
    private final java.lang.Object adInfoMapLock;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> adViewExtraParametersToSetAfterCreate;
    private final java.util.Map<java.lang.String, com.applovin.mediation.MaxAdFormat> adViewFormats;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> adViewLocalExtraParametersToSetAfterCreate;
    private final java.util.Map<java.lang.String, android.graphics.Point> adViewOffsets;
    private final java.util.Map<java.lang.String, java.lang.String> adViewPositions;
    private final java.util.Map<java.lang.String, java.lang.Integer> adViewWidths;
    private final java.util.Map<java.lang.String, com.applovin.mediation.ads.MaxAdView> adViews;
    private final java.util.Map<java.lang.String, com.applovin.mediation.ads.MaxAppOpenAd> appOpenAds;
    private final com.applovin.mediation.unity.MaxUnityApplicationStateChangeTracker applicationStateChangeTracker;
    private final java.util.Set<java.lang.String> disabledAdaptiveBannerAdUnitIds;
    private final java.util.Set<java.lang.String> disabledAutoRefreshAdViewAdUnitIds;
    private final java.util.Map<java.lang.String, com.applovin.mediation.ads.MaxInterstitialAd> interstitials;
    private java.lang.Integer publisherBannerBackgroundColor;
    private final java.util.Map<java.lang.String, com.applovin.mediation.ads.MaxRewardedAd> rewardedAds;
    private final java.util.Map<java.lang.String, com.applovin.mediation.ads.MaxRewardedInterstitialAd> rewardedInterstitialAds;
    private android.view.View safeAreaBackground;
    private com.applovin.sdk.AppLovinSdk sdk;
    private static final android.graphics.Point DEFAULT_AD_VIEW_OFFSET = new android.graphics.Point(0, 0);
    private static final java.util.concurrent.ScheduledThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(3, new com.applovin.mediation.unity.MaxUnityAdManager.SdkThreadFactory());

    public interface BackgroundCallback {
        void onEvent(java.lang.String str);
    }

    public interface Listener {
        void onSdkInitializationComplete(com.applovin.sdk.AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    protected static class Insets {
        int bottom;
        int left;
        int right;
        int top;

        protected Insets() {
        }
    }

    public MaxUnityAdManager() {
        this(null);
    }

    private MaxUnityAdManager(android.app.Activity activity) {
        this.publisherBannerBackgroundColor = null;
        currentActivity = new java.lang.ref.WeakReference<>(activity);
        this.interstitials = new java.util.HashMap(2);
        this.appOpenAds = new java.util.HashMap(2);
        this.rewardedAds = new java.util.HashMap(2);
        this.rewardedInterstitialAds = new java.util.HashMap(2);
        this.adViews = new java.util.HashMap(2);
        this.adViewFormats = new java.util.HashMap(2);
        this.adViewPositions = new java.util.HashMap(2);
        this.adViewOffsets = new java.util.HashMap(2);
        this.adViewWidths = new java.util.HashMap(2);
        this.adInfoMap = new java.util.HashMap();
        this.adInfoMapLock = new java.lang.Object();
        this.adViewExtraParametersToSetAfterCreate = new java.util.HashMap(1);
        this.adViewLocalExtraParametersToSetAfterCreate = new java.util.HashMap(1);
        this.AdViewCustomDataToSetAfterCreate = new java.util.HashMap(1);
        this.AdUnitsToShowAfterCreate = new java.util.ArrayList(2);
        this.disabledAdaptiveBannerAdUnitIds = new java.util.HashSet(2);
        this.disabledAutoRefreshAdViewAdUnitIds = new java.util.HashSet(2);
        this.applicationStateChangeTracker = new com.applovin.mediation.unity.MaxUnityApplicationStateChangeTracker(this);
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(true, new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m694lambda$new$2$comapplovinmediationunityMaxUnityAdManager();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$new$2$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m694lambda$new$2$comapplovinmediationunityMaxUnityAdManager() {
        android.view.View view = new android.view.View(getCurrentActivity());
        this.safeAreaBackground = view;
        view.setVisibility(8);
        this.safeAreaBackground.setBackgroundColor(0);
        this.safeAreaBackground.setClickable(false);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getCurrentActivity());
        frameLayout.addView(this.safeAreaBackground, new android.widget.FrameLayout.LayoutParams(0, 0));
        getCurrentActivity().addContentView(frameLayout, new android.widget.LinearLayout.LayoutParams(-1, -1));
        java.lang.Object parent = frameLayout.getParent();
        if (parent instanceof android.view.View) {
            ((android.view.View) parent).addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda9
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(android.view.View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    this.f$0.m692lambda$new$0$comapplovinmediationunityMaxUnityAdManager(view2, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
        }
        getCurrentActivity().getWindow().getDecorView().getRootView().addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda10
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.f$0.m693lambda$new$1$comapplovinmediationunityMaxUnityAdManager(view2, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$new$0$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m692lambda$new$0$comapplovinmediationunityMaxUnityAdManager(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        java.util.Iterator<com.applovin.mediation.ads.MaxAdView> it = this.adViews.values().iterator();
        while (it.hasNext()) {
            java.lang.Object parent = it.next().getParent();
            if (parent instanceof android.view.View) {
                ((android.view.View) parent).bringToFront();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$new$1$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m693lambda$new$1$comapplovinmediationunityMaxUnityAdManager(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if ((i == i5 && i3 == i7 && i4 == i8 && i2 == i6) ? false : true) {
            for (java.util.Map.Entry<java.lang.String, com.applovin.mediation.MaxAdFormat> entry : this.adViewFormats.entrySet()) {
                positionAdView(entry.getKey(), entry.getValue());
            }
        }
    }

    public static com.applovin.mediation.unity.MaxUnityAdManager getInstance(android.app.Activity activity) {
        if (instance == null) {
            instance = new com.applovin.mediation.unity.MaxUnityAdManager(activity);
        } else {
            currentActivity = new java.lang.ref.WeakReference<>(activity);
        }
        return instance;
    }

    public static void setBackgroundCallback(com.applovin.mediation.unity.MaxUnityAdManager.BackgroundCallback backgroundCallback2) {
        backgroundCallback = backgroundCallback2;
    }

    public void initializeSdkWithCompletionHandler(com.applovin.sdk.AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, final com.applovin.mediation.unity.MaxUnityAdManager.Listener listener) {
        com.applovin.sdk.AppLovinSdk appLovinSdk = com.applovin.sdk.AppLovinSdk.getInstance(getCurrentActivity());
        this.sdk = appLovinSdk;
        appLovinSdk.initialize(appLovinSdkInitializationConfiguration, new com.applovin.sdk.AppLovinSdk.SdkInitializationListener() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda25
            @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
            public final void onSdkInitialized(com.applovin.sdk.AppLovinSdkConfiguration appLovinSdkConfiguration) {
                this.f$0.m690x3112debb(listener, appLovinSdkConfiguration);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initializeSdkWithCompletionHandler$4$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m690x3112debb(final com.applovin.mediation.unity.MaxUnityAdManager.Listener listener, final com.applovin.sdk.AppLovinSdkConfiguration appLovinSdkConfiguration) {
        threadPoolExecutor.execute(new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m689xf7483cdc(listener, appLovinSdkConfiguration);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initializeSdkWithCompletionHandler$3$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m689xf7483cdc(com.applovin.mediation.unity.MaxUnityAdManager.Listener listener, com.applovin.sdk.AppLovinSdkConfiguration appLovinSdkConfiguration) {
        listener.onSdkInitializationComplete(appLovinSdkConfiguration);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "name", "OnSdkInitializedEvent");
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "consentFlowUserGeography", java.lang.Integer.toString(appLovinSdkConfiguration.getConsentFlowUserGeography().ordinal()));
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "consentDialogState", java.lang.Integer.toString(appLovinSdkConfiguration.getConsentDialogState().ordinal()));
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "countryCode", appLovinSdkConfiguration.getCountryCode());
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "isSuccessfullyInitialized", java.lang.String.valueOf(this.sdk.isInitialized()));
        com.applovin.impl.sdk.utils.JsonUtils.putBoolean(jSONObject, "isTestModeEnabled", appLovinSdkConfiguration.isTestModeEnabled());
        forwardUnityEvent(jSONObject);
    }

    public void createBanner(java.lang.String str, java.lang.String str2) {
        createAdView(str, getAdViewAdFormat(str), str2, DEFAULT_AD_VIEW_OFFSET);
    }

    public void createBanner(java.lang.String str, float f, float f2) {
        createAdView(str, getAdViewAdFormat(str), DEFAULT_AD_VIEW_POSITION, getOffsetPixels(f, f2, getCurrentActivity()));
    }

    public void loadBanner(java.lang.String str) {
        loadAdView(str, getAdViewAdFormat(str));
    }

    public void setBannerPlacement(java.lang.String str, java.lang.String str2) {
        setAdViewPlacement(str, getAdViewAdFormat(str), str2);
    }

    public void startBannerAutoRefresh(java.lang.String str) {
        startAdViewAutoRefresh(str, getAdViewAdFormat(str));
    }

    public void stopBannerAutoRefresh(java.lang.String str) {
        stopAdViewAutoRefresh(str, getAdViewAdFormat(str));
    }

    public void setBannerWidth(java.lang.String str, int i) {
        setAdViewWidth(str, i, getAdViewAdFormat(str));
    }

    public void updateBannerPosition(java.lang.String str, java.lang.String str2) {
        updateAdViewPosition(str, str2, DEFAULT_AD_VIEW_OFFSET, getAdViewAdFormat(str));
    }

    public void updateBannerPosition(java.lang.String str, float f, float f2) {
        updateAdViewPosition(str, DEFAULT_AD_VIEW_POSITION, getOffsetPixels(f, f2, getCurrentActivity()), getAdViewAdFormat(str));
    }

    public void showBanner(java.lang.String str) {
        showAdView(str, getAdViewAdFormat(str));
    }

    public void hideBanner(java.lang.String str) {
        hideAdView(str, getAdViewAdFormat(str));
    }

    public void destroyBanner(java.lang.String str) {
        destroyAdView(str, getAdViewAdFormat(str));
    }

    public void setBannerBackgroundColor(java.lang.String str, java.lang.String str2) {
        setAdViewBackgroundColor(str, getAdViewAdFormat(str), str2);
    }

    public void setBannerExtraParameter(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        setAdViewExtraParameter(str, getAdViewAdFormat(str), str2, str3);
    }

    public void setBannerLocalExtraParameter(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            setAdViewLocalExtraParameter(str, getAdViewAdFormat(str), str2, obj);
        }
    }

    public void setBannerCustomData(java.lang.String str, java.lang.String str2) {
        setAdViewCustomData(str, getAdViewAdFormat(str), str2);
    }

    public java.lang.String getBannerLayout(java.lang.String str) {
        return getAdViewLayout(str, getAdViewAdFormat(str));
    }

    public static float getAdaptiveBannerHeight(float f) {
        return getDeviceSpecificAdViewAdFormat().getAdaptiveSize((int) f, getCurrentActivity()).getHeight();
    }

    public void createMRec(java.lang.String str, java.lang.String str2) {
        createAdView(str, com.applovin.mediation.MaxAdFormat.MREC, str2, DEFAULT_AD_VIEW_OFFSET);
    }

    public void createMRec(java.lang.String str, float f, float f2) {
        createAdView(str, com.applovin.mediation.MaxAdFormat.MREC, DEFAULT_AD_VIEW_POSITION, getOffsetPixels(f, f2, getCurrentActivity()));
    }

    public void loadMRec(java.lang.String str) {
        loadAdView(str, com.applovin.mediation.MaxAdFormat.MREC);
    }

    public void setMRecPlacement(java.lang.String str, java.lang.String str2) {
        setAdViewPlacement(str, com.applovin.mediation.MaxAdFormat.MREC, str2);
    }

    public void startMRecAutoRefresh(java.lang.String str) {
        startAdViewAutoRefresh(str, com.applovin.mediation.MaxAdFormat.MREC);
    }

    public void stopMRecAutoRefresh(java.lang.String str) {
        stopAdViewAutoRefresh(str, com.applovin.mediation.MaxAdFormat.MREC);
    }

    public void updateMRecPosition(java.lang.String str, java.lang.String str2) {
        updateAdViewPosition(str, str2, DEFAULT_AD_VIEW_OFFSET, com.applovin.mediation.MaxAdFormat.MREC);
    }

    public void updateMRecPosition(java.lang.String str, float f, float f2) {
        updateAdViewPosition(str, DEFAULT_AD_VIEW_POSITION, getOffsetPixels(f, f2, getCurrentActivity()), com.applovin.mediation.MaxAdFormat.MREC);
    }

    public void showMRec(java.lang.String str) {
        showAdView(str, com.applovin.mediation.MaxAdFormat.MREC);
    }

    public void hideMRec(java.lang.String str) {
        hideAdView(str, com.applovin.mediation.MaxAdFormat.MREC);
    }

    public void setMRecExtraParameter(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        setAdViewExtraParameter(str, com.applovin.mediation.MaxAdFormat.MREC, str2, str3);
    }

    public void setMRecLocalExtraParameter(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            setAdViewLocalExtraParameter(str, com.applovin.mediation.MaxAdFormat.MREC, str2, obj);
        }
    }

    public void setMRecCustomData(java.lang.String str, java.lang.String str2) {
        setAdViewCustomData(str, com.applovin.mediation.MaxAdFormat.MREC, str2);
    }

    public java.lang.String getMRecLayout(java.lang.String str) {
        return getAdViewLayout(str, com.applovin.mediation.MaxAdFormat.MREC);
    }

    public void destroyMRec(java.lang.String str) {
        destroyAdView(str, com.applovin.mediation.MaxAdFormat.MREC);
    }

    public void loadInterstitial(java.lang.String str) {
        retrieveInterstitial(str).loadAd();
    }

    public boolean isInterstitialReady(java.lang.String str) {
        return retrieveInterstitial(str).isReady();
    }

    public void showInterstitial(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        retrieveInterstitial(str).showAd(str2, str3);
    }

    public void setInterstitialExtraParameter(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        retrieveInterstitial(str).setExtraParameter(str2, str3);
    }

    public void setInterstitialLocalExtraParameter(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            retrieveInterstitial(str).setLocalExtraParameter(str2, obj);
        }
    }

    public void loadAppOpenAd(java.lang.String str) {
        retrieveAppOpenAd(str).loadAd();
    }

    public boolean isAppOpenAdReady(java.lang.String str) {
        return retrieveAppOpenAd(str).isReady();
    }

    public void showAppOpenAd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        retrieveAppOpenAd(str).showAd(str2, str3);
    }

    public void setAppOpenAdExtraParameter(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        retrieveAppOpenAd(str).setExtraParameter(str2, str3);
    }

    public void setAppOpenAdLocalExtraParameter(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            retrieveAppOpenAd(str).setLocalExtraParameter(str2, obj);
        }
    }

    public void loadRewardedAd(java.lang.String str) {
        retrieveRewardedAd(str).loadAd();
    }

    public boolean isRewardedAdReady(java.lang.String str) {
        return retrieveRewardedAd(str).isReady();
    }

    public void showRewardedAd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        retrieveRewardedAd(str).showAd(str2, str3);
    }

    public void setRewardedAdExtraParameter(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        retrieveRewardedAd(str).setExtraParameter(str2, str3);
    }

    public void setRewardedAdLocalExtraParameter(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            retrieveRewardedAd(str).setLocalExtraParameter(str2, obj);
        }
    }

    public void loadRewardedInterstitialAd(java.lang.String str) {
        retrieveRewardedInterstitialAd(str).loadAd();
    }

    public boolean isRewardedInterstitialAdReady(java.lang.String str) {
        return retrieveRewardedInterstitialAd(str).isReady();
    }

    public void showRewardedInterstitialAd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        retrieveRewardedInterstitialAd(str).showAd(str2, str3);
    }

    public void setRewardedInterstitialAdExtraParameter(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        retrieveRewardedInterstitialAd(str).setExtraParameter(str2, str3);
    }

    public void setRewardedInterstitialAdLocalExtraParameter(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            retrieveRewardedInterstitialAd(str).setLocalExtraParameter(str2, obj);
        }
    }

    public void trackEvent(java.lang.String str, java.lang.String str2) {
        if (this.sdk == null) {
            return;
        }
        this.sdk.getEventService().trackEvent(str, deserializeParameters(str2));
    }

    public void showCmpForExistingUser() {
        this.sdk.getCmpService().showCmpForExistingUser(getCurrentActivity(), this);
    }

    @Override // com.applovin.sdk.AppLovinCmpService.OnCompletedListener
    public void onCompleted(final com.applovin.sdk.AppLovinCmpError appLovinCmpError) {
        threadPoolExecutor.execute(new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.mediation.unity.MaxUnityAdManager.lambda$onCompleted$5(appLovinCmpError);
            }
        });
    }

    static /* synthetic */ void lambda$onCompleted$5(com.applovin.sdk.AppLovinCmpError appLovinCmpError) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "name", "OnCmpCompletedEvent");
        com.applovin.impl.sdk.utils.JsonUtils.putBoolean(jSONObject, "keepInBackground", true);
        if (appLovinCmpError != null) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            com.applovin.impl.sdk.utils.JsonUtils.putInt(jSONObject2, "code", appLovinCmpError.getCode().getValue());
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject2, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, appLovinCmpError.getMessage());
            com.applovin.impl.sdk.utils.JsonUtils.putInt(jSONObject2, "cmpCode", appLovinCmpError.getCmpCode());
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject2, "cmpMessage", appLovinCmpError.getCmpMessage());
            com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject, "error", jSONObject2);
        }
        forwardUnityEvent(jSONObject);
    }

    @Override // com.applovin.mediation.unity.MaxUnityApplicationStateChangeTracker.MaxUnityApplicationStateCallback
    public void onApplicationStateChanged(final boolean z) {
        threadPoolExecutor.execute(new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.mediation.unity.MaxUnityAdManager.lambda$onApplicationStateChanged$6(z);
            }
        });
    }

    static /* synthetic */ void lambda$onApplicationStateChanged$6(boolean z) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "name", "OnApplicationStateChanged");
        com.applovin.impl.sdk.utils.JsonUtils.putBoolean(jSONObject, "isPaused", z);
        forwardUnityEvent(jSONObject);
    }

    public java.lang.String getAdInfo(java.lang.String str) {
        com.applovin.mediation.MaxAd ad;
        return (android.text.TextUtils.isEmpty(str) || (ad = getAd(str)) == null) ? "" : getAdInfo(ad).toString();
    }

    private org.json.JSONObject getAdInfo(com.applovin.mediation.MaxAd maxAd) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "adUnitId", maxAd.getAdUnitId());
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, maxAd.getFormat().getLabel());
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "networkName", maxAd.getNetworkName());
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "networkPlacement", maxAd.getNetworkPlacement());
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_CREATIVE_ID, !android.text.TextUtils.isEmpty(maxAd.getCreativeId()) ? maxAd.getCreativeId() : "");
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "placement", !android.text.TextUtils.isEmpty(maxAd.getPlacement()) ? maxAd.getPlacement() : "");
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "revenue", java.lang.String.valueOf(maxAd.getRevenue()));
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "revenuePrecision", maxAd.getRevenuePrecision());
        com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject, "waterfallInfo", createAdWaterfallInfo(maxAd.getWaterfall()));
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "latencyMillis", java.lang.String.valueOf(maxAd.getRequestLatencyMillis()));
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "dspName", android.text.TextUtils.isEmpty(maxAd.getDspName()) ? "" : maxAd.getDspName());
        return jSONObject;
    }

    private org.json.JSONObject createAdWaterfallInfo(com.applovin.mediation.MaxAdWaterfallInfo maxAdWaterfallInfo) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (maxAdWaterfallInfo == null) {
            return jSONObject;
        }
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "name", maxAdWaterfallInfo.getName());
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "testName", maxAdWaterfallInfo.getTestName());
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<com.applovin.mediation.MaxNetworkResponseInfo> it = maxAdWaterfallInfo.getNetworkResponses().iterator();
        while (it.hasNext()) {
            jSONArray.put(createNetworkResponseInfo(it.next()));
        }
        com.applovin.impl.sdk.utils.JsonUtils.putJsonArray(jSONObject, "networkResponses", jSONArray);
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "latencyMillis", java.lang.String.valueOf(maxAdWaterfallInfo.getLatencyMillis()));
        return jSONObject;
    }

    private org.json.JSONObject createNetworkResponseInfo(com.applovin.mediation.MaxNetworkResponseInfo maxNetworkResponseInfo) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "adLoadState", java.lang.Integer.toString(maxNetworkResponseInfo.getAdLoadState().ordinal()));
        if (maxNetworkResponseInfo.getMediatedNetwork() != null) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject2, "name", maxNetworkResponseInfo.getMediatedNetwork().getName());
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject2, "adapterClassName", maxNetworkResponseInfo.getMediatedNetwork().getAdapterClassName());
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject2, com.json.xt.b, maxNetworkResponseInfo.getMediatedNetwork().getAdapterVersion());
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject2, "sdkVersion", maxNetworkResponseInfo.getMediatedNetwork().getSdkVersion());
            com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject, "mediatedNetwork", jSONObject2);
        }
        com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject, "credentials", com.applovin.impl.sdk.utils.BundleUtils.toJSONObject(maxNetworkResponseInfo.getCredentials()));
        com.applovin.impl.sdk.utils.JsonUtils.putBoolean(jSONObject, "isBidding", maxNetworkResponseInfo.isBidding());
        com.applovin.mediation.MaxError error = maxNetworkResponseInfo.getError();
        if (error != null) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject3, "errorMessage", error.getMessage());
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject3, "adLoadFailureInfo", error.getAdLoadFailureInfo());
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject3, com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.toString(error.getCode()));
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject3, "latencyMillis", java.lang.String.valueOf(error.getRequestLatencyMillis()));
            com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject, "error", jSONObject3);
        }
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "latencyMillis", java.lang.String.valueOf(maxNetworkResponseInfo.getLatencyMillis()));
        return jSONObject;
    }

    public java.lang.String getAdValue(java.lang.String str, java.lang.String str2) {
        com.applovin.mediation.MaxAd ad;
        return (android.text.TextUtils.isEmpty(str) || (ad = getAd(str)) == null) ? "" : ad.getAdValue(str2);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(final com.applovin.mediation.MaxAd maxAd) {
        threadPoolExecutor.execute(new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m702x63f132af(maxAd);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onAdLoaded$7$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m702x63f132af(com.applovin.mediation.MaxAd maxAd) {
        java.lang.String str;
        com.applovin.mediation.MaxAdFormat format = maxAd.getFormat();
        if (format.isAdViewAd()) {
            str = com.applovin.mediation.MaxAdFormat.MREC == format ? "OnMRecAdLoadedEvent" : "OnBannerAdLoadedEvent";
            positionAdView(maxAd);
            com.applovin.mediation.ads.MaxAdView maxAdViewRetrieveAdView = retrieveAdView(maxAd.getAdUnitId(), format);
            if (maxAdViewRetrieveAdView != null && maxAdViewRetrieveAdView.getVisibility() != 0) {
                maxAdViewRetrieveAdView.stopAutoRefresh();
            }
        } else if (com.applovin.mediation.MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialLoadedEvent";
        } else if (com.applovin.mediation.MaxAdFormat.APP_OPEN == format) {
            str = "OnAppOpenAdLoadedEvent";
        } else if (com.applovin.mediation.MaxAdFormat.REWARDED == format) {
            str = "OnRewardedAdLoadedEvent";
        } else {
            if (com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL != format) {
                logInvalidAdFormat(format);
                return;
            }
            str = "OnRewardedInterstitialAdLoadedEvent";
        }
        synchronized (this.adInfoMapLock) {
            this.adInfoMap.put(maxAd.getAdUnitId(), maxAd);
        }
        forwardUnityEvent(getDefaultAdEventParameters(str, maxAd));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(final java.lang.String str, final com.applovin.mediation.MaxError maxError) {
        threadPoolExecutor.execute(new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m701x30b6f710(str, maxError);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onAdLoadFailed$8$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m701x30b6f710(java.lang.String str, com.applovin.mediation.MaxError maxError) {
        java.lang.String str2;
        if (android.text.TextUtils.isEmpty(str)) {
            logStackTrace(new java.lang.IllegalArgumentException("adUnitId cannot be null"));
            return;
        }
        if (this.adViews.containsKey(str)) {
            str2 = com.applovin.mediation.MaxAdFormat.MREC == this.adViewFormats.get(str) ? "OnMRecAdLoadFailedEvent" : "OnBannerAdLoadFailedEvent";
        } else if (this.interstitials.containsKey(str)) {
            str2 = "OnInterstitialLoadFailedEvent";
        } else if (this.appOpenAds.containsKey(str)) {
            str2 = "OnAppOpenAdLoadFailedEvent";
        } else if (this.rewardedAds.containsKey(str)) {
            str2 = "OnRewardedAdLoadFailedEvent";
        } else {
            if (!this.rewardedInterstitialAds.containsKey(str)) {
                logStackTrace(new java.lang.IllegalStateException("invalid adUnitId: " + str));
                return;
            }
            str2 = "OnRewardedInterstitialAdLoadFailedEvent";
        }
        synchronized (this.adInfoMapLock) {
            this.adInfoMap.remove(str);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "name", str2);
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "adUnitId", str);
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.toString(maxError.getCode()));
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "errorMessage", maxError.getMessage());
        com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject, "waterfallInfo", createAdWaterfallInfo(maxError.getWaterfall()));
        java.lang.String adLoadFailureInfo = maxError.getAdLoadFailureInfo();
        if (android.text.TextUtils.isEmpty(adLoadFailureInfo)) {
            adLoadFailureInfo = "";
        }
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "adLoadFailureInfo", adLoadFailureInfo);
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "latencyMillis", java.lang.String.valueOf(maxError.getRequestLatencyMillis()));
        forwardUnityEvent(jSONObject);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(final com.applovin.mediation.MaxAd maxAd) {
        threadPoolExecutor.execute(new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m695xc18452e9(maxAd);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onAdClicked$9$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m695xc18452e9(com.applovin.mediation.MaxAd maxAd) {
        java.lang.String str;
        com.applovin.mediation.MaxAdFormat format = maxAd.getFormat();
        if (com.applovin.mediation.MaxAdFormat.BANNER == format || com.applovin.mediation.MaxAdFormat.LEADER == format) {
            str = "OnBannerAdClickedEvent";
        } else if (com.applovin.mediation.MaxAdFormat.MREC == format) {
            str = "OnMRecAdClickedEvent";
        } else if (com.applovin.mediation.MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialClickedEvent";
        } else if (com.applovin.mediation.MaxAdFormat.APP_OPEN == format) {
            str = "OnAppOpenAdClickedEvent";
        } else if (com.applovin.mediation.MaxAdFormat.REWARDED == format) {
            str = "OnRewardedAdClickedEvent";
        } else {
            if (com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL != format) {
                logInvalidAdFormat(format);
                return;
            }
            str = "OnRewardedInterstitialAdClickedEvent";
        }
        forwardUnityEvent(getDefaultAdEventParameters(str, maxAd));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(final com.applovin.mediation.MaxAd maxAd) {
        threadPoolExecutor.execute(new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m698x43652f85(maxAd);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onAdDisplayed$10$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m698x43652f85(com.applovin.mediation.MaxAd maxAd) {
        java.lang.String str;
        com.applovin.mediation.MaxAdFormat format = maxAd.getFormat();
        if (format.isFullscreenAd()) {
            if (com.applovin.mediation.MaxAdFormat.INTERSTITIAL == format) {
                str = "OnInterstitialDisplayedEvent";
            } else if (com.applovin.mediation.MaxAdFormat.APP_OPEN == format) {
                str = "OnAppOpenAdDisplayedEvent";
            } else {
                str = com.applovin.mediation.MaxAdFormat.REWARDED == format ? "OnRewardedAdDisplayedEvent" : "OnRewardedInterstitialAdDisplayedEvent";
            }
            forwardUnityEvent(getDefaultAdEventParameters(str, maxAd));
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(final com.applovin.mediation.MaxAd maxAd, final com.applovin.mediation.MaxError maxError) {
        threadPoolExecutor.execute(new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m697xf4285022(maxAd, maxError);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onAdDisplayFailed$11$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m697xf4285022(com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxError maxError) {
        java.lang.String str;
        com.applovin.mediation.MaxAdFormat format = maxAd.getFormat();
        if (format.isFullscreenAd()) {
            if (com.applovin.mediation.MaxAdFormat.INTERSTITIAL == format) {
                str = "OnInterstitialAdFailedToDisplayEvent";
            } else if (com.applovin.mediation.MaxAdFormat.APP_OPEN == format) {
                str = "OnAppOpenAdFailedToDisplayEvent";
            } else {
                str = com.applovin.mediation.MaxAdFormat.REWARDED == format ? "OnRewardedAdFailedToDisplayEvent" : "OnRewardedInterstitialAdFailedToDisplayEvent";
            }
            org.json.JSONObject defaultAdEventParameters = getDefaultAdEventParameters(str, maxAd);
            com.applovin.impl.sdk.utils.JsonUtils.putString(defaultAdEventParameters, com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.toString(maxError.getCode()));
            com.applovin.impl.sdk.utils.JsonUtils.putString(defaultAdEventParameters, "errorMessage", maxError.getMessage());
            com.applovin.impl.sdk.utils.JsonUtils.putString(defaultAdEventParameters, "mediatedNetworkErrorCode", java.lang.Integer.toString(maxError.getMediatedNetworkErrorCode()));
            com.applovin.impl.sdk.utils.JsonUtils.putString(defaultAdEventParameters, "mediatedNetworkErrorMessage", maxError.getMediatedNetworkErrorMessage());
            com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(defaultAdEventParameters, "waterfallInfo", createAdWaterfallInfo(maxError.getWaterfall()));
            com.applovin.impl.sdk.utils.JsonUtils.putString(defaultAdEventParameters, "latencyMillis", java.lang.String.valueOf(maxError.getRequestLatencyMillis()));
            forwardUnityEvent(defaultAdEventParameters);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(final com.applovin.mediation.MaxAd maxAd) {
        threadPoolExecutor.execute(new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m700x9e2174aa(maxAd);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onAdHidden$12$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m700x9e2174aa(com.applovin.mediation.MaxAd maxAd) {
        java.lang.String str;
        com.applovin.mediation.MaxAdFormat format = maxAd.getFormat();
        if (format.isFullscreenAd()) {
            if (com.applovin.mediation.MaxAdFormat.INTERSTITIAL == format) {
                str = "OnInterstitialHiddenEvent";
            } else if (com.applovin.mediation.MaxAdFormat.APP_OPEN == format) {
                str = "OnAppOpenAdHiddenEvent";
            } else {
                str = com.applovin.mediation.MaxAdFormat.REWARDED == format ? "OnRewardedAdHiddenEvent" : "OnRewardedInterstitialAdHiddenEvent";
            }
            forwardUnityEvent(getDefaultAdEventParameters(str, maxAd));
        }
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(final com.applovin.mediation.MaxAd maxAd) {
        threadPoolExecutor.execute(new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m696x9354e118(maxAd);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onAdCollapsed$13$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m696x9354e118(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.mediation.MaxAdFormat format = maxAd.getFormat();
        if (!format.isAdViewAd()) {
            logInvalidAdFormat(format);
        } else {
            forwardUnityEvent(getDefaultAdEventParameters(com.applovin.mediation.MaxAdFormat.MREC == format ? "OnMRecAdCollapsedEvent" : "OnBannerAdCollapsedEvent", maxAd));
        }
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(final com.applovin.mediation.MaxAd maxAd) {
        threadPoolExecutor.execute(new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda28
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m699xfe24b1f7(maxAd);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onAdExpanded$14$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m699xfe24b1f7(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.mediation.MaxAdFormat format = maxAd.getFormat();
        if (!format.isAdViewAd()) {
            logInvalidAdFormat(format);
        } else {
            forwardUnityEvent(getDefaultAdEventParameters(com.applovin.mediation.MaxAdFormat.MREC == format ? "OnMRecAdExpandedEvent" : "OnBannerAdExpandedEvent", maxAd));
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(final com.applovin.mediation.MaxAd maxAd, final com.applovin.mediation.MaxReward maxReward) {
        threadPoolExecutor.execute(new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m705xd790293(maxAd, maxReward);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onUserRewarded$15$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m705xd790293(com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxReward maxReward) {
        com.applovin.mediation.MaxAdFormat format = maxAd.getFormat();
        if (format != com.applovin.mediation.MaxAdFormat.REWARDED && format != com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL) {
            logInvalidAdFormat(format);
            return;
        }
        java.lang.String label = maxReward.getLabel();
        java.lang.String string = java.lang.Integer.toString(maxReward.getAmount());
        org.json.JSONObject defaultAdEventParameters = getDefaultAdEventParameters(format == com.applovin.mediation.MaxAdFormat.REWARDED ? "OnRewardedAdReceivedRewardEvent" : "OnRewardedInterstitialAdReceivedRewardEvent", maxAd);
        com.applovin.impl.sdk.utils.JsonUtils.putString(defaultAdEventParameters, "rewardLabel", label);
        com.applovin.impl.sdk.utils.JsonUtils.putString(defaultAdEventParameters, com.json.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT, string);
        forwardUnityEvent(defaultAdEventParameters);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(final com.applovin.mediation.MaxAd maxAd) {
        threadPoolExecutor.execute(new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m703x84bedee6(maxAd);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onAdRevenuePaid$16$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m703x84bedee6(com.applovin.mediation.MaxAd maxAd) {
        java.lang.String str;
        com.applovin.mediation.MaxAdFormat format = maxAd.getFormat();
        if (com.applovin.mediation.MaxAdFormat.BANNER == format || com.applovin.mediation.MaxAdFormat.LEADER == format) {
            str = "OnBannerAdRevenuePaidEvent";
        } else if (com.applovin.mediation.MaxAdFormat.MREC == format) {
            str = "OnMRecAdRevenuePaidEvent";
        } else if (com.applovin.mediation.MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialAdRevenuePaidEvent";
        } else if (com.applovin.mediation.MaxAdFormat.APP_OPEN == format) {
            str = "OnAppOpenAdRevenuePaidEvent";
        } else if (com.applovin.mediation.MaxAdFormat.REWARDED == format) {
            str = "OnRewardedAdRevenuePaidEvent";
        } else {
            if (com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL != format) {
                logInvalidAdFormat(format);
                return;
            }
            str = "OnRewardedInterstitialAdRevenuePaidEvent";
        }
        org.json.JSONObject defaultAdEventParameters = getDefaultAdEventParameters(str, maxAd);
        com.applovin.impl.sdk.utils.JsonUtils.putBoolean(defaultAdEventParameters, "keepInBackground", format.isFullscreenAd());
        forwardUnityEvent(defaultAdEventParameters);
    }

    @Override // com.applovin.mediation.MaxAdReviewListener
    public void onCreativeIdGenerated(final java.lang.String str, final com.applovin.mediation.MaxAd maxAd) {
        threadPoolExecutor.execute(new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m704x4537e065(maxAd, str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onCreativeIdGenerated$17$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m704x4537e065(com.applovin.mediation.MaxAd maxAd, java.lang.String str) {
        java.lang.String str2;
        com.applovin.mediation.MaxAdFormat format = maxAd.getFormat();
        if (com.applovin.mediation.MaxAdFormat.BANNER == format || com.applovin.mediation.MaxAdFormat.LEADER == format) {
            str2 = "OnBannerAdReviewCreativeIdGeneratedEvent";
        } else if (com.applovin.mediation.MaxAdFormat.MREC == format) {
            str2 = "OnMRecAdReviewCreativeIdGeneratedEvent";
        } else if (com.applovin.mediation.MaxAdFormat.INTERSTITIAL == format) {
            str2 = "OnInterstitialAdReviewCreativeIdGeneratedEvent";
        } else if (com.applovin.mediation.MaxAdFormat.REWARDED == format) {
            str2 = "OnRewardedAdReviewCreativeIdGeneratedEvent";
        } else {
            if (com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL != format) {
                logInvalidAdFormat(format);
                return;
            }
            str2 = "OnRewardedInterstitialAdReviewCreativeIdGeneratedEvent";
        }
        org.json.JSONObject defaultAdEventParameters = getDefaultAdEventParameters(str2, maxAd);
        com.applovin.impl.sdk.utils.JsonUtils.putString(defaultAdEventParameters, "adReviewCreativeId", str);
        com.applovin.impl.sdk.utils.JsonUtils.putBoolean(defaultAdEventParameters, "keepInBackground", format.isFullscreenAd());
        forwardUnityEvent(defaultAdEventParameters);
    }

    private org.json.JSONObject getDefaultAdEventParameters(java.lang.String str, com.applovin.mediation.MaxAd maxAd) {
        org.json.JSONObject adInfo = getAdInfo(maxAd);
        com.applovin.impl.sdk.utils.JsonUtils.putString(adInfo, "name", str);
        return adInfo;
    }

    private void createAdView(final java.lang.String str, final com.applovin.mediation.MaxAdFormat maxAdFormat, final java.lang.String str2, final android.graphics.Point point) {
        com.applovin.mediation.unity.Utils.runSafelyOnUiThread(getCurrentActivity(), new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m686x2e12dd7c(maxAdFormat, str, str2, point);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$createAdView$18$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m686x2e12dd7c(com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.String str, java.lang.String str2, android.graphics.Point point) {
        java.util.Map<java.lang.String, java.lang.Object> map;
        d("Creating " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\" and position: \"" + str2 + "\"");
        if (this.adViews.get(str) != null) {
            w("Trying to create a " + maxAdFormat.getLabel() + " that was already created. This will cause the current ad to be hidden.");
        }
        com.applovin.mediation.ads.MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat, str2, point);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        this.safeAreaBackground.setVisibility(8);
        maxAdViewRetrieveAdView.setVisibility(8);
        if (maxAdViewRetrieveAdView.getParent() == null) {
            android.app.Activity currentActivity2 = getCurrentActivity();
            android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(currentActivity2);
            currentActivity2.addContentView(relativeLayout, new android.widget.LinearLayout.LayoutParams(-1, -1));
            relativeLayout.addView(maxAdViewRetrieveAdView);
            this.adViewFormats.put(str, maxAdFormat);
            positionAdView(str, maxAdFormat);
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = this.adViewExtraParametersToSetAfterCreate.get(str);
        if (maxAdFormat.isBannerOrLeaderAd() && (map2 == null || !map2.containsKey("adaptive_banner"))) {
            maxAdViewRetrieveAdView.setExtraParameter("adaptive_banner", com.json.mediationsdk.metadata.a.g);
        }
        if (map2 != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map2.entrySet()) {
                maxAdViewRetrieveAdView.setExtraParameter(entry.getKey(), entry.getValue());
                maybeHandleExtraParameterChanges(str, maxAdFormat, entry.getKey(), entry.getValue());
            }
            this.adViewExtraParametersToSetAfterCreate.remove(str);
        }
        if (this.adViewLocalExtraParametersToSetAfterCreate.containsKey(str) && (map = this.adViewLocalExtraParametersToSetAfterCreate.get(str)) != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry2 : map.entrySet()) {
                maxAdViewRetrieveAdView.setLocalExtraParameter(entry2.getKey(), entry2.getValue());
            }
            this.adViewLocalExtraParametersToSetAfterCreate.remove(str);
        }
        if (this.AdViewCustomDataToSetAfterCreate.containsKey(str)) {
            maxAdViewRetrieveAdView.setCustomData(this.AdViewCustomDataToSetAfterCreate.get(str));
            this.AdViewCustomDataToSetAfterCreate.remove(str);
        }
        maxAdViewRetrieveAdView.loadAd();
        if (this.disabledAutoRefreshAdViewAdUnitIds.contains(str)) {
            maxAdViewRetrieveAdView.stopAutoRefresh();
        }
        if (this.AdUnitsToShowAfterCreate.contains(str)) {
            showAdView(str, maxAdFormat);
            this.AdUnitsToShowAfterCreate.remove(str);
        }
    }

    private void loadAdView(final java.lang.String str, final com.applovin.mediation.MaxAdFormat maxAdFormat) {
        com.applovin.mediation.unity.Utils.runSafelyOnUiThread(getCurrentActivity(), new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m691xac5fd885(str, maxAdFormat);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$loadAdView$19$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m691xac5fd885(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat) {
        com.applovin.mediation.ads.MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        if (!this.disabledAutoRefreshAdViewAdUnitIds.contains(str)) {
            if (maxAdViewRetrieveAdView.getVisibility() != 0) {
                e("Auto-refresh will resume when the " + maxAdFormat.getLabel() + " ad is shown. You should only call LoadBanner() or LoadMRec() if you explicitly pause auto-refresh and want to manually load an ad.");
                return;
            } else {
                e("You must stop auto-refresh if you want to manually load " + maxAdFormat.getLabel() + " ads.");
                return;
            }
        }
        maxAdViewRetrieveAdView.loadAd();
    }

    private void setAdViewPlacement(final java.lang.String str, final com.applovin.mediation.MaxAdFormat maxAdFormat, final java.lang.String str2) {
        com.applovin.mediation.unity.Utils.runSafelyOnUiThread(getCurrentActivity(), new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m711xde70f31c(str2, maxAdFormat, str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setAdViewPlacement$20$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m711xde70f31c(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.String str2) {
        d("Setting placement \"" + str + "\" for " + maxAdFormat.getLabel() + " with ad unit id \"" + str2 + "\"");
        com.applovin.mediation.ads.MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str2, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
        } else {
            maxAdViewRetrieveAdView.setPlacement(str);
        }
    }

    private void startAdViewAutoRefresh(final java.lang.String str, final com.applovin.mediation.MaxAdFormat maxAdFormat) {
        com.applovin.mediation.unity.Utils.runSafelyOnUiThread(getCurrentActivity(), new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m714x79413882(maxAdFormat, str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$startAdViewAutoRefresh$21$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m714x79413882(com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.String str) {
        d("Starting " + maxAdFormat.getLabel() + " auto refresh for ad unit identifier \"" + str + "\"");
        this.disabledAutoRefreshAdViewAdUnitIds.remove(str);
        com.applovin.mediation.ads.MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist for ad unit identifier \"" + str + "\"");
        } else {
            maxAdViewRetrieveAdView.startAutoRefresh();
        }
    }

    private void stopAdViewAutoRefresh(final java.lang.String str, final com.applovin.mediation.MaxAdFormat maxAdFormat) {
        com.applovin.mediation.unity.Utils.runSafelyOnUiThread(getCurrentActivity(), new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m715xbeb996a7(maxAdFormat, str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$stopAdViewAutoRefresh$22$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m715xbeb996a7(com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.String str) {
        d("Stopping " + maxAdFormat.getLabel() + " auto refresh for ad unit identifier \"" + str + "\"");
        this.disabledAutoRefreshAdViewAdUnitIds.add(str);
        com.applovin.mediation.ads.MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist for ad unit identifier \"" + str + "\"");
        } else {
            maxAdViewRetrieveAdView.stopAutoRefresh();
        }
    }

    private void setAdViewWidth(final java.lang.String str, final int i, final com.applovin.mediation.MaxAdFormat maxAdFormat) {
        com.applovin.mediation.unity.Utils.runSafelyOnUiThread(getCurrentActivity(), new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m712x907d8ada(i, maxAdFormat, str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setAdViewWidth$23$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m712x907d8ada(int i, com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.String str) {
        d("Setting width " + i + " for \"" + maxAdFormat + "\" with ad unit identifier \"" + str + "\"");
        int width = (maxAdFormat.isBannerOrLeaderAd() ? com.applovin.mediation.MaxAdFormat.BANNER.getSize() : maxAdFormat.getSize()).getWidth();
        if (i < width) {
            e("The provided width: " + i + "dp is smaller than the minimum required width: " + width + "dp for ad format: " + maxAdFormat + ". Automatically setting width to " + width + ".");
        }
        this.adViewWidths.put(str, java.lang.Integer.valueOf(java.lang.Math.max(width, i)));
        positionAdView(str, maxAdFormat);
    }

    private void updateAdViewPosition(final java.lang.String str, final java.lang.String str2, final android.graphics.Point point, final com.applovin.mediation.MaxAdFormat maxAdFormat) {
        com.applovin.mediation.unity.Utils.runSafelyOnUiThread(getCurrentActivity(), new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda32
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m716x888a47d7(maxAdFormat, str2, str, point);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$updateAdViewPosition$24$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m716x888a47d7(com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.String str, java.lang.String str2, android.graphics.Point point) {
        d("Updating " + maxAdFormat.getLabel() + " position to \"" + str + "\" for ad unit id \"" + str2 + "\"");
        if (retrieveAdView(str2, maxAdFormat) == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        this.adViewPositions.put(str2, str);
        this.adViewOffsets.put(str2, point);
        positionAdView(str2, maxAdFormat);
    }

    private void showAdView(final java.lang.String str, final com.applovin.mediation.MaxAdFormat maxAdFormat) {
        com.applovin.mediation.unity.Utils.runSafelyOnUiThread(getCurrentActivity(), new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m713xf8d4d021(maxAdFormat, str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showAdView$25$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m713xf8d4d021(com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.String str) {
        d("Showing " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        com.applovin.mediation.ads.MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist for ad unit id \"" + str + "\"");
            this.AdUnitsToShowAfterCreate.add(str);
            return;
        }
        this.safeAreaBackground.setVisibility(0);
        maxAdViewRetrieveAdView.setVisibility(0);
        if (this.disabledAutoRefreshAdViewAdUnitIds.contains(str)) {
            return;
        }
        maxAdViewRetrieveAdView.startAutoRefresh();
    }

    private void hideAdView(final java.lang.String str, final com.applovin.mediation.MaxAdFormat maxAdFormat) {
        com.applovin.mediation.unity.Utils.runSafelyOnUiThread(getCurrentActivity(), new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m688x4e92e145(maxAdFormat, str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$hideAdView$26$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m688x4e92e145(com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.String str) {
        d("Hiding " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        this.AdUnitsToShowAfterCreate.remove(str);
        com.applovin.mediation.ads.MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        this.safeAreaBackground.setVisibility(8);
        maxAdViewRetrieveAdView.setVisibility(8);
        maxAdViewRetrieveAdView.stopAutoRefresh();
    }

    private java.lang.String getAdViewLayout(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat) {
        d("Getting " + maxAdFormat.getLabel() + " absolute position with ad unit id \"" + str + "\"");
        com.applovin.mediation.ads.MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return "";
        }
        int[] iArr = new int[2];
        maxAdViewRetrieveAdView.getLocationOnScreen(iArr);
        int iPxToDp = com.applovin.sdk.AppLovinSdkUtils.pxToDp(getCurrentActivity(), iArr[0]);
        int iPxToDp2 = com.applovin.sdk.AppLovinSdkUtils.pxToDp(getCurrentActivity(), iArr[1]);
        int iPxToDp3 = com.applovin.sdk.AppLovinSdkUtils.pxToDp(getCurrentActivity(), maxAdViewRetrieveAdView.getWidth());
        int iPxToDp4 = com.applovin.sdk.AppLovinSdkUtils.pxToDp(getCurrentActivity(), maxAdViewRetrieveAdView.getHeight());
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "origin_x", java.lang.String.valueOf(iPxToDp));
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "origin_y", java.lang.String.valueOf(iPxToDp2));
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "width", java.lang.String.valueOf(iPxToDp3));
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "height", java.lang.String.valueOf(iPxToDp4));
        return jSONObject.toString();
    }

    private void destroyAdView(final java.lang.String str, final com.applovin.mediation.MaxAdFormat maxAdFormat) {
        com.applovin.mediation.unity.Utils.runSafelyOnUiThread(getCurrentActivity(), new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m687xb1e20142(maxAdFormat, str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$destroyAdView$27$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m687xb1e20142(com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.String str) {
        d("Destroying " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        com.applovin.mediation.ads.MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        android.view.ViewParent parent = maxAdViewRetrieveAdView.getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(maxAdViewRetrieveAdView);
        }
        maxAdViewRetrieveAdView.setListener(null);
        maxAdViewRetrieveAdView.setRevenueListener(null);
        maxAdViewRetrieveAdView.setAdReviewListener(null);
        maxAdViewRetrieveAdView.destroy();
        this.adViews.remove(str);
        this.adViewFormats.remove(str);
        this.adViewPositions.remove(str);
        this.adViewOffsets.remove(str);
        this.adViewWidths.remove(str);
        this.disabledAdaptiveBannerAdUnitIds.remove(str);
    }

    private void setAdViewBackgroundColor(final java.lang.String str, final com.applovin.mediation.MaxAdFormat maxAdFormat, final java.lang.String str2) {
        com.applovin.mediation.unity.Utils.runSafelyOnUiThread(getCurrentActivity(), new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m707x65eb07c4(maxAdFormat, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setAdViewBackgroundColor$28$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m707x65eb07c4(com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.String str, java.lang.String str2) {
        d("Setting " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\" to color: " + str2);
        com.applovin.mediation.ads.MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        int color = android.graphics.Color.parseColor(str2);
        this.publisherBannerBackgroundColor = java.lang.Integer.valueOf(color);
        this.safeAreaBackground.setBackgroundColor(color);
        maxAdViewRetrieveAdView.setBackgroundColor(color);
    }

    private void setAdViewExtraParameter(final java.lang.String str, final com.applovin.mediation.MaxAdFormat maxAdFormat, final java.lang.String str2, final java.lang.String str3) {
        com.applovin.mediation.unity.Utils.runSafelyOnUiThread(getCurrentActivity(), new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m709x68c53d81(maxAdFormat, str2, str3, str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setAdViewExtraParameter$29$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m709x68c53d81(com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        d("Setting " + maxAdFormat.getLabel() + " extra with key: \"" + str + "\" value: " + str2);
        com.applovin.mediation.ads.MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str3, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.setExtraParameter(str, str2);
        } else {
            d(maxAdFormat.getLabel() + " does not exist for ad unit ID \"" + str3 + "\". Saving extra parameter to be set when it is created.");
            java.util.Map<java.lang.String, java.lang.String> map = this.adViewExtraParametersToSetAfterCreate.get(str3);
            if (map == null) {
                map = new java.util.HashMap<>(1);
                this.adViewExtraParametersToSetAfterCreate.put(str3, map);
            }
            map.put(str, str2);
        }
        maybeHandleExtraParameterChanges(str3, maxAdFormat, str, str2);
    }

    private void setAdViewLocalExtraParameter(final java.lang.String str, final com.applovin.mediation.MaxAdFormat maxAdFormat, final java.lang.String str2, final java.lang.Object obj) {
        com.applovin.mediation.unity.Utils.runSafelyOnUiThread(getCurrentActivity(), new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m710x6e15767c(maxAdFormat, str2, obj, str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setAdViewLocalExtraParameter$30$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m710x6e15767c(com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.String str, java.lang.Object obj, java.lang.String str2) {
        d("Setting " + maxAdFormat.getLabel() + " local extra with key: \"" + str + "\" value: " + obj);
        com.applovin.mediation.ads.MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str2, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.setLocalExtraParameter(str, obj);
            return;
        }
        d(maxAdFormat.getLabel() + " does not exist for ad unit ID \"" + str2 + "\". Saving local extra parameter to be set when it is created.");
        java.util.Map<java.lang.String, java.lang.Object> map = this.adViewLocalExtraParametersToSetAfterCreate.get(str2);
        if (map == null) {
            map = new java.util.HashMap<>(1);
            this.adViewLocalExtraParametersToSetAfterCreate.put(str2, map);
        }
        map.put(str, obj);
    }

    private void maybeHandleExtraParameterChanges(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.String str2, java.lang.String str3) {
        if (com.applovin.mediation.MaxAdFormat.MREC != maxAdFormat) {
            if ("force_banner".equalsIgnoreCase(str2)) {
                com.applovin.mediation.MaxAdFormat deviceSpecificAdViewAdFormat = java.lang.Boolean.parseBoolean(str3) ? com.applovin.mediation.MaxAdFormat.BANNER : getDeviceSpecificAdViewAdFormat();
                this.adViewFormats.put(str, deviceSpecificAdViewAdFormat);
                positionAdView(str, deviceSpecificAdViewAdFormat);
            } else if ("adaptive_banner".equalsIgnoreCase(str2)) {
                if (java.lang.Boolean.parseBoolean(str3)) {
                    this.disabledAdaptiveBannerAdUnitIds.remove(str);
                } else {
                    this.disabledAdaptiveBannerAdUnitIds.add(str);
                }
                positionAdView(str, maxAdFormat);
            }
        }
    }

    private void setAdViewCustomData(final java.lang.String str, final com.applovin.mediation.MaxAdFormat maxAdFormat, final java.lang.String str2) {
        com.applovin.mediation.unity.Utils.runSafelyOnUiThread(getCurrentActivity(), new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m708x53e22fcc(str, maxAdFormat, str2);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setAdViewCustomData$31$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m708x53e22fcc(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.String str2) {
        com.applovin.mediation.ads.MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.setCustomData(str2);
        } else {
            d(maxAdFormat.getLabel() + " does not exist for ad unit ID \"" + str + "\". Saving custom data to be set when it is created.");
            this.AdViewCustomDataToSetAfterCreate.put(str, str2);
        }
    }

    private void logInvalidAdFormat(com.applovin.mediation.MaxAdFormat maxAdFormat) {
        logStackTrace(new java.lang.IllegalStateException("invalid ad format: " + maxAdFormat));
    }

    private void logStackTrace(java.lang.Exception exc) {
        e(android.util.Log.getStackTraceString(exc));
    }

    private static void d(java.lang.String str) {
        if (com.applovin.mediation.unity.MaxUnityPlugin.isDisableAllLogs()) {
            return;
        }
        android.util.Log.d(SDK_TAG, "[MaxUnityAdManager] " + str);
    }

    private static void w(java.lang.String str) {
        if (com.applovin.mediation.unity.MaxUnityPlugin.isDisableAllLogs()) {
            return;
        }
        android.util.Log.w(SDK_TAG, "[MaxUnityAdManager] " + str);
    }

    private static void e(java.lang.String str) {
        if (com.applovin.mediation.unity.MaxUnityPlugin.isDisableAllLogs()) {
            return;
        }
        android.util.Log.e(SDK_TAG, "[MaxUnityAdManager] " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(java.lang.String str, java.lang.Throwable th) {
        if (com.applovin.mediation.unity.MaxUnityPlugin.isDisableAllLogs()) {
            return;
        }
        android.util.Log.e(SDK_TAG, "[MaxUnityAdManager] " + str, th);
    }

    private com.applovin.mediation.ads.MaxInterstitialAd retrieveInterstitial(java.lang.String str) {
        com.applovin.mediation.ads.MaxInterstitialAd maxInterstitialAd = this.interstitials.get(str);
        if (maxInterstitialAd != null) {
            return maxInterstitialAd;
        }
        com.applovin.mediation.ads.MaxInterstitialAd maxInterstitialAd2 = new com.applovin.mediation.ads.MaxInterstitialAd(str, this.sdk, getCurrentActivity());
        maxInterstitialAd2.setListener(this);
        maxInterstitialAd2.setRevenueListener(this);
        maxInterstitialAd2.setAdReviewListener(this);
        this.interstitials.put(str, maxInterstitialAd2);
        return maxInterstitialAd2;
    }

    private com.applovin.mediation.ads.MaxAppOpenAd retrieveAppOpenAd(java.lang.String str) {
        com.applovin.mediation.ads.MaxAppOpenAd maxAppOpenAd = this.appOpenAds.get(str);
        if (maxAppOpenAd != null) {
            return maxAppOpenAd;
        }
        com.applovin.mediation.ads.MaxAppOpenAd maxAppOpenAd2 = new com.applovin.mediation.ads.MaxAppOpenAd(str, this.sdk);
        maxAppOpenAd2.setListener(this);
        maxAppOpenAd2.setRevenueListener(this);
        this.appOpenAds.put(str, maxAppOpenAd2);
        return maxAppOpenAd2;
    }

    private com.applovin.mediation.ads.MaxRewardedAd retrieveRewardedAd(java.lang.String str) {
        com.applovin.mediation.ads.MaxRewardedAd maxRewardedAd = this.rewardedAds.get(str);
        if (maxRewardedAd != null) {
            return maxRewardedAd;
        }
        com.applovin.mediation.ads.MaxRewardedAd maxRewardedAd2 = com.applovin.mediation.ads.MaxRewardedAd.getInstance(str, this.sdk, getCurrentActivity());
        maxRewardedAd2.setListener(this);
        maxRewardedAd2.setRevenueListener(this);
        maxRewardedAd2.setAdReviewListener(this);
        this.rewardedAds.put(str, maxRewardedAd2);
        return maxRewardedAd2;
    }

    private com.applovin.mediation.ads.MaxRewardedInterstitialAd retrieveRewardedInterstitialAd(java.lang.String str) {
        com.applovin.mediation.ads.MaxRewardedInterstitialAd maxRewardedInterstitialAd = this.rewardedInterstitialAds.get(str);
        if (maxRewardedInterstitialAd != null) {
            return maxRewardedInterstitialAd;
        }
        com.applovin.mediation.ads.MaxRewardedInterstitialAd maxRewardedInterstitialAd2 = new com.applovin.mediation.ads.MaxRewardedInterstitialAd(str, this.sdk, getCurrentActivity());
        maxRewardedInterstitialAd2.setListener(this);
        maxRewardedInterstitialAd2.setRevenueListener(this);
        maxRewardedInterstitialAd2.setAdReviewListener(this);
        this.rewardedInterstitialAds.put(str, maxRewardedInterstitialAd2);
        return maxRewardedInterstitialAd2;
    }

    private com.applovin.mediation.ads.MaxAdView retrieveAdView(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat) {
        return retrieveAdView(str, maxAdFormat, null, null);
    }

    private com.applovin.mediation.ads.MaxAdView retrieveAdView(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.String str2, android.graphics.Point point) {
        com.applovin.mediation.ads.MaxAdView maxAdView = this.adViews.get(str);
        if (maxAdView != null || str2 == null || point == null) {
            return maxAdView;
        }
        com.applovin.mediation.ads.MaxAdView maxAdView2 = new com.applovin.mediation.ads.MaxAdView(str, maxAdFormat, this.sdk, getCurrentActivity());
        maxAdView2.setListener(this);
        maxAdView2.setRevenueListener(this);
        maxAdView2.setAdReviewListener(this);
        this.adViews.put(str, maxAdView2);
        this.adViewPositions.put(str, str2);
        this.adViewOffsets.put(str, point);
        maxAdView2.setExtraParameter("allow_pause_auto_refresh_immediately", com.json.mediationsdk.metadata.a.g);
        return maxAdView2;
    }

    private void positionAdView(com.applovin.mediation.MaxAd maxAd) {
        positionAdView(maxAd.getAdUnitId(), maxAd.getFormat());
    }

    private void positionAdView(final java.lang.String str, final com.applovin.mediation.MaxAdFormat maxAdFormat) {
        getCurrentActivity().runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m706x19b8a831(str, maxAdFormat);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$positionAdView$32$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m706x19b8a831(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat) {
        int iPxToDp;
        int height;
        int i;
        java.lang.String str2;
        int i2;
        com.applovin.mediation.ads.MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) maxAdViewRetrieveAdView.getParent();
        if (relativeLayout == null) {
            e(maxAdFormat.getLabel() + "'s parent does not exist");
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        relativeLayout.getWindowVisibleDisplayFrame(rect);
        java.lang.String str3 = this.adViewPositions.get(str);
        android.graphics.Point point = this.adViewOffsets.get(str);
        com.applovin.mediation.unity.MaxUnityAdManager.Insets safeInsets = getSafeInsets();
        boolean zContains = this.disabledAdaptiveBannerAdUnitIds.contains(str);
        boolean zContainsKey = this.adViewWidths.containsKey(str);
        if (zContainsKey) {
            iPxToDp = this.adViewWidths.get(str).intValue();
        } else if ("top_center".equalsIgnoreCase(str3) || "bottom_center".equalsIgnoreCase(str3)) {
            iPxToDp = com.applovin.sdk.AppLovinSdkUtils.pxToDp(getCurrentActivity(), rect.width());
        } else {
            iPxToDp = maxAdFormat.getSize().getWidth();
        }
        if ((maxAdFormat == com.applovin.mediation.MaxAdFormat.BANNER || maxAdFormat == com.applovin.mediation.MaxAdFormat.LEADER) && !zContains) {
            height = maxAdFormat.getAdaptiveSize(iPxToDp, getCurrentActivity()).getHeight();
        } else {
            height = maxAdFormat.getSize().getHeight();
        }
        int iDpToPx = com.applovin.sdk.AppLovinSdkUtils.dpToPx(getCurrentActivity(), iPxToDp);
        int iDpToPx2 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(getCurrentActivity(), height);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) maxAdViewRetrieveAdView.getLayoutParams();
        layoutParams.height = iDpToPx2;
        maxAdViewRetrieveAdView.setLayoutParams(layoutParams);
        maxAdViewRetrieveAdView.setRotation(0.0f);
        maxAdViewRetrieveAdView.setTranslationX(0.0f);
        layoutParams.setMargins(0, 0, 0, 0);
        int i3 = safeInsets.left + point.x;
        int i4 = safeInsets.top + point.y;
        int i5 = safeInsets.right;
        int i6 = safeInsets.bottom;
        int i7 = 1;
        if ("centered".equalsIgnoreCase(str3)) {
            if (com.applovin.mediation.MaxAdFormat.MREC == maxAdFormat || zContainsKey) {
                layoutParams.width = iDpToPx;
            } else {
                layoutParams.width = -1;
            }
            i2 = 17;
            str2 = "top_center";
        } else {
            if (str3.contains("top")) {
                i = 48;
            } else {
                i = str3.contains("bottom") ? 80 : 0;
            }
            str2 = "top_center";
            if (str3.contains(androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                int i8 = i | 1;
                if (com.applovin.mediation.MaxAdFormat.MREC == maxAdFormat || zContainsKey) {
                    layoutParams.width = iDpToPx;
                } else {
                    layoutParams.width = -1;
                }
                boolean zContains2 = str3.contains(androidx.media3.extractor.text.ttml.TtmlNode.LEFT);
                boolean zContains3 = str3.contains(androidx.media3.extractor.text.ttml.TtmlNode.RIGHT);
                if (zContains2 || zContains3) {
                    int i9 = i8 | 16;
                    if (com.applovin.mediation.MaxAdFormat.MREC == maxAdFormat) {
                        i9 |= str3.contains(androidx.media3.extractor.text.ttml.TtmlNode.LEFT) ? 3 : 5;
                    } else {
                        int iWidth = (rect.width() - safeInsets.left) - safeInsets.right;
                        int iHeight = (rect.height() - safeInsets.top) - safeInsets.bottom;
                        int iMax = ((iHeight > iWidth ? -1 : 1) * (java.lang.Math.max(iWidth, iHeight) - java.lang.Math.min(iWidth, iHeight))) / 2;
                        i3 += iMax;
                        i5 += iMax;
                        int i10 = (iWidth / 2) - (iDpToPx2 / 2);
                        if (zContains2) {
                            i10 = -i10;
                        }
                        maxAdViewRetrieveAdView.setTranslationX(i10);
                        maxAdViewRetrieveAdView.setRotation(90.0f);
                    }
                    relativeLayout.setBackgroundColor(0);
                    i2 = i9;
                } else {
                    i2 = i8;
                }
            } else {
                layoutParams.width = iDpToPx;
                if (str3.contains(androidx.media3.extractor.text.ttml.TtmlNode.LEFT)) {
                    i2 = i | 3;
                } else {
                    i2 = str3.contains(androidx.media3.extractor.text.ttml.TtmlNode.RIGHT) ? i | 5 : i;
                }
            }
        }
        if (com.applovin.mediation.MaxAdFormat.BANNER == maxAdFormat || com.applovin.mediation.MaxAdFormat.LEADER == maxAdFormat) {
            if (this.publisherBannerBackgroundColor != null) {
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) this.safeAreaBackground.getLayoutParams();
                if (str2.equals(str3)) {
                    layoutParams2.height = safeInsets.top;
                    layoutParams2.width = -1;
                    this.safeAreaBackground.setVisibility(maxAdViewRetrieveAdView.getVisibility());
                    i3 -= safeInsets.left;
                    i5 -= safeInsets.right;
                    i7 = 49;
                } else if ("bottom_center".equals(str3)) {
                    layoutParams2.height = safeInsets.bottom;
                    layoutParams2.width = -1;
                    this.safeAreaBackground.setVisibility(maxAdViewRetrieveAdView.getVisibility());
                    i3 -= safeInsets.left;
                    i5 -= safeInsets.right;
                    i7 = 81;
                } else {
                    this.safeAreaBackground.setVisibility(8);
                }
                layoutParams2.gravity = i7;
                this.safeAreaBackground.requestLayout();
            } else {
                this.safeAreaBackground.setVisibility(8);
            }
        }
        layoutParams.setMargins(i3, i4, i5, i6);
        relativeLayout.setGravity(i2);
    }

    protected com.applovin.mediation.unity.MaxUnityAdManager.Insets getSafeInsets() {
        android.view.Window window;
        android.view.WindowInsets rootWindowInsets;
        android.view.DisplayCutout displayCutout;
        com.applovin.mediation.unity.MaxUnityAdManager.Insets insets = new com.applovin.mediation.unity.MaxUnityAdManager.Insets();
        if (android.os.Build.VERSION.SDK_INT < 28 || !getRenderOutsideSafeArea() || (window = getCurrentActivity().getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            return insets;
        }
        insets.left = displayCutout.getSafeInsetLeft();
        insets.top = displayCutout.getSafeInsetTop();
        insets.right = displayCutout.getSafeInsetRight();
        insets.bottom = displayCutout.getSafeInsetBottom();
        return insets;
    }

    private static void forwardUnityEvent(final org.json.JSONObject jSONObject) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.mediation.unity.MaxUnityAdManager.backgroundCallback.onEvent(jSONObject.toString());
            }
        };
        if (com.applovin.mediation.unity.Utils.isMainThread()) {
            threadPoolExecutor.execute(runnable);
        } else {
            runnable.run();
        }
    }

    protected static java.util.Map<java.lang.String, java.lang.String> deserializeParameters(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                return com.applovin.impl.sdk.utils.JsonUtils.toStringMap(com.applovin.impl.sdk.utils.JsonUtils.jsonObjectFromJsonString(str, new org.json.JSONObject()));
            } catch (java.lang.Throwable th) {
                e("Failed to deserialize: (" + str + ") with exception: " + th);
                return java.util.Collections.emptyMap();
            }
        }
        return java.util.Collections.emptyMap();
    }

    private com.applovin.mediation.MaxAdFormat getAdViewAdFormat(java.lang.String str) {
        if (this.adViewFormats.containsKey(str)) {
            return this.adViewFormats.get(str);
        }
        return getDeviceSpecificAdViewAdFormat();
    }

    private static com.applovin.mediation.MaxAdFormat getDeviceSpecificAdViewAdFormat() {
        return com.applovin.sdk.AppLovinSdkUtils.isTablet(getCurrentActivity()) ? com.applovin.mediation.MaxAdFormat.LEADER : com.applovin.mediation.MaxAdFormat.BANNER;
    }

    private static android.app.Activity getCurrentActivity() {
        return com.applovin.mediation.unity.Utils.getCurrentActivity();
    }

    private static android.graphics.Point getOffsetPixels(float f, float f2, android.content.Context context) {
        return new android.graphics.Point(com.applovin.sdk.AppLovinSdkUtils.dpToPx(context, (int) f), com.applovin.sdk.AppLovinSdkUtils.dpToPx(context, (int) f2));
    }

    private com.applovin.mediation.MaxAd getAd(java.lang.String str) {
        com.applovin.mediation.MaxAd maxAd;
        synchronized (this.adInfoMapLock) {
            maxAd = this.adInfoMap.get(str);
        }
        return maxAd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class SdkThreadFactory implements java.util.concurrent.ThreadFactory {
        private SdkThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable, "AppLovinSdk:Max-Unity-Plugin:shared");
            thread.setDaemon(true);
            thread.setPriority(5);
            thread.setUncaughtExceptionHandler(new java.lang.Thread.UncaughtExceptionHandler() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$SdkThreadFactory$$ExternalSyntheticLambda0
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(java.lang.Thread thread2, java.lang.Throwable th) {
                    com.applovin.mediation.unity.MaxUnityAdManager.e("Caught unhandled exceptions", th);
                }
            });
            return thread;
        }
    }

    private boolean getRenderOutsideSafeArea() {
        return java.lang.Boolean.valueOf(this.sdk.getSettings().getExtraParameters().get(KEY_RENDER_OUTSIDE_SAFE_AREA)).booleanValue();
    }
}
