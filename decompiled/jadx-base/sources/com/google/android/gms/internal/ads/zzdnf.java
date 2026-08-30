package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdnf implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfbo zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfbr zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcmk zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdnl zzd;

    zzdnf(com.google.android.gms.internal.ads.zzdnl zzdnlVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfbr zzfbrVar, com.google.android.gms.internal.ads.zzcmk zzcmkVar) {
        this.zza = zzfboVar;
        this.zzb = zzfbrVar;
        this.zzc = zzcmkVar;
        this.zzd = zzdnlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) obj;
        zzcexVar.zzW(this.zza, this.zzb);
        com.google.android.gms.internal.ads.zzcgp zzcgpVarZzN = zzcexVar.zzN();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjX)).booleanValue() && zzcgpVarZzN != null) {
            com.google.android.gms.internal.ads.zzcmk zzcmkVar = this.zzc;
            com.google.android.gms.internal.ads.zzdnl zzdnlVar = this.zzd;
            zzcgpVarZzN.zzK(zzcmkVar, zzdnlVar.zzi, zzdnlVar.zzj);
            com.google.android.gms.internal.ads.zzcmk zzcmkVar2 = this.zzc;
            com.google.android.gms.internal.ads.zzdnl zzdnlVar2 = this.zzd;
            zzcgpVarZzN.zzM(zzcmkVar2, zzdnlVar2.zzi, zzdnlVar2.zzd);
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmQ)).booleanValue() || zzcgpVarZzN == null) {
            return;
        }
        zzcgpVarZzN.zzN(this.zza);
    }
}
