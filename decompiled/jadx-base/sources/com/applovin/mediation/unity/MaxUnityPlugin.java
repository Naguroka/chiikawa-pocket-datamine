package com.applovin.mediation.unity;

/* JADX INFO: loaded from: classes3.dex */
public class MaxUnityPlugin {
    private static final java.lang.String KEY_SDK_KEY = "sdk_key";
    protected static final java.lang.String SDK_TAG = "AppLovinSdk";
    private static final java.lang.String TAG = "MaxUnityPlugin";
    private static final java.lang.String VERSION = "8.0.1";
    private static boolean disableAllLogs;
    private static boolean initializeSdkCalled;
    private static boolean isSdkInitialized;
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.Object> initConfigurationBuilder = new java.util.concurrent.atomic.AtomicReference<>();
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.Object> sdk = new java.util.concurrent.atomic.AtomicReference<>();
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.Object> adManager = new java.util.concurrent.atomic.AtomicReference<>();

    public static com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder getInitConfigurationBuilder() {
        java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference = initConfigurationBuilder;
        java.lang.Object objCreateInitConfigurationBuilder = atomicReference.get();
        if (objCreateInitConfigurationBuilder == null) {
            synchronized (atomicReference) {
                objCreateInitConfigurationBuilder = atomicReference.get();
                if (objCreateInitConfigurationBuilder == null) {
                    objCreateInitConfigurationBuilder = createInitConfigurationBuilder();
                    if (objCreateInitConfigurationBuilder == null) {
                        objCreateInitConfigurationBuilder = atomicReference;
                    }
                    atomicReference.set(objCreateInitConfigurationBuilder);
                }
            }
        }
        if (objCreateInitConfigurationBuilder == atomicReference) {
            objCreateInitConfigurationBuilder = null;
        }
        return (com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder) objCreateInitConfigurationBuilder;
    }

    public static com.applovin.sdk.AppLovinSdk getSdk() {
        java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference = sdk;
        java.lang.Object appLovinSdk = atomicReference.get();
        if (appLovinSdk == null) {
            synchronized (atomicReference) {
                appLovinSdk = atomicReference.get();
                if (appLovinSdk == null) {
                    appLovinSdk = com.applovin.sdk.AppLovinSdk.getInstance(com.applovin.mediation.unity.Utils.getCurrentActivity());
                    if (appLovinSdk == null) {
                        appLovinSdk = atomicReference;
                    }
                    atomicReference.set(appLovinSdk);
                }
            }
        }
        if (appLovinSdk == atomicReference) {
            appLovinSdk = null;
        }
        return (com.applovin.sdk.AppLovinSdk) appLovinSdk;
    }

    public static com.applovin.mediation.unity.MaxUnityAdManager getAdManager() {
        java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference = adManager;
        java.lang.Object maxUnityAdManager = atomicReference.get();
        if (maxUnityAdManager == null) {
            synchronized (atomicReference) {
                maxUnityAdManager = atomicReference.get();
                if (maxUnityAdManager == null) {
                    maxUnityAdManager = new com.applovin.mediation.unity.MaxUnityAdManager();
                    atomicReference.set(maxUnityAdManager);
                }
            }
        }
        if (maxUnityAdManager == atomicReference) {
            maxUnityAdManager = null;
        }
        return (com.applovin.mediation.unity.MaxUnityAdManager) maxUnityAdManager;
    }

    public static boolean isDisableAllLogs() {
        return disableAllLogs;
    }

