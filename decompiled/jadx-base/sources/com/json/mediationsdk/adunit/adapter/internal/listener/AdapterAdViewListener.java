package com.json.mediationsdk.adunit.adapter.internal.listener;

/* JADX INFO: loaded from: classes5.dex */
public interface AdapterAdViewListener extends com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener {
    void onAdLeftApplication();

    void onAdLoadSuccess(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams);

    void onAdScreenDismissed();

    void onAdScreenPresented();
}
