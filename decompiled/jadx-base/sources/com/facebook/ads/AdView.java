package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public class AdView extends android.widget.RelativeLayout implements com.facebook.ads.Ad {
    private final com.facebook.ads.internal.api.AdViewApi mAdViewApi;
    private final com.facebook.ads.internal.api.AdViewParentApi mAdViewParentApi;

    public interface AdViewLoadConfig extends com.facebook.ads.Ad.LoadAdConfig {
    }

    public interface AdViewLoadConfigBuilder extends com.facebook.ads.Ad.LoadConfigBuilder {
        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        com.facebook.ads.AdView.AdViewLoadConfig build();

        com.facebook.ads.AdView.AdViewLoadConfigBuilder withAdListener(com.facebook.ads.AdListener adListener);

        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        com.facebook.ads.AdView.AdViewLoadConfigBuilder withBid(java.lang.String str);
    }

    public AdView(android.content.Context context, java.lang.String str, com.facebook.ads.AdSize adSize) {
        super(context);
        com.facebook.ads.internal.api.AdViewParentApi adViewParentApi = new com.facebook.ads.internal.api.AdViewParentApi() { // from class: com.facebook.ads.AdView.1
            @Override // com.facebook.ads.internal.api.AdViewParentApi
            public void onConfigurationChanged(android.content.res.Configuration configuration) {
                com.facebook.ads.AdView.super.onConfigurationChanged(configuration);
            }
        };
        this.mAdViewParentApi = adViewParentApi;
        this.mAdViewApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createAdViewApi(context, str, adSize, adViewParentApi, this);
    }

    public AdView(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        super(context);
        com.facebook.ads.internal.api.AdViewParentApi adViewParentApi = new com.facebook.ads.internal.api.AdViewParentApi() { // from class: com.facebook.ads.AdView.1
            @Override // com.facebook.ads.internal.api.AdViewParentApi
            public void onConfigurationChanged(android.content.res.Configuration configuration) {
                com.facebook.ads.AdView.super.onConfigurationChanged(configuration);
            }
        };
        this.mAdViewParentApi = adViewParentApi;
        this.mAdViewApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createAdViewApi(context, str, str2, adViewParentApi, this);
    }

    @Override // com.facebook.ads.Ad
    public void loadAd() {
        this.mAdViewApi.loadAd();
    }

    public void loadAd(com.facebook.ads.AdView.AdViewLoadConfig adViewLoadConfig) {
        this.mAdViewApi.loadAd(adViewLoadConfig);
    }

    @Override // com.facebook.ads.Ad
    public boolean isAdInvalidated() {
        return this.mAdViewApi.isAdInvalidated();
    }

    @Override // com.facebook.ads.Ad
    @java.lang.Deprecated
    public void setExtraHints(com.facebook.ads.ExtraHints extraHints) {
        this.mAdViewApi.setExtraHints(extraHints);
    }

    @Override // com.facebook.ads.Ad
    public void destroy() {
        this.mAdViewApi.destroy();
    }

    @Override // com.facebook.ads.Ad
    public java.lang.String getPlacementId() {
        return this.mAdViewApi.getPlacementId();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.mAdViewApi.onConfigurationChanged(configuration);
    }

    public com.facebook.ads.AdView.AdViewLoadConfigBuilder buildLoadAdConfig() {
        return this.mAdViewApi.buildLoadAdConfig();
    }
}
