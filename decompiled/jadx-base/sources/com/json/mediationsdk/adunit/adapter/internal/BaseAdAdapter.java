package com.json.mediationsdk.adunit.adapter.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseAdAdapter<NetworkAdapter extends com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, Listener> {
    private final com.ironsource.mediationsdk.IronSource.AD_UNIT mAdUnit;
    protected final java.util.UUID mAdUnitObjectId;
    protected final com.json.mediationsdk.model.NetworkSettings mNetworkSettings;

    public BaseAdAdapter(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, com.json.mediationsdk.model.NetworkSettings networkSettings) {
        this(ad_unit, networkSettings, null);
    }

    public BaseAdAdapter(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, com.json.mediationsdk.model.NetworkSettings networkSettings, java.util.UUID uuid) {
        this.mAdUnit = ad_unit;
        this.mNetworkSettings = networkSettings;
        this.mAdUnitObjectId = uuid;
    }

    public NetworkAdapter getNetworkAdapter() {
        NetworkAdapter networkadapter = (NetworkAdapter) com.json.mediationsdk.c.b().b(this.mNetworkSettings, this.mAdUnit, this.mAdUnitObjectId);
        if (networkadapter != null) {
            return networkadapter;
        }
        return null;
    }

    protected com.json.mediationsdk.model.NetworkSettings getNetworkSettings() {
        return this.mNetworkSettings;
    }

    public void releaseMemory() {
    }
}
