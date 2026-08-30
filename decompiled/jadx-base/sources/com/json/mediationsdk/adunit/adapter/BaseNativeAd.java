package com.json.mediationsdk.adunit.adapter;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseNativeAd<NetworkAdapter extends com.json.mediationsdk.adunit.adapter.BaseAdapter> extends com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<NetworkAdapter, com.json.mediationsdk.adunit.adapter.listener.NativeAdListener> implements com.json.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.json.mediationsdk.adunit.adapter.listener.NativeAdListener> {
    public BaseNativeAd(com.json.mediationsdk.model.NetworkSettings networkSettings) {
        super(com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD, networkSettings);
    }
}
