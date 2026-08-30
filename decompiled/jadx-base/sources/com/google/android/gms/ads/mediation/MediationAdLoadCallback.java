package com.google.android.gms.ads.mediation;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public interface MediationAdLoadCallback<MediationAdT, MediationAdCallbackT> {
    void onFailure(com.google.android.gms.ads.AdError adError);

    @java.lang.Deprecated
    void onFailure(java.lang.String str);

    MediationAdCallbackT onSuccess(MediationAdT mediationadt);
}
