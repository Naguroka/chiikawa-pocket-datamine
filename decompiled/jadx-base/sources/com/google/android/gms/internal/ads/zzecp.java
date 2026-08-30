package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzecp {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;
    private final com.google.android.gms.internal.ads.zzfbo zzc;
    private final com.google.android.gms.internal.ads.zzcex zzd;
    private final com.google.android.gms.internal.ads.zzdrw zze;
    private com.google.android.gms.internal.ads.zzfla zzf;

    zzecp(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfboVar;
        this.zzd = zzcexVar;
        this.zze = zzdrwVar;
    }

    public final synchronized void zza(android.view.View view) {
        com.google.android.gms.internal.ads.zzfla zzflaVar = this.zzf;
        if (zzflaVar != null) {
            com.google.android.gms.ads.internal.zzv.zzB().zzh(zzflaVar, view);
        }
    }

    public final synchronized void zzb() {
        com.google.android.gms.internal.ads.zzcex zzcexVar;
        if (this.zzf == null || (zzcexVar = this.zzd) == null) {
            return;
        }
        zzcexVar.zzd("onSdkImpression", com.google.android.gms.internal.ads.zzfxq.zzd());
    }

    public final synchronized void zzc() {
        com.google.android.gms.internal.ads.zzcex zzcexVar;
        com.google.android.gms.internal.ads.zzfla zzflaVar = this.zzf;
        if (zzflaVar == null || (zzcexVar = this.zzd) == null) {
            return;
        }
        java.util.Iterator it = zzcexVar.zzV().iterator();
        while (it.hasNext()) {
            com.google.android.gms.ads.internal.zzv.zzB().zzh(zzflaVar, (android.view.View) it.next());
        }
        this.zzd.zzd("onSdkLoaded", com.google.android.gms.internal.ads.zzfxq.zzd());
    }

    public final synchronized boolean zzd() {
        return this.zzf != null;
    }

    public final synchronized boolean zze(boolean z) {
        if (this.zzc.zzT) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfc)).booleanValue()) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzff)).booleanValue() && this.zzd != null) {
                    if (this.zzf != null) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!com.google.android.gms.ads.internal.zzv.zzB().zzl(this.zza)) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to initialize omid.");
                        return false;
                    }
                    if (this.zzc.zzV.zzb()) {
                        com.google.android.gms.internal.ads.zzfla zzflaVarZze = com.google.android.gms.ads.internal.zzv.zzB().zze(this.zzb, this.zzd.zzG(), true);
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfg)).booleanValue()) {
                            com.google.android.gms.internal.ads.zzdrw zzdrwVar = this.zze;
                            java.lang.String str = zzflaVarZze != null ? "1" : "0";
                            com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = zzdrwVar.zza();
                            zzdrvVarZza.zzb("omid_js_session_success", str);
                            zzdrvVarZza.zzg();
                        }
                        if (zzflaVarZze == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to create javascript session service.");
                            return false;
                        }
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Created omid javascript session service.");
                        this.zzf = zzflaVarZze;
                        this.zzd.zzas(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void zzf(com.google.android.gms.internal.ads.zzcfo zzcfoVar) {
        com.google.android.gms.internal.ads.zzfla zzflaVar = this.zzf;
        if (zzflaVar == null || this.zzd == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzB().zzm(zzflaVar, zzcfoVar);
        this.zzf = null;
        this.zzd.zzas(null);
    }
}
