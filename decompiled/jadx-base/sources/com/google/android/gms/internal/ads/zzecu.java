package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzecu {
    private final android.content.Context zza;

    zzecu(android.content.Context context) {
        this.zza = context;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(boolean z) {
        try {
            androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest getTopicsRequestBuild = new androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest.Builder().setAdsSdkName(com.google.android.gms.ads.MobileAds.ERROR_DOMAIN).setShouldRecordObservation(z).build();
            androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures topicsManagerFuturesFrom = androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures.from(this.zza);
            return topicsManagerFuturesFrom != null ? topicsManagerFuturesFrom.getTopicsAsync(getTopicsRequestBuild) : com.google.android.gms.internal.ads.zzgch.zzg(new java.lang.IllegalStateException());
        } catch (java.lang.Exception e) {
            return com.google.android.gms.internal.ads.zzgch.zzg(e);
        }
    }
}
