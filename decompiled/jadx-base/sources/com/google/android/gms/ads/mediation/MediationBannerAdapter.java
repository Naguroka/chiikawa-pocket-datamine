package com.google.android.gms.ads.mediation;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public interface MediationBannerAdapter extends com.google.android.gms.ads.mediation.MediationAdapter {
    android.view.View getBannerView();

    void requestBannerAd(android.content.Context context, com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener, android.os.Bundle bundle, com.google.android.gms.ads.AdSize adSize, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, android.os.Bundle bundle2);
}
