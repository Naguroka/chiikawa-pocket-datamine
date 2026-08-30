package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcmv implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcmw zzb;

    zzcmv(com.google.android.gms.internal.ads.zzcmw zzcmwVar, java.lang.String str) {
        this.zza = str;
        this.zzb = zzcmwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzcmw zzcmwVar = this.zzb;
        zzcmwVar.zzh.zza(zzcmwVar.zzg.zzd(zzcmwVar.zze, zzcmwVar.zzf, false, this.zza, null, zzcmwVar.zzu()));
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcmw zzcmwVar = this.zzb;
        zzcmwVar.zzh.zza(zzcmwVar.zzg.zzd(zzcmwVar.zze, zzcmwVar.zzf, false, this.zza, (java.lang.String) obj, zzcmwVar.zzu()));
    }
}
