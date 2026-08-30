package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzejt extends com.google.android.gms.ads.internal.client.zzbx implements com.google.android.gms.internal.ads.zzcyf {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzeya zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.ads.zzekn zzd;
    private com.google.android.gms.ads.internal.client.zzs zze;
    private final com.google.android.gms.internal.ads.zzfch zzf;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzg;
    private final com.google.android.gms.internal.ads.zzdrw zzh;
    private com.google.android.gms.internal.ads.zzcom zzi;

    public zzejt(android.content.Context context, com.google.android.gms.ads.internal.client.zzs zzsVar, java.lang.String str, com.google.android.gms.internal.ads.zzeya zzeyaVar, com.google.android.gms.internal.ads.zzekn zzeknVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = context;
        this.zzb = zzeyaVar;
        this.zze = zzsVar;
        this.zzc = str;
        this.zzd = zzeknVar;
        this.zzf = zzeyaVar.zzf();
        this.zzg = versionInfoParcel;
        this.zzh = zzdrwVar;
        zzeyaVar.zzo(this);
    }

    private final synchronized void zzf(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        this.zzf.zzs(zzsVar);
        this.zzf.zzy(this.zze.zzn);
    }

    private final synchronized boolean zzh(com.google.android.gms.ads.internal.client.zzm zzmVar) throws android.os.RemoteException {
        if (zzm()) {
            com.google.android.gms.common.internal.Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        if (!com.google.android.gms.ads.internal.util.zzs.zzI(this.zza) || zzmVar.zzs != null) {
            com.google.android.gms.internal.ads.zzfdg.zza(this.zza, zzmVar.zzf);
            return this.zzb.zzb(zzmVar, this.zzc, null, new com.google.android.gms.internal.ads.zzejs(this));
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load the ad because app ID is missing.");
        com.google.android.gms.internal.ads.zzekn zzeknVar = this.zzd;
        if (zzeknVar != null) {
            zzeknVar.zzdz(com.google.android.gms.internal.ads.zzfdk.zzd(4, null, null));
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    private final boolean zzm() {
        boolean z;
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzf.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzla)).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return this.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlb)).intValue() || !z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzA() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzcom zzcomVar = this.zzi;
        if (zzcomVar != null) {
            zzcomVar.zzh();
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0037 A[Catch: all -> 0x004c, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003c, B:12:0x0040, B:9:0x0037), top: B:20:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzB() {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzh.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkW)).booleanValue()) {
                if (this.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlc)).intValue()) {
                    com.google.android.gms.common.internal.Preconditions.checkMainThread("resume must be called on the main UI thread.");
                }
            } else {
                com.google.android.gms.common.internal.Preconditions.checkMainThread("resume must be called on the main UI thread.");
            }
        } else {
            com.google.android.gms.common.internal.Preconditions.checkMainThread("resume must be called on the main UI thread.");
        }
        com.google.android.gms.internal.ads.zzcom zzcomVar = this.zzi;
        if (zzcomVar != null) {
            zzcomVar.zzn().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
        if (zzm()) {
            com.google.android.gms.common.internal.Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzn(zzbiVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(com.google.android.gms.ads.internal.client.zzbl zzblVar) {
        if (zzm()) {
            com.google.android.gms.common.internal.Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzj(zzblVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(com.google.android.gms.ads.internal.client.zzcc zzccVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzs(zzsVar);
        this.zze = zzsVar;
        com.google.android.gms.internal.ads.zzcom zzcomVar = this.zzi;
        if (zzcomVar != null) {
            zzcomVar.zzi(this.zzb.zzc(), zzsVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(com.google.android.gms.ads.internal.client.zzcm zzcmVar) {
        if (zzm()) {
            com.google.android.gms.common.internal.Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzm(zzcmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(com.google.android.gms.internal.ads.zzbag zzbagVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(com.google.android.gms.ads.internal.client.zzy zzyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(com.google.android.gms.ads.internal.client.zzct zzctVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(com.google.android.gms.ads.internal.client.zzef zzefVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(com.google.android.gms.internal.ads.zzbtn zzbtnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzN(boolean z) {
        if (zzm()) {
            com.google.android.gms.common.internal.Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.zzf.zzB(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzO(com.google.android.gms.internal.ads.zzbdg zzbdgVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzp(zzbdgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        if (zzm()) {
            com.google.android.gms.common.internal.Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdrVar.zzf()) {
                this.zzh.zze();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzd.zzl(zzdrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(com.google.android.gms.internal.ads.zzbtq zzbtqVar, java.lang.String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(java.lang.String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(com.google.android.gms.internal.ads.zzbwc zzbwcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(java.lang.String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        if (zzm()) {
            com.google.android.gms.common.internal.Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        }
        this.zzf.zzI(zzgaVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzY() {
        com.google.android.gms.internal.ads.zzcom zzcomVar = this.zzi;
        return zzcomVar != null && zzcomVar.zzs();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzZ() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcyf
    public final synchronized void zza() {
        if (!this.zzb.zzs()) {
            this.zzb.zzl();
            return;
        }
        com.google.android.gms.ads.internal.client.zzs zzsVarZzh = this.zzf.zzh();
        com.google.android.gms.internal.ads.zzcom zzcomVar = this.zzi;
        if (zzcomVar != null && zzcomVar.zzg() != null && this.zzf.zzT()) {
            zzsVarZzh = com.google.android.gms.internal.ads.zzfcp.zza(this.zza, java.util.Collections.singletonList(this.zzi.zzg()));
        }
        zzf(zzsVarZzh);
        this.zzf.zzx(true);
        try {
            zzh(this.zzf.zzf());
        } catch (android.os.RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to refresh the banner ad.");
        }
        this.zzf.zzx(false);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) throws android.os.RemoteException {
        zzf(this.zze);
        return zzh(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzac(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzV(zzcqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyf
    public final synchronized void zzb() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        if (this.zzb.zzs()) {
            this.zzb.zzq();
        } else {
            this.zzb.zzm();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final android.os.Bundle zzd() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzs zzg() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzcom zzcomVar = this.zzi;
        if (zzcomVar != null) {
            return com.google.android.gms.internal.ads.zzfcp.zza(this.zza, java.util.Collections.singletonList(zzcomVar.zzf()));
        }
        return this.zzf.zzh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzbl zzi() {
        return this.zzd.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzcm zzj() {
        return this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzdy zzk() {
        com.google.android.gms.internal.ads.zzcom zzcomVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgC)).booleanValue() && (zzcomVar = this.zzi) != null) {
            return zzcomVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzeb zzl() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        com.google.android.gms.internal.ads.zzcom zzcomVar = this.zzi;
        if (zzcomVar == null) {
            return null;
        }
        return zzcomVar.zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.dynamic.IObjectWrapper zzn() {
        if (zzm()) {
            com.google.android.gms.common.internal.Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb.zzc());
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized java.lang.String zzr() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized java.lang.String zzs() {
        com.google.android.gms.internal.ads.zzcom zzcomVar = this.zzi;
        if (zzcomVar == null || zzcomVar.zzm() == null) {
            return null;
        }
        return zzcomVar.zzm().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized java.lang.String zzt() {
        com.google.android.gms.internal.ads.zzcom zzcomVar = this.zzi;
        if (zzcomVar == null || zzcomVar.zzm() == null) {
            return null;
        }
        return zzcomVar.zzm().zzg();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0037 A[Catch: all -> 0x0047, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003c, B:12:0x0040, B:9:0x0037), top: B:20:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzx() {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zze.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkX)).booleanValue()) {
                if (this.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlc)).intValue()) {
                    com.google.android.gms.common.internal.Preconditions.checkMainThread("destroy must be called on the main UI thread.");
                }
            } else {
                com.google.android.gms.common.internal.Preconditions.checkMainThread("destroy must be called on the main UI thread.");
            }
        } else {
            com.google.android.gms.common.internal.Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        }
        com.google.android.gms.internal.ads.zzcom zzcomVar = this.zzi;
        if (zzcomVar != null) {
            zzcomVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbo zzboVar) {
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0037 A[Catch: all -> 0x004c, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003c, B:12:0x0040, B:9:0x0037), top: B:20:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzz() {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzg.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkY)).booleanValue()) {
                if (this.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlc)).intValue()) {
                    com.google.android.gms.common.internal.Preconditions.checkMainThread("pause must be called on the main UI thread.");
                }
            } else {
                com.google.android.gms.common.internal.Preconditions.checkMainThread("pause must be called on the main UI thread.");
            }
        } else {
            com.google.android.gms.common.internal.Preconditions.checkMainThread("pause must be called on the main UI thread.");
        }
        com.google.android.gms.internal.ads.zzcom zzcomVar = this.zzi;
        if (zzcomVar != null) {
            zzcomVar.zzn().zzb(null);
        }
    }
}
