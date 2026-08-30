package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfay implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzelc zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfhh zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgw zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfaz zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfbb zze;

    zzfay(com.google.android.gms.internal.ads.zzfbb zzfbbVar, com.google.android.gms.internal.ads.zzelc zzelcVar, com.google.android.gms.internal.ads.zzfhh zzfhhVar, com.google.android.gms.internal.ads.zzfgw zzfgwVar, com.google.android.gms.internal.ads.zzfaz zzfazVar) {
        this.zza = zzelcVar;
        this.zzb = zzfhhVar;
        this.zzc = zzfgwVar;
        this.zzd = zzfazVar;
        this.zze = zzfbbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzfhh zzfhhVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfG)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th);
        }
        com.google.android.gms.internal.ads.zzdof zzdofVar = (com.google.android.gms.internal.ads.zzdof) this.zze.zze.zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzdofVar == null ? com.google.android.gms.internal.ads.zzfdk.zzb(th, null) : zzdofVar.zzb().zza(th);
        synchronized (this.zze) {
            try {
                if (zzdofVar != null) {
                    zzdofVar.zza().zzdz(zzeVarZzb);
                    this.zze.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfaw
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zzd.zzdz(zzeVarZzb);
                        }
                    });
                } else {
                    this.zze.zzd.zzdz(zzeVarZzb);
                    this.zze.zzk(this.zzd).zzh().zzb().zzc().zzh();
                }
                com.google.android.gms.internal.ads.zzfdg.zzb(zzeVarZzb.zza, th, "RewardedAdLoader.onFailure");
                this.zza.zza();
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue() || (zzfhhVar = this.zzb) == null) {
                    com.google.android.gms.internal.ads.zzfhk zzfhkVar = this.zze.zzg;
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
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzfhh zzfhhVar;
        com.google.android.gms.internal.ads.zzdoa zzdoaVar = (com.google.android.gms.internal.ads.zzdoa) obj;
        synchronized (this.zze) {
            zzdoaVar.zzo().zzd(this.zze.zzd);
            this.zza.zzb(zzdoaVar);
            com.google.android.gms.internal.ads.zzfbb zzfbbVar = this.zze;
            java.util.concurrent.Executor executor = zzfbbVar.zzb;
            final com.google.android.gms.internal.ads.zzfar zzfarVar = zzfbbVar.zzd;
            java.util.Objects.requireNonNull(zzfarVar);
            executor.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfax
                @Override // java.lang.Runnable
                public final void run() {
                    zzfarVar.zzs();
                }
            });
            this.zze.zzd.onAdMetadataChanged();
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue() || (zzfhhVar = this.zzb) == null) {
                com.google.android.gms.internal.ads.zzfhk zzfhkVar = this.zze.zzg;
                com.google.android.gms.internal.ads.zzfgw zzfgwVar = this.zzc;
                zzfgwVar.zzb(zzdoaVar.zzq().zzb);
                zzfgwVar.zzd(zzdoaVar.zzm().zzg());
                zzfgwVar.zzg(true);
                zzfhkVar.zzb(zzfgwVar.zzm());
            } else {
                zzfhhVar.zzg(zzdoaVar.zzq().zzb);
                zzfhhVar.zze(zzdoaVar.zzm().zzg());
                com.google.android.gms.internal.ads.zzfgw zzfgwVar2 = this.zzc;
                zzfgwVar2.zzg(true);
                zzfhhVar.zza(zzfgwVar2);
                zzfhhVar.zzh();
            }
        }
    }
}
