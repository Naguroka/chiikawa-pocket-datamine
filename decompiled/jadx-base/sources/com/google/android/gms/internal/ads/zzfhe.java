package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfhe implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfhh zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgw zzb;
    final /* synthetic */ boolean zzc;

    zzfhe(com.google.android.gms.internal.ads.zzfhh zzfhhVar, com.google.android.gms.internal.ads.zzfgw zzfgwVar, boolean z) {
        this.zza = zzfhhVar;
        this.zzb = zzfgwVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzfgw zzfgwVar = this.zzb;
        if (zzfgwVar.zzk()) {
            com.google.android.gms.internal.ads.zzfhh zzfhhVar = this.zza;
            zzfgwVar.zzh(th);
            zzfgwVar.zzg(false);
            zzfhhVar.zza(zzfgwVar);
            if (this.zzc) {
                this.zza.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzfgw zzfgwVar = this.zzb;
        zzfgwVar.zzg(true);
        this.zza.zza(zzfgwVar);
        if (this.zzc) {
            this.zza.zzh();
        }
    }
}
