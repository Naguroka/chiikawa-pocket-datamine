package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzekv extends com.google.android.gms.ads.internal.client.zzbx {
    private final com.google.android.gms.ads.internal.client.zzs zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzezr zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zze;
    private final com.google.android.gms.internal.ads.zzekn zzf;
    private final com.google.android.gms.internal.ads.zzfar zzg;
    private final com.google.android.gms.internal.ads.zzava zzh;
    private final com.google.android.gms.internal.ads.zzdrw zzi;
    private com.google.android.gms.internal.ads.zzdeq zzj;
    private boolean zzk = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaO)).booleanValue();

    public zzekv(android.content.Context context, com.google.android.gms.ads.internal.client.zzs zzsVar, java.lang.String str, com.google.android.gms.internal.ads.zzezr zzezrVar, com.google.android.gms.internal.ads.zzekn zzeknVar, com.google.android.gms.internal.ads.zzfar zzfarVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzava zzavaVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = zzsVar;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzezrVar;
        this.zzf = zzeknVar;
        this.zzg = zzfarVar;
        this.zze = versionInfoParcel;
        this.zzh = zzavaVar;
        this.zzi = zzdrwVar;
    }

    private final synchronized boolean zze() {
        com.google.android.gms.internal.ads.zzdeq zzdeqVar = this.zzj;
        return (zzdeqVar == null || zzdeqVar.zza()) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzB() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("resume must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzdeq zzdeqVar = this.zzj;
        if (zzdeqVar != null) {
            zzdeqVar.zzn().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(com.google.android.gms.ads.internal.client.zzbl zzblVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzf.zzj(zzblVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(com.google.android.gms.ads.internal.client.zzcc zzccVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(com.google.android.gms.ads.internal.client.zzs zzsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(com.google.android.gms.ads.internal.client.zzcm zzcmVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzm(zzcmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(com.google.android.gms.internal.ads.zzbag zzbagVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(com.google.android.gms.ads.internal.client.zzy zzyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(com.google.android.gms.ads.internal.client.zzct zzctVar) {
        this.zzf.zzn(zzctVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(com.google.android.gms.ads.internal.client.zzef zzefVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzL(boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(com.google.android.gms.internal.ads.zzbtn zzbtnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzO(com.google.android.gms.internal.ads.zzbdg zzbdgVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzi(zzbdgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdrVar.zzf()) {
                this.zzi.zze();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzf.zzl(zzdrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(com.google.android.gms.internal.ads.zzbtq zzbtqVar, java.lang.String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(java.lang.String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(com.google.android.gms.internal.ads.zzbwc zzbwcVar) {
        this.zzg.zzm(zzbwcVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(java.lang.String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzW(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (this.zzj == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzq(com.google.android.gms.internal.ads.zzfdk.zzd(9, null, null));
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcT)).booleanValue()) {
            this.zzh.zzc().zzn(new java.lang.Throwable().getStackTrace());
        }
        this.zzj.zzc(this.zzk, (android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzX() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzq(com.google.android.gms.internal.ads.zzfdk.zzd(9, null, null));
        } else {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcT)).booleanValue()) {
                this.zzh.zzc().zzn(new java.lang.Throwable().getStackTrace());
            }
            this.zzj.zzc(this.zzk, null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzZ() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzaa() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zze();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        boolean z;
        if (!zzmVar.zzb()) {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzi.zze()).booleanValue()) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzla)).booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (this.zze.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlb)).intValue() || !z) {
                com.google.android.gms.common.internal.Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzI(this.zzb) && zzmVar.zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load the ad because app ID is missing.");
            com.google.android.gms.internal.ads.zzekn zzeknVar = this.zzf;
            if (zzeknVar != null) {
                zzeknVar.zzdz(com.google.android.gms.internal.ads.zzfdk.zzd(4, null, null));
            }
        } else if (!zze()) {
            com.google.android.gms.internal.ads.zzfdg.zza(this.zzb, zzmVar.zzf);
            this.zzj = null;
            return this.zzc.zzb(zzmVar, this.zzd, new com.google.android.gms.internal.ads.zzezk(this.zza), new com.google.android.gms.internal.ads.zzeku(this));
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final android.os.Bundle zzd() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzs zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzbl zzi() {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzcm zzj() {
        return this.zzf.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzdy zzk() {
        com.google.android.gms.internal.ads.zzdeq zzdeqVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgC)).booleanValue() && (zzdeqVar = this.zzj) != null) {
            return zzdeqVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzeb zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.dynamic.IObjectWrapper zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized java.lang.String zzr() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized java.lang.String zzs() {
        com.google.android.gms.internal.ads.zzdeq zzdeqVar = this.zzj;
        if (zzdeqVar == null || zzdeqVar.zzm() == null) {
            return null;
        }
        return zzdeqVar.zzm().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized java.lang.String zzt() {
        com.google.android.gms.internal.ads.zzdeq zzdeqVar = this.zzj;
        if (zzdeqVar == null || zzdeqVar.zzm() == null) {
            return null;
        }
        return zzdeqVar.zzm().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzx() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzdeq zzdeqVar = this.zzj;
        if (zzdeqVar != null) {
            zzdeqVar.zzn().zza(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbo zzboVar) {
        this.zzf.zzk(zzboVar);
        zzab(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzz() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("pause must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzdeq zzdeqVar = this.zzj;
        if (zzdeqVar != null) {
            zzdeqVar.zzn().zzb(null);
        }
    }
}
