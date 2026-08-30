package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfeo implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfer zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfes zzb;

    zzfeo(com.google.android.gms.internal.ads.zzfes zzfesVar, com.google.android.gms.internal.ads.zzfer zzferVar) {
        this.zza = zzferVar;
        this.zzb = zzfesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
            this.zzb.zzd.addFirst(this.zza);
            com.google.android.gms.internal.ads.zzfes zzfesVar = this.zzb;
            if (zzfesVar.zzf == 1) {
                zzfesVar.zzh();
            }
        }
    }
}
