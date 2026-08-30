package com.unity3d.scar.adapter.common;

/* JADX INFO: loaded from: classes6.dex */
public interface IScarAdListenerWrapper {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(int i, java.lang.String str);

    void onAdLoaded();

    void onAdOpened();
}
