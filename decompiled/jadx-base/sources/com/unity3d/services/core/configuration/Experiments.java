package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public class Experiments extends com.unity3d.services.core.configuration.ExperimentsBase {
    private static final java.util.Set<java.lang.String> NEXT_SESSION_FLAGS = new java.util.HashSet(java.util.Collections.singletonList("tsi_prw"));
    private final org.json.JSONObject _experimentData;

    public Experiments() {
        this(null);
    }

    public Experiments(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            this._experimentData = new org.json.JSONObject();
        } else {
            this._experimentData = jSONObject;
        }
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean shouldNativeTokenAwaitPrivacy() {
        return this._experimentData.optBoolean("tsi_prw", false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebAssetAdCaching() {
        return this._experimentData.optBoolean("wac", false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebGestureNotRequired() {
        return this._experimentData.optBoolean("wgr", false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isScarInitEnabled() {
        return this._experimentData.optBoolean("scar_init", false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isScarBannerHbEnabled() {
        return this._experimentData.optBoolean("scar_bn", false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public java.lang.String getScarBiddingManager() {
        return this._experimentData.optString("scar_bm", com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType.DISABLED.getName());
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isJetpackLifecycle() {
        return this._experimentData.optBoolean("gjl", false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isOkHttpEnabled() {
        return this._experimentData.optBoolean(com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP, false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebMessageEnabled() {
        return this._experimentData.optBoolean("jwm", false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebViewAsyncDownloadEnabled() {
        return this._experimentData.optBoolean("wad", false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isNativeShowTimeoutDisabled() {
        return this._experimentData.optBoolean("nstd", false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isNativeLoadTimeoutDisabled() {
        return this._experimentData.optBoolean("nltd", false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isCaptureHDRCapabilitiesEnabled() {
        return this._experimentData.optBoolean("hdrc", false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isPCCheckEnabled() {
        return this._experimentData.optBoolean("pc_check", false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isBoldSdkNextSessionEnabled() {
        return this._experimentData.optBoolean(com.unity3d.services.core.configuration.ExperimentsBase.EXP_TAG_IS_BOLD_NEXT_SESSION, false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public org.json.JSONObject getExperimentsAsJson() {
        return this._experimentData;
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public java.util.Map<java.lang.String, java.lang.String> getExperimentTags() {
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator<java.lang.String> itKeys = this._experimentData.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            map.put(next, java.lang.String.valueOf(this._experimentData.opt(next)));
        }
        return map;
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public org.json.JSONObject getNextSessionExperiments() {
        if (this._experimentData == null) {
            return null;
        }
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator<java.lang.String> itKeys = this._experimentData.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            if (NEXT_SESSION_FLAGS.contains(next)) {
                map.put(next, java.lang.String.valueOf(this._experimentData.optBoolean(next)));
            }
        }
        return new org.json.JSONObject(map);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public org.json.JSONObject getCurrentSessionExperiments() {
        if (this._experimentData == null) {
            return null;
        }
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator<java.lang.String> itKeys = this._experimentData.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            if (!NEXT_SESSION_FLAGS.contains(next)) {
                map.put(next, java.lang.String.valueOf(this._experimentData.optBoolean(next)));
            }
        }
        return new org.json.JSONObject(map);
    }
}
