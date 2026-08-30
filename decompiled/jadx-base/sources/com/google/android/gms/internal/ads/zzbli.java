package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbli implements com.google.android.gms.internal.ads.zzgbo {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbla zza;

    zzbli(com.google.android.gms.internal.ads.zzblm zzblmVar, com.google.android.gms.internal.ads.zzbla zzblaVar) {
        this.zza = zzblaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbo
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzcab zzcabVar = new com.google.android.gms.internal.ads.zzcab();
        ((com.google.android.gms.internal.ads.zzblg) obj).zze(this.zza, new com.google.android.gms.internal.ads.zzblh(this, zzcabVar));
        return zzcabVar;
    }
}
