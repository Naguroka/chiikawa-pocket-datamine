package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzefz implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfbo zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzega zzb;

    zzefz(com.google.android.gms.internal.ads.zzega zzegaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        this.zza = zzfboVar;
        this.zzb = zzegaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zzh.zzb(th, this.zza);
            com.google.android.gms.internal.ads.zzfbo zzfboVarZza = this.zzb.zzh.zza();
            if (this.zza.zzav) {
                while (zzfboVarZza != null) {
                    this.zzb.zze(zzfboVarZza);
                    zzfboVarZza = this.zzb.zzh.zza();
                }
            } else if (zzfboVarZza != null) {
                this.zzb.zze(zzfboVarZza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzegr zzegrVar = (com.google.android.gms.internal.ads.zzegr) obj;
        synchronized (this.zzb) {
            this.zzb.zzh.zzc(zzegrVar, this.zza);
            com.google.android.gms.internal.ads.zzfbo zzfboVarZza = this.zzb.zzh.zza();
            if (zzfboVarZza != null) {
                this.zzb.zze(zzfboVarZza);
            }
        }
    }
}
