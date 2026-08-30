package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdtz extends com.google.android.gms.internal.ads.zzblq {
    final /* synthetic */ java.lang.Object zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgw zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcab zze;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdua zzf;

    zzdtz(com.google.android.gms.internal.ads.zzdua zzduaVar, java.lang.Object obj, java.lang.String str, long j, com.google.android.gms.internal.ads.zzfgw zzfgwVar, com.google.android.gms.internal.ads.zzcab zzcabVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfgwVar;
        this.zze = zzcabVar;
        this.zzf = zzduaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zze(java.lang.String str) {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzb(this.zzb, "error");
            this.zzf.zzo.zzb(this.zzb, "error");
            com.google.android.gms.internal.ads.zzfhk zzfhkVar = this.zzf.zzp;
            com.google.android.gms.internal.ads.zzfgw zzfgwVar = this.zzd;
            zzfgwVar.zzc(str);
            zzfgwVar.zzg(false);
            zzfhkVar.zzb(zzfgwVar.zzm());
            this.zze.zzc(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zzf() {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzd(this.zzb);
            this.zzf.zzo.zzd(this.zzb);
            com.google.android.gms.internal.ads.zzfhk zzfhkVar = this.zzf.zzp;
            com.google.android.gms.internal.ads.zzfgw zzfgwVar = this.zzd;
            zzfgwVar.zzg(true);
            zzfhkVar.zzb(zzfgwVar.zzm());
            this.zze.zzc(true);
        }
    }
}
