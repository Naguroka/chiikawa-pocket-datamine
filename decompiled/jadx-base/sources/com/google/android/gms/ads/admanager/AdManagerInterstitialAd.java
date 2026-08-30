package com.google.android.gms.ads.admanager;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AdManagerInterstitialAd extends com.google.android.gms.ads.interstitial.InterstitialAd {
    public static void load(final android.content.Context context, final java.lang.String str, final com.google.android.gms.ads.admanager.AdManagerAdRequest adManagerAdRequest, final com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(adManagerInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzi.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzla)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.admanager.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.content.Context context2 = context;
                        java.lang.String str2 = str;
                        com.google.android.gms.ads.admanager.AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new com.google.android.gms.internal.ads.zzbmj(context2, str2).zza(adManagerAdRequest2.zza(), adManagerInterstitialAdLoadCallback);
                        } catch (java.lang.IllegalStateException e) {
                            com.google.android.gms.internal.ads.zzbuh.zza(context2).zzh(e, "AdManagerInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new com.google.android.gms.internal.ads.zzbmj(context, str).zza(adManagerAdRequest.zza(), adManagerInterstitialAdLoadCallback);
    }

    public abstract com.google.android.gms.ads.admanager.AppEventListener getAppEventListener();

    public abstract void setAppEventListener(com.google.android.gms.ads.admanager.AppEventListener appEventListener);
}
