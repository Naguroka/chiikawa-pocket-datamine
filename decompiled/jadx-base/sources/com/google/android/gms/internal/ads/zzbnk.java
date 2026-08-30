package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbnk implements com.google.android.gms.internal.ads.zzcaf {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbnm zza;

    zzbnk(com.google.android.gms.internal.ads.zzbnm zzbnmVar) {
        this.zza = zzbnmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        this.zza.zzb.zzd();
    }
}
