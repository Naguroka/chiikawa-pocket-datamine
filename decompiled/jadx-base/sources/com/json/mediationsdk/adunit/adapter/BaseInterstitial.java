package com.json.mediationsdk.adunit.adapter;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseInterstitial<NetworkAdapter extends com.json.mediationsdk.adunit.adapter.BaseAdapter> extends com.json.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter<NetworkAdapter, com.json.mediationsdk.adunit.adapter.listener.InterstitialAdListener> {
    public BaseInterstitial(com.json.mediationsdk.model.NetworkSettings networkSettings) {
        super(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, networkSettings);
    }
}
