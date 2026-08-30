package com.json.mediationsdk.adunit.adapter.internal;

/* JADX INFO: loaded from: classes5.dex */
public interface AdapterBaseInterface {
    java.lang.String getAdapterVersion();

    java.lang.String getNetworkSDKVersion();

    void init(com.json.mediationsdk.adunit.adapter.utility.AdData adData, android.content.Context context, com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener networkInitializationListener);
}
