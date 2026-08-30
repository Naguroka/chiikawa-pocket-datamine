package com.json.mediationsdk.adunit.adapter.internal.listener;

/* JADX INFO: loaded from: classes5.dex */
public interface AdapterAdListener {
    void onAdClicked();

    void onAdLoadFailed(com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType, int i, java.lang.String str);

    void onAdLoadSuccess();

    void onAdOpened();
}
