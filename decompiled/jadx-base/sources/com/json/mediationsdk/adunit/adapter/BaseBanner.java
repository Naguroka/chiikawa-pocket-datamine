package com.json.mediationsdk.adunit.adapter;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseBanner<NetworkAdapter extends com.json.mediationsdk.adunit.adapter.BaseAdapter> extends com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<NetworkAdapter, com.json.mediationsdk.adunit.adapter.listener.BannerAdListener> implements com.json.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<com.json.mediationsdk.adunit.adapter.listener.BannerAdListener> {
    public BaseBanner(com.json.mediationsdk.model.NetworkSettings networkSettings) {
        super(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, networkSettings);
    }
}
