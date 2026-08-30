package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzewt implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzelc zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfhh zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgw zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzewu zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzeww zze;

    zzewt(com.google.android.gms.internal.ads.zzeww zzewwVar, com.google.android.gms.internal.ads.zzelc zzelcVar, com.google.android.gms.internal.ads.zzfhh zzfhhVar, com.google.android.gms.internal.ads.zzfgw zzfgwVar, com.google.android.gms.internal.ads.zzewu zzewuVar) {
        this.zza = zzelcVar;
        this.zzb = zzfhhVar;
        this.zzc = zzfgwVar;
        this.zzd = zzewuVar;
        this.zze = zzewwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzfhh zzfhhVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfG)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th);
        }
        com.google.android.gms.internal.ads.zzcnw zzcnwVar = (com.google.android.gms.internal.ads.zzcnw) this.zze.zze.zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzcnwVar == null ? com.google.android.gms.internal.ads.zzfdk.zzb(th, null) : zzcnwVar.zzb().zza(th);
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcnwVar != null) {
                zzcnwVar.zzc().zzdz(zzeVarZzb);
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzia)).booleanValue()) {
                    this.zze.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzews
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zzd.zzdz(zzeVarZzb);
                        }
                    });
                }
            } else {
                this.zze.zzd.zzdz(zzeVarZzb);
                ((com.google.android.gms.internal.ads.zzcnw) this.zze.zzm(this.zzd).zzh()).zzb().zzc().zzh();
            }
            com.google.android.gms.internal.ads.zzfdg.zzb(zzeVarZzb.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue() || (zzfhhVar = this.zzb) == null) {
                com.google.android.gms.internal.ads.zzfhk zzfhkVar = this.zze.zzh;
                com.google.android.gms.internal.ads.zzfgw zzfgwVar = this.zzc;
                zzfgwVar.zza(zzeVarZzb);
                zzfgwVar.zzh(th);
                zzfgwVar.zzg(false);
                zzfhkVar.zzb(zzfgwVar.zzm());
            } else {
                zzfhhVar.zzc(zzeVarZzb);
                com.google.android.gms.internal.ads.zzfgw zzfgwVar2 = this.zzc;
                zzfgwVar2.zzh(th);
                zzfgwVar2.zzg(false);
                zzfhhVar.zza(zzfgwVar2);
                zzfhhVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzfhh zzfhhVar;
        com.google.android.gms.internal.ads.zzcqz zzcqzVar = (com.google.android.gms.internal.ads.zzcqz) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzia)).booleanValue()) {
                zzcqzVar.zzo().zzb(this.zze.zzd);
            }
            this.zza.zzb(zzcqzVar);
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue() || (zzfhhVar = this.zzb) == null) {
                com.google.android.gms.internal.ads.zzfhk zzfhkVar = this.zze.zzh;
                com.google.android.gms.internal.ads.zzfgw zzfgwVar = this.zzc;
                zzfgwVar.zzb(zzcqzVar.zzq().zzb);
                zzfgwVar.zzd(zzcqzVar.zzm().zzg());
                zzfgwVar.zzg(true);
                zzfhkVar.zzb(zzfgwVar.zzm());
            } else {
                zzfhhVar.zzg(zzcqzVar.zzq().zzb);
                zzfhhVar.zze(zzcqzVar.zzm().zzg());
                com.google.android.gms.internal.ads.zzfgw zzfgwVar2 = this.zzc;
                zzfgwVar2.zzg(true);
                zzfhhVar.zza(zzfgwVar2);
                zzfhhVar.zzh();
            }
        }
    }
}
