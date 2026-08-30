package com.unity3d.scar.adapter.common;

/* JADX INFO: loaded from: classes6.dex */
public interface IScarInterstitialAdListenerWrapper extends com.unity3d.scar.adapter.common.IScarAdListenerWrapper {
    void onAdFailedToShow(int i, java.lang.String str);

    void onAdImpression();

    void onAdLeftApplication();

    void onAdSkipped();
}
