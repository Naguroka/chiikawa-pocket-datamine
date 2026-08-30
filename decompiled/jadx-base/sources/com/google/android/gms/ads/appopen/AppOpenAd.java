package com.google.android.gms.ads.appopen;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AppOpenAd {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public static abstract class AppOpenAdLoadCallback extends com.google.android.gms.ads.AdLoadCallback<com.google.android.gms.ads.appopen.AppOpenAd> {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public @interface AppOpenAdOrientation {
    }

    public static boolean isAdAvailable(android.content.Context context, java.lang.String str) {
        try {
            return com.google.android.gms.ads.zzb.zza(context).zzj(str);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    @java.lang.Deprecated
    public static void load(final android.content.Context context, final java.lang.String str, final com.google.android.gms.ads.AdRequest adRequest, final int i, final com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzd.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzla)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.appopen.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.content.Context context2 = context;
                        int i2 = i;
                        java.lang.String str2 = str;
                        com.google.android.gms.ads.AdRequest adRequest2 = adRequest;
                        try {
                            new com.google.android.gms.internal.ads.zzbal(context2, str2, adRequest2.zza(), i2, appOpenAdLoadCallback).zza();
                        } catch (java.lang.IllegalStateException e) {
                            com.google.android.gms.internal.ads.zzbuh.zza(context2).zzh(e, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new com.google.android.gms.internal.ads.zzbal(context, str, adRequest.zza(), i, appOpenAdLoadCallback).zza();
    }

    public static com.google.android.gms.ads.appopen.AppOpenAd pollAd(android.content.Context context, java.lang.String str) {
        try {
            com.google.android.gms.internal.ads.zzbad zzbadVarZze = com.google.android.gms.ads.zzb.zza(context).zze(str);
            if (zzbadVarZze != null) {
                return new com.google.android.gms.internal.ads.zzazz(zzbadVarZze, str);
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzl("Failed to obtain an App Open ad from the preloader.", null);
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

    public static void load(final android.content.Context context, final java.lang.String str, final com.google.android.gms.ads.AdRequest adRequest, final com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzd.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzla)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.appopen.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.content.Context context2 = context;
                        java.lang.String str2 = str;
                        com.google.android.gms.ads.AdRequest adRequest2 = adRequest;
                        try {
                            new com.google.android.gms.internal.ads.zzbal(context2, str2, adRequest2.zza(), 3, appOpenAdLoadCallback).zza();
                        } catch (java.lang.IllegalStateException e) {
                            com.google.android.gms.internal.ads.zzbuh.zza(context2).zzh(e, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new com.google.android.gms.internal.ads.zzbal(context, str, adRequest.zza(), 3, appOpenAdLoadCallback).zza();
    }

    @java.lang.Deprecated
    public static void load(final android.content.Context context, final java.lang.String str, final com.google.android.gms.ads.admanager.AdManagerAdRequest adManagerAdRequest, final int i, final com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzd.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzla)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.appopen.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.content.Context context2 = context;
                        int i2 = i;
                        java.lang.String str2 = str;
                        com.google.android.gms.ads.admanager.AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new com.google.android.gms.internal.ads.zzbal(context2, str2, adManagerAdRequest2.zza(), i2, appOpenAdLoadCallback).zza();
                        } catch (java.lang.IllegalStateException e) {
                            com.google.android.gms.internal.ads.zzbuh.zza(context2).zzh(e, "AppOpenAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new com.google.android.gms.internal.ads.zzbal(context, str, adManagerAdRequest.zza(), i, appOpenAdLoadCallback).zza();
    }
}
