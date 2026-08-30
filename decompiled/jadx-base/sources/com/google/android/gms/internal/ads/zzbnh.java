package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbnh implements com.google.android.gms.internal.ads.zzcaf {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbnr zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgw zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbns zzc;

    zzbnh(com.google.android.gms.internal.ads.zzbns zzbnsVar, com.google.android.gms.internal.ads.zzbnr zzbnrVar, com.google.android.gms.internal.ads.zzfgw zzfgwVar) {
        this.zza = zzbnrVar;
        this.zzb = zzfgwVar;
        this.zzc = zzbnsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        synchronized (this.zzc.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
            this.zzc.zzi = 0;
            com.google.android.gms.internal.ads.zzbns zzbnsVar = this.zzc;
            if (zzbnsVar.zzh != null && this.zza != zzbnsVar.zzh) {
                com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                this.zzc.zzh.zzb();
            }
            this.zzc.zzh = this.zza;
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzd.zze()).booleanValue()) {
                com.google.android.gms.internal.ads.zzbns zzbnsVar2 = this.zzc;
                if (zzbnsVar2.zze != null) {
                    com.google.android.gms.internal.ads.zzfhk zzfhkVar = zzbnsVar2.zze;
                    com.google.android.gms.internal.ads.zzfgw zzfgwVar = this.zzb;
                    zzfgwVar.zzg(true);
                    zzfhkVar.zzb(zzfgwVar.zzm());
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
