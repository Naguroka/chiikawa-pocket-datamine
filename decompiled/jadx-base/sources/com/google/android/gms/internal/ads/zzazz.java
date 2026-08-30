package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzazz extends com.google.android.gms.ads.appopen.AppOpenAd {
    com.google.android.gms.ads.FullScreenContentCallback zza;
    private final com.google.android.gms.internal.ads.zzbad zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.ads.zzbaa zzd = new com.google.android.gms.internal.ads.zzbaa();
    private com.google.android.gms.ads.OnPaidEventListener zze;

    public zzazz(com.google.android.gms.internal.ads.zzbad zzbadVar, java.lang.String str) {
        this.zzb = zzbadVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final java.lang.String getAdUnitId() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final com.google.android.gms.ads.FullScreenContentCallback getFullScreenContentCallback() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final com.google.android.gms.ads.OnPaidEventListener getOnPaidEventListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final com.google.android.gms.ads.ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdy zzdyVarZzf;
        try {
            zzdyVarZzf = this.zzb.zzf();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            zzdyVarZzf = null;
        }
        return com.google.android.gms.ads.ResponseInfo.zzb(zzdyVarZzf);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setFullScreenContentCallback(com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback) {
        this.zza = fullScreenContentCallback;
        this.zzd.zzg(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setImmersiveMode(boolean z) {
        try {
            this.zzb.zzg(z);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener onPaidEventListener) {
        this.zze = onPaidEventListener;
        try {
            this.zzb.zzh(new com.google.android.gms.ads.internal.client.zzfs(onPaidEventListener));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(android.app.Activity activity) {
        try {
            this.zzb.zzi(com.google.android.gms.dynamic.ObjectWrapper.wrap(activity), this.zzd);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
