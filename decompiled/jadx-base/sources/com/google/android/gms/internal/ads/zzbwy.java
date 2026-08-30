package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzbwy extends com.google.android.gms.ads.rewarded.RewardedAd {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzbwp zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzbxh zzd;
    private com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener zze;
    private com.google.android.gms.ads.OnPaidEventListener zzf;
    private com.google.android.gms.ads.FullScreenContentCallback zzg;
    private final long zzh;

    public zzbwy(android.content.Context context, java.lang.String str) {
        this(context.getApplicationContext(), str, com.google.android.gms.ads.internal.client.zzbc.zza().zzs(context, str, new com.google.android.gms.internal.ads.zzbpa()), new com.google.android.gms.internal.ads.zzbxh());
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final java.lang.String getAdUnitId() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final com.google.android.gms.ads.FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final com.google.android.gms.ads.OnPaidEventListener getOnPaidEventListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final com.google.android.gms.ads.rewarded.RewardItem getRewardItem() {
        try {
            com.google.android.gms.internal.ads.zzbwp zzbwpVar = this.zzb;
            com.google.android.gms.internal.ads.zzbwm zzbwmVarZzd = zzbwpVar != null ? zzbwpVar.zzd() : null;
            return zzbwmVarZzd == null ? com.google.android.gms.ads.rewarded.RewardItem.DEFAULT_REWARD : new com.google.android.gms.internal.ads.zzbwz(zzbwmVarZzd);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return com.google.android.gms.ads.rewarded.RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback) {
        this.zzg = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zze = onAdMetadataChangedListener;
            com.google.android.gms.internal.ads.zzbwp zzbwpVar = this.zzb;
            if (zzbwpVar != null) {
                zzbwpVar.zzi(new com.google.android.gms.ads.internal.client.zzfr(onAdMetadataChangedListener));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener onPaidEventListener) {
        try {
            this.zzf = onPaidEventListener;
            com.google.android.gms.internal.ads.zzbwp zzbwpVar = this.zzb;
            if (zzbwpVar != null) {
                zzbwpVar.zzj(new com.google.android.gms.ads.internal.client.zzfs(onPaidEventListener));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(com.google.android.gms.ads.rewarded.ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                com.google.android.gms.internal.ads.zzbwp zzbwpVar = this.zzb;
                if (zzbwpVar != null) {
                    zzbwpVar.zzl(new com.google.android.gms.internal.ads.zzbxd(serverSideVerificationOptions));
                }
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(android.app.Activity activity, com.google.android.gms.ads.OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        if (activity == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
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

    public final com.google.android.gms.ads.rewarded.RewardedAd zza() {
        try {
            com.google.android.gms.internal.ads.zzbwp zzbwpVarZzg = com.google.android.gms.ads.zzb.zza(this.zzc).zzg(this.zza);
            if (zzbwpVarZzg != null) {
                return new com.google.android.gms.internal.ads.zzbwy(this.zzc, this.zza, zzbwpVarZzg, this.zzd);
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzl("Failed to obtain a Rewarded Ad from the preloader.", null);
            return null;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void zzb(com.google.android.gms.ads.internal.client.zzei zzeiVar, com.google.android.gms.ads.rewarded.RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            if (this.zzb != null) {
                zzeiVar.zzq(this.zzh);
                this.zzb.zzf(com.google.android.gms.ads.internal.client.zzr.zza.zza(this.zzc, zzeiVar), new com.google.android.gms.internal.ads.zzbxc(rewardedAdLoadCallback, this));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final boolean zzc() {
        try {
            return com.google.android.gms.ads.zzb.zza(this.zzc).zzl(this.zza);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    protected zzbwy(android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.zzbwp zzbwpVar, com.google.android.gms.internal.ads.zzbxh zzbxhVar) {
        this.zzh = java.lang.System.currentTimeMillis();
        this.zzc = context.getApplicationContext();
        this.zza = str;
        this.zzb = zzbwpVar;
        this.zzd = zzbxhVar;
    }
}
