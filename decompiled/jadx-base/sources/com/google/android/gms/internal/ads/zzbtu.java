package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbtu extends com.google.android.gms.internal.ads.zzbyq {
    final /* synthetic */ com.google.android.gms.ads.query.QueryInfoGenerationCallback zza;

    zzbtu(com.google.android.gms.internal.ads.zzbtv zzbtvVar, com.google.android.gms.ads.query.QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.zza = queryInfoGenerationCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzb(java.lang.String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzc(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.zza.onSuccess(new com.google.android.gms.ads.query.QueryInfo(new com.google.android.gms.ads.internal.client.zzfa(str, bundle, str2)));
    }
}
