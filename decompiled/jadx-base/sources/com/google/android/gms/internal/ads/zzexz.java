package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzexz implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfhh zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgw zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcpq zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzeya zzd;

    zzexz(com.google.android.gms.internal.ads.zzeya zzeyaVar, com.google.android.gms.internal.ads.zzfhh zzfhhVar, com.google.android.gms.internal.ads.zzfgw zzfgwVar, com.google.android.gms.internal.ads.zzcpq zzcpqVar) {
        this.zza = zzfhhVar;
        this.zzb = zzfgwVar;
        this.zzc = zzcpqVar;
        this.zzd = zzeyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzfhh zzfhhVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfG)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Banner ad failed to load", th);
        }
        synchronized (this.zzd) {
            com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzc.zzd().zza(th);
            this.zzd.zzn = zzeVarZza;
            this.zzc.zzf().zzdz(zzeVarZza);
            com.google.android.gms.internal.ads.zzfdg.zzb(zzeVarZza.zza, th, "BannerAdLoader.onFailure");
            com.google.android.gms.internal.ads.zzeya zzeyaVar = this.zzd;
            if (zzeyaVar.zzm) {
                zzeyaVar.zzt();
                com.google.android.gms.internal.ads.zzeya zzeyaVar2 = this.zzd;
                zzeyaVar2.zzh.zzd(zzeyaVar2.zzj.zzc());
            }
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue() || (zzfhhVar = this.zza) == null) {
                com.google.android.gms.internal.ads.zzfhk zzfhkVar = this.zzd.zzi;
                com.google.android.gms.internal.ads.zzfgw zzfgwVar = this.zzb;
                zzfgwVar.zza(zzeVarZza);
                zzfgwVar.zzh(th);
                zzfgwVar.zzg(false);
                zzfhkVar.zzb(zzfgwVar.zzm());
            } else {
                zzfhhVar.zzc(zzeVarZza);
                com.google.android.gms.internal.ads.zzfgw zzfgwVar2 = this.zzb;
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
        com.google.android.gms.internal.ads.zzcom zzcomVar = (com.google.android.gms.internal.ads.zzcom) obj;
        synchronized (this.zzd) {
            com.google.android.gms.internal.ads.zzeya zzeyaVar = this.zzd;
            if (zzeyaVar.zzm) {
                zzeyaVar.zzq();
            }
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue() || (zzfhhVar = this.zza) == null) {
                com.google.android.gms.internal.ads.zzfhk zzfhkVar = this.zzd.zzi;
                com.google.android.gms.internal.ads.zzfgw zzfgwVar = this.zzb;
                zzfgwVar.zzb(zzcomVar.zzq().zzb);
                zzfgwVar.zzd(zzcomVar.zzm().zzg());
                zzfgwVar.zzg(true);
                zzfhkVar.zzb(zzfgwVar.zzm());
            } else {
                zzfhhVar.zzg(zzcomVar.zzq().zzb);
                zzfhhVar.zze(zzcomVar.zzm().zzg());
                com.google.android.gms.internal.ads.zzfgw zzfgwVar2 = this.zzb;
                zzfgwVar2.zzg(true);
                zzfhhVar.zza(zzfgwVar2);
                zzfhhVar.zzh();
            }
        }
    }
}
