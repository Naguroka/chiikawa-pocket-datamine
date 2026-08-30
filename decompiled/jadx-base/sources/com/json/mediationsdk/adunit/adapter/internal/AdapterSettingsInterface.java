package com.json.mediationsdk.adunit.adapter.internal;

/* JADX INFO: loaded from: classes5.dex */
public interface AdapterSettingsInterface {
    com.json.mediationsdk.LoadWhileShowSupportState getBannerLoadWhileShowSupportedState(com.json.mediationsdk.model.NetworkSettings networkSettings);

    com.json.mediationsdk.LoadWhileShowSupportState getLoadWhileShowSupportedState(com.json.mediationsdk.model.NetworkSettings networkSettings);

    boolean isUsingActivityBeforeImpression(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit);
}
