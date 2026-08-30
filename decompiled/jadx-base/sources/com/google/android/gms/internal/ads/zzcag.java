package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcag implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcai zza;

    zzcag(com.google.android.gms.internal.ads.zzcai zzcaiVar) {
        this.zza = zzcaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        this.zza.zzb.set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(java.lang.Object obj) {
        this.zza.zzb.set(1);
    }
}
