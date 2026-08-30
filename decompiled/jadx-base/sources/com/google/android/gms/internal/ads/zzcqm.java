package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcqm implements com.google.android.gms.internal.ads.zzcxh, com.google.android.gms.internal.ads.zzcwn {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzcex zzb;
    private final com.google.android.gms.internal.ads.zzfbo zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private com.google.android.gms.internal.ads.zzecr zze;
    private boolean zzf;
    private final com.google.android.gms.internal.ads.zzecp zzg;

    public zzcqm(android.content.Context context, com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzecp zzecpVar) {
        this.zza = context;
        this.zzb = zzcexVar;
        this.zzc = zzfboVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzecpVar;
    }

    private final synchronized void zza() {
        com.google.android.gms.internal.ads.zzeco zzecoVar;
        com.google.android.gms.internal.ads.zzecn zzecnVar;
        if (this.zzc.zzT && this.zzb != null) {
            if (com.google.android.gms.ads.internal.zzv.zzB().zzl(this.zza)) {
                com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zzd;
                java.lang.String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                com.google.android.gms.internal.ads.zzfcm zzfcmVar = this.zzc.zzV;
                java.lang.String strZza = zzfcmVar.zza();
                if (zzfcmVar.zzc() == 1) {
                    zzecnVar = com.google.android.gms.internal.ads.zzecn.VIDEO;
                    zzecoVar = com.google.android.gms.internal.ads.zzeco.DEFINED_BY_JAVASCRIPT;
                } else {
                    com.google.android.gms.internal.ads.zzfbo zzfboVar = this.zzc;
                    com.google.android.gms.internal.ads.zzecn zzecnVar2 = com.google.android.gms.internal.ads.zzecn.HTML_DISPLAY;
                    zzecoVar = zzfboVar.zze == 1 ? com.google.android.gms.internal.ads.zzeco.ONE_PIXEL : com.google.android.gms.internal.ads.zzeco.BEGIN_TO_RENDER;
                    zzecnVar = zzecnVar2;
                }
                this.zze = com.google.android.gms.ads.internal.zzv.zzB().zza(str, this.zzb.zzG(), "", "javascript", strZza, zzecoVar, zzecnVar, this.zzc.zzal);
                android.view.View viewZzF = this.zzb.zzF();
                com.google.android.gms.internal.ads.zzecr zzecrVar = this.zze;
                if (zzecrVar != null) {
                    com.google.android.gms.internal.ads.zzfkp zzfkpVarZza = zzecrVar.zza();
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfe)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.zzB().zzj(zzfkpVarZza, this.zzb.zzG());
                        java.util.Iterator it = this.zzb.zzV().iterator();
                        while (it.hasNext()) {
                            com.google.android.gms.ads.internal.zzv.zzB().zzg(zzfkpVarZza, (android.view.View) it.next());
                        }
                    } else {
                        com.google.android.gms.ads.internal.zzv.zzB().zzj(zzfkpVarZza, viewZzF);
                    }
                    this.zzb.zzat(this.zze);
                    com.google.android.gms.ads.internal.zzv.zzB().zzk(zzfkpVarZza);
                    this.zzf = true;
                    this.zzb.zzd("onSdkLoaded", new androidx.collection.ArrayMap());
                }
            }
        }
    }

    private final boolean zzb() {
        return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzff)).booleanValue() && this.zzg.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final synchronized void zzr() {
        com.google.android.gms.internal.ads.zzcex zzcexVar;
        if (zzb()) {
            this.zzg.zzb();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzcexVar = this.zzb) == null) {
            return;
        }
        zzcexVar.zzd("onSdkImpression", new androidx.collection.ArrayMap());
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final synchronized void zzs() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }
}
