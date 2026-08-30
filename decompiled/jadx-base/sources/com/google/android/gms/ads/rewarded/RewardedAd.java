package com.google.android.gms.ads.rewarded;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class RewardedAd {
    public static boolean isAdAvailable(android.content.Context context, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        return new com.google.android.gms.internal.ads.zzbwy(context, str).zzc();
    }

    public static void load(final android.content.Context context, final java.lang.String str, final com.google.android.gms.ads.AdRequest adRequest, final com.google.android.gms.ads.rewarded.RewardedAdLoadCallback rewardedAdLoadCallback) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzk.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzla)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.rewarded.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.content.Context context2 = context;
                        java.lang.String str2 = str;
                        com.google.android.gms.ads.AdRequest adRequest2 = adRequest;
                        try {
                            new com.google.android.gms.internal.ads.zzbwy(context2, str2).zzb(adRequest2.zza(), rewardedAdLoadCallback);
                        } catch (java.lang.IllegalStateException e) {
                            com.google.android.gms.internal.ads.zzbuh.zza(context2).zzh(e, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Loading on UI thread");
        new com.google.android.gms.internal.ads.zzbwy(context, str).zzb(adRequest.zza(), rewardedAdLoadCallback);
    }

    public static com.google.android.gms.ads.rewarded.RewardedAd pollAd(android.content.Context context, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        return new com.google.android.gms.internal.ads.zzbwy(context, str).zza();
    }

    public abstract android.os.Bundle getAdMetadata();

    public abstract java.lang.String getAdUnitId();

    public abstract com.google.android.gms.ads.FullScreenContentCallback getFullScreenContentCallback();

    public abstract com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    public abstract com.google.android.gms.ads.OnPaidEventListener getOnPaidEventListener();

    public abstract com.google.android.gms.ads.ResponseInfo getResponseInfo();

    public abstract com.google.android.gms.ads.rewarded.RewardItem getRewardItem();

    public abstract void setFullScreenContentCallback(com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnAdMetadataChangedListener(com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener onAdMetadataChangedListener);

    public abstract void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener onPaidEventListener);

    public abstract void setServerSideVerificationOptions(com.google.android.gms.ads.rewarded.ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void show(android.app.Activity activity, com.google.android.gms.ads.OnUserEarnedRewardListener onUserEarnedRewardListener);

    public static void load(final android.content.Context context, final java.lang.String str, final com.google.android.gms.ads.admanager.AdManagerAdRequest adManagerAdRequest, final com.google.android.gms.ads.rewarded.RewardedAdLoadCallback rewardedAdLoadCallback) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzk.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzla)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Loading on background thread");
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.rewarded.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.content.Context context2 = context;
                        java.lang.String str2 = str;
                        com.google.android.gms.ads.admanager.AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new com.google.android.gms.internal.ads.zzbwy(context2, str2).zzb(adManagerAdRequest2.zza(), rewardedAdLoadCallback);
                        } catch (java.lang.IllegalStateException e) {
                            com.google.android.gms.internal.ads.zzbuh.zza(context2).zzh(e, "RewardedAd.loadAdManager");
                        }
                    }
                });
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Loading on UI thread");
        new com.google.android.gms.internal.ads.zzbwy(context, str).zzb(adManagerAdRequest.zza(), rewardedAdLoadCallback);
    }
}
