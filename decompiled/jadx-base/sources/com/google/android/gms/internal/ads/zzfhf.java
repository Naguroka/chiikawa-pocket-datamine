package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfhf implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfhh zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgw zzb;

    zzfhf(com.google.android.gms.internal.ads.zzfhh zzfhhVar, com.google.android.gms.internal.ads.zzfgw zzfgwVar) {
        this.zza = zzfhhVar;
        this.zzb = zzfgwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzfgw zzfgwVar = this.zzb;
        zzfgwVar.zzh(th);
        zzfgwVar.zzg(false);
        this.zza.zza(zzfgwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(java.lang.Object obj) {
    }
}
