package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfbf extends com.google.android.gms.internal.ads.zzbwo {
    private final com.google.android.gms.internal.ads.zzfbb zza;
    private final com.google.android.gms.internal.ads.zzfar zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.ads.zzfcb zzd;
    private final android.content.Context zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private final com.google.android.gms.internal.ads.zzava zzg;
    private final com.google.android.gms.internal.ads.zzdrw zzh;
    private com.google.android.gms.internal.ads.zzdoa zzi;
    private boolean zzj = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaO)).booleanValue();

    public zzfbf(java.lang.String str, com.google.android.gms.internal.ads.zzfbb zzfbbVar, android.content.Context context, com.google.android.gms.internal.ads.zzfar zzfarVar, com.google.android.gms.internal.ads.zzfcb zzfcbVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzava zzavaVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zzc = str;
        this.zza = zzfbbVar;
        this.zzb = zzfarVar;
        this.zzd = zzfcbVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzg = zzavaVar;
        this.zzh = zzdrwVar;
    }

    private final synchronized void zzu(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.internal.ads.zzbww zzbwwVar, int i) throws android.os.RemoteException {
        if (!zzmVar.zzb()) {
            boolean z = false;
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzk.zze()).booleanValue()) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzla)).booleanValue()) {
                    z = true;
                }
            }
            if (this.zzf.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlb)).intValue() || !z) {
                com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            }
        }
        this.zzb.zzk(zzbwwVar);
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzI(this.zze) && zzmVar.zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzdz(com.google.android.gms.internal.ads.zzfdk.zzd(4, null, null));
            return;
        }
        if (this.zzi != null) {
            return;
        }
        com.google.android.gms.internal.ads.zzfat zzfatVar = new com.google.android.gms.internal.ads.zzfat(null);
        this.zza.zzj(i);
        this.zza.zzb(zzmVar, this.zzc, zzfatVar, new com.google.android.gms.internal.ads.zzfbe(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final android.os.Bundle zzb() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzdoa zzdoaVar = this.zzi;
        return zzdoaVar != null ? zzdoaVar.zza() : new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final com.google.android.gms.ads.internal.client.zzdy zzc() {
        com.google.android.gms.internal.ads.zzdoa zzdoaVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgC)).booleanValue() && (zzdoaVar = this.zzi) != null) {
            return zzdoaVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final com.google.android.gms.internal.ads.zzbwm zzd() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzdoa zzdoaVar = this.zzi;
        if (zzdoaVar != null) {
            return zzdoaVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized java.lang.String zze() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdoa zzdoaVar = this.zzi;
        if (zzdoaVar == null || zzdoaVar.zzm() == null) {
            return null;
        }
        return zzdoaVar.zzm().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.internal.ads.zzbww zzbwwVar) throws android.os.RemoteException {
        zzu(zzmVar, zzbwwVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.internal.ads.zzbww zzbwwVar) throws android.os.RemoteException {
        zzu(zzmVar, zzbwwVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzh(boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzi(com.google.android.gms.ads.internal.client.zzdo zzdoVar) {
        if (zzdoVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new com.google.android.gms.internal.ads.zzfbd(this, zzdoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzj(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdrVar.zzf()) {
                this.zzh.zze();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzi(zzdrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzk(com.google.android.gms.internal.ads.zzbws zzbwsVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbwsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzl(com.google.android.gms.internal.ads.zzbxd zzbxdVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzfcb zzfcbVar = this.zzd;
        zzfcbVar.zza = zzbxdVar.zza;
        zzfcbVar.zzb = zzbxdVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzm(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        zzn(iObjectWrapper, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, boolean z) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzq(com.google.android.gms.internal.ads.zzfdk.zzd(9, null, null));
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcT)).booleanValue()) {
            this.zzg.zzc().zzn(new java.lang.Throwable().getStackTrace());
        }
        this.zzi.zzh(z, (android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzo() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzdoa zzdoaVar = this.zzi;
        return (zzdoaVar == null || zzdoaVar.zzf()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzp(com.google.android.gms.internal.ads.zzbwx zzbwxVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbwxVar);
    }
}
