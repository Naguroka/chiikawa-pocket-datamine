package com.json.mediationsdk.adunit.adapter.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseAdInteractionAdapter<NetworkAdapter extends com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, Listener extends com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener> extends com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<NetworkAdapter, Listener> implements com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<Listener> {
    public BaseAdInteractionAdapter(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, com.json.mediationsdk.model.NetworkSettings networkSettings) {
        super(ad_unit, networkSettings);
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void disposeAd(com.json.mediationsdk.adunit.adapter.utility.AdData adData) {
    }
}
