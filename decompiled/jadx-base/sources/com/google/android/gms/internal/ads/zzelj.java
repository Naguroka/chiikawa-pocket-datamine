package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzelj implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzelc zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfhh zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgw zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdgq zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzelk zze;

    zzelj(com.google.android.gms.internal.ads.zzelk zzelkVar, com.google.android.gms.internal.ads.zzelc zzelcVar, com.google.android.gms.internal.ads.zzfhh zzfhhVar, com.google.android.gms.internal.ads.zzfgw zzfgwVar, com.google.android.gms.internal.ads.zzdgq zzdgqVar) {
        this.zza = zzelcVar;
        this.zzb = zzfhhVar;
        this.zzc = zzfgwVar;
        this.zzd = zzdgqVar;
        this.zze = zzelkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzfhh zzfhhVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfG)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Native ad failed to load", th);
        }
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzd.zza().zza(th);
        this.zzd.zzb().zzdz(zzeVarZza);
        this.zze.zzb.zzC().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzeli
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze.zzd.zza().zzdz(zzeVarZza);
            }
        });
        com.google.android.gms.internal.ads.zzfdg.zzb(zzeVarZza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue() && (zzfhhVar = this.zzb) != null) {
            zzfhhVar.zzc(zzeVarZza);
            com.google.android.gms.internal.ads.zzfgw zzfgwVar = this.zzc;
            zzfgwVar.zzh(th);
            zzfgwVar.zzg(false);
            zzfhhVar.zza(zzfgwVar);
            zzfhhVar.zzh();
            return;
        }
        com.google.android.gms.internal.ads.zzelk zzelkVar = this.zze;
        com.google.android.gms.internal.ads.zzfgw zzfgwVar2 = this.zzc;
        com.google.android.gms.internal.ads.zzfhk zzfhkVar = zzelkVar.zze;
        zzfgwVar2.zza(zzeVarZza);
        zzfgwVar2.zzh(th);
        zzfgwVar2.zzg(false);
        zzfhkVar.zzb(zzfgwVar2.zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzfhh zzfhhVar;
        com.google.android.gms.internal.ads.zzcqz zzcqzVar = (com.google.android.gms.internal.ads.zzcqz) obj;
        synchronized (this.zze) {
            zzcqzVar.zzo().zza(this.zze.zzd.zzd());
            this.zza.zzb(zzcqzVar);
            this.zze.zzb.zzC().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzelh
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zze.zzd.zzb().zzs();
                }
            });
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue() || (zzfhhVar = this.zzb) == null) {
                com.google.android.gms.internal.ads.zzfhk zzfhkVar = this.zze.zze;
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
