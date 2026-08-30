package com.facebook.ads.internal.api;

/* JADX INFO: loaded from: classes4.dex */
public interface AdViewApi extends com.facebook.ads.internal.api.AdViewParentApi, com.facebook.ads.Ad {
    com.facebook.ads.AdView.AdViewLoadConfigBuilder buildLoadAdConfig();

    void loadAd(com.facebook.ads.AdView.AdViewLoadConfig adViewLoadConfig);

    @Override // com.facebook.ads.internal.api.AdViewParentApi
    void onConfigurationChanged(android.content.res.Configuration configuration);

    @Override // com.facebook.ads.Ad
    @java.lang.Deprecated
    void setExtraHints(com.facebook.ads.ExtraHints extraHints);
}
