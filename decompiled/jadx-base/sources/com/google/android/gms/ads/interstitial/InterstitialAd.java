package com.google.android.gms.ads.interstitial;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class InterstitialAd {
    public static boolean isAdAvailable(android.content.Context context, java.lang.String str) {
        try {
            return com.google.android.gms.ads.zzb.zza(context).zzk(str);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public static void load(final android.content.Context context, final java.lang.String str, final com.google.android.gms.ads.AdRequest adRequest, final com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback interstitialAdLoadCallback) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(interstitialAdLoadCallback, "LoadCallback cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzi.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzla)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.interstitial.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.content.Context context2 = context;
                        java.lang.String str2 = str;
                        com.google.android.gms.ads.AdRequest adRequest2 = adRequest;
                        try {
                            new com.google.android.gms.internal.ads.zzbmj(context2, str2).zza(adRequest2.zza(), interstitialAdLoadCallback);
                        } catch (java.lang.IllegalStateException e) {
                            com.google.android.gms.internal.ads.zzbuh.zza(context2).zzh(e, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new com.google.android.gms.internal.ads.zzbmj(context, str).zza(adRequest.zza(), interstitialAdLoadCallback);
    }

    public static com.google.android.gms.ads.interstitial.InterstitialAd pollAd(android.content.Context context, java.lang.String str) {
        try {
            com.google.android.gms.ads.internal.client.zzby zzbyVarZzf = com.google.android.gms.ads.zzb.zza(context).zzf(str);
            if (zzbyVarZzf != null) {
                return new com.google.android.gms.internal.ads.zzbmj(context, str, zzbyVarZzf);
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzl("Failed to obtain an Interstitial Ad from the preloader.", null);
            return null;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    public abstract java.lang.String getAdUnitId();

    public abstract com.google.android.gms.ads.FullScreenContentCallback getFullScreenContentCallback();

    public abstract com.google.android.gms.ads.OnPaidEventListener getOnPaidEventListener();

    public abstract com.google.android.gms.ads.ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener onPaidEventListener);

    public abstract void show(android.app.Activity activity);
}
