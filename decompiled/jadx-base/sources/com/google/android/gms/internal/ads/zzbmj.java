package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbmj extends com.google.android.gms.ads.admanager.AdManagerInterstitialAd {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.client.zzr zzb;
    private final com.google.android.gms.ads.internal.client.zzby zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.ads.zzbpa zze;
    private final long zzf;
    private com.google.android.gms.ads.admanager.AppEventListener zzg;
    private com.google.android.gms.ads.FullScreenContentCallback zzh;
    private com.google.android.gms.ads.OnPaidEventListener zzi;

    public zzbmj(android.content.Context context, java.lang.String str) {
        com.google.android.gms.internal.ads.zzbpa zzbpaVar = new com.google.android.gms.internal.ads.zzbpa();
        this.zze = zzbpaVar;
        this.zzf = java.lang.System.currentTimeMillis();
        this.zza = context;
        this.zzd = str;
        this.zzb = com.google.android.gms.ads.internal.client.zzr.zza;
        this.zzc = com.google.android.gms.ads.internal.client.zzbc.zza().zzf(context, new com.google.android.gms.ads.internal.client.zzs(), str, zzbpaVar);
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final java.lang.String getAdUnitId() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final com.google.android.gms.ads.admanager.AppEventListener getAppEventListener() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final com.google.android.gms.ads.FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzh;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final com.google.android.gms.ads.OnPaidEventListener getOnPaidEventListener() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final com.google.android.gms.ads.ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdy zzdyVarZzk = null;
        try {
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzc;
            if (zzbyVar != null) {
                zzdyVarZzk = zzbyVar.zzk();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        return com.google.android.gms.ads.ResponseInfo.zzb(zzdyVarZzk);
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(com.google.android.gms.ads.admanager.AppEventListener appEventListener) {
        try {
            this.zzg = appEventListener;
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzc;
            if (zzbyVar != null) {
                zzbyVar.zzG(appEventListener != null ? new com.google.android.gms.internal.ads.zzayy(appEventListener) : null);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.zzh = fullScreenContentCallback;
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzc;
            if (zzbyVar != null) {
                zzbyVar.zzJ(new com.google.android.gms.ads.internal.client.zzbf(fullScreenContentCallback));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzc;
            if (zzbyVar != null) {
                zzbyVar.zzL(z);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener onPaidEventListener) {
        try {
            this.zzi = onPaidEventListener;
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzc;
            if (zzbyVar != null) {
                zzbyVar.zzP(new com.google.android.gms.ads.internal.client.zzfs(onPaidEventListener));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(android.app.Activity activity) {
        if (activity == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzc;
            if (zzbyVar != null) {
                zzbyVar.zzW(com.google.android.gms.dynamic.ObjectWrapper.wrap(activity));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzei zzeiVar, com.google.android.gms.ads.AdLoadCallback adLoadCallback) {
        try {
            if (this.zzc != null) {
                zzeiVar.zzq(this.zzf);
                this.zzc.zzy(this.zzb.zza(this.zza, zzeiVar), new com.google.android.gms.ads.internal.client.zzh(adLoadCallback, this));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            adLoadCallback.onAdFailedToLoad(new com.google.android.gms.ads.LoadAdError(0, "Internal Error.", com.google.android.gms.ads.MobileAds.ERROR_DOMAIN, null, null));
        }
    }

    public zzbmj(android.content.Context context, java.lang.String str, com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        this.zze = new com.google.android.gms.internal.ads.zzbpa();
        this.zzf = java.lang.System.currentTimeMillis();
        this.zza = context;
        this.zzd = str;
        this.zzb = com.google.android.gms.ads.internal.client.zzr.zza;
        this.zzc = zzbyVar;
    }
}
