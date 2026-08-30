package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfm extends com.google.android.gms.ads.internal.client.zzcy {
    private com.google.android.gms.internal.ads.zzblu zza;

    final /* synthetic */ void zzb() {
        com.google.android.gms.internal.ads.zzblu zzbluVar = this.zza;
        if (zzbluVar != null) {
            try {
                zzbluVar.zzb(java.util.Collections.emptyList());
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onComplete event.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final float zze() throws android.os.RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final java.lang.String zzf() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final java.util.List zzg() throws android.os.RemoteException {
        return java.util.Collections.emptyList();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzh(java.lang.String str) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzj(boolean z) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzk() throws android.os.RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfl
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzl(java.lang.String str, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(com.google.android.gms.ads.internal.client.zzdl zzdlVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(com.google.android.gms.internal.ads.zzbpe zzbpeVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzp(boolean z) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzq(float f) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzr(java.lang.String str) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(com.google.android.gms.internal.ads.zzblu zzbluVar) throws android.os.RemoteException {
        this.zza = zzbluVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(java.lang.String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(com.google.android.gms.ads.internal.client.zzfv zzfvVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final boolean zzv() throws android.os.RemoteException {
        return false;
    }
}
