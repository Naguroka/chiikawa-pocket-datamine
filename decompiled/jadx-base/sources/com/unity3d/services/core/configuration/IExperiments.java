package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public interface IExperiments {
    org.json.JSONObject getCurrentSessionExperiments();

    java.util.Map<java.lang.String, java.lang.String> getExperimentTags();

    org.json.JSONObject getExperimentsAsJson();

    org.json.JSONObject getNextSessionExperiments();

    java.lang.String getScarBiddingManager();

    boolean isBoldSdkNextSessionEnabled();

    boolean isCaptureHDRCapabilitiesEnabled();

    boolean isJetpackLifecycle();

    boolean isNativeLoadTimeoutDisabled();

    boolean isNativeShowTimeoutDisabled();

    boolean isOkHttpEnabled();

    boolean isPCCheckEnabled();

    boolean isScarBannerHbEnabled();

    boolean isScarInitEnabled();

    boolean isWebAssetAdCaching();

    boolean isWebGestureNotRequired();

    boolean isWebMessageEnabled();

    boolean isWebViewAsyncDownloadEnabled();

    boolean shouldNativeTokenAwaitPrivacy();
}
