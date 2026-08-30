package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbxf implements com.google.android.gms.ads.mediation.MediationRewardedAdCallback {
    private final com.google.android.gms.internal.ads.zzbpk zza;

    public zzbxf(com.google.android.gms.internal.ads.zzbpk zzbpkVar) {
        this.zza = zzbpkVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.zze("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(com.google.android.gms.ads.AdError adError) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.zze("Adapter called onAdFailedToShow.");
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Mediation ad failed to show: Error Code = " + adError.getCode() + ". Error Message = " + adError.getMessage() + " Error Domain = " + adError.getDomain());
        try {
            this.zza.zzk(adError.zza());
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.zze("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward(com.google.android.gms.ads.rewarded.RewardItem rewardItem) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.zze("Adapter called onUserEarnedReward.");
        try {
            this.zza.zzt(new com.google.android.gms.internal.ads.zzbxg(rewardItem));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.zze("Adapter called onVideoComplete.");
        try {
            this.zza.zzu();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoStart() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.zze("Adapter called onVideoStart.");
        try {
            this.zza.zzy();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.zze("Adapter called reportAdClicked.");
        try {
            this.zza.zze();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.zze("Adapter called reportAdImpression.");
        try {
            this.zza.zzm();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.zze("Adapter called onAdFailedToShow.");
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Mediation ad failed to show: ".concat(java.lang.String.valueOf(str)));
        try {
            this.zza.zzl(str);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
