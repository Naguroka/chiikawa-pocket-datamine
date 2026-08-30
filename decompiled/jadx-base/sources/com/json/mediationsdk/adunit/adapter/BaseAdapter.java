package com.json.mediationsdk.adunit.adapter;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseAdapter implements com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, com.json.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface, com.json.mediationsdk.adunit.adapter.internal.AdapterConsentInterface, com.json.mediationsdk.adunit.adapter.AdapterDebugInterface, com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface, com.json.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface {
    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public com.json.mediationsdk.LoadWhileShowSupportState getBannerLoadWhileShowSupportedState(com.json.mediationsdk.model.NetworkSettings networkSettings) {
        return com.json.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public com.json.mediationsdk.LoadWhileShowSupportState getLoadWhileShowSupportedState(com.json.mediationsdk.model.NetworkSettings networkSettings) {
        return com.json.mediationsdk.LoadWhileShowSupportState.NONE;
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public boolean isUsingActivityBeforeImpression(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        return true;
    }

    @Override // com.json.mediationsdk.adunit.adapter.AdapterDebugInterface
    public void setAdapterDebug(boolean z) {
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterConsentInterface
    public void setConsent(boolean z) {
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    public void setMetaData(java.lang.String str, java.util.List<java.lang.String> list) {
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface
    public void setNetworkData(com.json.mediationsdk.AdapterNetworkData adapterNetworkData) {
    }
}
