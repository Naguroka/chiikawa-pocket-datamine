package com.json.mediationsdk.adunit.adapter.internal;

/* JADX INFO: loaded from: classes5.dex */
public interface AdapterBannerInterface<Listener extends com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> {
    void destroyAd(com.json.mediationsdk.adunit.adapter.utility.AdData adData);

    void loadAd(com.json.mediationsdk.adunit.adapter.utility.AdData adData, android.app.Activity activity, com.json.mediationsdk.ISBannerSize iSBannerSize, Listener listener);
}