    public static void setBackgroundCallback(com.applovin.mediation.unity.MaxUnityAdManager.BackgroundCallback backgroundCallback) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "name", "OnInitialCallbackEvent");
        backgroundCallback.onEvent(jSONObject.toString());
        com.applovin.mediation.unity.MaxUnityAdManager.setBackgroundCallback(backgroundCallback);
    }

    public static void setSdkKey(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        ((com.applovin.impl.sdk.AppLovinSdkInitializationConfigurationImpl.BuilderImpl) getInitConfigurationBuilder()).setSdkKey(str);
    }

    public static void initializeSdk(java.lang.String str, java.lang.String str2) {
        com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder initConfigurationBuilder2 = getInitConfigurationBuilder();
        initConfigurationBuilder2.setPluginVersion("Max-Unity-8.0.1");
        initConfigurationBuilder2.setMediationProvider(com.applovin.sdk.AppLovinMediationProvider.MAX);
        initConfigurationBuilder2.setAdUnitIds(java.util.Arrays.asList(str.split(",")));
        getSdk().getSettings().setExtraParameter("applovin_unity_metadata", str2);
        getAdManager().initializeSdkWithCompletionHandler(getInitConfigurationBuilder().build(), new com.applovin.mediation.unity.MaxUnityAdManager.Listener() { // from class: com.applovin.mediation.unity.MaxUnityPlugin$$ExternalSyntheticLambda0
            @Override // com.applovin.mediation.unity.MaxUnityAdManager.Listener
            public final void onSdkInitializationComplete(com.applovin.sdk.AppLovinSdkConfiguration appLovinSdkConfiguration) {
                com.applovin.mediation.unity.MaxUnityPlugin.isSdkInitialized = true;
            }
        });
        initializeSdkCalled = true;
    }

    public static boolean isInitialized() {
        return isSdkInitialized;
    }

    public static void setUserId(java.lang.String str) {
        getSdk().getSettings().setUserIdentifier(str);
    }

    public static void setSegmentCollection(java.lang.String str) {
        if (initializeSdkCalled) {
            e("Segment collection must be set before MAX SDK is initialized");
        } else {
            getInitConfigurationBuilder().setSegmentCollection(getMaxSegmentCollection(str));
        }
    }

    public static java.lang.String getAvailableMediatedNetworks() {
        java.util.List<com.applovin.mediation.MaxMediatedNetworkInfo> availableMediatedNetworks = getSdk().getAvailableMediatedNetworks();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.applovin.mediation.MaxMediatedNetworkInfo maxMediatedNetworkInfo : availableMediatedNetworks) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "name", maxMediatedNetworkInfo.getName());
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "adapterClassName", maxMediatedNetworkInfo.getAdapterClassName());
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, com.json.xt.b, maxMediatedNetworkInfo.getAdapterVersion());
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "sdkVersion", maxMediatedNetworkInfo.getSdkVersion());
            jSONArray.put(jSONObject);
        }
        return jSONArray.toString();
    }

    public static void showMediationDebugger() {
        if (!initializeSdkCalled) {
            d("Failed to show mediation debugger - please ensure the AppLovin MAX Unity Plugin has been initialized by calling 'MaxSdk.InitializeSdk();'!");
        } else {
            getSdk().showMediationDebugger();
        }
    }

    public static void showCreativeDebugger() {
        if (!initializeSdkCalled) {
            d("Failed to show creative debugger - please ensure the AppLovin MAX Unity Plugin has been initialized by calling 'MaxSdk.InitializeSdk();'!");
        } else {
            getSdk().showCreativeDebugger();
        }
    }

    public static int getConsentDialogState() {
        return !isSdkInitialized ? com.applovin.sdk.AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN.ordinal() : getSdk().getConfiguration().getConsentDialogState().ordinal();
    }

    public static java.lang.String getSdkConfiguration() {
        if (!initializeSdkCalled) {
            e("Failed to get SDK configuration - please ensure the AppLovin MAX Unity Plugin has been initialized by calling 'MaxSdk.InitializeSdk();'!");
            return "";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.sdk.AppLovinSdkConfiguration configuration = getSdk().getConfiguration();
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "consentFlowUserGeography", java.lang.Integer.toString(configuration.getConsentFlowUserGeography().ordinal()));
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "consentDialogState", java.lang.Integer.toString(configuration.getConsentDialogState().ordinal()));
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "countryCode", configuration.getCountryCode());
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "isSuccessfullyInitialized", java.lang.String.valueOf(getSdk().isInitialized()));
        com.applovin.impl.sdk.utils.JsonUtils.putBoolean(jSONObject, "isTestModeEnabled", configuration.isTestModeEnabled());
        return jSONObject.toString();
    }

    public static void setHasUserConsent(boolean z) {
        com.applovin.sdk.AppLovinPrivacySettings.setHasUserConsent(z, com.applovin.mediation.unity.Utils.getCurrentActivity());
    }

    public static boolean hasUserConsent() {
        return com.applovin.sdk.AppLovinPrivacySettings.hasUserConsent(com.applovin.mediation.unity.Utils.getCurrentActivity());
    }

    public static boolean isUserConsentSet() {
        return com.applovin.sdk.AppLovinPrivacySettings.isUserConsentSet(com.applovin.mediation.unity.Utils.getCurrentActivity());
    }

    public static void setDoNotSell(boolean z) {
        com.applovin.sdk.AppLovinPrivacySettings.setDoNotSell(z, com.applovin.mediation.unity.Utils.getCurrentActivity());
    }

    public static boolean isDoNotSell() {
        return com.applovin.sdk.AppLovinPrivacySettings.isDoNotSell(com.applovin.mediation.unity.Utils.getCurrentActivity());
    }

    public static boolean isDoNotSellSet() {
        return com.applovin.sdk.AppLovinPrivacySettings.isDoNotSellSet(com.applovin.mediation.unity.Utils.getCurrentActivity());
    }

    public static void createBanner(java.lang.String str, java.lang.String str2) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("CreateBanner");
        } else {
            getAdManager().createBanner(str.trim(), str2);
        }
    }

    public static void createBanner(java.lang.String str, float f, float f2) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("CreateBannerXY");
        } else {
            getAdManager().createBanner(str.trim(), f, f2);
        }
    }

    public static void loadBanner(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("LoadBanner");
        } else {
            getAdManager().loadBanner(str.trim());
        }
    }

    public static void setBannerExtraParameter(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetBannerExtraParameter");
        } else {
            getAdManager().setBannerExtraParameter(str.trim(), str2, str3);
        }
    }

    public static void setBannerLocalExtraParameter(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetBannerLocalExtraParameter");
        } else {
            getAdManager().setBannerLocalExtraParameter(str.trim(), str2, obj);
        }
    }

    public static void setBannerLocalExtraParameterJson(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetBannerLocalExtraParameter");
        } else {
            getAdManager().setBannerLocalExtraParameter(str.trim(), str2, getLocalExtraParameterValue(com.applovin.impl.sdk.utils.JsonUtils.deserialize(str3)));
        }
    }

    public static void setBannerCustomData(java.lang.String str, java.lang.String str2) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("setBannerCustomData");
        } else {
            getAdManager().setBannerCustomData(str.trim(), str2);
        }
    }

    public static void setBannerPlacement(java.lang.String str, java.lang.String str2) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetBannerPlacement");
        } else {
            getAdManager().setBannerPlacement(str.trim(), str2);
        }
    }

    public static void startBannerAutoRefresh(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("StartBannerAutoRefresh");
        } else {
            getAdManager().startBannerAutoRefresh(str.trim());
        }
    }

    public static void stopBannerAutoRefresh(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("StopBannerAutoRefresh");
        } else {
            getAdManager().stopBannerAutoRefresh(str.trim());
        }
    }

    public static void setBannerWidth(java.lang.String str, float f) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetBannerWidth");
        } else {
            getAdManager().setBannerWidth(str.trim(), (int) f);
        }
    }

    public static void updateBannerPosition(java.lang.String str, java.lang.String str2) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("UpdateBannerPosition");
        } else {
            getAdManager().updateBannerPosition(str.trim(), str2);
        }
    }

    public static void updateBannerPosition(java.lang.String str, float f, float f2) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("UpdateBannerPositionXY");
        } else {
            getAdManager().updateBannerPosition(str.trim(), f, f2);
        }
    }

    public static void showBanner(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("ShowBanner");
        } else {
            getAdManager().showBanner(str.trim());
        }
    }

    public static void destroyBanner(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("DestroyBanner");
        } else {
            getAdManager().destroyBanner(str.trim());
        }
    }

    public static void hideBanner(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("HideBanner");
        } else {
            getAdManager().hideBanner(str.trim());
        }
    }

    public static java.lang.String getBannerLayout(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("GetBannerLayout");
            return "";
        }
        return getAdManager().getBannerLayout(str.trim());
    }

    public static void setBannerBackgroundColor(java.lang.String str, java.lang.String str2) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetBannerBackgroundColor");
        } else {
            getAdManager().setBannerBackgroundColor(str.trim(), str2);
        }
    }

    public static void createMRec(java.lang.String str, java.lang.String str2) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("CreateMRec");
        } else {
            getAdManager().createMRec(str.trim(), str2);
        }
    }

    public static void createMRec(java.lang.String str, float f, float f2) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("CreateMRecXY");
        } else {
            getAdManager().createMRec(str.trim(), f, f2);
        }
    }

    public static void loadMRec(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("LoadMRec");
        } else {
            getAdManager().loadMRec(str.trim());
        }
    }

    public static void setMRecPlacement(java.lang.String str, java.lang.String str2) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetMRecPlacement");
        } else {
            getAdManager().setMRecPlacement(str.trim(), str2);
        }
    }

    public static void startMRecAutoRefresh(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("StartMRecAutoRefresh");
        } else {
            getAdManager().startMRecAutoRefresh(str.trim());
        }
    }

    public static void stopMRecAutoRefresh(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("StopMRecAutoRefresh");
        } else {
            getAdManager().stopMRecAutoRefresh(str.trim());
        }
    }

    public static void updateMRecPosition(java.lang.String str, java.lang.String str2) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("UpdateMRecPosition");
        } else {
            getAdManager().updateMRecPosition(str.trim(), str2);
        }
    }

    public static void updateMRecPosition(java.lang.String str, float f, float f2) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("UpdateMRecPositionXY");
        } else {
            getAdManager().updateMRecPosition(str.trim(), f, f2);
        }
    }

    public static void showMRec(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("ShowMRec");
        } else {
            getAdManager().showMRec(str.trim());
        }
    }

    public static void destroyMRec(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("DestroyMRec");
        } else {
            getAdManager().destroyMRec(str.trim());
        }
    }

    public static void hideMRec(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("HideMRec");
        } else {
            getAdManager().hideMRec(str.trim());
        }
    }

    public static void setMRecExtraParameter(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetMRecExtraParameter");
        } else {
            getAdManager().setMRecExtraParameter(str.trim(), str2, str3);
        }
    }

    public static void setMRecLocalExtraParameter(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetMRecLocalExtraParameter");
        } else {
            getAdManager().setMRecLocalExtraParameter(str.trim(), str2, obj);
        }
    }

    public static void setMRecLocalExtraParameterJson(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetMRecLocalExtraParameter");
        } else {
            getAdManager().setMRecLocalExtraParameter(str.trim(), str2, getLocalExtraParameterValue(com.applovin.impl.sdk.utils.JsonUtils.deserialize(str3)));
        }
    }

    public static void setMRecCustomData(java.lang.String str, java.lang.String str2) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("setMRecCustomData");
        } else {
            getAdManager().setMRecCustomData(str.trim(), str2);
        }
    }

    public static java.lang.String getMRecLayout(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("GetMRecLayout");
            return "";
        }
        return getAdManager().getMRecLayout(str.trim());
    }

    public static void loadInterstitial(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("LoadInterstitial");
        } else {
            getAdManager().loadInterstitial(str.trim());
        }
    }

    public static boolean isInterstitialReady(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("IsInterstitialReady");
            return false;
        }
        return getAdManager().isInterstitialReady(str.trim());
    }

    public static void showInterstitial(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("ShowInterstitial");
        } else {
            getAdManager().showInterstitial(str.trim(), str2, str3);
        }
    }

    public static void setInterstitialExtraParameter(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetInterstitialExtraParameter");
        } else {
            getAdManager().setInterstitialExtraParameter(str.trim(), str2, str3);
        }
    }

    public static void setInterstitialLocalExtraParameter(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetInterstitialLocalExtraParameter");
        } else {
            getAdManager().setInterstitialLocalExtraParameter(str.trim(), str2, obj);
        }
    }

    public static void setInterstitialLocalExtraParameterJson(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetInterstitialLocalExtraParameter");
        } else {
            getAdManager().setInterstitialLocalExtraParameter(str.trim(), str2, getLocalExtraParameterValue(com.applovin.impl.sdk.utils.JsonUtils.deserialize(str3)));
        }
    }

    public static void loadAppOpenAd(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("LoadAppOpenAd");
        } else {
            getAdManager().loadAppOpenAd(str.trim());
        }
    }

    public static boolean isAppOpenAdReady(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("IsAppOpenAdReady");
            return false;
        }
        return getAdManager().isAppOpenAdReady(str.trim());
    }

    public static void showAppOpenAd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("ShowAppOpenAd");
        } else {
            getAdManager().showAppOpenAd(str.trim(), str2, str3);
        }
    }

    public static void setAppOpenAdExtraParameter(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetAppOpenAdExtraParameter");
        } else {
            getAdManager().setAppOpenAdExtraParameter(str.trim(), str2, str3);
        }
    }

    public static void setAppOpenAdLocalExtraParameter(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetAppOpenAdLocalExtraParameter");
        } else {
            getAdManager().setAppOpenAdLocalExtraParameter(str.trim(), str2, obj);
        }
    }

    public static void setAppOpenAdLocalExtraParameterJson(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetAppOpenAdLocalExtraParameter");
        } else {
            getAdManager().setAppOpenAdLocalExtraParameter(str.trim(), str2, getLocalExtraParameterValue(com.applovin.impl.sdk.utils.JsonUtils.deserialize(str3)));
        }
    }

    public static void loadRewardedAd(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("LoadRewardedAd");
        } else {
            getAdManager().loadRewardedAd(str.trim());
        }
    }

    public static boolean isRewardedAdReady(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("IsRewardedAdReady");
            return false;
        }
        return getAdManager().isRewardedAdReady(str.trim());
    }

    public static void showRewardedAd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("ShowRewardedAd");
        } else {
            getAdManager().showRewardedAd(str.trim(), str2, str3);
        }
    }

    public static void setRewardedAdExtraParameter(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetRewardedAdExtraParameter");
        } else {
            getAdManager().setRewardedAdExtraParameter(str.trim(), str2, str3);
        }
    }

    public static void setRewardedAdLocalExtraParameter(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetRewardedAdLocalExtraParameter");
        } else {
            getAdManager().setRewardedAdLocalExtraParameter(str.trim(), str2, obj);
        }
    }

    public static void setRewardedAdLocalExtraParameterJson(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetRewardedAdLocalExtraParameter");
        } else {
            getAdManager().setRewardedAdLocalExtraParameter(str.trim(), str2, getLocalExtraParameterValue(com.applovin.impl.sdk.utils.JsonUtils.deserialize(str3)));
        }
    }

    public static void loadRewardedInterstitialAd(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("LoadRewardedInterstitialAd");
        } else {
            getAdManager().loadRewardedInterstitialAd(str.trim());
        }
    }

    public static boolean isRewardedInterstitialAdReady(java.lang.String str) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("IsRewardedInterstitialAdReady");
            return false;
        }
        return getAdManager().isRewardedInterstitialAdReady(str.trim());
    }

    public static void showRewardedInterstitialAd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("ShowRewardedInterstitialAd");
        } else {
            getAdManager().showRewardedInterstitialAd(str.trim(), str2, str3);
        }
    }

    public static void setRewardedInterstitialAdExtraParameter(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetRewardedInterstitialAdExtraParameter");
        } else {
            getAdManager().setRewardedInterstitialAdExtraParameter(str.trim(), str2, str3);
        }
    }

    public static void setRewardedInterstitialAdLocalExtraParameter(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetRewardedInterstitialAdLocalExtraParameter");
        } else {
            getAdManager().setRewardedInterstitialAdLocalExtraParameter(str.trim(), str2, obj);
        }
    }

    public static void setRewardedInterstitialAdLocalExtraParameterJson(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("SetRewardedInterstitialAdLocalExtraParameter");
        } else {
            getAdManager().setRewardedInterstitialAdLocalExtraParameter(str.trim(), str2, getLocalExtraParameterValue(com.applovin.impl.sdk.utils.JsonUtils.deserialize(str3)));
        }
    }

    public static void trackEvent(java.lang.String str, java.lang.String str2) {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("TrackEvent");
        } else {
            getAdManager().trackEvent(str, str2);
        }
    }

    public static boolean isTablet() {
        return com.applovin.sdk.AppLovinSdkUtils.isTablet(com.applovin.mediation.unity.Utils.getCurrentActivity());
    }

    public static boolean isPhysicalDevice() {
        return !com.applovin.sdk.AppLovinSdkUtils.isEmulator();
    }

    public static int getTcfVendorConsentStatus(int i) {
        return getConsentStatusValue(com.applovin.sdk.AppLovinPrivacySettings.getTcfVendorConsentStatus(i));
    }

    public static int getAdditionalConsentStatus(int i) {
        return getConsentStatusValue(com.applovin.sdk.AppLovinPrivacySettings.getAdditionalConsentStatus(i));
    }

    public static int getPurposeConsentStatus(int i) {
        return getConsentStatusValue(com.applovin.sdk.AppLovinPrivacySettings.getPurposeConsentStatus(i));
    }

    public static int getSpecialFeatureOptInStatus(int i) {
        return getConsentStatusValue(com.applovin.sdk.AppLovinPrivacySettings.getSpecialFeatureOptInStatus(i));
    }

    public static boolean isMuted() {
        return getSdk().getSettings().isMuted();
    }

    public static void setMuted(boolean z) {
        getSdk().getSettings().setMuted(z);
    }

    public static float getScreenDensity() {
        return com.applovin.mediation.unity.Utils.getCurrentActivity().getResources().getDisplayMetrics().density;
    }

    public static java.lang.String getAdInfo(java.lang.String str) {
        return getAdManager().getAdInfo(str.trim());
    }

    public static java.lang.String getAdValue(java.lang.String str, java.lang.String str2) {
        return getAdManager().getAdValue(str.trim(), str2);
    }

    public static void setVerboseLogging(boolean z) {
        getSdk().getSettings().setVerboseLogging(z);
    }

    public static boolean isVerboseLoggingEnabled() {
        return getSdk().getSettings().isVerboseLoggingEnabled();
    }

    public static void setCreativeDebuggerEnabled(boolean z) {
        getSdk().getSettings().setCreativeDebuggerEnabled(z);
    }

    public static void setExceptionHandlerEnabled(boolean z) {
        if (initializeSdkCalled) {
            e("Exception handler must be enabled/disabled before MAX SDK is initialized");
        } else {
            getInitConfigurationBuilder().setExceptionHandlerEnabled(z);
        }
    }

    public static void setExtraParameter(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            e("ERROR: Failed to set extra parameter for null or empty key: \" + key");
            return;
        }
        if ("disable_all_logs".equals(str)) {
            disableAllLogs = java.lang.Boolean.parseBoolean(str2);
        }
        getSdk().getSettings().setExtraParameter(str, str2);
    }

    public static int[] getSafeAreaInsets() {
        com.applovin.mediation.unity.MaxUnityAdManager.Insets safeInsets = getAdManager().getSafeInsets();
        return new int[]{safeInsets.left, safeInsets.top, safeInsets.right, safeInsets.bottom};
    }

    public static void showCmpForExistingUser() {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("showCmpForExistingUser");
        } else {
            getAdManager().showCmpForExistingUser();
        }
    }

    public static boolean hasSupportedCmp() {
        if (!initializeSdkCalled) {
            logUninitializedAccessError("hasSupportedCmp");
            return false;
        }
        return getSdk().getCmpService().hasSupportedCmp();
    }

    public static void setTestDeviceAdvertisingIds(java.lang.String[] strArr) {
        if (initializeSdkCalled) {
            e("Test device advertising IDs must be set before MAX SDK is initialized");
        } else {
            getInitConfigurationBuilder().setTestDeviceAdvertisingIds(java.util.Arrays.asList(strArr));
        }
    }

    public static float getAdaptiveBannerHeight(float f) {
        return com.applovin.mediation.unity.MaxUnityAdManager.getAdaptiveBannerHeight(f);
    }

    private static java.lang.Object getLocalExtraParameterValue(org.json.JSONObject jSONObject) {
        java.lang.Object object = com.applovin.impl.sdk.utils.JsonUtils.getObject(jSONObject, "value", null);
        if (object instanceof org.json.JSONArray) {
            return com.applovin.impl.sdk.utils.JsonUtils.optList((org.json.JSONArray) object, null);
        }
        if (!(object instanceof org.json.JSONObject)) {
            return object;
        }
        try {
            return com.applovin.impl.sdk.utils.JsonUtils.toStringObjectMap((org.json.JSONObject) object);
        } catch (org.json.JSONException e) {
            e("Failed to create map from local extra parameter data: " + jSONObject + "Exception: " + e);
            return null;
        }
    }

    private static int getConsentStatusValue(java.lang.Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? 1 : 0;
        }
        return -1;
    }

    private static com.applovin.mediation.MaxSegmentCollection getMaxSegmentCollection(java.lang.String str) {
        com.applovin.mediation.MaxSegmentCollection.Builder builder = com.applovin.mediation.MaxSegmentCollection.builder();
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(com.applovin.impl.sdk.utils.JsonUtils.deserialize(str), "segments", null);
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObject = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i, (org.json.JSONObject) null);
            builder.addSegment(new com.applovin.mediation.MaxSegment(com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject, com.ironsource.y8.h.W, -1), com.applovin.impl.sdk.utils.JsonUtils.toIntegerList(com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "values", null))));
        }
        return builder.build();
    }

    private static com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder createInitConfigurationBuilder() {
        return com.applovin.sdk.AppLovinSdkInitializationConfiguration.builder(getSdk().getSettings().getExtraParameters().get("sdk_key"), com.applovin.mediation.unity.Utils.getCurrentActivity());
    }

    private static void logUninitializedAccessError(java.lang.String str) {
        e("[MaxUnityPlugin] ERROR: Failed to execute " + str + "() - please ensure the AppLovin MAX Unity Plugin has been initialized by calling 'MaxSdk.InitializeSdk();'!");
    }

    private static void d(java.lang.String str) {
        if (isDisableAllLogs()) {
            return;
        }
        android.util.Log.d(SDK_TAG, "[MaxUnityPlugin] " + str);
    }

    private static void e(java.lang.String str) {
        if (isDisableAllLogs()) {
            return;
        }
        android.util.Log.e(SDK_TAG, "[MaxUnityPlugin] " + str);
    }
}
