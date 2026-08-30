package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdgd implements com.google.android.gms.internal.ads.zzcxh, com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.internal.ads.zzcwn {
    com.google.android.gms.internal.ads.zzecr zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzcex zzc;
    private final com.google.android.gms.internal.ads.zzfbo zzd;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zze;
    private final com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza zzf;
    private final com.google.android.gms.internal.ads.zzecp zzg;

    public zzdgd(android.content.Context context, com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza enumC0177zza, com.google.android.gms.internal.ads.zzecp zzecpVar) {
        this.zzb = context;
        this.zzc = zzcexVar;
        this.zzd = zzfboVar;
        this.zze = versionInfoParcel;
        this.zzf = enumC0177zza;
        this.zzg = zzecpVar;
    }

    private final boolean zzg() {
        return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzff)).booleanValue() && this.zzg.zzd();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfk)).booleanValue() || this.zzc == null) {
            return;
        }
        if (this.zza != null || zzg()) {
            if (this.zza != null) {
                this.zzc.zzd("onSdkImpression", new androidx.collection.ArrayMap());
            } else {
                this.zzg.zzb();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        if (zzg()) {
            this.zzg.zzb();
            return;
        }
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfk)).booleanValue()) {
            this.zzc.zzd("onSdkImpression", new androidx.collection.ArrayMap());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        com.google.android.gms.internal.ads.zzeco zzecoVar;
        com.google.android.gms.internal.ads.zzecn zzecnVar;
        com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza enumC0177zza;
        if ((((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfn)).booleanValue() || this.zzf == com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza.REWARD_BASED_VIDEO_AD || (enumC0177zza = this.zzf) == com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza.INTERSTITIAL || enumC0177zza == com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza.APP_OPEN) && this.zzd.zzT && this.zzc != null) {
            if (com.google.android.gms.ads.internal.zzv.zzB().zzl(this.zzb)) {
                if (zzg()) {
                    this.zzg.zzc();
                    return;
                }
                com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zze;
                java.lang.String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                com.google.android.gms.internal.ads.zzfcm zzfcmVar = this.zzd.zzV;
                java.lang.String strZza = zzfcmVar.zza();
                if (zzfcmVar.zzc() == 1) {
                    zzecnVar = com.google.android.gms.internal.ads.zzecn.VIDEO;
                    zzecoVar = com.google.android.gms.internal.ads.zzeco.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzecoVar = this.zzd.zzY == 2 ? com.google.android.gms.internal.ads.zzeco.UNSPECIFIED : com.google.android.gms.internal.ads.zzeco.BEGIN_TO_RENDER;
                    zzecnVar = com.google.android.gms.internal.ads.zzecn.HTML_DISPLAY;
                }
                this.zza = com.google.android.gms.ads.internal.zzv.zzB().zza(str, this.zzc.zzG(), "", "javascript", strZza, zzecoVar, zzecnVar, this.zzd.zzal);
                android.view.View viewZzF = this.zzc.zzF();
                com.google.android.gms.internal.ads.zzecr zzecrVar = this.zza;
                if (zzecrVar != null) {
                    com.google.android.gms.internal.ads.zzfkp zzfkpVarZza = zzecrVar.zza();
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfe)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.zzB().zzj(zzfkpVarZza, this.zzc.zzG());
                        java.util.Iterator it = this.zzc.zzV().iterator();
                        while (it.hasNext()) {
                            com.google.android.gms.ads.internal.zzv.zzB().zzg(zzfkpVarZza, (android.view.View) it.next());
                        }
                    } else {
                        com.google.android.gms.ads.internal.zzv.zzB().zzj(zzfkpVarZza, viewZzF);
                    }
                    this.zzc.zzat(this.zza);
                    com.google.android.gms.ads.internal.zzv.zzB().zzk(zzfkpVarZza);
                    this.zzc.zzd("onSdkLoaded", new androidx.collection.ArrayMap());
                }
            }
        }
    }
}
