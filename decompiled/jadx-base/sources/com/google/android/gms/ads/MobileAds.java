package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class MobileAds {
    public static final java.lang.String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(android.content.Context context) {
        com.google.android.gms.ads.internal.client.zzex.zzf().zzn(context);
    }

    public static com.google.android.gms.ads.initialization.InitializationStatus getInitializationStatus() {
        return com.google.android.gms.ads.internal.client.zzex.zzf().zze();
    }

    private static java.lang.String getInternalVersion() {
        return com.google.android.gms.ads.internal.client.zzex.zzf().zzi();
    }

    public static com.google.android.gms.ads.RequestConfiguration getRequestConfiguration() {
        return com.google.android.gms.ads.internal.client.zzex.zzf().zzc();
    }

    public static com.google.android.gms.ads.VersionInfo getVersion() {
        com.google.android.gms.ads.internal.client.zzex.zzf();
        java.lang.String[] strArrSplit = android.text.TextUtils.split("23.6.0", "\\.");
        if (strArrSplit.length != 3) {
            return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
        }
        try {
            return new com.google.android.gms.ads.VersionInfo(java.lang.Integer.parseInt(strArrSplit[0]), java.lang.Integer.parseInt(strArrSplit[1]), java.lang.Integer.parseInt(strArrSplit[2]));
        } catch (java.lang.NumberFormatException unused) {
            return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
        }
    }

    public static void initialize(android.content.Context context) {
        com.google.android.gms.ads.internal.client.zzex.zzf().zzo(context, null, null);
    }

    public static void openAdInspector(android.content.Context context, com.google.android.gms.ads.OnAdInspectorClosedListener onAdInspectorClosedListener) {
        com.google.android.gms.ads.internal.client.zzex.zzf().zzr(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(android.content.Context context, java.lang.String str) {
        com.google.android.gms.ads.internal.client.zzex.zzf().zzs(context, str);
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z) {
        return com.google.android.gms.ads.internal.client.zzex.zzf().zzz(z);
    }

    public static androidx.browser.customtabs.CustomTabsSession registerCustomTabsSession(android.content.Context context, androidx.browser.customtabs.CustomTabsClient customTabsClient, java.lang.String str, androidx.browser.customtabs.CustomTabsCallback customTabsCallback) {
        com.google.android.gms.ads.internal.client.zzex.zzf();
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzbyu zzbyuVarZza = com.google.android.gms.internal.ads.zzbtv.zza(context);
        if (zzbyuVarZza == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Internal error, query info generator is null.");
            return null;
        }
        try {
            return (androidx.browser.customtabs.CustomTabsSession) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzbyuVarZza.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), com.google.android.gms.dynamic.ObjectWrapper.wrap(customTabsClient), str, com.google.android.gms.dynamic.ObjectWrapper.wrap(customTabsCallback)));
        } catch (android.os.RemoteException | java.lang.IllegalArgumentException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to register custom tabs session. Error: ", e);
            return null;
        }
    }

    public static void registerRtbAdapter(java.lang.Class<? extends com.google.android.gms.ads.mediation.rtb.RtbAdapter> cls) {
        com.google.android.gms.ads.internal.client.zzex.zzf().zzt(cls);
    }

    public static void registerWebView(android.webkit.WebView webView) {
        com.google.android.gms.ads.internal.client.zzex.zzf();
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (webView == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("The webview to be registered cannot be null.");
            return;
        }
        com.google.android.gms.internal.ads.zzbyu zzbyuVarZza = com.google.android.gms.internal.ads.zzbtv.zza(webView.getContext());
        if (zzbyuVarZza == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Internal error, query info generator is null.");
            return;
        }
        try {
            zzbyuVarZza.zzj(com.google.android.gms.dynamic.ObjectWrapper.wrap(webView));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    public static void setAppMuted(boolean z) {
        com.google.android.gms.ads.internal.client.zzex.zzf().zzu(z);
    }

    public static void setAppVolume(float f) {
        com.google.android.gms.ads.internal.client.zzex.zzf().zzv(f);
    }

    private static void setPlugin(java.lang.String str) {
        com.google.android.gms.ads.internal.client.zzex.zzf().zzw(str);
    }

    public static void setRequestConfiguration(com.google.android.gms.ads.RequestConfiguration requestConfiguration) {
        com.google.android.gms.ads.internal.client.zzex.zzf().zzx(requestConfiguration);
    }

    public static void startPreload(android.content.Context context, java.util.List<com.google.android.gms.ads.preload.PreloadConfiguration> list, com.google.android.gms.ads.preload.PreloadCallback preloadCallback) {
        com.google.android.gms.ads.internal.client.zzex.zzf().zzg(context, list, preloadCallback);
    }

    public static void initialize(android.content.Context context, com.google.android.gms.ads.initialization.OnInitializationCompleteListener onInitializationCompleteListener) {
        com.google.android.gms.ads.internal.client.zzex.zzf().zzo(context, null, onInitializationCompleteListener);
    }
}
