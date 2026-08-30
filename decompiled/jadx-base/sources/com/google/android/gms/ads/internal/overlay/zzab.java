package com.google.android.gms.ads.internal.overlay;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzab extends com.google.android.gms.internal.ads.zzbtd {
    private final com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel zza;
    private final android.app.Activity zzb;
    private boolean zzc = false;
    private boolean zzd = false;
    private boolean zze = false;

    public zzab(android.app.Activity activity, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = activity;
    }

    private final synchronized void zzb() {
        if (this.zzd) {
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzds(4);
        }
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final boolean zzH() throws android.os.RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzh(int i, int i2, android.content.Intent intent) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzi() throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzl(android.os.Bundle bundle) {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziL)).booleanValue() && !this.zze) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        if (adOverlayInfoParcel == null) {
            this.zzb.finish();
            return;
        }
        if (z) {
            this.zzb.finish();
            return;
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            com.google.android.gms.internal.ads.zzdds zzddsVar = this.zza.zzu;
            if (zzddsVar != null) {
                zzddsVar.zzdd();
            }
            if (this.zzb.getIntent() != null && this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzrVar = this.zza.zzc) != null) {
                zzrVar.zzdp();
            }
        }
        android.app.Activity activity = this.zzb;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel2 = this.zza;
        com.google.android.gms.ads.internal.zzv.zzi();
        com.google.android.gms.ads.internal.overlay.zzc zzcVar = adOverlayInfoParcel2.zza;
        if (com.google.android.gms.ads.internal.overlay.zza.zzb(activity, zzcVar, adOverlayInfoParcel2.zzi, zzcVar.zzi, null, "")) {
            return;
        }
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzm() throws android.os.RemoteException {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzo() throws android.os.RemoteException {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdi();
        }
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzp(int i, java.lang.String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzq() throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzr() throws android.os.RemoteException {
        if (this.zzc) {
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzs(android.os.Bundle bundle) throws android.os.RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzt() throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzu() throws android.os.RemoteException {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzv() throws android.os.RemoteException {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzx() throws android.os.RemoteException {
        this.zze = true;
    }
}
