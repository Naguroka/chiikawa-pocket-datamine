package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbtw extends com.google.android.gms.internal.ads.zzbts {
    final /* synthetic */ com.google.android.gms.ads.query.UpdateImpressionUrlsCallback zza;

    zzbtw(com.google.android.gms.internal.ads.zzbub zzbubVar, com.google.android.gms.ads.query.UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zze(java.lang.String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zzf(java.util.List list) {
        this.zza.onSuccess(list);
    }
}
