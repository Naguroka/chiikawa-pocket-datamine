package com.json.mediationsdk.adunit.adapter.internal.listener;

/* JADX INFO: loaded from: classes5.dex */
public interface AdapterAdInteractionListener extends com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener {
    void onAdClosed();

    void onAdEnded();

    void onAdShowFailed(int i, java.lang.String str);

    void onAdShowSuccess();

    void onAdStarted();

    void onAdVisible();
}
