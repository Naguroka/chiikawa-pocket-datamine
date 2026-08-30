package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzelk implements com.google.android.gms.internal.ads.zzeld {
    private final com.google.android.gms.internal.ads.zzfch zza;
    private final com.google.android.gms.internal.ads.zzcgx zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzela zzd;
    private final com.google.android.gms.internal.ads.zzfhk zze;
    private com.google.android.gms.internal.ads.zzcro zzf;

    public zzelk(com.google.android.gms.internal.ads.zzcgx zzcgxVar, android.content.Context context, com.google.android.gms.internal.ads.zzela zzelaVar, com.google.android.gms.internal.ads.zzfch zzfchVar) {
        this.zzb = zzcgxVar;
        this.zzc = context;
        this.zzd = zzelaVar;
        this.zza = zzfchVar;
        this.zze = zzcgxVar.zzz();
        zzfchVar.zzv(zzelaVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final boolean zza() {
        com.google.android.gms.internal.ads.zzcro zzcroVar = this.zzf;
        return zzcroVar != null && zzcroVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzelb zzelbVar, com.google.android.gms.internal.ads.zzelc zzelcVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzfhh zzfhhVar;
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzI(this.zzc) && zzmVar.zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzC().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzelf
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf();
                }
            });
            return false;
        }
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzC().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzelg
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg();
                }
            });
            return false;
        }
        com.google.android.gms.internal.ads.zzfdg.zza(this.zzc, zzmVar.zzf);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziN)).booleanValue() && zzmVar.zzf) {
            this.zzb.zzl().zzo(true);
        }
        int i = ((com.google.android.gms.internal.ads.zzele) zzelbVar).zza;
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        java.lang.String strZza = com.google.android.gms.internal.ads.zzdre.PUBLIC_API_CALL.zza();
        java.lang.Long lValueOf = java.lang.Long.valueOf(jCurrentTimeMillis);
        android.os.Bundle bundleZza = com.google.android.gms.internal.ads.zzdrg.zza(new android.util.Pair(strZza, lValueOf), new android.util.Pair(com.google.android.gms.internal.ads.zzdre.DYNAMITE_ENTER.zza(), lValueOf));
        com.google.android.gms.internal.ads.zzfch zzfchVar = this.zza;
        zzfchVar.zzH(zzmVar);
        zzfchVar.zzA(bundleZza);
        zzfchVar.zzC(i);
        android.content.Context context = this.zzc;
        com.google.android.gms.internal.ads.zzfcj zzfcjVarZzJ = zzfchVar.zzJ();
        com.google.android.gms.internal.ads.zzfgw zzfgwVarZzb = com.google.android.gms.internal.ads.zzfgv.zzb(context, com.google.android.gms.internal.ads.zzfhg.zzf(zzfcjVarZzJ), 8, zzmVar);
        com.google.android.gms.ads.internal.client.zzcm zzcmVar = zzfcjVarZzJ.zzn;
        if (zzcmVar != null) {
            this.zzd.zzd().zzm(zzcmVar);
        }
        com.google.android.gms.internal.ads.zzdgp zzdgpVarZzh = this.zzb.zzh();
        com.google.android.gms.internal.ads.zzcva zzcvaVar = new com.google.android.gms.internal.ads.zzcva();
        zzcvaVar.zzf(this.zzc);
        zzcvaVar.zzk(zzfcjVarZzJ);
        zzdgpVarZzh.zzf(zzcvaVar.zzl());
        com.google.android.gms.internal.ads.zzdbk zzdbkVar = new com.google.android.gms.internal.ads.zzdbk();
        zzdbkVar.zzk(this.zzd.zzd(), this.zzb.zzC());
        zzdgpVarZzh.zze(zzdbkVar.zzn());
        zzdgpVarZzh.zzd(this.zzd.zzc());
        zzdgpVarZzh.zzc(new com.google.android.gms.internal.ads.zzcoj(null));
        com.google.android.gms.internal.ads.zzdgq zzdgqVarZzg = zzdgpVarZzh.zzg();
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzfhh zzfhhVarZzf = zzdgqVarZzg.zzf();
            zzfhhVarZzf.zzi(8);
            zzfhhVarZzf.zzb(zzmVar.zzp);
            zzfhhVarZzf.zzf(zzmVar.zzm);
            zzfhhVar = zzfhhVarZzf;
        } else {
            zzfhhVar = null;
        }
        this.zzb.zzy().zzc(1);
        com.google.android.gms.internal.ads.zzcgx zzcgxVar = this.zzb;
        com.google.android.gms.internal.ads.zzgcs zzgcsVarZzc = com.google.android.gms.internal.ads.zzffh.zzc();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceZzD = zzcgxVar.zzD();
        com.google.android.gms.internal.ads.zzcsd zzcsdVarZza = zzdgqVarZzg.zza();
        com.google.android.gms.internal.ads.zzcro zzcroVar = new com.google.android.gms.internal.ads.zzcro(zzgcsVarZzc, scheduledExecutorServiceZzD, zzcsdVarZza.zzh(zzcsdVarZza.zzi()));
        this.zzf = zzcroVar;
        zzcroVar.zze(new com.google.android.gms.internal.ads.zzelj(this, zzelcVar, zzfhhVar, zzfgwVarZzb, zzdgqVarZzg));
        return true;
    }

    final /* synthetic */ void zzf() {
        this.zzd.zza().zzdz(com.google.android.gms.internal.ads.zzfdk.zzd(4, null, null));
    }

    final /* synthetic */ void zzg() {
        this.zzd.zza().zzdz(com.google.android.gms.internal.ads.zzfdk.zzd(6, null, null));
    }
}
