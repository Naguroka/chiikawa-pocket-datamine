package com.json.mediationsdk.adunit.adapter.internal;

/* JADX INFO: loaded from: classes5.dex */
public interface AdapterAdFullScreenInterface<Listener extends com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> {
    void disposeAd(com.json.mediationsdk.adunit.adapter.utility.AdData adData);

    boolean isAdAvailable(com.json.mediationsdk.adunit.adapter.utility.AdData adData);

    void loadAd(com.json.mediationsdk.adunit.adapter.utility.AdData adData, android.app.Activity activity, Listener listener);

    void showAd(com.json.mediationsdk.adunit.adapter.utility.AdData adData, Listener listener);
}
