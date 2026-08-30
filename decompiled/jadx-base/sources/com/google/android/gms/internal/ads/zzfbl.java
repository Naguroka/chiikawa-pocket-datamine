package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfbl extends com.google.android.gms.internal.ads.zzbvy {
    private final com.google.android.gms.internal.ads.zzfbb zza;
    private final com.google.android.gms.internal.ads.zzfar zzb;
    private final com.google.android.gms.internal.ads.zzfcb zzc;
    private com.google.android.gms.internal.ads.zzdoa zzd;
    private boolean zze = false;

    public zzfbl(com.google.android.gms.internal.ads.zzfbb zzfbbVar, com.google.android.gms.internal.ads.zzfar zzfarVar, com.google.android.gms.internal.ads.zzfcb zzfcbVar) {
        this.zza = zzfbbVar;
        this.zzb = zzfarVar;
        this.zzc = zzfcbVar;
    }

    private final synchronized boolean zzy() {
        com.google.android.gms.internal.ads.zzdoa zzdoaVar = this.zzd;
        return (zzdoaVar == null || zzdoaVar.zze()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final android.os.Bundle zzb() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        com.google.android.gms.internal.ads.zzdoa zzdoaVar = this.zzd;
        return zzdoaVar != null ? zzdoaVar.zza() : new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized com.google.android.gms.ads.internal.client.zzdy zzc() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdoa zzdoaVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgC)).booleanValue() && (zzdoaVar = this.zzd) != null) {
            return zzdoaVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized java.lang.String zzd() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdoa zzdoaVar = this.zzd;
        if (zzdoaVar == null || zzdoaVar.zzm() == null) {
            return null;
        }
        return zzdoaVar.zzm().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final void zze() throws android.os.RemoteException {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        android.content.Context context = null;
        this.zzb.zzg(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzn().zza(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzft)).booleanValue() == false) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzbvz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzg(com.google.android.gms.internal.ads.zzbwd zzbwdVar) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        java.lang.String str = zzbwdVar.zzb;
        java.lang.String str2 = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfr);
        if (str2 != null && str != null) {
            try {
                if (!java.util.regex.Pattern.matches(str2, str)) {
                }
            } catch (java.lang.RuntimeException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "NonagonUtil.isPatternMatched");
            }
            return;
        }
        if (zzy()) {
        }
        com.google.android.gms.internal.ads.zzfat zzfatVar = new com.google.android.gms.internal.ads.zzfat(null);
        this.zzd = null;
        this.zza.zzj(1);
        this.zza.zzb(zzbwdVar.zza, zzbwdVar.zzb, zzfatVar, new com.google.android.gms.internal.ads.zzfbj(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzi(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzn().zzb(iObjectWrapper == null ? null : (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzn().zzc(iObjectWrapper == null ? null : (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final void zzl(com.google.android.gms.ads.internal.client.zzcc zzccVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzccVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new com.google.android.gms.internal.ads.zzfbk(this, zzccVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzm(java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzn(boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final void zzo(com.google.android.gms.internal.ads.zzbwc zzbwcVar) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzm(zzbwcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzp(java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzq() throws android.os.RemoteException {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzr(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            android.app.Activity activity = null;
            if (iObjectWrapper != null) {
                java.lang.Object objUnwrap = com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
                if (objUnwrap instanceof android.app.Activity) {
                    activity = (android.app.Activity) objUnwrap;
                }
            }
            this.zzd.zzh(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final boolean zzs() throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final boolean zzt() {
        com.google.android.gms.internal.ads.zzdoa zzdoaVar = this.zzd;
        return zzdoaVar != null && zzdoaVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final void zzu(com.google.android.gms.internal.ads.zzbvx zzbvxVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzn(zzbvxVar);
    }
}
