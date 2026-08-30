package com.json.adapters.ironsource;

/* JADX INFO: loaded from: classes5.dex */
public class IronSourceAdapter extends com.json.mediationsdk.AbstractAdapter implements com.ironsource.environment.ContextProvider.a {
    public static final java.lang.String IRONSOURCE_BIDDING_TOKEN_KEY = "token";
    public static final java.lang.String IRONSOURCE_ONE_FLOW_KEY = "isOneFlow";
    private static final int IS_LOAD_EXCEPTION = 1000;
    private static final int IS_SHOW_EXCEPTION = 1001;
    private static final int RV_LOAD_EXCEPTION = 1002;
    private static final int RV_SHOW_EXCEPTION = 1003;
    private static final java.lang.String VERSION = "8.6.1";
    public final java.lang.String ADM_KEY;
    private final java.lang.String DEMAND_SOURCE_NAME;
    private final java.lang.String DYNAMIC_CONTROLLER_CONFIG;
    private final java.lang.String DYNAMIC_CONTROLLER_DEBUG_MODE;
    private final java.lang.String DYNAMIC_CONTROLLER_URL;
    private final java.lang.String LWS_SUPPORT_STATE;
    private final java.lang.String SDK_PLUGIN_TYPE;
    private final java.lang.String SESSION_ID;
    java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.ArrayList<com.json.mj>> mDemandSourceToBnAd;
    java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mj> mDemandSourceToISAd;
    java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mj> mDemandSourceToRvAd;
    private final com.json.ln mNetworkGlobalDataWriter;
    private final com.json.vh sessionDepthService;
    private static java.util.concurrent.atomic.AtomicBoolean mDidInitSdk = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static com.json.a1 mBaseAdPlayerExtraParams = new com.json.a1();

