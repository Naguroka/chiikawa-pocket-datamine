package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public class ExperimentObjects extends com.unity3d.services.core.configuration.ExperimentsBase {
    private final java.util.Map<java.lang.String, com.unity3d.services.core.configuration.ExperimentObject> _experimentObjects = new java.util.HashMap();
    private final org.json.JSONObject _experimentObjetsData;

    public ExperimentObjects(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this._experimentObjetsData = jSONObject;
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                this._experimentObjects.put(next, new com.unity3d.services.core.configuration.ExperimentObject(jSONObject.optJSONObject(next)));
            }
            return;
        }
        this._experimentObjetsData = new org.json.JSONObject();
    }

    public com.unity3d.services.core.configuration.ExperimentObject getExperimentObject(java.lang.String str) {
        return this._experimentObjects.get(str);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean shouldNativeTokenAwaitPrivacy() {
        return getExperimentValueOrDefault("tsi_prw");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebAssetAdCaching() {
        return getExperimentValueOrDefault("wac");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebGestureNotRequired() {
        return getExperimentValueOrDefault("wgr");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isScarInitEnabled() {
        return getExperimentValueOrDefault("scar_init");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isJetpackLifecycle() {
        return getExperimentValueOrDefault("gjl");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isOkHttpEnabled() {
        return getExperimentValueOrDefault(com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebMessageEnabled() {
        return getExperimentValueOrDefault("jwm");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebViewAsyncDownloadEnabled() {
        return getExperimentValueOrDefault("wad");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isNativeShowTimeoutDisabled() {
        return getExperimentValueOrDefault("nstd");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isNativeLoadTimeoutDisabled() {
        return getExperimentValueOrDefault("nltd");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isCaptureHDRCapabilitiesEnabled() {
        return getExperimentValueOrDefault("hdrc");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isScarBannerHbEnabled() {
        return getExperimentValueOrDefault("scar_bn");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public java.lang.String getScarBiddingManager() {
        return getExperimentValue("scar_bm", com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType.DISABLED.getName());
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isPCCheckEnabled() {
        return getExperimentValueOrDefault("pc_check");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isBoldSdkNextSessionEnabled() {
        return getExperimentValueOrDefault(com.unity3d.services.core.configuration.ExperimentsBase.EXP_TAG_IS_BOLD_NEXT_SESSION);
    }

    private java.lang.String getExperimentValue(java.lang.String str, java.lang.String str2) {
        com.unity3d.services.core.configuration.ExperimentObject experimentObject = getExperimentObject(str);
        return experimentObject != null ? experimentObject.getStringValue() : str2;
    }

    private boolean getExperimentValue(java.lang.String str, boolean z) {
        com.unity3d.services.core.configuration.ExperimentObject experimentObject = getExperimentObject(str);
        return experimentObject != null ? experimentObject.getBooleanValue() : z;
    }

    private boolean getExperimentValueOrDefault(java.lang.String str) {
        return getExperimentValue(str, false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public org.json.JSONObject getExperimentsAsJson() {
        return this._experimentObjetsData;
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public java.util.Map<java.lang.String, java.lang.String> getExperimentTags() {
        java.util.HashMap map = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, com.unity3d.services.core.configuration.ExperimentObject> entry : this._experimentObjects.entrySet()) {
            map.put(entry.getKey(), entry.getValue().getStringValue());
        }
        return map;
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public org.json.JSONObject getCurrentSessionExperiments() {
        return getExperimentWithAppliedRule(com.unity3d.services.core.configuration.ExperimentAppliedRule.IMMEDIATE);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public org.json.JSONObject getNextSessionExperiments() {
        return getExperimentWithAppliedRule(com.unity3d.services.core.configuration.ExperimentAppliedRule.NEXT);
    }

    private org.json.JSONObject getExperimentWithAppliedRule(com.unity3d.services.core.configuration.ExperimentAppliedRule experimentAppliedRule) {
        java.util.HashMap map = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, com.unity3d.services.core.configuration.ExperimentObject> entry : this._experimentObjects.entrySet()) {
            if (entry.getValue().getAppliedRule() == experimentAppliedRule) {
                map.put(entry.getKey(), entry.getValue().getStringValue());
            }
        }
        return new org.json.JSONObject(map);
    }
}
