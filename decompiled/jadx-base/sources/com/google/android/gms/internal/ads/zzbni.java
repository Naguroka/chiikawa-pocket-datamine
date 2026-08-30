package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbni implements com.google.android.gms.internal.ads.zzcad {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbnr zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgw zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbns zzc;

    zzbni(com.google.android.gms.internal.ads.zzbns zzbnsVar, com.google.android.gms.internal.ads.zzbnr zzbnrVar, com.google.android.gms.internal.ads.zzfgw zzfgwVar) {
        this.zza = zzbnrVar;
        this.zzb = zzfgwVar;
        this.zzc = zzbnsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcad
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        synchronized (this.zzc.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
            this.zzc.zzi = 1;
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzd.zze()).booleanValue()) {
                com.google.android.gms.internal.ads.zzbns zzbnsVar = this.zzc;
                if (zzbnsVar.zze != null) {
                    com.google.android.gms.internal.ads.zzfhk zzfhkVar = zzbnsVar.zze;
                    com.google.android.gms.internal.ads.zzfgw zzfgwVar = this.zzb;
                    zzfgwVar.zzc("Failed loading new engine");
                    zzfgwVar.zzg(false);
                    zzfhkVar.zzb(zzfgwVar.zzm());
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}
