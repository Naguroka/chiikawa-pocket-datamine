package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdmm extends com.google.android.gms.internal.ads.zzbmb implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, com.google.android.gms.internal.ads.zzbfi {
    private android.view.View zza;
    private com.google.android.gms.ads.internal.client.zzeb zzb;
    private com.google.android.gms.internal.ads.zzdia zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdmm(com.google.android.gms.internal.ads.zzdia zzdiaVar, com.google.android.gms.internal.ads.zzdif zzdifVar) {
        this.zza = zzdifVar.zzf();
        this.zzb = zzdifVar.zzj();
        this.zzc = zzdiaVar;
        if (zzdifVar.zzs() != null) {
            zzdifVar.zzs().zzap(this);
        }
    }

    private final void zzg() {
        android.view.View view;
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zzc;
        if (zzdiaVar == null || (view = this.zza) == null) {
            return;
        }
        zzdiaVar.zzB(view, java.util.Collections.emptyMap(), java.util.Collections.emptyMap(), com.google.android.gms.internal.ads.zzdia.zzY(this.zza));
    }

    private final void zzh() {
        android.view.View view = this.zza;
        if (view == null) {
            return;
        }
        android.view.ViewParent parent = view.getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(this.zza);
        }
    }

    private static final void zzi(com.google.android.gms.internal.ads.zzbmf zzbmfVar, int i) {
        try {
            zzbmfVar.zze(i);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    public final com.google.android.gms.ads.internal.client.zzeb zzb() throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzg("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    public final com.google.android.gms.internal.ads.zzbft zzc() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zzc;
        if (zzdiaVar == null || zzdiaVar.zzc() == null) {
            return null;
        }
        return zzdiaVar.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    public final void zzd() throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zzc;
        if (zzdiaVar != null) {
            zzdiaVar.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new com.google.android.gms.internal.ads.zzdml(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    public final void zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbmf zzbmfVar) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Instream ad can not be shown after destroy().");
            zzi(zzbmfVar, 2);
            return;
        }
        android.view.View view = this.zza;
        if (view == null || this.zzb == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            zzi(zzbmfVar, 0);
            return;
        }
        if (this.zze) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Instream ad should not be used again.");
            zzi(zzbmfVar, 1);
            return;
        }
        this.zze = true;
        zzh();
        ((android.view.ViewGroup) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new android.view.ViewGroup.LayoutParams(-1, -1));
        com.google.android.gms.ads.internal.zzv.zzy();
        com.google.android.gms.internal.ads.zzcaj.zza(this.zza, this);
        com.google.android.gms.ads.internal.zzv.zzy();
        com.google.android.gms.internal.ads.zzcaj.zzb(this.zza, this);
        zzg();
        try {
            zzbmfVar.zzf();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
