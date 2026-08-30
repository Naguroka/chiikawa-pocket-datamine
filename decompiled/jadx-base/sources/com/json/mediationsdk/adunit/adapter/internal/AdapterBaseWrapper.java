package com.json.mediationsdk.adunit.adapter.internal;

/* JADX INFO: loaded from: classes5.dex */
public class AdapterBaseWrapper {
    com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface;
    com.json.mediationsdk.model.NetworkSettings settings;

    public AdapterBaseWrapper(com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface, com.json.mediationsdk.model.NetworkSettings networkSettings) {
        this.adapterBaseInterface = adapterBaseInterface;
        this.settings = networkSettings;
    }

    public com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface getAdapterBaseInterface() {
        return this.adapterBaseInterface;
    }

    public com.json.mediationsdk.model.NetworkSettings getSettings() {
        return this.settings;
    }
}
