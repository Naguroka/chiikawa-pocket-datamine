package com.google.android.gms.ads.preload;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface PreloadCallback {
    void onAdsAvailable(com.google.android.gms.ads.preload.PreloadConfiguration preloadConfiguration);

    void onAdsExhausted(com.google.android.gms.ads.preload.PreloadConfiguration preloadConfiguration);
}
