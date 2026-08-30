package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzbxj extends com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzbwp zzb;
    private final android.content.Context zzc;
    private com.google.android.gms.ads.FullScreenContentCallback zze;
    private com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener zzf;
    private com.google.android.gms.ads.OnPaidEventListener zzg;
    private final long zzh = java.lang.System.currentTimeMillis();
    private final com.google.android.gms.internal.ads.zzbxh zzd = new com.google.android.gms.internal.ads.zzbxh();

    public zzbxj(android.content.Context context, java.lang.String str) {
        this.zza = str;
        this.zzc = context.getApplicationContext();
        this.zzb = com.google.android.gms.ads.internal.client.zzbc.zza().zzs(context, str, new com.google.android.gms.internal.ads.zzbpa());
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final android.os.Bundle getAdMetadata() {
        try {
            com.google.android.gms.internal.ads.zzbwp zzbwpVar = this.zzb;
            if (zzbwpVar != null) {
                return zzbwpVar.zzb();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final java.lang.String getAdUnitId() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final com.google.android.gms.ads.FullScreenContentCallback getFullScreenContentCallback() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final com.google.android.gms.ads.OnPaidEventListener getOnPaidEventListener() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final com.google.android.gms.ads.ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdy zzdyVarZzc = null;
        try {
            com.google.android.gms.internal.ads.zzbwp zzbwpVar = this.zzb;
            if (zzbwpVar != null) {
                zzdyVarZzc = zzbwpVar.zzc();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        return com.google.android.gms.ads.ResponseInfo.zzb(zzdyVarZzc);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final com.google.android.gms.ads.rewarded.RewardItem getRewardItem() {
        try {
            com.google.android.gms.internal.ads.zzbwp zzbwpVar = this.zzb;
            com.google.android.gms.internal.ads.zzbwm zzbwmVarZzd = zzbwpVar != null ? zzbwpVar.zzd() : null;
            if (zzbwmVarZzd != null) {
                return new com.google.android.gms.internal.ads.zzbwz(zzbwmVarZzd);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        return com.google.android.gms.ads.rewarded.RewardItem.DEFAULT_REWARD;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback) {
        this.zze = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            com.google.android.gms.internal.ads.zzbwp zzbwpVar = this.zzb;
            if (zzbwpVar != null) {
                zzbwpVar.zzh(z);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzf = onAdMetadataChangedListener;
        try {
            com.google.android.gms.internal.ads.zzbwp zzbwpVar = this.zzb;
            if (zzbwpVar != null) {
                zzbwpVar.zzi(new com.google.android.gms.ads.internal.client.zzfr(onAdMetadataChangedListener));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener onPaidEventListener) {
        this.zzg = onPaidEventListener;
        try {
            com.google.android.gms.internal.ads.zzbwp zzbwpVar = this.zzb;
            if (zzbwpVar != null) {
                zzbwpVar.zzj(new com.google.android.gms.ads.internal.client.zzfs(onPaidEventListener));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(com.google.android.gms.ads.rewarded.ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            com.google.android.gms.internal.ads.zzbwp zzbwpVar = this.zzb;
            if (zzbwpVar != null) {
                zzbwpVar.zzl(new com.google.android.gms.internal.ads.zzbxd(serverSideVerificationOptions));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(android.app.Activity activity, com.google.android.gms.ads.OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        try {
            com.google.android.gms.internal.ads.zzbwp zzbwpVar = this.zzb;
            if (zzbwpVar != null) {
                zzbwpVar.zzk(this.zzd);
                this.zzb.zzm(com.google.android.gms.dynamic.ObjectWrapper.wrap(activity));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzei zzeiVar, com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            if (this.zzb != null) {
                zzeiVar.zzq(this.zzh);
                this.zzb.zzg(com.google.android.gms.ads.internal.client.zzr.zza.zza(this.zzc, zzeiVar), new com.google.android.gms.internal.ads.zzbxi(rewardedInterstitialAdLoadCallback, this));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
