package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzezq implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzelc zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfhh zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgw zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdfu zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzezr zze;

    zzezq(com.google.android.gms.internal.ads.zzezr zzezrVar, com.google.android.gms.internal.ads.zzelc zzelcVar, com.google.android.gms.internal.ads.zzfhh zzfhhVar, com.google.android.gms.internal.ads.zzfgw zzfgwVar, com.google.android.gms.internal.ads.zzdfu zzdfuVar) {
        this.zza = zzelcVar;
        this.zzb = zzfhhVar;
        this.zzc = zzfgwVar;
        this.zzd = zzdfuVar;
        this.zze = zzezrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzfhh zzfhhVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfG)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Interstitial ad failed to load", th);
        }
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zzdz(zzeVarZza);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzib)).booleanValue()) {
                this.zze.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzezm
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zzd.zzdz(zzeVarZza);
                    }
                });
                this.zze.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzezn
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zze.zzdz(zzeVarZza);
                    }
                });
            }
            com.google.android.gms.internal.ads.zzfdg.zzb(zzeVarZza.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue() || (zzfhhVar = this.zzb) == null) {
                com.google.android.gms.internal.ads.zzfhk zzfhkVar = this.zze.zzg;
                com.google.android.gms.internal.ads.zzfgw zzfgwVar = this.zzc;
                zzfgwVar.zza(zzeVarZza);
                zzfgwVar.zzh(th);
                zzfgwVar.zzg(false);
                zzfhkVar.zzb(zzfgwVar.zzm());
            } else {
                zzfhhVar.zzc(zzeVarZza);
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
        com.google.android.gms.internal.ads.zzdeq zzdeqVar = (com.google.android.gms.internal.ads.zzdeq) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzib)).booleanValue()) {
                com.google.android.gms.internal.ads.zzczz zzczzVarZzo = zzdeqVar.zzo();
                zzczzVarZzo.zza(this.zze.zzd);
                zzczzVarZzo.zzd(this.zze.zze);
            }
            this.zza.zzb(zzdeqVar);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzib)).booleanValue()) {
                this.zze.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzezo
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zzd.zzs();
                    }
                });
                this.zze.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzezp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zze.zzs();
                    }
                });
            }
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue() || (zzfhhVar = this.zzb) == null) {
                com.google.android.gms.internal.ads.zzfhk zzfhkVar = this.zze.zzg;
                com.google.android.gms.internal.ads.zzfgw zzfgwVar = this.zzc;
                zzfgwVar.zzb(zzdeqVar.zzq().zzb);
                zzfgwVar.zzd(zzdeqVar.zzm().zzg());
                zzfgwVar.zzg(true);
                zzfhkVar.zzb(zzfgwVar.zzm());
            } else {
                zzfhhVar.zzg(zzdeqVar.zzq().zzb);
                zzfhhVar.zze(zzdeqVar.zzm().zzg());
                com.google.android.gms.internal.ads.zzfgw zzfgwVar2 = this.zzc;
                zzfgwVar2.zzg(true);
                zzfhhVar.zza(zzfgwVar2);
                zzfhhVar.zzh();
            }
        }
    }
}