    private IronSourceAdapter(java.lang.String str) {
        super(str);
        this.DYNAMIC_CONTROLLER_URL = "controllerUrl";
        this.DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
        this.DYNAMIC_CONTROLLER_CONFIG = "controllerConfig";
        this.SESSION_ID = "sessionid";
        this.SDK_PLUGIN_TYPE = com.ironsource.kn.a.SDK_PLUGIN_TYPE;
        this.ADM_KEY = "adm";
        this.DEMAND_SOURCE_NAME = "demandSourceName";
        this.LWS_SUPPORT_STATE = "isSupportedLWS";
        this.mNetworkGlobalDataWriter = new com.json.ln();
        this.sessionDepthService = com.json.im.S().k();
        this.mDemandSourceToRvAd = new java.util.concurrent.ConcurrentHashMap<>();
        this.mDemandSourceToISAd = new java.util.concurrent.ConcurrentHashMap<>();
        this.mDemandSourceToBnAd = new java.util.concurrent.ConcurrentHashMap<>();
        setNativeAdAdapter(new com.json.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter(this));
        com.json.environment.ContextProvider.getInstance().registerLifeCycleListener(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x006a A[PHI: r5
  0x006a: PHI (r5v3 int) = (r5v0 int), (r5v4 int) binds: [B:26:0x0050, B:36:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private com.json.og convertBannerSize(android.content.Context context, com.json.mediationsdk.ISBannerSize iSBannerSize) {
        java.lang.String description = iSBannerSize.getDescription();
        description.hashCode();
        description.hashCode();
        byte b = -1;
        switch (description.hashCode()) {
            case -387072689:
                if (description.equals(com.json.mediationsdk.l.c)) {
                    b = 0;
                }
                break;
            case 72205083:
                if (description.equals(com.json.mediationsdk.l.b)) {
                    b = 1;
                }
                break;
            case 79011241:
                if (description.equals(com.json.mediationsdk.l.e)) {
                    b = 2;
                }
                break;
            case 1951953708:
                if (description.equals(com.json.mediationsdk.l.f2983a)) {
                    b = 3;
                }
                break;
            case 1999208305:
                if (description.equals("CUSTOM")) {
                    b = 4;
                }
                break;
        }
        int i = 50;
        int i2 = 320;
        switch (b) {
            case 0:
                i2 = com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT;
                i = 250;
                return new com.json.og(com.json.mediationsdk.AdapterUtils.dpToPixels(context, i2), com.json.mediationsdk.AdapterUtils.dpToPixels(context, i), description);
            case 1:
                i = 90;
                return new com.json.og(com.json.mediationsdk.AdapterUtils.dpToPixels(context, i2), com.json.mediationsdk.AdapterUtils.dpToPixels(context, i), description);
            case 2:
                boolean zIsLargeScreen = com.json.mediationsdk.AdapterUtils.isLargeScreen(context);
                i2 = zIsLargeScreen ? 728 : 320;
                if (zIsLargeScreen) {
                    i = 90;
                }
                return new com.json.og(com.json.mediationsdk.AdapterUtils.dpToPixels(context, i2), com.json.mediationsdk.AdapterUtils.dpToPixels(context, i), description);
            case 3:
                return new com.json.og(com.json.mediationsdk.AdapterUtils.dpToPixels(context, i2), com.json.mediationsdk.AdapterUtils.dpToPixels(context, i), description);
            case 4:
                int height = iSBannerSize.getHeight();
                if (height != 50 && height != 90) {
                    return null;
                }
                i = height;
                return new com.json.og(com.json.mediationsdk.AdapterUtils.dpToPixels(context, i2), com.json.mediationsdk.AdapterUtils.dpToPixels(context, i), description);
            default:
                return null;
        }
    }

    private com.json.mj createBannerAdInstance(java.lang.String str, com.json.og ogVar, org.json.JSONObject jSONObject, com.json.adapters.ironsource.LoadAdData loadAdData, com.json.mediationsdk.sdk.BannerSmashListener bannerSmashListener) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("creating banner ad instance for " + str);
        return new com.json.nj(str, new com.json.adapters.ironsource.IronSourceBannerListener(this, bannerSmashListener, str)).a(mBaseAdPlayerExtraParams.get()).a(jSONObject.optInt("instanceType", 2) == 2).c(jSONObject.optBoolean("isOneFlow")).a(ogVar).b(loadAdData.isMultipleAdObjectsFlow()).b(loadAdData.adUnitId()).a();
    }

    private com.json.mj createInterstitialAdInstance(java.lang.String str, org.json.JSONObject jSONObject, com.json.adapters.ironsource.LoadAdData loadAdData, com.json.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        boolean zOptBoolean = jSONObject.optBoolean("isOneFlow");
        boolean z = jSONObject.optInt("instanceType", 2) == 2;
        com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("creating ad instance for " + str + " isBidder=" + z);
        return new com.json.nj(str, new com.json.adapters.ironsource.IronSourceInterstitialListener(interstitialSmashListener, str)).a(mBaseAdPlayerExtraParams.get()).c(zOptBoolean).a(z).b(loadAdData.isMultipleAdObjectsFlow()).b(loadAdData.adUnitId()).a();
    }

    private com.json.mj createRewardedVideoAdInstance(java.lang.String str, boolean z, org.json.JSONObject jSONObject, com.json.adapters.ironsource.LoadAdData loadAdData, com.json.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        boolean zOptBoolean = jSONObject.optBoolean("isOneFlow");
        boolean z2 = jSONObject.optInt("instanceType", 2) == 2;
        com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("creating ad instance for " + str + " isDemandOnly=" + z + " isBidder=" + z2);
        return new com.json.nj(str, new com.json.adapters.ironsource.IronSourceRewardedVideoListener(rewardedVideoSmashListener, str, z)).a(mBaseAdPlayerExtraParams.get()).c().c(zOptBoolean).b(loadAdData.isMultipleAdObjectsFlow()).a(z2).b(loadAdData.adUnitId()).a();
    }

    public static java.lang.String getAdapterSDKVersion() {
        return com.json.sdk.utils.SDKUtils.getSDKVersion();
    }

    public static com.json.mediationsdk.IntegrationData getIntegrationData(android.content.Context context) {
        return new com.json.mediationsdk.IntegrationData("IronSource", "8.6.1");
    }

    private void initInterstitialInternal(java.lang.String str, org.json.JSONObject jSONObject, com.json.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener, java.lang.String str2) {
        initSDK(str, jSONObject);
        interstitialSmashListener.onInterstitialInitSuccess();
    }

    private void initRewardedVideoInternal(java.lang.String str, org.json.JSONObject jSONObject) {
        initSDK(str, jSONObject);
    }

    private boolean isMultipleAdObjectsFlow(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.optBoolean("isMultipleAdUnits", false);
    }

    private void loadBannerInternal(android.app.Activity activity, com.json.mediationsdk.ISBannerSize iSBannerSize, org.json.JSONObject jSONObject, com.json.mediationsdk.sdk.BannerSmashListener bannerSmashListener, java.lang.String str, com.json.adapters.ironsource.LoadAdData loadAdData) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            com.json.og ogVarConvertBannerSize = convertBannerSize(com.json.environment.ContextProvider.getInstance().getApplicationContext(), iSBannerSize);
            if (ogVarConvertBannerSize == null) {
                bannerSmashListener.onBannerAdLoadFailed(com.json.mediationsdk.utils.ErrorBuilder.unsupportedBannerSize(getProviderName()));
            } else {
                com.json.sdk.IronSourceNetwork.loadAdView(activity, createBannerAdInstance(demandSourceName, ogVarConvertBannerSize, jSONObject, loadAdData, bannerSmashListener), new com.ironsource.adapters.ironsource.IronSourceLoadParameters.WithLog(new com.ironsource.adapters.ironsource.IronSourceLoadParameters.Base(jSONObject, str)).value());
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            bannerSmashListener.onBannerAdLoadFailed(com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - " + e.getMessage()));
        }
    }

    private void loadInterstitialAdInternal(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.json.adapters.ironsource.LoadAdData loadAdData, com.json.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) throws java.lang.Exception {
        com.ironsource.adapters.ironsource.IronSourceLoadParameters.WithLog withLog = new com.ironsource.adapters.ironsource.IronSourceLoadParameters.WithLog(new com.ironsource.adapters.ironsource.IronSourceLoadParameters.Base(jSONObject, str2));
        com.json.mj mjVarCreateInterstitialAdInstance = this.mDemandSourceToISAd.get(str);
        if (mjVarCreateInterstitialAdInstance == null) {
            mjVarCreateInterstitialAdInstance = createInterstitialAdInstance(str, jSONObject, loadAdData, interstitialSmashListener);
            this.mDemandSourceToISAd.put(str, mjVarCreateInterstitialAdInstance);
        }
        com.json.sdk.IronSourceNetwork.loadAd(mjVarCreateInterstitialAdInstance, withLog.value());
    }

    private void loadRewardedVideoAdInternal(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, com.json.adapters.ironsource.LoadAdData loadAdData, com.json.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) throws java.lang.Exception {
        com.ironsource.adapters.ironsource.IronSourceLoadParameters.WithLog withLog = new com.ironsource.adapters.ironsource.IronSourceLoadParameters.WithLog(new com.ironsource.adapters.ironsource.IronSourceLoadParameters.Base(jSONObject, str2));
        com.json.mj mjVarCreateRewardedVideoAdInstance = this.mDemandSourceToRvAd.get(str);
        if (mjVarCreateRewardedVideoAdInstance == null) {
            mjVarCreateRewardedVideoAdInstance = createRewardedVideoAdInstance(str, withLog.demandOnly(), jSONObject, loadAdData, rewardedVideoSmashListener);
            this.mDemandSourceToRvAd.put(str, mjVarCreateRewardedVideoAdInstance);
        }
        com.json.sdk.IronSourceNetwork.loadAd(mjVarCreateRewardedVideoAdInstance, withLog.value());
    }

    private void showAdInternal(com.json.mj mjVar, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) throws java.lang.Exception {
        int iA = this.sessionDepthService.a(ad_unit);
        java.util.HashMap map = new java.util.HashMap();
        map.put("sessionDepth", java.lang.String.valueOf(iA));
        com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("demandSourceName=" + mjVar.g() + " showParams=" + map);
        com.json.sdk.IronSourceNetwork.showAd(com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity(), mjVar, map);
    }

    public static com.json.adapters.ironsource.IronSourceAdapter startAdapter(java.lang.String str) {
        return new com.json.adapters.ironsource.IronSourceAdapter(str);
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(org.json.JSONObject jSONObject) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose(demandSourceName + ": destroyBanner()");
        java.util.ArrayList<com.json.mj> arrayList = this.mDemandSourceToBnAd.get(demandSourceName);
        if (arrayList != null) {
            try {
                java.util.Iterator<com.json.mj> it = arrayList.iterator();
                while (it.hasNext()) {
                    com.json.sdk.IronSourceNetwork.destroyAd(it.next());
                }
                this.mDemandSourceToBnAd.remove(demandSourceName);
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("destroyBanner failed: " + e.getMessage());
            }
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    public void earlyInit(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
        if (com.json.mediationsdk.p.m().n() == null) {
            com.json.mediationsdk.logger.IronLog.ADAPTER_API.error("Appkey is null for early init");
        } else {
            com.json.mediationsdk.utils.IronSourceUtils.sendAutomationLog(getDemandSourceName(jSONObject) + ": earlyInit");
            initSDK(com.json.mediationsdk.p.m().n(), jSONObject);
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.BannerAdapterInterface
    public java.util.Map<java.lang.String, java.lang.Object> getBannerBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        return new java.util.HashMap();
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    public java.lang.String getCoreSDKVersion() {
        return com.json.sdk.utils.SDKUtils.getSDKVersion();
    }

    public java.lang.String getDemandSourceName(org.json.JSONObject jSONObject) {
        return !android.text.TextUtils.isEmpty(jSONObject.optString("demandSourceName")) ? jSONObject.optString("demandSourceName") : getProviderName();
    }

    public java.util.HashMap<java.lang.String, java.lang.String> getInitParams() {
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        java.lang.String pluginType = getPluginType();
        if (!android.text.TextUtils.isEmpty(pluginType)) {
            map.put(com.ironsource.kn.a.SDK_PLUGIN_TYPE, pluginType);
        }
        if (!android.text.TextUtils.isEmpty(com.json.mediationsdk.p.m().u())) {
            map.put("sessionid", com.json.mediationsdk.p.m().u());
        }
        return map;
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public java.util.Map<java.lang.String, java.lang.Object> getInterstitialBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        return new java.util.HashMap();
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    public com.json.mediationsdk.LoadWhileShowSupportState getLoadWhileShowSupportState(org.json.JSONObject jSONObject) {
        com.json.mediationsdk.LoadWhileShowSupportState loadWhileShowSupportState = this.mLWSSupportState;
        return (jSONObject == null || !jSONObject.optBoolean("isSupportedLWS")) ? loadWhileShowSupportState : com.json.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public java.util.Map<java.lang.String, java.lang.Object> getRewardedVideoBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        return new java.util.HashMap();
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    public java.lang.String getVersion() {
        return "8.6.1";
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.json.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("demandSourceName: " + getDemandSourceName(jSONObject));
        initRewardedVideoInternal(str, jSONObject);
        loadRewardedVideo(jSONObject, jSONObject2, rewardedVideoSmashListener);
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.json.mediationsdk.sdk.BannerSmashListener bannerSmashListener) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("demandSourceName: " + getDemandSourceName(jSONObject));
        initSDK(str, jSONObject);
        bannerSmashListener.onBannerInitSuccess();
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitial(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.json.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.json.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoForDemandOnly(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.json.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("demandSourceName: " + getDemandSourceName(jSONObject));
        initRewardedVideoInternal(str, jSONObject);
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.json.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("demandSourceName: " + getDemandSourceName(jSONObject));
        initRewardedVideoInternal(str, jSONObject);
        rewardedVideoSmashListener.onRewardedVideoInitSuccess();
    }

    public void initSDK(java.lang.String str, org.json.JSONObject jSONObject) {
        if (mDidInitSdk.compareAndSet(false, true)) {
            java.lang.String mediationUserId = com.json.mediationsdk.utils.IronSourceUtils.getMediationUserId();
            int iOptInt = jSONObject.optInt("debugMode", 0);
            if (isAdaptersDebugEnabled()) {
                iOptInt = 3;
            }
            com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.ADAPTER_API;
            ironLog.verbose("setting debug mode to " + iOptInt);
            com.json.sdk.utils.SDKUtils.setDebugMode(iOptInt);
            com.json.sdk.utils.SDKUtils.setControllerUrl(jSONObject.optString("controllerUrl"));
            ironLog.verbose("IronSourceNetwork setting controller url to " + jSONObject.optString("controllerUrl"));
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("controllerConfig");
            java.lang.String string = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : "";
            com.json.sdk.utils.SDKUtils.setControllerConfig(string);
            ironLog.verbose("IronSourceNetwork setting controller config to " + string);
            java.util.HashMap<java.lang.String, java.lang.String> initParams = getInitParams();
            mBaseAdPlayerExtraParams.a(initParams);
            java.lang.String strN = com.json.mediationsdk.p.m().n();
            ironLog.verbose("with appKey=" + strN + " userId=" + mediationUserId + " parameters " + initParams);
            com.json.sdk.IronSourceNetwork.addInitListener(new com.json.jo() { // from class: com.ironsource.adapters.ironsource.IronSourceAdapter.1
                @Override // com.json.jo
                public void onFail(com.json.ah ahVar) {
                    com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("OnNetworkSDKInitListener fail - code:" + ahVar.a() + " message:" + ahVar.b());
                }

                @Override // com.json.jo
                public void onSuccess() {
                    com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("OnNetworkSDKInitListener success");
                }
            });
            com.json.sdk.IronSourceNetwork.initSDK(com.json.environment.ContextProvider.getInstance().getApplicationContext(), strN, mediationUserId, initParams);
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(org.json.JSONObject jSONObject) {
        com.json.mj mjVar = this.mDemandSourceToISAd.get(getDemandSourceName(jSONObject));
        return mjVar != null && com.json.sdk.IronSourceNetwork.isAdAvailableForInstance(mjVar);
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(org.json.JSONObject jSONObject) {
        com.json.mj mjVar = this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject));
        return mjVar != null && com.json.sdk.IronSourceNetwork.isAdAvailableForInstance(mjVar);
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        return false;
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str, com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout, com.json.mediationsdk.sdk.BannerSmashListener bannerSmashListener) {
        if (ironSourceBannerLayout != null) {
            loadBannerInternal(ironSourceBannerLayout.getActivity(), ironSourceBannerLayout.getSize(), jSONObject, bannerSmashListener, str, new com.json.adapters.ironsource.LoadAdData(jSONObject2));
        } else {
            bannerSmashListener.onBannerAdLoadFailed(com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - banner is null"));
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForDemandOnlyForBidding(org.json.JSONObject jSONObject, java.lang.String str, com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, com.json.mediationsdk.sdk.BannerSmashListener bannerSmashListener) {
        if (iSDemandOnlyBannerLayout != null) {
            loadBannerInternal(iSDemandOnlyBannerLayout.getActivity(), iSDemandOnlyBannerLayout.getSize(), jSONObject, bannerSmashListener, str, new com.json.adapters.ironsource.LoadAdData());
        } else {
            bannerSmashListener.onBannerAdLoadFailed(com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - banner is null"));
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitial(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.json.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            loadInterstitialAdInternal(demandSourceName, null, jSONObject, new com.json.adapters.ironsource.LoadAdData(jSONObject2), interstitialSmashListener);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.ADAPTER_API.error("exception " + e.getMessage());
            interstitialSmashListener.onInterstitialAdLoadFailed(new com.json.mediationsdk.logger.IronSourceError(1000, e.getMessage()));
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str, com.json.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            loadInterstitialAdInternal(demandSourceName, str, jSONObject, new com.json.adapters.ironsource.LoadAdData(jSONObject2), interstitialSmashListener);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.ADAPTER_API.error("for bidding exception " + e.getMessage());
            interstitialSmashListener.onInterstitialAdLoadFailed(new com.json.mediationsdk.logger.IronSourceError(1000, e.getMessage()));
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.json.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            loadRewardedVideoAdInternal(jSONObject, demandSourceName, null, new com.json.adapters.ironsource.LoadAdData(jSONObject2), rewardedVideoSmashListener);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.ADAPTER_API.error("exception " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            rewardedVideoSmashListener.onRewardedVideoLoadFailed(new com.json.mediationsdk.logger.IronSourceError(1002, e.getMessage()));
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str, com.json.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            loadRewardedVideoAdInternal(jSONObject, demandSourceName, str, new com.json.adapters.ironsource.LoadAdData(jSONObject2), rewardedVideoSmashListener);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.ADAPTER_API.error("exception " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            rewardedVideoSmashListener.onRewardedVideoLoadFailed(new com.json.mediationsdk.logger.IronSourceError(1002, e.getMessage()));
        }
    }

    @Override // com.ironsource.environment.ContextProvider.a
    public void onPause(android.app.Activity activity) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("IronSourceNetwork.onPause");
        com.json.sdk.IronSourceNetwork.onPause(activity);
    }

    @Override // com.ironsource.environment.ContextProvider.a
    public void onResume(android.app.Activity activity) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("IronSourceNetwork.onResume");
        com.json.sdk.IronSourceNetwork.onResume(activity);
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    protected void setConsent(boolean z) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("(" + (z ? com.json.mediationsdk.metadata.a.g : "false") + ")");
        this.mNetworkGlobalDataWriter.a(z);
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    protected void setMetaData(java.lang.String str, java.util.List<java.lang.String> list) {
        if (list.isEmpty()) {
            return;
        }
        mBaseAdPlayerExtraParams.b(str, list.get(0));
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(org.json.JSONObject jSONObject, com.json.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            showAdInternal(this.mDemandSourceToISAd.get(demandSourceName), com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.ADAPTER_API.error("exception " + e.getMessage());
            interstitialSmashListener.onInterstitialAdShowFailed(new com.json.mediationsdk.logger.IronSourceError(1001, e.getMessage()));
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(org.json.JSONObject jSONObject, com.json.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            showAdInternal(this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject)), com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.ADAPTER_API.error("exception " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(new com.json.mediationsdk.logger.IronSourceError(1003, e.getMessage()));
        }
    }
}
