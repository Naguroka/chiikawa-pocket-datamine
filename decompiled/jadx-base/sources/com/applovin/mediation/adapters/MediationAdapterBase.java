package com.applovin.mediation.adapters;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MediationAdapterBase implements com.applovin.mediation.adapter.MaxAdapter, com.applovin.mediation.adapter.MaxNativeAdAdapter, com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter, com.applovin.mediation.adapter.MaxRewardedAdViewAdapter, com.applovin.mediation.adapter.MaxAppOpenAdapter {
    private boolean alwaysRewardUser;
    private final com.applovin.impl.sdk.n mLogger;
    private final com.applovin.impl.sdk.j mSdk;
    private final java.lang.String mTag;
    private final com.applovin.sdk.AppLovinSdk mWrappingSdk;
    private com.applovin.mediation.MaxReward reward;

    public MediationAdapterBase(com.applovin.sdk.AppLovinSdk appLovinSdk) {
        this.mWrappingSdk = appLovinSdk;
        com.applovin.impl.sdk.j jVarA = appLovinSdk.a();
        this.mSdk = jVarA;
        this.mLogger = jVarA.I();
        this.mTag = getClass().getSimpleName();
    }

    protected static java.lang.String mediationTag() {
        return "AppLovinSdk_" + com.applovin.sdk.AppLovinSdk.VERSION;
    }

    protected void checkActivities(android.content.Context context, java.lang.Class<?>... clsArr) {
    }

    protected void checkExistence(java.lang.Class<?>... clsArr) {
        if (clsArr == null || clsArr.length <= 0) {
            return;
        }
        for (java.lang.Class<?> cls : clsArr) {
            log("Found: " + cls.getName());
        }
    }

    protected void configureReward(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters) {
        android.os.Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        this.alwaysRewardUser = com.applovin.impl.sdk.utils.BundleUtils.getBoolean("always_reward_user", maxAdapterResponseParameters.isTesting(), serverParameters);
        int i = com.applovin.impl.sdk.utils.BundleUtils.getInt("amount", 0, serverParameters);
        java.lang.String string = com.applovin.impl.sdk.utils.BundleUtils.getString("currency", "", serverParameters);
        log("Creating reward: " + i + " " + string);
        this.reward = com.applovin.impl.mediation.MaxRewardImpl.create(i, string);
    }

    protected java.util.concurrent.Future<android.graphics.drawable.Drawable> createDrawableFuture(final java.lang.String str, final android.content.res.Resources resources) {
        return getCachingExecutorService().submit(new java.util.concurrent.Callable<android.graphics.drawable.Drawable>() { // from class: com.applovin.mediation.adapters.MediationAdapterBase.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public android.graphics.drawable.Drawable call() throws java.lang.Exception {
                java.io.InputStream inputStreamOpenStream = new java.net.URL(str).openStream();
                android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(resources, android.graphics.BitmapFactory.decodeStream(inputStreamOpenStream));
                inputStreamOpenStream.close();
                return bitmapDrawable;
            }
        });
    }

    protected void d(java.lang.String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.mLogger.a(this.mTag, str);
        }
    }

    protected void e(java.lang.String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.mLogger.b(this.mTag, str);
        }
    }

    protected android.content.Context getApplicationContext() {
        return com.applovin.impl.sdk.j.m();
    }

    protected java.util.concurrent.ExecutorService getCachingExecutorService() {
        return this.mSdk.i0().b();
    }

    protected com.applovin.mediation.MaxReward getReward() {
        com.applovin.mediation.MaxReward maxReward = this.reward;
        return maxReward != null ? maxReward : com.applovin.impl.mediation.MaxRewardImpl.createDefault();
    }

    java.lang.String getVersionString(java.lang.Class cls, java.lang.String str) {
        java.lang.String strB = com.applovin.impl.yp.b(cls, str);
        if (strB == null) {
            log("Failed to retrieve version string.");
        }
        return strB;
    }

    protected com.applovin.sdk.AppLovinSdk getWrappingSdk() {
        return this.mWrappingSdk;
    }

    protected void i(java.lang.String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.mLogger.d(this.mTag, str);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public boolean isBeta() {
        return false;
    }

    public void loadAppOpenAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.app.Activity activity, com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        d("This adapter (" + getAdapterVersion() + ") does not support app open ads.");
        maxAppOpenAdapterListener.onAppOpenAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void loadNativeAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.app.Activity activity, com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        d("This adapter (" + getAdapterVersion() + ") does not support native ads.");
        maxNativeAdAdapterListener.onNativeAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION);
    }

    protected void log(java.lang.String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.mLogger.d(this.mTag, str);
        }
    }

    protected boolean shouldAlwaysRewardUser() {
        return this.alwaysRewardUser;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public java.lang.Boolean shouldCollectSignalsOnUiThread() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public java.lang.Boolean shouldInitializeOnUiThread() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public java.lang.Boolean shouldLoadAdsOnUiThread(com.applovin.mediation.MaxAdFormat maxAdFormat) {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public java.lang.Boolean shouldShowAdsOnUiThread(com.applovin.mediation.MaxAdFormat maxAdFormat) {
        return null;
    }

    public void showAppOpenAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.app.Activity activity, com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        d("This adapter (" + getAdapterVersion() + ") does not support app open ads.");
        maxAppOpenAdapterListener.onAppOpenAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void showInterstitialAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle, android.app.Activity activity, com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        d("This adapter (" + getAdapterVersion() + ") does not support interstitial ad view ads.");
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void showRewardedAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle, android.app.Activity activity, com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener maxRewardedAdapterListener) {
        d("This adapter (" + getAdapterVersion() + ") does not support rewarded ad view ads.");
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION);
    }

    protected void userError(java.lang.String str) {
        userError(str, null);
    }

    protected void w(java.lang.String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.mLogger.k(this.mTag, str);
        }
    }

    protected void e(java.lang.String str, java.lang.Throwable th) {
        if (com.applovin.impl.sdk.n.a()) {
            this.mLogger.a(this.mTag, str, th);
        }
    }

    protected void log(java.lang.String str, java.lang.Throwable th) {
        if (com.applovin.impl.sdk.n.a()) {
            this.mLogger.a(this.mTag, str, th);
        }
    }

    protected void userError(java.lang.String str, java.lang.Throwable th) {
        com.applovin.impl.sdk.n.c(this.mTag, str, th);
    }
}
