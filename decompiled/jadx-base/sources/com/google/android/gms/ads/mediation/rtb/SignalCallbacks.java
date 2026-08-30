package com.google.android.gms.ads.mediation.rtb;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public interface SignalCallbacks {
    void onFailure(com.google.android.gms.ads.AdError adError);

    @java.lang.Deprecated
    void onFailure(java.lang.String str);

    void onSuccess(java.lang.String str);
}
