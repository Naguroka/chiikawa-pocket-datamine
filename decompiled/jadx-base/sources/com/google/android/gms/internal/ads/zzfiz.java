package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfiz implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgw zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfhh zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfja zzc;

    zzfiz(com.google.android.gms.internal.ads.zzfja zzfjaVar, com.google.android.gms.internal.ads.zzfgw zzfgwVar, com.google.android.gms.internal.ads.zzfhh zzfhhVar) {
        this.zza = zzfgwVar;
        this.zzb = zzfhhVar;
        this.zzc = zzfjaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        this.zza.zzg(false);
        com.google.android.gms.internal.ads.zzfhh zzfhhVar = this.zzb;
        if (zzfhhVar != null) {
            zzfhhVar.zza(this.zza);
            zzfhhVar.zzh();
        } else {
            this.zzc.zzf.zzb(this.zza.zzm());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        this.zza.zzg(((com.google.android.gms.ads.internal.util.client.zzt) obj) == com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
        com.google.android.gms.internal.ads.zzfhh zzfhhVar = this.zzb;
        if (zzfhhVar == null) {
            this.zzc.zzf.zzb(this.zza.zzm());
        } else {
            zzfhhVar.zza(this.zza);
            zzfhhVar.zzh();
        }
    }
}
