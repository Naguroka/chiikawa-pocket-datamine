package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcoh extends com.google.android.gms.internal.ads.zzbac {
    private final com.google.android.gms.internal.ads.zzcog zza;
    private final com.google.android.gms.ads.internal.client.zzby zzb;
    private final com.google.android.gms.internal.ads.zzexm zzc;
    private boolean zzd = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaR)).booleanValue();
    private final com.google.android.gms.internal.ads.zzdrw zze;

    public zzcoh(com.google.android.gms.internal.ads.zzcog zzcogVar, com.google.android.gms.ads.internal.client.zzby zzbyVar, com.google.android.gms.internal.ads.zzexm zzexmVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = zzcogVar;
        this.zzb = zzbyVar;
        this.zzc = zzexmVar;
        this.zze = zzdrwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final com.google.android.gms.ads.internal.client.zzby zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final com.google.android.gms.ads.internal.client.zzdy zzf() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgC)).booleanValue()) {
            return this.zza.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzg(boolean z) {
        this.zzd = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzh(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdrVar.zzf()) {
                    this.zze.zze();
                }
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
            }
            this.zzc.zzn(zzdrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzi(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbak zzbakVar) {
        try {
            this.zzc.zzp(zzbakVar);
            this.zza.zzd((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), zzbakVar, this.zzd);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
