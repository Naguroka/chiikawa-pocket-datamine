package com.facebook.ads.internal.api;

/* JADX INFO: loaded from: classes4.dex */
public class InitSettingsBuilder implements com.facebook.ads.AudienceNetworkAds.InitSettingsBuilder {
    public static final java.lang.String PLACEMENTS_KEY = "PLACEMENTS_KEY";
    private final android.content.Context mContext;
    private final com.facebook.ads.internal.settings.MultithreadedBundleWrapper mInitSettings = new com.facebook.ads.internal.settings.MultithreadedBundleWrapper();
    private com.facebook.ads.AudienceNetworkAds.InitListener mInitializationListener;

    @Override // com.facebook.ads.AudienceNetworkAds.InitSettingsBuilder
    public /* bridge */ /* synthetic */ com.facebook.ads.AudienceNetworkAds.InitSettingsBuilder withPlacementIds(java.util.List list) {
        return withPlacementIds((java.util.List<java.lang.String>) list);
    }

    public InitSettingsBuilder(android.content.Context context) {
        this.mContext = context;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitSettingsBuilder
    public com.facebook.ads.internal.api.InitSettingsBuilder withPlacementIds(java.util.List<java.lang.String> list) {
        this.mInitSettings.putStringArrayList(PLACEMENTS_KEY, new java.util.ArrayList<>(list));
        return this;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitSettingsBuilder
    public com.facebook.ads.internal.api.InitSettingsBuilder withMediationService(java.lang.String str) {
        com.facebook.ads.AdSettings.setMediationService(str);
        return this;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitSettingsBuilder
    public com.facebook.ads.internal.api.InitSettingsBuilder withInitListener(com.facebook.ads.AudienceNetworkAds.InitListener initListener) {
        this.mInitializationListener = initListener;
        return this;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitSettingsBuilder
    public void initialize() {
        com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.initialize(this.mContext, this.mInitSettings, this.mInitializationListener, false);
    }
}
