package com.google.android.gms.ads.mediation.customevent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public interface CustomEventListener {
    void onAdClicked();

    void onAdClosed();

    @java.lang.Deprecated
    void onAdFailedToLoad(int i);

    void onAdFailedToLoad(com.google.android.gms.ads.AdError adError);

    void onAdLeftApplication();

    void onAdOpened();
}
